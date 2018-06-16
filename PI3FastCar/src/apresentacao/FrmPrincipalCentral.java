/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;




//import entidade.Usuario;
import entidade.observer.Central;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrmPrincipalCentral extends javax.swing.JFrame {
    /**
     * Creates new form frmPrincipalCampeonato
     */
    static Central central;
    
    public FrmPrincipalCentral() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
//    public FrmPrincipalCentral(Usuario usuarioSis){
//        this();
//        FrmPrincipalCentral.usuarioSis = usuarioSis;
//    }
    
    private void sair(){
        try{
            int resposta = JOptionPane.showConfirmDialog(null, 
                    "Tem certeza?", "Aviso!", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION){
                System.exit(0);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pnlPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCadastroMotorista = new javax.swing.JMenuItem();
        mnuCadastroPassageiro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuRegistroViagem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Campeonato");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        jMenu1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(120, 32780));

        mnuCadastroMotorista.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        mnuCadastroMotorista.setText("Cadastro de Motorista");
        mnuCadastroMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroMotoristaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCadastroMotorista);

        mnuCadastroPassageiro.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        mnuCadastroPassageiro.setText("Cadastro de Passageiro");
        mnuCadastroPassageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroPassageiroActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCadastroPassageiro);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu2.setText("Viagens");
        jMenu2.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jMenu2.setMaximumSize(new java.awt.Dimension(120, 32780));

        mnuRegistroViagem.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        mnuRegistroViagem.setText("Registro de Viagens");
        mnuRegistroViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistroViagemActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRegistroViagem);

        jMenuBar1.add(jMenu2);

        jMenu4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu4.setText("Relatórios");
        jMenu4.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jMenu4.setMaximumSize(new java.awt.Dimension(120, 32780));
        jMenuBar1.add(jMenu4);

        jMenu3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu3.setText("Sair");
        jMenu3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jMenu3.setMaximumSize(new java.awt.Dimension(120, 32780));

        mnuSair.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        this.sair();
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuCadastroMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroMotoristaActionPerformed
        try {
            FrmCadastroMotorista frm = new FrmCadastroMotorista(this.pnlPrincipal);
            this.pnlPrincipal.add(frm);
            frm.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_mnuCadastroMotoristaActionPerformed

    private void mnuCadastroPassageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroPassageiroActionPerformed
        try {
            FrmCadastroPassageiro frm = new FrmCadastroPassageiro(this.pnlPrincipal);
            this.pnlPrincipal.add(frm);
            frm.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_mnuCadastroPassageiroActionPerformed

    private void mnuRegistroViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistroViagemActionPerformed
        try {
            FrmRegistroViagem frm = new FrmRegistroViagem(this.pnlPrincipal);
            this.pnlPrincipal.add(frm);
            frm.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_mnuRegistroViagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalCentral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuCadastroMotorista;
    private javax.swing.JMenuItem mnuCadastroPassageiro;
    private javax.swing.JMenuItem mnuRegistroViagem;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JDesktopPane pnlPrincipal;
    // End of variables declaration//GEN-END:variables

}
