/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;


//import entidade.Passageiro;
import entidade.Passageiro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import negocio.NPassageiro;
import util.Validation;
import util.interfaces.TelaPreenchida;

/**
 *
 * @author aluno
 */
public class FrmCadastroPassageiro extends javax.swing.JInternalFrame implements TelaPreenchida<Passageiro>{
    private JDesktopPane principal;
    
    private void limpar(){
        txtCodigoPassageiro.setText("");
        txtNome.setText("");
        txtNumeroCelular.setText("");
        lblAvisoNome.setText("");
        lblAvisoNumero.setText("");
    }
    
    /**
     * Creates new form frmCadastroFuncionario
     */
    public FrmCadastroPassageiro() {
        initComponents();
        limpar();
    }
    
    public FrmCadastroPassageiro(JDesktopPane principal){
        this();
        this.principal = principal;
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
        txtCodigoPassageiro = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNumeroCelular = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblAvisoNome = new javax.swing.JLabel();
        lblAvisoNumero = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPasswordField1.setText("jPasswordField1");

        jLabel9.setText("jLabel9");

        setTitle("Cadastro de Passageiro");

        jLabel1.setText("Código Passageiro:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Número Celular");

        txtCodigoPassageiro.setEditable(false);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        txtNumeroCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCelularKeyTyped(evt);
            }
        });

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

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblAvisoNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoNome.setText("Aviso Nome");

        lblAvisoNumero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoNumero.setText("Aviso Número");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(332, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvisoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnCadastrar)
                        .addGap(70, 70, 70)
                        .addComponent(btnLimpar)
                        .addGap(76, 76, 76)
                        .addComponent(btnFechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar)
                    .addComponent(btnCadastrar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            ArrayList<String> textos = new ArrayList<>();
            
            textos.removeAll(textos);
            textos.add(txtNome.getText());
            textos.add(txtNumeroCelular.getText());

            Validation.isEmpty(textos);
            Validation.invalidCaracAndLetters(txtNumeroCelular.getText());
            Validation.invalidCaracAndNumbers(txtNome.getText());

            Passageiro passageiro = new Passageiro();

            passageiro.setNome(txtNome.getText());
            passageiro.setNumeroCelular(txtNumeroCelular.getText());

            if(txtCodigoPassageiro.getText() != null && !txtCodigoPassageiro.getText().isEmpty()){
                passageiro.setCodigoTipo(Integer.parseInt(txtCodigoPassageiro.getText()));
            }
            
            new NPassageiro().incluir(passageiro);

            limpar();
            JOptionPane.showMessageDialog(rootPane, "Passageiro cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            FrmPesquisaGeral janela = new FrmPesquisaGeral(principal, 1);
            principal.add(janela);
            janela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        try {
            Validation.limitMaxCaracter(255, txtNome.getText(), evt);
        } catch (Exception e) {
            lblAvisoNome.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtNumeroCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCelularKeyTyped
        try {
            Validation.limitMaxCaracter(11, txtNumeroCelular.getText(), evt);
        } catch (Exception e) {
            lblAvisoNumero.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtNumeroCelularKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblAvisoNome;
    private javax.swing.JLabel lblAvisoNumero;
    private javax.swing.JTextField txtCodigoPassageiro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroCelular;
    // End of variables declaration//GEN-END:variables

    @Override
    public void preencherTela(Passageiro passageiro) {
        txtCodigoPassageiro.setText(Integer.toString(passageiro.getCodigoPassageiro()));
        txtNome.setText(passageiro.getNome());
        txtNumeroCelular.setText(passageiro.getNumeroCelular());
    }

//    private void preencherTelaAlmox(Funcionario func) {
//        try {
//            txtCodigoFunc.setText(func.getId()+"");
//            txtMatricula.setText(func.getMatricula());
//            txtNome.setText(func.getNome());
//            
//            btnExcluir.setEnabled(true);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
//        }
//    }
//
//    private void preencherTelaSis(Passageiro usuario) {
//        try {
//            txtCodigoFunc.setText(usuario.getFuncionario().getId()+"");
//            txtCodPassageiro.setText(usuario.getIdPassageiro()+"");
//            txtMatricula.setText(usuario.getFuncionario().getMatricula());
//            txtNome.setText(usuario.getFuncionario().getNome());
//            txtCpf.setText(usuario.getCpf()+"");
//            txtEmail.setText(usuario.getEmail());
//            txtSenha.setText(usuario.getSenha());
//            
//            btnExcluir.setEnabled(true);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
//        }
//    }

    
}
