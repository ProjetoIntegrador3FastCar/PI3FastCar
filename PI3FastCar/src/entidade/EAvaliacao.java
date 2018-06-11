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
public class EAvaliacao {
    private int codigoAvaliacao;
    private Motorista codMotorista;
    private EPassageiro codPassageiro;
    private int avaliacao;
    
    public EAvaliacao(){
        
    }
    public EAvaliacao(int codigo_avaliacao, int cod_motorista, EPassageiro cod_passageiro, int avaliacao){
        this.codigoAvaliacao = codigo_avaliacao;
        this.codMotorista = cod_motorista;
        this.codPassageiro = cod_passageiro;
        this.avaliacao = avaliacao;
    }

    public int getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(int codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public int getCodMotorista() {
        return codMotorista;
    }

    public void setCodMotorista(int codMotorista) {
        this.codMotorista = codMotorista;
    }

    public EPassageiro getCodPassageiro() {
        return codPassageiro;
    }

    public void setCodPassageiro(EPassageiro codPassageiro) {
        this.codPassageiro = codPassageiro;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}

