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
public class No<T> implements Comparable<T>{
    
    private T objeto;
    private No proximoNo;
    
    public No(T objeto, No proximoNo){
        this.objeto = objeto;
        this.proximoNo = proximoNo;
    }

    public No() {
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public int compareTo(T o) {
        if(this.getObjeto().equals(o)) return 0;
        else return -1;
    }
}
