/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;


import entidade.fabricasconcretas.StCategoria;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Kleiton
 */
public class Teste {
    int se = 0;
    /**
     * @param args the command line arguments
     */
    Timer timer = new Timer();
    TimerTask timerT = new TimerTask(){
        public void run(){
            se++;
            System.out.printf("%2d\n", se);
            if(se == 10){
                timer.cancel();
                timer.purge();
            }
        }
    };
    
    public void start(){
        timer.scheduleAtFixedRate(timerT, 1000, 1000);
    }
    
    public void stop(){
        
    }
    
    public static void main(String[] args) throws Exception {
        try {
            String localDestino = JOptionPane.showInputDialog("Local de destino:");
            
            if(localDestino.trim().isEmpty())
                System.out.println("Está vazio");
//            for (int i = 0; i < StCategoria.values().length; i++) {
//                System.out.println(StCategoria.values()[i].getInstance().getCodCategoria());
//            }
            
//            System.out.println(new Random().nextInt(3)+1);
//            Teste test = new Teste();
//            test.start();
            
//            Central central = new Central();
//            Passageiro p1 = new Passageiro(central);
//            p1.setCodigoTipo(1);
//            p1.setNome("Rodrigo Leite");
//            p1.setNumeroCelular("9988");
//
//            Motorista motorista = new Motorista();
//            motorista.setCodigoTipo(1);
//            motorista.setNome("Kleiton ");
//            motorista.setCpf("8958");
//
//            Viagem viagem = new Viagem();
//            viagem.setCodigoTipo(1);
//            viagem.setDataViagem(new java.sql.Date(System.currentTimeMillis()));
//            viagem.setLocalDestino("rua bla bla qd.");
//            viagem.setLocalOrigem("la nos quintos");
//            viagem.setMotorista(motorista);
//            viagem.setValorViagem(45.00);
//
//            Solicitacao solicita = new Solicitacao(1 ,viagem, p1, "Cartão de Credito");
//            DadosDaViagem ddv = new DadosDaViagem(solicita);
//            central.setDados(ddv);
//            central.notificarObservador();
//            System.out.println();
//            central.removerObservador(p1);
//            System.out.println(central.listarObservador().mostrarObjeto(0));
        } catch (NullPointerException e) {
            System.out.println("Nulo");
        }
//        central.notificarObservador();
//        Motorista moto = new Motorista();
//        Validacao valida = new Validacao();
//        long cpf = 11111111112L;
//        valida.setCpf(cpf);
//        
//        System.out.println(valida.getCpf());
//        System.out.println(valida.validacaoCPF());
//        DateTime data = new DateTime();
//        Lista<Viagem> lista = new Lista();
//        Viagem viagem = new Viagem();
//        Viagem viagem2 = new Viagem();
//        Viagem viagem3 = new Viagem();
//        Viagem viagem4 = new Viagem();
//        Viagem viagem5 = new Viagem();
//        Motorista moto = new Motorista();
//        moto.setCodigoMotorista(1);
//        moto.setNome("Batista");
//        moto.setCpf("12345678909");
//        viagem.setCodigoTipo(1);
//        viagem.setDataViagem(new java.sql.Date(System.currentTimeMillis()));
//        viagem.setLocalOrigem("A");
//        viagem.setLocalDestino("B");
//        viagem.setValorViagem(14);
//        viagem.setMotorista(moto);
//        viagem2.setCodigoTipo(2);
//        viagem2.setDataViagem(new java.sql.Date(System.currentTimeMillis()));
//        viagem2.setLocalOrigem("A");
//        viagem2.setLocalDestino("B");
//        viagem2.setValorViagem(14);
//        viagem2.setMotorista(moto);
//        lista.insereNoInicio(viagem);
//        lista.insereNoInicio(viagem2);
//        
//        viagem3 = (Viagem) lista.getFim().getObjeto();
//        viagem4 = (Viagem) lista.getInicio().getObjeto();
//        System.out.println("Viagem 1: " + viagem.getCodigoViagem());
//        System.out.println("Viagem 2: " + viagem2.getCodigoViagem());
//        lista.retirarElemento(viagem2);
//        System.out.println(viagem3.getCodigoViagem());
//        System.out.println(viagem4.getCodigoViagem());
    }
    
}
