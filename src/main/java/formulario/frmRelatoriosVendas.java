/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formulario;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.javavendass.Dados;
import com.mycompany.javavendass.Dados_db;
import com.mycompany.javavendass.Opcoes;
import com.mycompany.javavendass.Relatorio;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/**
 *
 * @author Arthur
 */
public class frmRelatoriosVendas extends javax.swing.JInternalFrame {
private Dados msDados;
    public void setDados(Dados msDados){
    this.msDados = msDados;
    }
    
    
    private Dados_db msDados_db;
    public void setDados_db(Dados_db msDados_db){
    this.msDados_db = msDados_db;
    }
    
   
    public frmRelatoriosVendas() {
        initComponents();
        
        buttonGroup2.add(radioTodasVenda);
        buttonGroup2.add(radioSelecaoVenda);
       // buttonGroup1.add(radioData);
        buttonGroup1.add(radioNumeroVenda);
        buttonGroup1.add(radioUsuario);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnSelecao = new javax.swing.JButton();
        radioNumeroVenda = new javax.swing.JRadioButton();
        radioUsuario = new javax.swing.JRadioButton();
        radioTodasVenda = new javax.swing.JRadioButton();
        radioSelecaoVenda = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cmbVendaInicial = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbVendaFinal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbUsuarioInicial = new javax.swing.JComboBox<>();
        btnGerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("relatorio de vendas:");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Arquivo:");

        txtArquivo.setText("relatorio");
        txtArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArquivoActionPerformed(evt);
            }
        });

        btnSelecao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelecao.setText("...");
        btnSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecaoActionPerformed(evt);
            }
        });

        radioNumeroVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioNumeroVenda.setText("numero venda");
        radioNumeroVenda.setEnabled(false);
        radioNumeroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNumeroVendaActionPerformed(evt);
            }
        });

        radioUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioUsuario.setText("usuario");
        radioUsuario.setEnabled(false);
        radioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUsuarioActionPerformed(evt);
            }
        });

        radioTodasVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioTodasVenda.setSelected(true);
        radioTodasVenda.setText("todas as vendas");
        radioTodasVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTodasVendaActionPerformed(evt);
            }
        });

        radioSelecaoVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioSelecaoVenda.setText("selecao de venda");
        radioSelecaoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSelecaoVendaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("venda inicial");
        jLabel2.setToolTipText("");

        cmbVendaInicial.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("venda final");

        cmbVendaFinal.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("usuario inicial");

        cmbUsuarioInicial.setEnabled(false);

        btnGerar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGerar.setText("gerar relatorio");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbVendaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cmbUsuarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbVendaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerar)
                        .addGap(99, 99, 99))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioNumeroVenda)
                            .addComponent(radioTodasVenda)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioSelecaoVenda))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecao))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTodasVenda)
                    .addComponent(radioSelecaoVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNumeroVenda)
                    .addComponent(radioUsuario))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbVendaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbVendaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbUsuarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerar))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArquivoActionPerformed

    private void radioTodasVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTodasVendaActionPerformed
        habilitarCampos();
        
        
    }//GEN-LAST:event_radioTodasVendaActionPerformed
    private void habilitarCampos (){  if(radioTodasVenda.isSelected()){
        //radioData.setEnabled(false);
        radioNumeroVenda.setEnabled(false);
        radioUsuario.setEnabled(false);
        cmbUsuarioInicial.setEnabled(false);
       
        cmbVendaInicial.setEnabled(false);
        cmbVendaFinal.setEnabled(false);
        
         }else{
        //radioData.setEnabled(true);
        radioNumeroVenda.setEnabled(true);
        radioUsuario.setEnabled(true);
        
        if(radioNumeroVenda.isSelected()){
        //radioData.setEnabled(false);
        cmbUsuarioInicial.setEnabled(false);
        
        cmbVendaInicial.setEnabled(true);
        cmbVendaFinal.setEnabled(true);
        
         }
        if(radioUsuario.isSelected()){
        //radioData.setEnabled(false);
        cmbUsuarioInicial.setEnabled(true);
        
        cmbVendaInicial.setEnabled(false);
        cmbVendaFinal.setEnabled(false);
        
         }
        }
    
    }
    private void radioSelecaoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSelecaoVendaActionPerformed
         habilitarCampos();
        
        
        
    }//GEN-LAST:event_radioSelecaoVendaActionPerformed

    private void radioNumeroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNumeroVendaActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_radioNumeroVendaActionPerformed

    private void radioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUsuarioActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_radioUsuarioActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        if(txtArquivo.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
    return;
} else {
    try {
        
        String arquivo = txtArquivo.getText() + ".pdf";
        String sql = "SELECT fatura.idFatura, fatura.idUsuario, CONCAT(nome, sobrenome) AS nomeFull, idLinha, idProduto, descricao, preco, quantidade, (preco + (preco * quantidade / 100.0)) AS valor \n" +
             "FROM fatura \n" +
             "INNER JOIN usuarios ON fatura.idUsuario = usuarios.id \n" +
             "INNER JOIN detalhefatura ON fatura.idFatura = detalhefatura.idFatura ";

        
//        String sql = "SELECT fatura.idFatura, fatura.idUsuario, CONCAT(nome,sobrenome) AS nomeFull, idLinha, idProduto, descricao, preco,quantidade, preco*quantidade AS valor \n" +
//"FROM fatura \n" +
//"INNER JOIN usuarios ON fatura.idUsuario = usuarios.id \n" +
//"INNER JOIN detalhefatura ON fatura.idFatura = detalhefatura.idFatura ";
        
        String filtro ="";
        if(radioTodasVenda.isSelected()){
            filtro ="";
        
        }else{
            if(radioUsuario.isSelected()){
                if(cmbUsuarioInicial.getSelectedIndex()==0){
                  JOptionPane.showMessageDialog(null, "selecione um cliente");
                  cmbUsuarioInicial.requestFocusInWindow();
                  return;
                }
                filtro = "WHERE fatura.idUsuario ='"+ ((Opcoes)cmbUsuarioInicial.getSelectedItem()).getValor()+"'";
            }
            //sql = sql + filtro;
            if(radioTodasVenda.isSelected()){
            if(cmbUsuarioInicial.getSelectedIndex()==0){
                  JOptionPane.showMessageDialog(null, "selecione uma venda inicial");
                  cmbVendaFinal.requestFocusInWindow();
                  return;
                }
            if(cmbVendaFinal.getSelectedIndex()==0){
                  JOptionPane.showMessageDialog(null, "selecione uma venda final");
                  cmbVendaFinal.requestFocusInWindow();
                  return;
                }
                
                filtro = "WHERE fatura.idFatura >= "
                        + ((Opcoes)cmbVendaInicial.getSelectedItem()).getValor()
                        +" and fatura.idFatura <= "
                        + ((Opcoes)cmbVendaFinal.getSelectedItem()).getValor();
            
            }
        }
        sql = sql + filtro;
        
         Relatorio.relatorioFatura(arquivo, msDados_db.getConsulta(sql));
        
        
 
        JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso");
           
    } catch (Exception ex) {
        Logger.getLogger(frmRelatoriosVendas.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try{ 
        Opcoes opc = new Opcoes("teste@gmail.com", "selecione um cliente");
        cmbUsuarioInicial.addItem(opc);
        
            ResultSet rsUsu = msDados_db.getUsuarios();
        while (rsUsu.next()){
            opc = new Opcoes(
       rsUsu.getString("id"),
            rsUsu.getString("nome")+""+
            rsUsu.getString("sobrenome"));
        cmbUsuarioInicial.addItem(opc);
       
        }
         
        opc = new Opcoes("teste@gmail.com", "selecione um cliente");
        cmbVendaInicial.addItem(opc);
        cmbVendaFinal.addItem(opc);
            ResultSet rsFat = msDados_db.getFatura();
        while (rsFat.next()){
            opc = new Opcoes(
       rsFat.getString("idFatura"),
            rsFat.getString("idFatura"));
            
        cmbVendaInicial.addItem(opc);
        cmbVendaFinal.addItem(opc);
        }
        
        }catch (SQLException ex ){
            Logger.getLogger(frmFatura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecaoActionPerformed
        frmSelecionarArquivo mArquivo = new frmSelecionarArquivo(null, closable);
        mArquivo.setLocationRelativeTo(null);
        mArquivo.setVisible(true);
        String arquivo = mArquivo.getArquivo();
        if(!arquivo.equals("")){
            txtArquivo.setText(arquivo);
        }
    }//GEN-LAST:event_btnSelecaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnSelecao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<Opcoes> cmbUsuarioInicial;
    private javax.swing.JComboBox<Opcoes> cmbVendaFinal;
    private javax.swing.JComboBox<Opcoes> cmbVendaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton radioNumeroVenda;
    private javax.swing.JRadioButton radioSelecaoVenda;
    private javax.swing.JRadioButton radioTodasVenda;
    private javax.swing.JRadioButton radioUsuario;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables
}
