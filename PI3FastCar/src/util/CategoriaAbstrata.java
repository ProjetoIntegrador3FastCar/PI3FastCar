/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entidade.Veiculo;
import java.sql.SQLException;
import java.util.Iterator;

/**
 *
 * @author rodri
 */
public abstract class CategoriaAbstrata {
    
    protected int codCategoria;
    protected String descricao;
    
    public static Iterator<CategoriaAbstrata> getListaDeCategorias() throws SQLException{
        return new PCategoria().listar();
    }
    
    public int getCodCategoria(){ return codCategoria; }
    public String getDescricao(){ return descricao; }
    public abstract Iterator<Veiculo> getListaDeVeiculos();
    public static CategoriaAbstrata getInstance(int codCat){
        return SCategoria.values()[codCat].getInstance();
    }
}
