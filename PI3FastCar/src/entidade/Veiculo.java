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
    private int codigo_veiculo;
    private String placa;
    private String cor;
    private String modelo;
    //private Categoria categoria;

    public Veiculo(int codigo_veiculo, String placa, String cor, String modelo) {
        this.codigo_veiculo = codigo_veiculo;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }

    public int getCodigo_veiculo() {
        return codigo_veiculo;
    }

    public void setCodigo_veiculo(int codigo_veiculo) {
        this.codigo_veiculo = codigo_veiculo;
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
