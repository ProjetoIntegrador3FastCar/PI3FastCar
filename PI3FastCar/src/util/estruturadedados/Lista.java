/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.estruturadedados;

import entidade.Passageiro;
import java.util.Iterator;

/**
 *
 * @author rodri
 */
public class Lista implements Iterator<Lista>{
    
    private No inicio;
    private No fim;
    private int qtdeNo;

    public Lista() {
        inicio = null;
        fim = null;
        this.qtdeNo = 0;
    }
    
    public boolean eVazia(){ return inicio == null && fim == null; }
    
    public Passageiro mostrarObjeto(Passageiro objeto) throws Exception{
        if(eVazia()) throw new Exception("Lista vazia!");
        No aux = inicio;
        while(aux != null){
            if(aux.getObjeto().equals(objeto))
                return aux.getObjeto();
            aux = aux.getProximoNo();
        }
        return null;
    }
    
    public Passageiro mostrarObjeto(int index) throws Exception{
        if(eVazia()) throw new Exception("Lista vazia!");
        No aux = inicio;
        while(aux != null){
            if(aux.getIndex() == index)
                return aux.getObjeto();
            aux = aux.getProximoNo();
        }
        return null;
    }
    
    public void insereNoInicio(Passageiro obj) throws Exception{
        if (obj == null) throw new Exception("Passageiro inexistente.");
        No novo = new No(obj, null);
        novo.setIndex(this.qtdeNo);
        if(eVazia()) fim = novo;
        else novo.setProximoNo(inicio);
        
        inicio = novo;
        this.qtdeNo++;
    }
    
    public void insereNoFim(Passageiro obj) throws Exception{
        if (obj == null) throw new Exception("Passageiro inexistente.");
        No novo = new No(obj, null);

        if (eVazia()) {
            novo.setProximoNo(novo);
            fim = novo;
        } else {
            novo.setProximoNo(fim.getProximoNo());
            fim.setProximoNo(novo);
            fim = novo;
        }
        this.qtdeNo++;
    }
    
    public void inserirOrdenado(Passageiro obj) throws Exception{
        if (obj == null) throw new Exception("Passageiro inexistente.");
        No novo = new No(obj, null);
        if (eVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            No ant = null;
            No prox = inicio;
            while (prox != null && obj.compareTo(prox.getObjeto()) > 0) {
                ant = prox;
                prox = prox.getProximoNo();
            }
            if (ant == null) {
                insereNoInicio(obj);
            } else {
                ant.setProximoNo(novo);
                novo.setProximoNo(prox);
            }
        }
        this.qtdeNo++;
    }
    
    public No retirarElemento(Passageiro elemento){
        if(elemento == null) return null;
        if(!eVazia()) {
            No prox = inicio;
            No ultimo = null;
            if(elemento.compareTo(fim.getObjeto()) <= 0 && elemento.compareTo(inicio.getObjeto()) >= 0){
                while(prox != null && elemento.compareTo(prox.getObjeto()) >= 0){
                    if(elemento.compareTo(prox.getObjeto()) == 0){
                        if(inicio.compareTo(fim) == 0){
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
                    else if(prox.getObjeto().compareTo(elemento) > 0){
                        return null;
                    }
                    ultimo = prox;
                    prox = prox.getProximoNo();
                }
            }
            this.qtdeNo--;
        }
        return null;
    }
    
    public int size(){
        return this.qtdeNo;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    @Override
    public boolean hasNext() {
        No aux = inicio;
        int qde = 0;
        while(aux != null){
            qde++;
            aux = aux.getProximoNo();
        }
        return qde > 0;
    }

    @Override
    public Lista next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
