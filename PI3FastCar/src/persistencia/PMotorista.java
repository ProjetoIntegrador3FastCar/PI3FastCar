/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Motorista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kleiton
 */
public class PMotorista extends TPersistencia<Motorista>{
    
    public void incluir(Motorista motorista) throws SQLException{
        
        String sql = "INSERT INTO motorista(nome, cpf)"
                + " VALUES(?, ?);";
        
        String sql2 = "SELECT currval('codigo_motorista') as codigo";
        
        this.alterarOuIncluir(motorista, sql, sql2);
    }
    
    public void alterar(Motorista motorista) throws SQLException{
        
        
        String sql = "UPDATE motorista SET nome = ? , cpf = ?,"
                + " WHERE codigo_motorista = ?;";
        
        this.alterarOuIncluir(motorista, sql);
    }

    @Override
    public void excluir(int cod) throws SQLException {
        String sql = "DELETE FROM motorista WHERE codigo_motorista = ?";
        
        Connection cnn = util.SConexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, cod);

        prd.execute();
    }

    @Override
    public Motorista consultar(int cod) throws SQLException {
        String sql = "SELECT * FROM motorista WHERE codigo_motorista = ?";
        
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, cod);
        
        ResultSet rs = prd.executeQuery();
        if(rs.next()){
            return new Motorista(rs.getInt(1), rs.getString(2), rs.getString(3), 
            new PVeiculo().consultar(rs.getInt(4)), rs.getBoolean(5), rs.getBoolean(6));
        }
        
        return null;
    }

    @Override
    public Iterator<Motorista> listar() throws SQLException {
        String sql = "SELECT * FROM motorista ORDER BY codigo_motorista;";
        
        Connection cnn = util.SConexao.getConexao();
        Statement prd = cnn.createStatement();
        
        ResultSet rs = prd.executeQuery(sql);
        ArrayList<Motorista> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Motorista(rs.getInt(1), rs.getString(2), rs.getString(3), 
            new PVeiculo().consultar(rs.getInt(4)), rs.getBoolean(5), rs.getBoolean(6)));
        }
        
        return lista.iterator();
    }

    @Override
    public Iterator<Motorista> listarPorFiltro(int opcao, String string) throws SQLException {
        String sql = "SELECT * FROM motorista WHERE codigo_motorista = ? ORDER BY codigo_motorista;";
        String sql2 = "SELECT * FROM motorista WHERE UPPER(nome) LIKE ? ORDER BY codigo_motorista;";
        String sql3 = "SELECT * FROM motorista WHERE cpf = ? ORDER BY codigo_motorista;";
        
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
        ArrayList<Motorista> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Motorista(rs.getInt(1), rs.getString(2), rs.getString(3), 
            new PVeiculo().consultar(rs.getInt(4)), rs.getBoolean(5), rs.getBoolean(6)));
        }
        
        return lista.iterator();
    }

    @Override
    public PreparedStatement prepararDeclaracao(Motorista motorista, Connection cnn, String sql) throws SQLException {
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        
        prd.setString(1, motorista.getNome());
        prd.setString(2, motorista.getCpf()+"");
        
        
        if(motorista.getCodigoMotorista()> 0)
            prd.setInt(6, motorista.getCodigoMotorista());
        
        return prd;
    }

    
    
}
