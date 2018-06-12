/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import util.CategoriaAbstrata;

/**
 *
 * @author Kleiton
 */
public class PVeiculo extends TPersistencia<Veiculo>{
    
    public void incluir(Veiculo veiculo) throws SQLException{
        
        String sql = "INSERT INTO veiculo(modelo, cor, placa, cod_categoria)"
                + " VALUES(?, ?, ?, ?);";
        
        String sql2 = "SELECT currval('codigo_veiculo') as codigo";
        
        this.alterarOuIncluir(veiculo, sql, sql2);
    }
    
    public void alterar(Veiculo veiculo) throws SQLException{
        
        
        String sql = "UPDATE veiculo SET modelo = ?, cor = ?, placa = ?, cod_categoria = ?"
                + " WHERE codigo_veiculo = ?;";
        
        this.alterarOuIncluir(veiculo, sql);
    }

    @Override
    public void excluir(int cod) throws SQLException {
        String sql = "DELETE FROM veiculo WHERE codigo_veiculo = ?";
        
        Connection cnn = util.SConexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, cod);

        prd.execute();
    }

    @Override
    public Veiculo consultar(int cod) throws SQLException {
        String sql = "SELECT * FROM veiculo WHERE codigo_veiculo = ?";
        
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, cod);
        
        ResultSet rs = prd.executeQuery();
        if(rs.next()){
            return new Veiculo(rs.getInt(1), CategoriaAbstrata.getInstance(rs.getInt(2)), rs.getString(3), rs.getString(4), 
                    rs.getString(5));
        }
        
        return null;
    }

    @Override
    public Iterator<Veiculo> listar() throws SQLException {
        String sql = "SELECT * FROM veiculo ORDER BY codigo_veiculo;";
        
        Connection cnn = util.SConexao.getConexao();
        Statement prd = cnn.createStatement();
        
        ResultSet rs = prd.executeQuery(sql);
        ArrayList<Veiculo> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Veiculo(rs.getInt(1), CategoriaAbstrata.getInstance(rs.getInt(2)), rs.getString(3), rs.getString(4), 
                    rs.getString(5)));
        }
        
        return lista.iterator();
    }

    @Override
    public Iterator<Veiculo> listarDescricao(int opcao, String string) throws SQLException {
        String sql = "SELECT * FROM veiculo WHERE codigo_veiculo = ? ORDER BY codigo_veiculo;";
        String sql2 = "SELECT * FROM veiculo WHERE modelo = ? ORDER BY modelo;";
        String sql3 = "SELECT * FROM veiculo v INNER JOIN categoria_veiculo cv "
                + "ON v.cod_categoria = cv.codigo_categoria "
                + "WHERE descricao = ? ORDER BY codigo_viagem;";
        
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
        ArrayList<Veiculo> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Veiculo(rs.getInt(1), CategoriaAbstrata.getInstance(rs.getInt(2)), rs.getString(3), rs.getString(4), 
                    rs.getString(5)));
        }
        
        return lista.iterator();
    }

    @Override
    public PreparedStatement prepararDeclaracao(Veiculo veiculo, Connection cnn, String sql) throws SQLException {
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        
        prd.setString(1, veiculo.getModelo());
        prd.setString(2, veiculo.getCor());
        prd.setString(3, veiculo.getPlaca());
        prd.setInt(4, veiculo.getCategoria().getCodCategoria());
        prd.setInt(5, veiculo.getCodigoVeiculo());
        
        if(veiculo.getCodigoVeiculo()> 0)
            prd.setInt(6, veiculo.getCodigoVeiculo());
        
        return prd;
    }
    
}
