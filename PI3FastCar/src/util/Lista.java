/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author rodri
 */
public class Lista<T> {
    
    private No inicio;
    private No fim;

    public Lista() {
    }
    
    public boolean eVazia(){ return inicio == null && fim == null; }
    
    public T mostrarObjeto(T objeto) throws Exception{
        if(eVazia()) throw new Exception("Lista vazia!");
        No aux = inicio;
        while(aux != null){
            if(aux.getObjeto().equals(objeto))
                return (T) aux.getObjeto();
        }
        return null;
    }
    
    
}
