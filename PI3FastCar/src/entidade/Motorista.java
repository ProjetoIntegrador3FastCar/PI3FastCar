/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Kleiton
 */
public class Motorista {
    private int codigoMotorista;
    private String nome;
    private String cpf;

    public Motorista(int codigoMotorista, String nome, String cpf) {
        this.codigoMotorista = codigoMotorista;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Motorista() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigoMotorista() {
        return codigoMotorista;
    }

    public void setCodigoMotorista(int codigoMotorista) {
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
}
