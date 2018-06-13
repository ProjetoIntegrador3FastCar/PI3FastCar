/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.fabricasconcretas;

import util.fabricaabstrata.CategoriaAbstrata;

/**
 *
 * @author rodri
 */
public enum StCategoria {
    
    CARRO_SIMPLES{
        @Override
        public CategoriaAbstrata getInstance() {
            return new CarroSimples();
        }
    },
    CARRO_LUXO{
        @Override
        public CategoriaAbstrata getInstance() {
            return new CarroLuxo();
        }
    },
    CARRO_ESPECIAL{
        @Override
        public CategoriaAbstrata getInstance() {
            return new CarroEspecial();
        }
    };
    
    public abstract CategoriaAbstrata getInstance();
}
