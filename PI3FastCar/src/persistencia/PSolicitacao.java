/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Solicitacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rodri
 */
public class PSolicitacao extends TPersistencia<Solicitacao>{
    public void incluir(Solicitacao solicitacao) throws SQLException{
        
        String sql = "INSERT INTO solicitacao(cod_passageiro, cod_viagem,"
                + " forma_pagamento)"
                + " VALUES(?, ?, ?);";
        
        String sql2 = "SELECT currval('solicitacao_codigo_solicitacao_seq') as codigo";
        
        this.alterarOuIncluir(solicitacao, sql, sql2);
    }
    
    @Override
    public void excluir(int cod) throws SQLException {
        String sql = "DELETE FROM solicitacao WHERE codigo_solicitacao = ?";
        
        Connection cnn = util.SConexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, cod);

        prd.execute();
    }

    @Override
    public Solicitacao consultar(int cod) throws SQLException {
        String sql = "SELECT * FROM solicitacao WHERE codigo_solicitacao = ?";
        
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, cod);
        
        ResultSet rs = prd.executeQuery();
        if(rs.next()){
            return new Solicitacao(rs.getInt(1), new PViagem().consultar(rs.getInt(2)),
                    new PPassageiro().consultar(rs.getInt(3)), rs.getString(4));
        }
        
        return null;
    }

    @Override
    public Iterator<Solicitacao> listar() throws SQLException {
        String sql = "SELECT * FROM solicitacao ORDER BY codigo_solicitacao;";
        
        Connection cnn = util.SConexao.getConexao();
        Statement prd = cnn.createStatement();
        
        ResultSet rs = prd.executeQuery(sql);
        ArrayList<Solicitacao> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Solicitacao(rs.getInt(1), new PViagem().consultar(rs.getInt(2)),
                    new PPassageiro().consultar(rs.getInt(3)), rs.getString(4)));
        }
        
        return lista.iterator();
    }

    @Override
    public Iterator<Solicitacao> listarPorFiltro(int opcao, String filtro) throws SQLException {
        String sql = "SELECT * FROM solicitacao WHERE codigo_solicitacao = ? ORDER BY codigo_solicitacao;";
        String sql2 = "SELECT * FROM solicitacao s INNER JOIN passageiro p ON s.cod_passageiro = p.codigo_passageiro"
                + " WHERE UPPER(p.nome) LIKE ? ORDER BY codigo_solicitacao;";
        String sql3 = "SELECT * FROM solicitacao WHERE UPPER(forma_pagamento)"
                + " LIKE ? ORDER BY codigo_solicitacao;";
        
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd;
        switch (opcao) {
            case 0:
                prd = cnn.prepareStatement(sql);
                prd.setInt(1, Integer.parseInt(filtro));
                break;
            case 1:
                prd = cnn.prepareStatement(sql2);
                prd.setString(1, "%" + filtro + "%");
                break;
            default:
                prd = cnn.prepareStatement(sql3);
                prd.setString(1, "%" + filtro + "%");
                break;
        }
        
        ResultSet rs = prd.executeQuery();
        ArrayList<Solicitacao> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Solicitacao(rs.getInt(1), new PViagem().consultar(rs.getInt(2)),
                    new PPassageiro().consultar(rs.getInt(3)), rs.getString(4)));
        }
        
        return lista.iterator();
    }

    @Override
    public PreparedStatement prepararDeclaracao(Solicitacao solicitacao, Connection cnn, String sql) throws SQLException {
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        
        prd.setInt(1, solicitacao.getPassageiro().getCodigoPassageiro());
        prd.setInt(2, solicitacao.getViagem().getCodigoViagem());
        prd.setString(3, solicitacao.getFormaDePagamento());
        
        if(solicitacao.getCodigoSolicitacao() > 0)
            prd.setInt(4, solicitacao.getCodigoSolicitacao());
        
        return prd;
    }
    
}
