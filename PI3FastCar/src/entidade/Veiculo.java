/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import util.fabricaabstrata.CategoriaAbstrata;

/**
 *
 * @author Kleiton
 */
public class Veiculo {
    private int codigoVeiculo;
    private CategoriaAbstrata categoria;
    private String placa;
    private String cor;
    private String modelo;

    public Veiculo(int codigoVeiculo, CategoriaAbstrata categoria, String placa, String cor, String modelo) {
        this.codigoVeiculo = codigoVeiculo;
        this.categoria = categoria;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public CategoriaAbstrata getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaAbstrata categoria) {
        this.categoria = categoria;
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
