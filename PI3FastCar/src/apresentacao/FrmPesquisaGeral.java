
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;




import entidade.Motorista;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.NMotorista;
import negocio.NPassageiro;
import util.Validation;

/**
 *
 * @author aluno
 */
public class FrmPesquisaGeral extends javax.swing.JInternalFrame {
    
    private int opcao;
    private JDesktopPane principal;
    /**
     * Creates new form frmTipoAssociadoPesquisa
     */
    public FrmPesquisaGeral() {
        initComponents();
        lblAvisoPesquisa.setText("");
    }
    
    public FrmPesquisaGeral(JDesktopPane principal, int opcao){
        this();
        this.opcao = opcao;
        if(opcao == 3) btnAtivar.setEnabled(false);
        else btnAtivar.setEnabled(true);
        this.principal = principal;
        preencherFrame(this.opcao);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAtivar = new javax.swing.JToggleButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblAvisoPesquisa = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnFechar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblResultadoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblResultado);

        jLabel1.setText("Filtrar por:");

        jLabel2.setText("Mouse:");

        btnAtivar.setText("Desativado");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblAvisoPesquisa.setText("Aviso Pesquisa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtivar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAvisoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtivar)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAvisoPesquisa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnFechar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        if(this.opcao == 3) this.dispose();
        else{
            switch(this.opcao){
                case 0: 
                    FrmCadastroMotorista janelaM = new FrmCadastroMotorista(principal);
                    this.principal.add(janelaM);
                    janelaM.setVisible(true);
                    this.dispose();
                    break;
                case 1:
                    FrmCadastroPassageiro janelaP = new FrmCadastroPassageiro(principal);
                    this.principal.add(janelaP);
                    janelaP.setVisible(true);
                    this.dispose();
                    break;
                case 2: 
                    FrmRegistroViagem janelaRv = new FrmRegistroViagem(principal);
                    this.principal.add(janelaRv);
                    janelaRv.setVisible(true);
                    this.dispose();
                    break;
                default: 
                    break;
            }
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tblResultadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoMousePressed
        try {
            if(btnAtivar.isSelected()){
                int linha = tblResultado.getSelectedRow();
                String codigo = tblResultado.getValueAt(linha,0).toString();
                switch(this.opcao){
                    case 0:
                        FrmCadastroMotorista janelaM = new FrmCadastroMotorista(principal, 
                                new NMotorista().consultar(Integer.parseInt(codigo)));
                        this.principal.add(janelaM);
                        janelaM.setVisible(true);
                        this.dispose();
                        break;
                    case 1:
                        FrmCadastroPassageiro janelaP = new FrmCadastroPassageiro(principal, 
                                new NPassageiro().consultar(Integer.parseInt(codigo)));
                        this.principal.add(janelaP);
                        janelaP.setVisible(true);
                        this.dispose();
                        break;
                    case 2: 
                        FrmRegistroViagem janelaRv = new FrmRegistroViagem(principal);
                        this.principal.add(janelaRv);
                        janelaRv.setVisible(true);
                        this.dispose();
                    break;
                    default: 
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblResultadoMousePressed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        if(btnAtivar.isSelected()){
            btnAtivar.setText("Ativado");
            tblResultado.setEnabled(true);
        } else{
            tblResultado.setRowSelectionAllowed(false);
            tblResultado.setEnabled(false);
            btnAtivar.setText("Desativado");
        }
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            Validation.isEmpty(txtPesquisa.getText());
            preencherPorFiltro(cmbFiltro.getSelectedIndex(), txtPesquisa.getText().toUpperCase());
            lblAvisoPesquisa.setText("");
        } catch (Exception e) {
            lblAvisoPesquisa.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAtivar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAvisoPesquisa;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
    
    private void preencherPorFiltro(int opcaoCmb, String filtro){
        try {
            StFramePesquisa.values()[this.opcao].preencherPorFiltro(tblResultado, opcaoCmb, filtro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void preencherFrame(int opcao) {
        StFramePesquisa.values()[opcao].preencherTabela(tblResultado);
        StFramePesquisa.values()[opcao].preencherCombo(cmbFiltro);
    }
}
