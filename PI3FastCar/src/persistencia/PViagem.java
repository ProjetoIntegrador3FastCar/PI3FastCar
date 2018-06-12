/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Viagem;
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
public class PViagem extends TPersistencia<Viagem>{
    
    public void incluir(Viagem viagem) throws SQLException{
        
        String sql = "INSERT INTO viagem(local_origem, local_destino,"
                + " valor_viagem, data_viagem, cod_motorista)"
                + " VALUES(?, ?, ?, ?, ?);";
        
        String sql2 = "SELECT currval('viagem_codigo_viagem_seq') as codigo";
        
        this.alterarOuIncluir(viagem, sql, sql2);
    }
    
    public void alterar(Viagem Viagem) throws SQLException{
        
        
        String sql = "UPDATE jogador SET local_origem = ? , local_destino = ?,"
                + " valor_viagem = ?, data_viagem = ?, cod_motorista = ?"
                + " WHERE codigo_viagem = ?;";
        
        this.alterarOuIncluir(Viagem, sql);
    }

    @Override
    public void excluir(int cod) throws SQLException {
        String sql = "DELETE FROM viagem WHERE codigo_viagem = ?";
        
        Connection cnn = util.SConexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, cod);

        prd.execute();
    }

    @Override
    public Viagem consultar(int cod) throws SQLException {
        
        String sql = "SELECT * FROM viagem WHERE codigo_viagem = ?";
        
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, cod);
        
        ResultSet rs = prd.executeQuery();
        if(rs.next()){
            return new Viagem(rs.getInt(1), rs.getString(2), rs.getString(3), 
                    rs.getDouble(4), rs.getDate(5), new PMotorista().consultar(rs.getInt(6)));
        }
        
        return null;
    }

    @Override
    public Iterator<Viagem> listar() throws SQLException {
        String sql = "SELECT * FROM viagem ORDER BY codigo_viagem;";
        
        Connection cnn = util.SConexao.getConexao();
        Statement prd = cnn.createStatement();
        
        ResultSet rs = prd.executeQuery(sql);
        ArrayList<Viagem> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Viagem(rs.getInt(1), rs.getString(2), rs.getString(3), 
                    rs.getDouble(4), rs.getDate(5), new PMotorista().consultar(rs.getInt(6))));
        }
        
        return lista.iterator();
    }

    @Override
    public Iterator<Viagem> listarDescricao(int opcao, String string) throws SQLException {
        String sql = "SELECT * FROM viagem WHERE codigo_viagem = ? ORDER BY codigo_viagem;";
        String sql2 = "SELECT * FROM viagem WHERE TO_CHAR(data_viagem, 'DD/MM/YYYY') LIKE ? ORDER BY codigo_viagem;";
        String sql3 = "SELECT * FROM viagem WHERE codigo_motorista = ? ORDER BY codigo_viagem;";
        
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd;
        switch (opcao) {
            case 0:
                prd = cnn.prepareStatement(sql);
                prd.setInt(1, Integer.parseInt(string));
                break;
            case 1:
                prd = cnn.prepareStatement(sql2);
                prd.setString(1, "%" + string + "%");
                break;
            default:
                prd = cnn.prepareStatement(sql3);
                prd.setInt(1, Integer.parseInt(string));
                break;
        }
        
        ResultSet rs = prd.executeQuery();
        ArrayList<Viagem> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Viagem(rs.getInt(1), rs.getString(2), rs.getString(3), 
                    rs.getDouble(4), rs.getDate(5), new PMotorista().consultar(rs.getInt(6))));
        }
        
        return lista.iterator();
    }

    @Override
    public PreparedStatement prepararDeclaracao(Viagem viagem, Connection cnn, String sql) throws SQLException {
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        
        prd.setString(1, viagem.getLocalOrigem());
        prd.setString(2, viagem.getLocalDestino());
        prd.setDouble(3, viagem.getValorViagem());
        prd.setDate(4, viagem.getDataViagem());
        prd.setInt(5, viagem.getMotorista().getCodigoMotorista());
        
        if(viagem.getCodigoViagem()> 0)
            prd.setInt(6, viagem.getCodigoViagem());
        
        return prd;
    }
}
