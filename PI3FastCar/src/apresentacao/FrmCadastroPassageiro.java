/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;


//import entidade.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import util.Validation;

/**
 *
 * @author aluno
 */
public class FrmCadastroPassageiro extends javax.swing.JInternalFrame {
    private JDesktopPane principal;
    
    private void limpar(){
        txtCodigoFunc.setText("");
        txtNome.setText("");
        txtNumeroCelular.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        lblAvisoNome.setText("");
        lblAvisoNumero.setText("");
        lblAvisoEmail.setText("");
        lblAvisoSenha.setText("");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoFunc = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNumeroCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblAvisoNome = new javax.swing.JLabel();
        lblAvisoNumero = new javax.swing.JLabel();
        lblAvisoEmail = new javax.swing.JLabel();
        lblAvisoSenha = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPasswordField1.setText("jPasswordField1");

        jLabel9.setText("jLabel9");

        setTitle("Cadastro de Passageiro");

        jLabel1.setText("Código Passageiro:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Número Celular");

        jLabel5.setText("E-mail:");

        jLabel6.setText("Senha:");

        txtCodigoFunc.setEditable(false);

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

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
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

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });

        lblAvisoNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoNome.setText("Aviso Nome");

        lblAvisoNumero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoNumero.setText("Aviso Número");

        lblAvisoEmail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoEmail.setText("Aviso E-mail");

        lblAvisoSenha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAvisoSenha.setText("Aviso Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(332, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnCadastrar))
                .addGap(47, 47, 47)
                .addComponent(btnExcluir)
                .addGap(53, 53, 53)
                .addComponent(btnLimpar)
                .addGap(49, 49, 49)
                .addComponent(btnFechar)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblAvisoSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAvisoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addComponent(lblAvisoNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblAvisoEmail)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAvisoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
//        try {
//            ArrayList<String> textos = new ArrayList<>();
//            
//                    textos.removeAll(textos);
//                    textos.add(txtNome.getText().trim());
//                    textos.add(txtCpf.getText());
//                    textos.add(txtEmail.getText());
//                    textos.add(String.valueOf(txtSenha.getPassword()));
//                    
//                    Validation.isEmpty(textos);
//                    Validation.invalidCaracAndLetters(txtMatricula.getText());
//                    Validation.invalidCaracAndLetters(txtCpf.getText());
//                    Validation.limitMinCaracter(11, txtCpf.getText());
//                    Validation.invalidCaracAndNumbers(txtNome.getText());
//                    Validation.invalidSpaces(txtEmail.getText());
//                    
//                    Funcionario funcionario1 = new Funcionario();
//                    Usuario usuarioSis = new Usuario();
//
//                    funcionario1.setMatricula(txtMatricula.getText());
//                    funcionario1.setNome(txtNome.getText());
//
//                    usuarioSis.setFuncionario(funcionario1);
//                    usuarioSis.setCpf(txtCpf.getText());
//                    usuarioSis.setEmail(txtEmail.getText());
//                    usuarioSis.setSenha(String.valueOf(txtSenha.getPassword()));
//
//                    if(txtCodigoFunc.getText() != null && !txtCodigoFunc.getText().isEmpty()){
//                        funcionario1.setId(Integer.parseInt(txtCodigoFunc.getText()));
//                    }
//                    
//                    if(txtCodUsuario.getText() != null && !txtCodUsuario.getText().isEmpty())
//                        usuarioSis.setIdUsuario(Integer.parseInt(txtCodUsuario.getText()));
//
//
//                    new FuncionarioBR().salvar(funcionario1);
//                    new UsuarioSisBR().salvar(usuarioSis);
//                    
//                    textos.removeAll(textos);
//                    textos.add(txtMatricula.getText());
//                    textos.add(txtNome.getText());
//                    
//                    Validation.isEmpty(textos);
//                    Validation.invalidCaracAndLetters(txtMatricula.getText());
//                    Validation.invalidCaracAndNumbers(txtNome.getText());
//                    
//                    Funcionario funcionario2 = new Funcionario();
//                    
//                    funcionario2.setNome(txtNome.getText());
//                    funcionario2.setMatricula(txtMatricula.getText());
//                    
//                    if(txtCodigoFunc.getText() != null && !txtCodigoFunc.getText().isEmpty())
//                        funcionario2.setId(Integer.parseInt(txtCodigoFunc.getText()));
//                    
//                    new FuncionarioBR().salvar(funcionario2);
//
//            limpar();
//            JOptionPane.showMessageDialog(rootPane, "Funcionário cadastrado com sucesso!");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
//        }

        
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

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        try {
            Validation.limitMaxCaracter(30, txtEmail.getText(), evt);
        } catch (Exception e) {
            lblAvisoEmail.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped
        try {
            Validation.limitMaxCaracter(20, String.valueOf(txtSenha.getPassword()), evt);
        } catch (Exception e) {
            lblAvisoSenha.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtSenhaKeyTyped

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
//        try {
//            int resposta = JOptionPane.showConfirmDialog(null, 
//                    "Confirma a exclusão do \"Funcionário\" ?",
//                    "Gestão Almoxarifado", JOptionPane.YES_NO_OPTION);
//            
//            if(resposta == JOptionPane.YES_OPTION){
//                if(cmbCategoria.getSelectedIndex() == 0)
//                    new UsuarioSisBR().deletar(Integer.parseInt(txtCodigoFunc.getText()));
//                else
//                    new FuncionarioBR().deletar(Integer.parseInt(txtCodigoFunc.getText()));
//                
//                JOptionPane.showMessageDialog(rootPane, 
//                        "Operação efetuada com sucesso!");
//                limpar();
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
//        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblAvisoEmail;
    private javax.swing.JLabel lblAvisoNome;
    private javax.swing.JLabel lblAvisoNumero;
    private javax.swing.JLabel lblAvisoSenha;
    private javax.swing.JTextField txtCodigoFunc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroCelular;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

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
//    private void preencherTelaSis(Usuario usuario) {
//        try {
//            txtCodigoFunc.setText(usuario.getFuncionario().getId()+"");
//            txtCodUsuario.setText(usuario.getIdUsuario()+"");
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
