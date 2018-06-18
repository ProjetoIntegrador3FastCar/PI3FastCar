/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;


//import entidade.Usuario;

import entidade.Motorista;
import entidade.Veiculo;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import negocio.NMotorista;
import negocio.NVeiculo;
import util.Validation;
import util.fabricaabstrata.CategoriaAbstrata;
import util.interfaces.ComboBox;
import util.interfaces.TelaPreenchida;
//import negocio.UsuarioSisBR;

/**
 *
 * @author aluno
 */
public class FrmCadastroMotorista extends javax.swing.JInternalFrame implements ComboBox, TelaPreenchida<Motorista>{
    private JDesktopPane principal;
    
    private void limpar(){
        txtStatusMotorista.setText("");
        txtCodigoMotorista.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtCodigoVeiculo.setText("");
        txtPlaca.setText("");
        txtCor.setText("");
        txtModelo.setText("");
        btnAlterarStatus.setEnabled(false);
        lblAvisoNome.setText("");
        lblAvisoCpf.setText("");
        lblAvisoPlaca.setText("");
        lblAvisoCor.setText("");
        lblAvisoModelo.setText("");
    }
    
    /**
     * Creates new form frmCadastroFuncionario
     */
    public FrmCadastroMotorista() {
        initComponents();
        limpar();
        popularCombo();
    }
    
    public FrmCadastroMotorista(JDesktopPane principal){
        this();
        this.principal = principal;
    }
    
    public FrmCadastroMotorista(JDesktopPane principal, Motorista motorista){
        this();
        this.principal = principal;
        preencherTela(motorista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoMotorista = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnAlterarStatus = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblAvisoNome = new javax.swing.JLabel();
        lblAvisoCpf = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoVeiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnConsultarVeiculo = new javax.swing.JButton();
        lblAvisoPlaca = new javax.swing.JLabel();
        lblAvisoCor = new javax.swing.JLabel();
        lblAvisoModelo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStatusMotorista = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPasswordField1.setText("jPasswordField1");

        jLabel9.setText("jLabel9");

        setTitle("Cadastro de Motorista");

        jLabel1.setText("Código Motorista:");

        jLabel2.setText("Nome:");

        jLabel4.setText("CPF:");

        txtCodigoMotorista.setEditable(false);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });

