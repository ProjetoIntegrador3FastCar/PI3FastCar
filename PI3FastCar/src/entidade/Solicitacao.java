/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author rodri
 */
public class Solicitacao {
    
    private Viagem viagem;
    private Passageiro passageiro;
    private String formaDePagamento;

    public Solicitacao() {}

    public Solicitacao(Viagem viagem, Passageiro passageiro, String formaDePagamento) {
        this.viagem = viagem;
        this.passageiro = passageiro;
        this.formaDePagamento = formaDePagamento;
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
