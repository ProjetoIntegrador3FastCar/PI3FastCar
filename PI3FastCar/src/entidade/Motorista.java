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
    private int condigo_motorista;
    private String nome;
    private long cpf;

    public Motorista(int condigo_motorista, String nome, long cpf) {
        this.condigo_motorista = condigo_motorista;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Motorista() {
        
    }

    public int getCondigo_motorista() {
        return condigo_motorista;
    }

    public void setCondigo_motorista(int condigo_motorista) {
        this.condigo_motorista = condigo_motorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf)throws Exception {
        if(cpf <= 0 )throw new Exception("O CPF não pode ser <= 0");
        this.cpf = cpf;
    }
    
    
}
