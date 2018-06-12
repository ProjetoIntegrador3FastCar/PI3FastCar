/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author andre
 */
public class Avaliacao {
    private int codigoAvaliacao;
    private Motorista motorista;
    private Passageiro passageiro;
    private int avaliacao;
    
    public Avaliacao(){
        
    }
    public Avaliacao(int codigo_avaliacao, Motorista motorista, Passageiro passageiro, int avaliacao){
        this.codigoAvaliacao = codigo_avaliacao;
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.avaliacao = avaliacao;
    }

    public int getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(int codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setCodMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}

