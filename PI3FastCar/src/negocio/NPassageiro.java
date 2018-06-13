/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Passageiro;
import java.sql.SQLException;
import java.util.Iterator;
import persistencia.PPassageiro;

/**
 *
 * @author rodri
 */
public class NPassageiro {
    public void incluir(Passageiro passageiro) throws SQLException{
        if(passageiro.getCodigoPassageiro() != 0) new PPassageiro().alterar(passageiro);
        else new PPassageiro().incluir(passageiro);
    }
    
    public void excluir(int codigo) throws SQLException{
        new PPassageiro().excluir(codigo);
    }
    
    public Passageiro consultar(int codigo) throws SQLException{
        return new PPassageiro().consultar(codigo);
    }
    
    public Iterator<Passageiro> listar() throws SQLException{
        return new PPassageiro().listar();
    }
    
    public Iterator<Passageiro> listarPorFiltro(int opcao, String filtro) throws SQLException{
        return new PPassageiro().listarPorFiltro(opcao, filtro);
    }
}
