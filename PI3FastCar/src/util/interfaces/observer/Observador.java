/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.interfaces.observer;


import entidade.observer.DadosDaViagem;

/**
 *
 * @author rodri
 */
public interface Observador {
    public void atualizar(DadosDaViagem dados);
}
