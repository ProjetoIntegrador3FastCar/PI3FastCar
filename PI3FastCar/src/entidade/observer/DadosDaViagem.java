/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.observer;


import entidade.Motorista;
import entidade.Passageiro;
import entidade.Solicitacao;
import entidade.Viagem;

/**
 *
 * @author rodri
 */
public class DadosDaViagem {
    
    private Solicitacao solicitacao;

    public DadosDaViagem(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }
    
    public Viagem getViagem(){
        return this.solicitacao.getViagem();
    }
    
    public Motorista getMotorista(){
        return this.solicitacao.getViagem().getMotorista();
    }
    
    public Passageiro getPassageiro(){
        return this.solicitacao.getPassageiro();
    }
}
