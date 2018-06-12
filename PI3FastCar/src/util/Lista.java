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
public class Lista<T>{
    
    private No<T> inicio;
    private No<T> fim;

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
    
    public void insereNoInicio(Comparable elemento){
        No<T> novo = new No(elemento, null);
        
        if(eVazia()) fim = novo;
        else novo.setProximoNo(inicio);
        
        inicio = novo;
    }
    
    public void insereNoFim(Comparable elemento) {
        No<T> novo = new No(elemento, null);

        if (eVazia()) {
            novo.setProximoNo(novo);
            fim = novo;
        } else {
            novo.setProximoNo(fim.getProximoNo());
            fim.setProximoNo(novo);
            fim = novo;
        }
    }
    
    public void inserirOrdenado(Comparable elemento) {
        No<T> novo = new No(elemento, null);
        if (eVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            No ant = null;
            No prox = inicio;
            while (prox != null && elemento.compareTo(prox.getObjeto()) > 0) {
                ant = prox;
                prox = prox.getProximoNo();
            }
            if (ant == null) {
                insereNoInicio(elemento);
            } else {
                ant.setProximoNo(novo);
                novo.setProximoNo(prox);
            }
        }
    }
    
    public No<T> retirarElemento(Comparable elemento){
        if(elemento == null) return null;
        if(!eVazia()) {
            No prox = inicio;
            No ultimo = null;
            if(elemento.compareTo(fim.getObjeto()) <= 0 && elemento.compareTo(inicio.getObjeto()) >= 0){
                while(prox != null && elemento.compareTo(prox.getObjeto()) >= 0){
                    if(elemento.compareTo(prox.getObjeto()) == 0){
                        if(inicio.compareTo(fim.getObjeto()) == 0){
                            inicio = null;
                            fim = null;
                            return prox;
                        }else if(prox.getProximoNo() == null){
                            ultimo.setProximoNo(null);
                            fim = ultimo;
                            return prox;
                        }
                        else if(ultimo == null){
                            inicio = prox.getProximoNo();
                            return prox;
                        }else {
                            ultimo.setProximoNo(prox.getProximoNo());
                            return prox;
                        }
                    }
                    else if(prox.compareTo(elemento) > 0){
                        return null;
                    }
                    ultimo = prox;
                    prox = prox.getProximoNo();
                }
            }
        }
        return null;
    }

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getFim() {
        return fim;
    }

    public void setFim(No<T> fim) {
        this.fim = fim;
    }
}
