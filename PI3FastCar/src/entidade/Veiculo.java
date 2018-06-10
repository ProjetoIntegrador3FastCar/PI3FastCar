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
public class Veiculo {
    private int codigoVeiculo;
    private String placa;
    private String cor;
    private String modelo;

    public Veiculo(int codigo_veiculo, String placa, String cor, String modelo) {
        this.codigoVeiculo = codigoVeiculo;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }

    public int getCodigo_veiculo() {
        return codigoVeiculo;
    }

    public void setCodigo_veiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
