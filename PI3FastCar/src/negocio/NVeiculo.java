/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Veiculo;
import java.sql.SQLException;
import java.util.Iterator;
import persistencia.PVeiculo;

/**
 *
 * @author Rodrigo Leite
 */
public class NVeiculo {
    public void incluir(Veiculo veiculo) throws SQLException{
        if(veiculo.getCodigoVeiculo() != 0) new PVeiculo().alterar(veiculo);
        else new PVeiculo().incluir(veiculo);
    }
    
    public void excluir(int codigo) throws SQLException{
        new PVeiculo().excluir(codigo);
    }
    
    public Veiculo consultar(int codigo) throws SQLException{
        return new PVeiculo().consultar(codigo);
    }
    
    public Iterator<Veiculo> listar() throws SQLException{
        return new PVeiculo().listar();
    }
    public Iterator<Veiculo> listarPorFiltro(int opcao, String filtro) throws SQLException{
        return new PVeiculo().listarPorFiltro(opcao, filtro);
    }
}
