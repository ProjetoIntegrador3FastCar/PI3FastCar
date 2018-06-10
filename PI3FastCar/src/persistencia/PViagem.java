/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Viagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Viagem consultar(int cod) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Viagem> listar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Viagem> listarDescricao(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
