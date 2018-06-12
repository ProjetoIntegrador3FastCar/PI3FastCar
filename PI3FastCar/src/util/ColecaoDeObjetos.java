/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author rodri
 */
public class ColecaoDeObjetos<T> implements Iterator<T>{
    private Lista<T> lista = null;

        public ColecaoDeObjetos(Lista<T> lista) throws Exception{
            if(lista == null) throw new Exception("Lista vazia!");
            this.lista = lista;
        }
        
        @Override
        public boolean hasNext() {
            return lista.eVazia();
        }
        
        @Override
        public T next() {
            No aux = lista.getInicio();
            return (T) aux.getObjeto();
        }
}
