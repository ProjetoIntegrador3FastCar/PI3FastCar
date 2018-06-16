/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import entidade.observer.DadosDaViagem;
import util.interfaces.Codigo;
import util.interfaces.observer.MostrarDados;
import util.interfaces.observer.Observador;
import util.interfaces.observer.Sujeito;

/**
 *
 * @author andre
 */
public class Passageiro implements Codigo, Comparable<Passageiro>, Observador, MostrarDados{
    private int codigoPassageiro;
    private String nome;
    private String numeroCelular;
    private DadosDaViagem dados;
    private Sujeito central;
    
    public Passageiro(){}
    
    public Passageiro(Sujeito central){
        this.central = central;
        this.central.incluirObservador(this);
    }
    
    public Passageiro(int codigoPassageiro, String nome, String numeroCelular){
        this.codigoPassageiro = codigoPassageiro;
        this.nome = nome;
        this.numeroCelular = numeroCelular;
    }
    
    public int getCodigoPassageiro() {
        return codigoPassageiro;
    }
    
    @Override
    public void setCodigoTipo(int codigo_passageiro) {
        this.codigoPassageiro = codigo_passageiro;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNumeroCelular() {
        return numeroCelular;
    }
    
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public int compareTo(Passageiro obj) {
        if(this.getCodigoPassageiro() > obj.getCodigoPassageiro()) return 1;
        else if (this.getCodigoPassageiro() == obj.getCodigoPassageiro()) return 0;
        else return -1;
    }

    @Override
    public void atualizar(DadosDaViagem dados) {
        this.dados = dados;
        mostrar();
    }

    @Override
    public void mostrar() {
        StringBuilder re = new StringBuilder();
        re.append("-------- Dados para avaliação --------\n");
        re.append("Passageiro: ");
        re.append(dados.getPassageiro().getNome());
        re.append("\n");
        re.append("Motorista: ");
        re.append(dados.getMotorista().getNome());
        re.append("\n");
        re.append("Legenda para avaliação: 1 - Ruim; 2 - Regular; 3 - Ótimo\n");
        
        System.out.println(re.toString());
    }
    
}
