/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author andre
 */
public class EPassageiro {
    private int codigo_passageiro;
    private String nome;
    private String numero_celular;
    
    public EPassageiro(){
        
    }
    public EPassageiro(int codigo_passageiro, String nome, String numero_celular){
        this.codigo_passageiro = codigo_passageiro;
        this.nome = nome;
        this.numero_celular = numero_celular;
    }
    
    public int getCodigo_passageiro() {
        return codigo_passageiro;
    }
    
    public void setCodigo_passageiro(int codigo_passageiro) {
        this.codigo_passageiro = codigo_passageiro;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNumero_celular() {
        return numero_celular;
    }
    
    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }
    
}