        jLabel7.setText("Categoria Veículo:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAlterarStatus.setText("Alterar Status");
        btnAlterarStatus.setEnabled(false);
        btnAlterarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarStatusActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblAvisoNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoNome.setText("Aviso Nome");

        lblAvisoCpf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoCpf.setText("Aviso CPF");

        jLabel5.setText("Código Veículo:");

        txtCodigoVeiculo.setEditable(false);

        jLabel3.setText("Placa:");

        jLabel6.setText("Cor:");

        jLabel8.setText("Modelo:");

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        txtCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorKeyTyped(evt);
            }
        });

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        btnConsultarVeiculo.setText("Consultar Veículos");
        btnConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVeiculoActionPerformed(evt);
            }
        });

        lblAvisoPlaca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoPlaca.setText("Aviso Placa");

        lblAvisoCor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoCor.setText("Aviso Cor");

        lblAvisoModelo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoModelo.setText("Aviso Modelo");

        jLabel10.setText("Status:");

        txtStatusMotorista.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtStatusMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnAlterarStatus)
                        .addGap(41, 41, 41)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoVeiculo)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(txtCor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultarVeiculo)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAvisoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAvisoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAvisoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(lblAvisoCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAvisoPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(txtStatusMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addComponent(lblAvisoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterarStatus)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            ArrayList<String> textos = new ArrayList<>();
            String regex = "[\u0020-\u002C|\u002E|\u002F|\u003A-\u0040|\\u005B-\u02AC]";

            textos.removeAll(textos);
            textos.add(txtNome.getText());
            textos.add(txtCpf.getText());
            textos.add(txtPlaca.getText());
            textos.add(txtCor.getText());
            textos.add(txtModelo.getText());

            Validation.isEmpty(textos);
            Validation.invalidSpecCaracters(regex, txtPlaca.getText());
            Validation.invalidCaracAndLetters(txtCpf.getText());
            Validation.invalidCaracAndNumbers(txtNome.getText());
            Validation.invalidSpaces(txtCpf.getText());
            Validation.invalidCpf(txtCpf.getText());

            Veiculo veiculo = new Veiculo();
            Motorista motorista = new Motorista();

            motorista.setNome(txtNome.getText());
            motorista.setCpf(txtCpf.getText());
            motorista.setStatusMotorista(true);
            motorista.setStatusDeCorrida(false);

            veiculo.setCategoria(CategoriaAbstrata.getInstance(cmbCategoria.getSelectedIndex()-1));
            veiculo.setPlaca(txtPlaca.getText());
            veiculo.setCor(txtCor.getText());
            veiculo.setModelo(txtModelo.getText());

            motorista.setVeiculo(veiculo);
            
            if(txtCodigoVeiculo.getText() != null && !txtCodigoVeiculo.getText().isEmpty()){
                veiculo.setCodigoTipo(Integer.parseInt(txtCodigoVeiculo.getText()));
            }
            
            new NVeiculo().incluir(veiculo);

            if(txtCodigoMotorista.getText() != null && !txtCodigoMotorista.getText().isEmpty()){
                motorista.setCodigoTipo(Integer.parseInt(txtCodigoMotorista.getText()));
            }
            
            new NMotorista().incluir(motorista);
            
            limpar();
            JOptionPane.showMessageDialog(null, "Motorista cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
        cmbCategoria.setSelectedIndex(0);
        cmbCategoria.setEnabled(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            FrmPesquisaGeral janela = new FrmPesquisaGeral(principal, 0);
            principal.add(janela);
            janela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        try {
            Validation.limitMaxCaracter(11, txtCpf.getText(), evt);
        } catch (Exception e) {
            lblAvisoCpf.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtCpfKeyTyped

    private void btnAlterarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarStatusActionPerformed
        try {
            int resposta = JOptionPane.showConfirmDialog(null, 
                    "Confirma a alteração do status deste Motorista?",
                    "FastCar Central", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION){
                Motorista motorista = new NMotorista().consultar(Integer.parseInt(txtCodigoMotorista.getText()));
                
                if(motorista.isStatusMotorista())
                    motorista.setStatusMotorista(false);
                else
                    motorista.setStatusMotorista(true);
                
                if(txtCodigoMotorista.getText() != null && !txtCodigoMotorista.getText().isEmpty()){
                    motorista.setCodigoTipo(Integer.parseInt(txtCodigoMotorista.getText()));
                }
                
                new NMotorista().incluir(motorista);
                JOptionPane.showMessageDialog(rootPane, 
                        "Operação efetuada com sucesso!");
                limpar();
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarStatusActionPerformed

    private void btnConsultarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVeiculoActionPerformed
        try {
            FrmPesquisaGeral janela = new FrmPesquisaGeral(principal, 3);
            principal.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarVeiculoActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        try {
            Validation.limitMaxCaracter(50, txtNome.getText(), evt);
        } catch (Exception e) {
            lblAvisoNome.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        try {
            Validation.limitMaxCaracter(8, txtPlaca.getText(), evt);
        } catch (Exception e) {
            lblAvisoPlaca.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtCorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorKeyTyped
        try {
            Validation.limitMaxCaracter(10, txtCor.getText(), evt);
        } catch (Exception e) {
            lblAvisoCor.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtCorKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        try {
            Validation.limitMaxCaracter(25, txtModelo.getText(), evt);
        } catch (Exception e) {
            lblAvisoModelo.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtModeloKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarStatus;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultarVeiculo;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblAvisoCor;
    private javax.swing.JLabel lblAvisoCpf;
    private javax.swing.JLabel lblAvisoModelo;
    private javax.swing.JLabel lblAvisoNome;
    private javax.swing.JLabel lblAvisoPlaca;
    private javax.swing.JTextField txtCodigoMotorista;
    private javax.swing.JTextField txtCodigoVeiculo;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtStatusMotorista;
    // End of variables declaration//GEN-END:variables

    @Override
    public void popularCombo() {
        try {
            CategoriaAbstrata.getListaDeCategorias().forEachRemaining(categoria ->{
                cmbCategoria.addItem(categoria.getDescricao());
            });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    @Override
    public void preencherTela(Motorista motorista) {
        txtCodigoMotorista.setText(Integer.toString(motorista.getCodigoMotorista()));
        txtStatusMotorista.setText((motorista.isStatusMotorista()) ? "Ativo" : "Desativado");
        txtNome.setText(motorista.getNome());
        txtCpf.setText(motorista.getCpf());
        txtCodigoVeiculo.setText(Integer.toString(motorista.getVeiculo().getCodigoVeiculo()));
        cmbCategoria.setSelectedItem(motorista.getVeiculo().getCategoria().getDescricao());
        txtPlaca.setText(motorista.getVeiculo().getPlaca());
        txtCor.setText(motorista.getVeiculo().getCor());
        txtModelo.setText(motorista.getVeiculo().getModelo());
        btnAlterarStatus.setEnabled(true);
    }

    
}
