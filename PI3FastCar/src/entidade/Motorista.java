/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import util.interfaces.Codigo;

/**
 *
 * @author Kleiton
 */
public class Motorista implements Codigo{
    
    private Veiculo veiculo;
    private int codigoMotorista;
    private String nome;
    private String cpf;
    private boolean statusMotorista;
    private boolean statusDeCorrida;

    public Motorista(int codigoMotorista, String nome, String cpf, 
             Veiculo veiculo, boolean statusMotorista, boolean statusDeCorrida) {
        this.codigoMotorista = codigoMotorista;
        this.nome = nome;
        this.cpf = cpf;
        this.statusMotorista = statusMotorista;
        this.statusDeCorrida = statusDeCorrida;
        this.veiculo = veiculo;
    }
    
    public Motorista() {}

    public int getCodigoMotorista() {
        return codigoMotorista;
    }
    
    @Override
    public void setCodigoTipo(int codigoMotorista) {
        this.codigoMotorista = codigoMotorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf)throws Exception {
        if(cpf.length() <= 0)throw new Exception("CPF inválido.");
        this.cpf = cpf;
    }

    public boolean isStatusMotorista() {
        return statusMotorista;
    }

    public void setStatusMotorista(boolean statusMotorista) {
        this.statusMotorista = statusMotorista;
    }

    public boolean isStatusDeCorrida() {
        return statusDeCorrida;
    }

    public void setStatusDeCorrida(boolean statusDeCorrida) {
        this.statusDeCorrida = statusDeCorrida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
}
