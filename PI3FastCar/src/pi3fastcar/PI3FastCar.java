/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi3fastcar;

import dadosValidacao.Validacao;

/**
 *
 * @author Kleiton
 */
public class PI3FastCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Motorista moto = new Motorista();
        Validacao valida = new Validacao();
        long cpf = 11111111112L;
        valida.setCpf(cpf);
        
        System.out.println(valida.getCpf());
        System.out.println(valida.validacaoCPF());
        
    }
    
}
