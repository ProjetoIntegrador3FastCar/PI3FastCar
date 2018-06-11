/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidade.Motorista;
import entidade.Viagem;
import java.util.ArrayList;
import org.joda.time.DateTime;
import util.Lista;
import util.Validacao;

/**
 *
 * @author Kleiton
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        Motorista moto = new Motorista();
//        Validacao valida = new Validacao();
//        long cpf = 11111111112L;
//        valida.setCpf(cpf);
//        
//        System.out.println(valida.getCpf());
//        System.out.println(valida.validacaoCPF());
//        DateTime data = new DateTime();
        Lista<Viagem> lista = new Lista();
        Viagem viagem = new Viagem();
        Viagem viagem2 = new Viagem();
        Viagem viagem3 = new Viagem();
        Viagem viagem4 = new Viagem();
        Viagem viagem5 = new Viagem();
        Motorista moto = new Motorista();
        moto.setCodigoMotorista(1);
        moto.setNome("Batista");
        moto.setCpf("12345678909");
        viagem.setCodigoTipo(1);
        viagem.setDataViagem(new java.sql.Date(System.currentTimeMillis()));
        viagem.setLocalOrigem("A");
        viagem.setLocalDestino("B");
        viagem.setValorViagem(14);
        viagem.setMotorista(moto);
        viagem2.setCodigoTipo(2);
        viagem2.setDataViagem(new java.sql.Date(System.currentTimeMillis()));
        viagem2.setLocalOrigem("A");
        viagem2.setLocalDestino("B");
        viagem2.setValorViagem(14);
        viagem2.setMotorista(moto);
        lista.insereNoInicio(viagem);
        lista.insereNoInicio(viagem2);
        
        viagem3 = (Viagem) lista.getFim().getObjeto();
        viagem4 = (Viagem) lista.getInicio().getObjeto();
        System.out.println("Viagem 1: " + viagem.getCodigoViagem());
        System.out.println("Viagem 2: " + viagem2.getCodigoViagem());
        lista.retirarElemento(viagem2);
        System.out.println(viagem3.getCodigoViagem());
        System.out.println(viagem4.getCodigoViagem());
    }
    
}
