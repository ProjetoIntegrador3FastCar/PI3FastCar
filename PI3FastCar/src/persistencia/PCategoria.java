/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import util.fabricaabstrata.CategoriaAbstrata;

/**
 *
 * @author rodri
 */
public class PCategoria extends TPersistencia<CategoriaAbstrata>{
    
    @Override
    public CategoriaAbstrata consultar(int cod) throws SQLException {
        String sql = "SELECT * FROM categoria_veiculo WHERE codigo_veiculo = ?;";
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, cod);
        
        ResultSet rs = prd.executeQuery();
        if(rs.next())
            return CategoriaAbstrata.getInstance(rs.getInt(1));
        
        return null;
    }

    @Override
    public Iterator<CategoriaAbstrata> listar() throws SQLException {
        String sql = "SELECT * FROM categoria_veiculo ORDER BY codigo_categoria;";
        Connection cnn = util.SConexao.getConexao();
        Statement prd = cnn.createStatement();
        
        ResultSet rs = prd.executeQuery(sql);
        ArrayList<CategoriaAbstrata> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(CategoriaAbstrata.getInstance(rs.getInt(1)-1));
        }
        return lista.iterator();
    }
    
    @Override
    public void excluir(int cod) throws SQLException {}
    
    @Override
    public Iterator<CategoriaAbstrata> listarPorFiltro(int opcao, String string) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepararDeclaracao(CategoriaAbstrata obj, Connection cnn, String sql) throws SQLException {
        return null;
    }
    
}
