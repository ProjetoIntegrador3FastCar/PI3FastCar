/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Solicitacao;
import java.sql.SQLException;
import java.util.Iterator;
import persistencia.PSolicitacao;

/**
 *
 * @author rodri
 */
public class NSolicitacao {
    public void incluir(Solicitacao solicitacao) throws SQLException{
        new PSolicitacao().incluir(solicitacao);
    }
    
    public void excluir(int codigo) throws SQLException{
        new PSolicitacao().excluir(codigo);
    }
    
    public Solicitacao consultar(int codigo) throws SQLException{
        return new PSolicitacao().consultar(codigo);
    }
    
    public Iterator<Solicitacao> listar() throws SQLException{
        return new PSolicitacao().listar();
    }
    
    public Iterator<Solicitacao> listarPorFiltro(int opcao, String filtro) throws SQLException{
        return new PSolicitacao().listarPorFiltro(opcao, filtro);
    }
}
