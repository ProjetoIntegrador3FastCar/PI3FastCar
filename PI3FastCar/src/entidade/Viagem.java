/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.sql.Date;

/**
 *
 * @author rodri
 */
public class Viagem {
    
    
    
    private int codigoViagem;
    private String localOrigem;
    private String localDestino;
    private double valorViagem;
    private Date dataViagem;
    private String formaPagamento;
    private Motorista motorista;

    public Viagem() {
    }

    public Viagem(int codigoViagem, String localOrigem, String localDestino,
            double valorViagem, Date dataViagem, String formaPagamento, 
            Motorista motorista) {
        this.codigoViagem = codigoViagem;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.valorViagem = valorViagem;
        this.dataViagem = dataViagem;
        this.formaPagamento = formaPagamento;
        this.motorista = motorista;
    }


    public int getCodigoViagem() {
        return codigoViagem;
    }

    public void setCodigoViagem(int codigoViagem) {
        this.codigoViagem = codigoViagem;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public double getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public Date getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(Date dataViagem) {
        this.dataViagem = dataViagem;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
}
