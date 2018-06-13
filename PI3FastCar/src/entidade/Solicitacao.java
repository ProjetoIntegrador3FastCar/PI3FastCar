/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import util.interfaces.Codigo;

/**
 *
 * @author rodri
 */
public class Solicitacao implements Codigo{
    
    private int codigoSolicitacao;
    private Viagem viagem;
    private Passageiro passageiro;
    private String formaDePagamento;

    public Solicitacao() {}

    public Solicitacao(int codigoSolicitacao, Viagem viagem, Passageiro passageiro, String formaDePagamento) {
        this.codigoSolicitacao = codigoSolicitacao;
        this.viagem = viagem;
        this.passageiro = passageiro;
        this.formaDePagamento = formaDePagamento;
    }

    public int getCodigoSolicitacao() {
        return codigoSolicitacao;
    }
    
    @Override
    public void setCodigoTipo(int codigoSolicitacao) {
        this.codigoSolicitacao = codigoSolicitacao;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
