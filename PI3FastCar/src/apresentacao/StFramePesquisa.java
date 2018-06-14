/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistencia.PMotorista;
import persistencia.PPassageiro;
import persistencia.PVeiculo;
import persistencia.PVeiculo;

/**
 *
 * @author Rodrigo Leite
 */
public enum StFramePesquisa {
    
    FRM_MOTORISTA{
        @Override
        public void preencherTabela(JTable tabela) {
            try {
                
                Vector detalhe = new Vector<>();
                
                new PMotorista().listar().forEachRemaining(motorista ->{
                    Vector<String> linha = new Vector<>();
                    linha.add(Integer.toString(motorista.getCodigoMotorista()));
                    linha.add(motorista.getNome());
                    linha.add(motorista.getCpf());
                    linha.add(Integer.toString(motorista.getVeiculo().getCodigoVeiculo()));
                    linha.add(motorista.getVeiculo().getPlaca());
                    linha.add((motorista.isStatusMotorista()) ? "Ativo" : "Desativado");
                    linha.add((motorista.isStatusDeCorrida()) ? "Em corrida" : "Disponível");
                    
                    detalhe.add(linha);
                });
                
                tabela.setModel(new DefaultTableModel(detalhe, getCabecalho()));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void preencherCombo(JComboBox cmb) {
            try {
                cmb.addItem("Código do motorista");
                cmb.addItem("Nome");
                cmb.addItem("CPF");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void preencherPorFiltro(JTable tabela, int opcao, String filtro) {
            try {
                
                Vector detalhe = new Vector<>();
                
                new PMotorista().listarPorFiltro(opcao, filtro).forEachRemaining(motorista ->{
                    Vector<String> linha = new Vector<>();
                    linha.add(Integer.toString(motorista.getCodigoMotorista()));
                    linha.add(motorista.getNome());
                    linha.add(motorista.getCpf());
                    linha.add(Integer.toString(motorista.getVeiculo().getCodigoVeiculo()));
                    linha.add(motorista.getVeiculo().getPlaca());
                    linha.add((motorista.isStatusMotorista()) ? "Ativo" : "Desativado");
                    linha.add((motorista.isStatusDeCorrida()) ? "Em corrida" : "Disponível");
                    
                    detalhe.add(linha);
                });
                
                tabela.setModel(new DefaultTableModel(detalhe, getCabecalho()));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public Vector<String> getCabecalho() {
            Vector<String> cabecalho = new Vector<>();
            cabecalho.add("Código");
            cabecalho.add("Nome");
            cabecalho.add("CPF");
            cabecalho.add("Código Veículo");
            cabecalho.add("Placa Veículo");
            cabecalho.add("Status Motorista");
            cabecalho.add("Status de Corrida");
            return cabecalho;
        }
        
    },
    FRM_PASSAGEIRO{
        @Override
        public void preencherTabela(JTable tabela) {
            try {
                
                Vector detalhe = new Vector<>();
                
                new PPassageiro().listar().forEachRemaining(passageiro ->{
                    Vector<String> linha = new Vector<>();
                    linha.add(Integer.toString(passageiro.getCodigoPassageiro()));
                    linha.add(passageiro.getNome());
                    linha.add(passageiro.getNumeroCelular());
                    detalhe.add(linha);
                });
                
                tabela.setModel(new DefaultTableModel(detalhe, getCabecalho()));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void preencherCombo(JComboBox cmb) {
            try {
                cmb.addItem("Código do passageiro");
                cmb.addItem("Nome");
                cmb.addItem("Número do celular");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void preencherPorFiltro(JTable tabela, int opcao, String filtro) {
            try {
                
                Vector detalhe = new Vector<>();
                
                new PPassageiro().listarPorFiltro(opcao, filtro).forEachRemaining(passageiro ->{
                    Vector<String> linha = new Vector<>();
                    linha.add(Integer.toString(passageiro.getCodigoPassageiro()));
                    linha.add(passageiro.getNome());
                    linha.add(passageiro.getNumeroCelular());
                    detalhe.add(linha);
                });
                
                tabela.setModel(new DefaultTableModel(detalhe, getCabecalho()));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public Vector<String> getCabecalho() {
            Vector<String> cabecalho = new Vector<>();
            cabecalho.add("Código");
            cabecalho.add("Nome");
            cabecalho.add("Número Celular");
            return cabecalho;
        }
        
    },
    FRM_VIAGEM{
        @Override
        public void preencherTabela(JTable tabela) {
            
        }

        @Override
        public void preencherCombo(JComboBox cmb) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void preencherPorFiltro(JTable tabela, int opcao, String filtro) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Vector<String> getCabecalho() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    },
    FRM_VEICULO{
        @Override
        public void preencherTabela(JTable tabela) {
            try {
                
                Vector detalhe = new Vector<>();
                
                new PVeiculo().listar().forEachRemaining(veiculo ->{
                    Vector<String> linha = new Vector<>();
                    linha.add(Integer.toString(veiculo.getCodigoVeiculo()));
                    linha.add(veiculo.getPlaca());
                    linha.add(veiculo.getCor());
                    linha.add(veiculo.getModelo());
                    linha.add(Integer.toString(veiculo.getCategoria().getCodCategoria()));
                    linha.add(veiculo.getCategoria().getDescricao());
                    
                    detalhe.add(linha);
                });
                
                tabela.setModel(new DefaultTableModel(detalhe, getCabecalho()));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void preencherCombo(JComboBox cmb) {
            try {
                cmb.addItem("Código do veículo");
                cmb.addItem("Modelo");
                cmb.addItem("Categoria");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void preencherPorFiltro(JTable tabela, int opcao, String filtro) {
            try {
                
                Vector detalhe = new Vector<>();
                
                new PVeiculo().listarPorFiltro(opcao, filtro).forEachRemaining(veiculo ->{
                    Vector<String> linha = new Vector<>();
                    linha.add(Integer.toString(veiculo.getCodigoVeiculo()));
                    linha.add(veiculo.getPlaca());
                    linha.add(veiculo.getCor());
                    linha.add(veiculo.getModelo());
                    linha.add(Integer.toString(veiculo.getCategoria().getCodCategoria()));
                    linha.add(veiculo.getCategoria().getDescricao());
                    
                    detalhe.add(linha);
                });
                
                tabela.setModel(new DefaultTableModel(detalhe, getCabecalho()));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public Vector<String> getCabecalho() {
            Vector<String> cabecalho = new Vector<>();
            cabecalho.add("Código");
            cabecalho.add("Placa");
            cabecalho.add("Cor");
            cabecalho.add("Modelo");
            cabecalho.add("Código Categoria");
            cabecalho.add("Categoria");
            return cabecalho;
        }
        
    };
    
    public abstract void preencherTabela(JTable tabela);
    public abstract void preencherCombo(JComboBox cmb);
    public abstract void preencherPorFiltro(JTable tabela, int opcao, String filtro);
    public abstract Vector<String> getCabecalho();
}
