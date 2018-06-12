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
    private long cpf;

    public Motorista(int codigo_motorista, String nome, long cpf) {
        this.codigoMotorista = codigo_motorista;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Motorista() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo_motorista() {
        return codigoMotorista;
    }

    public void setCodigo_motorista(int codigoMotorista) {
        this.codigoMotorista = codigoMotorista;
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

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf)throws Exception {
        if(cpf <= 0 )throw new Exception("O CPF não pode ser <= 0");
        this.cpf = cpf;
    }

        
    
}
