/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Motorista;
import java.sql.SQLException;
import java.util.Iterator;
import persistencia.PMotorista;

/**
 *
 * @author Rodrigo Leite
 */
public class NMotorista {
    
    public void incluir(Motorista motorista) throws SQLException{
        if(motorista.getCodigoMotorista() != 0) new PMotorista().alterar(motorista);
        else new PMotorista().incluir(motorista);
    }
    
    public void excluir(int codigo) throws SQLException{
        new PMotorista().excluir(codigo);
    }
    
    public Motorista consultar(int codigo) throws SQLException{
        return new PMotorista().consultar(codigo);
    }
    
    public Iterator<Motorista> listar() throws SQLException{
        return new PMotorista().listar();
    }
    
    public Iterator<Motorista> listarPorFiltro(int opcao, String filtro) throws SQLException{
        return new PMotorista().listarPorFiltro(opcao, filtro);
    }
}
