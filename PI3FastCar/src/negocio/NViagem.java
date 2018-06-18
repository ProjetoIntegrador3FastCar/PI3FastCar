/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Viagem;
import java.sql.SQLException;
import java.util.Iterator;
import persistencia.PViagem;

/**
 *
 * @author Rodrigo Leite
 */
public class NViagem {
    public void incluir(Viagem viagem) throws SQLException{
        if(viagem.getCodigoViagem() != 0) new PViagem().alterar(viagem);
        else new PViagem().incluir(viagem);
    }
    
    public void excluir(int codigo) throws SQLException{
        new PViagem().excluir(codigo);
    }
    
    public Viagem consultar(int codigo) throws SQLException{
        return new PViagem().consultar(codigo);
    }
    
    public Iterator<Viagem> listar() throws SQLException{
        return new PViagem().listar();
    }
    
    public Iterator<Viagem> listarPorFiltro(int opcao, String filtro) throws SQLException{
        return new PViagem().listarPorFiltro(opcao, filtro);
    }
}
