/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import util.fabricaabstrata.CategoriaAbstrata;
import util.interfaces.Codigo;

/**
 *
 * @author Kleiton
 */
public class Veiculo implements Codigo{
    private int codigoVeiculo;
    private String placa;
    private String cor;
    private String modelo;
    private CategoriaAbstrata categoria;

    public Veiculo() {}
    
    public Veiculo(int codigoVeiculo, String placa, String cor, String modelo,
            CategoriaAbstrata categoria) {
        this.codigoVeiculo = codigoVeiculo;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }
    
    @Override
    public void setCodigoTipo(int codigoVeiculo) {
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
