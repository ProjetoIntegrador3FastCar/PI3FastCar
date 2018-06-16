/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import util.interfaces.Codigo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

/**
 * Classe Template para persistências das classes: 
 * 
 * <ul>
 *  <li>Avaliacao</li>
 *  <li>Motorista</li>
 *  <li>Passageiro</li>
 *  <li>Veiculo</li>
 *  <li>Viagem</li>
 *  <li>Categoria</li>
 * </ul>
 * 
 * Para classe Categoria será, a priori, apenas para listagem e consulta das
 * categorias existentes.
 * 
 * @author Rodrigo Leite
 * @param <T> Classe a ser persistida
 */
public abstract class TPersistencia<T>{
    
    
    public abstract void excluir(int cod) throws SQLException;
    public abstract T consultar(int cod) throws SQLException;
    public abstract Iterator<T> listar() throws SQLException;
    public abstract Iterator<T> listarPorFiltro(int opcao, String filtro) throws SQLException;
    public abstract PreparedStatement prepararDeclaracao(T obj, Connection cnn, String sql) throws SQLException;
    
    public void alterarOuIncluir(T obj, String... sql) throws SQLException{
        Connection cnn = util.SConexao.getConexao();
        
        
        cnn.setAutoCommit(false);
        try{
        String sql2 = sql[0];
            PreparedStatement prd = prepararDeclaracao(obj, cnn, sql2);

            prd.execute();

            if(sql.length > 1){
                String sql3 = sql[1];
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql3);
                if (rs.next()) {
                    ((Codigo)obj).setCodigoTipo(rs.getInt("codigo"));
                }
                rs.close();
            }
            cnn.commit();
        }catch(Exception e){
            e.printStackTrace();
            cnn.rollback();
        }
        cnn.close();
    }
}
