/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.observer;

import entidade.Passageiro;
import javax.swing.JOptionPane;
import util.estruturadedados.Lista;
import util.interfaces.observer.Observador;
import util.interfaces.observer.Sujeito;

/**
 *
 * @author rodri
 */
public class Central implements Sujeito{
    
    public Lista listaDeObservadores;
    public DadosDaViagem dados;

    public Central() {
        listaDeObservadores = new Lista();
    }

    @Override
    public void incluirObservador(Observador obj) {
        try {
            listaDeObservadores.insereNoInicio((Passageiro)obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void removerObservador(Observador obj) {
        listaDeObservadores.retirarElemento((Passageiro)obj);
    }

    @Override
    public void notificarObservador() {
        try {
            if(listaDeObservadores.hasNext()){
                for (int i = 0; i < listaDeObservadores.size(); i++) {
                    Observador observer = listaDeObservadores.mostrarObjeto(i);
                    observer.atualizar(dados);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public Lista listarObservador() {
        return listaDeObservadores;
    }
    
    public void setDados(DadosDaViagem dados){
        this.dados = dados;
        notificarObservador();
    }
}
