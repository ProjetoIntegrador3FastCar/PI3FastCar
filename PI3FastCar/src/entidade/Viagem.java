/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.sql.Date;
import util.interfaces.Codigo;

/**
 *
 * @author rodri
 */
public class Viagem implements Comparable<Viagem>, Codigo{
    
    private int codigoViagem;
    private String localOrigem;
    private String localDestino;
    private double valorViagem;
    private Date dataViagem;
    private Motorista motorista;
    private int avaliacao;

    public Viagem() {
    }

    public Viagem(int codigoViagem, String localOrigem, String localDestino,
            double valorViagem, Date dataViagem, Motorista motorista, int avaliacao) {
        this.codigoViagem = codigoViagem;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.valorViagem = valorViagem;
        this.dataViagem = dataViagem;
        this.motorista = motorista;
        this.avaliacao = avaliacao;
    }


    public int getCodigoViagem() {
        return codigoViagem;
    }
    
    @Override
    public void setCodigoTipo(int codigoViagem) {
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
    
    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public int compareTo(Viagem objV) {
        if(this.codigoViagem > objV.codigoViagem) return 1;
        else if (this.codigoViagem == objV.codigoViagem) return 0;
        else return -1;
    }
    
}
