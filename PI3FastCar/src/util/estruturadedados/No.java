/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.estruturadedados;

import entidade.Passageiro;

/**
 *
 * @author rodri
 */
public class No implements Comparable<No>{
    
    private Passageiro objeto;
    private No proximoNo;
    private int index;
    
    public No(Passageiro objeto, No proximoNo){
        this.objeto = objeto;
        this.proximoNo = proximoNo;
    }

    public No() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public Passageiro getObjeto() {
        return objeto;
    }

    public void setObjeto(Passageiro objeto) {
        this.objeto = objeto;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public int compareTo(No o) {
        if(this.getObjeto().equals(o.getObjeto())) return 0;
        else return 1;
    }
}
