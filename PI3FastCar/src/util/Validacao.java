/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JOptionPane;

/**
 *
 * @author Kleiton
 */
public class Validacao {
    //Atributos
    private long cpf = 0;
    
    //Metodos

    /**
     * @return the cpf
     */
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

    // Calculos
    public String validacaoCPF(){
        long dv, d1, dv1, d2, dv2;
        String valido ="";
        dv = (cpf%100);
        d1 = (2*(cpf/100%10));
        d1 += (3*(cpf/1000%10));
        d1 += (4*(cpf/10000%10));
        d1 += 5*(cpf/100000%10);
        d1 += 6*(cpf/1000000%10);
        d1 += 7*(cpf/10000000%10);
        d1 += 8*(cpf/100000000%10);
        d1 += 9*(cpf/100000/10000%10);
        d1 += 10*(cpf/100000/100000);
        dv1 = 11-(d1 % 11);
        if(dv1 == 10 || dv1 == 11){
            dv1 = 0;
        }
        
        d2 = (2*dv1);
        d2 += (3*(cpf/100%10));
        d2 += (4*(cpf/1000%10));
        d2 += (5*(cpf/10000%10));
        d2 += 6*(cpf/100000%10);
        d2 += 7*(cpf/1000000%10);
        d2 += 8*(cpf/10000000%10);
        d2 += 9*(cpf/100000000%10);
        d2 += 10*(cpf/100000/10000%10);
        d2 += 11*(cpf/100000/100000);
        dv2 = 11-(d2 % 11);
        if(dv2 == 10 || dv2 == 11){
            dv2 = 0;
        }
        
        dv1 = dv1 * 10;
        dv2 += dv1;
        
        if(dv2 == dv){
            valido = "CPF VALIDO!!!";
            
        }
        else {
            valido = "CPF INVALIDO!!!";
            
        }
        
        
        return valido;
    }
    
}
