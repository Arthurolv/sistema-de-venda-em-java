/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formulario;

import com.mycompany.javavendass.Dados;
import com.mycompany.javavendass.Dados_db;
import com.mycompany.javavendass.Usuario;
import com.mycompany.javavendass.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmUsuarios extends javax.swing.JInternalFrame {
     //private Dados msDados;
     
      private Dados_db msDados_db;
     
     private int usuAtual =0;
     private boolean novo = false;
     private DefaultTableModel mTabela;
    
//    public void setDados(Dados msDados){
//    this.msDados = msDados;
//    }
    
    public void setDados_db(Dados_db msDados_db){
    this.msDados_db = msDados_db;
    }
    
    public frmUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        buttonPrimeiro = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();
        buttonUltimo = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        buttonNovo = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("cadastrar Usuarios ");
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
        jLabel1.setText("id :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("nome :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("sobrenome :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("senha :");

        txtId.setEnabled(false);

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtSobrenome.setEnabled(false);

        txtSenha.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("perfil :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("confirma a senha :");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selcione um perfil:", "administrativo", "funcionario" }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        txtConfirmarSenha.setEnabled(false);
        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });

        buttonPrimeiro.setText("primeiro");
        buttonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrimeiroActionPerformed(evt);
            }
        });

        buttonProximo.setText("proximo");
        buttonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProximoActionPerformed(evt);
            }
        });

        buttonAnterior.setText("anterior");
        buttonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnteriorActionPerformed(evt);
            }
        });

        buttonUltimo.setText("ultimo");
        buttonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUltimoActionPerformed(evt);
            }
        });

        buttonPesquisar.setText("pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        buttonNovo.setText("novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });

        buttonEditar.setText("editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("salvar");
        buttonSalvar.setEnabled(false);
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonExcluir.setText("excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonCancelar.setText("cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(buttonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPrimeiro)
                    .addComponent(buttonProximo)
                    .addComponent(buttonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUltimo)
                    .addComponent(buttonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNovo)
                    .addComponent(buttonEditar)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        buttonPrimeiro.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonUltimo.setEnabled(false);
        buttonNovo.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonPesquisar.setEnabled(false);
        buttonSalvar.setEnabled(true);
        buttonCancelar.setEnabled(true);
        //caixa text
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmarSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
       
        novo = false;
        
        txtNome.requestFocus();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnteriorActionPerformed
        usuAtual--;
        if(usuAtual== -1){
         usuAtual = msDados_db.numeroUsuarios() -1;
         
         
        }
        mostrarRegistro();
    }//GEN-LAST:event_buttonAnteriorActionPerformed

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        buttonPrimeiro.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonUltimo.setEnabled(false);
        buttonNovo.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonPesquisar.setEnabled(false);
        buttonSalvar.setEnabled(true);
        buttonCancelar.setEnabled(true);
        //caixa text
        txtId.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmarSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        //limpeza das caixasde textos
         txtId.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtSenha.setText("");
        txtConfirmarSenha.setText("");
        cmbPerfil.setSelectedIndex(0);
        
        novo = true;
        
        txtId.requestFocus();
        
        
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "por favor inserir um numero de id");
            txtId.requestFocusInWindow();
            return;
                }
        
        if(cmbPerfil.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(rootPane, "por favor selecionar um perfil");
            cmbPerfil.requestFocusInWindow();
            return;
                }
        
         if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "por favor inserir o nome");
            txtNome.requestFocusInWindow();
            return;
                }
         
          if(txtSobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "por favor inserir um sobrenome valido");
            txtSobrenome.requestFocusInWindow();
            return;
                }
          
          String senha = new String (txtSenha.getPassword());
          String confirmarSenha = new String (txtConfirmarSenha.getPassword());
          
          if(senha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "por favor digite uma senha valida");
            txtSenha.requestFocusInWindow();
            return;
                }
          
           if(confirmarSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "por confirme sua senha ");
            txtConfirmarSenha.requestFocusInWindow();
            return;
                }
        
           if(! senha.equals(confirmarSenha)){
            JOptionPane.showMessageDialog(rootPane, "verique as senhas, estão incorretas");
            txtSenha.setText("");
            txtConfirmarSenha.setText("");
            txtSenha.requestFocusInWindow();
            return;
           }
           
          
           if(novo){
           if(msDados_db.existeUsuario(txtId.getSelectedText())){
               JOptionPane.showMessageDialog(rootPane, "este usuario ja existe");
            txtId.requestFocusInWindow();
            return;
           }
           }else {
            if (!msDados_db.existeUsuario(txtId.getSelectedText())) {
               JOptionPane.showMessageDialog(rootPane, "Este usuário não existe");
            txtId.requestFocusInWindow();
            return;
    }
}

           Usuario mUsuario = new Usuario(
                   txtId.getText(),
                   txtNome.getText(),
                   txtSobrenome.getText(),
                   senha,
                   cmbPerfil.getSelectedIndex());
           String msg;
           if(novo){
           msg =  msDados_db.adicionarUsuario(mUsuario);
           }
           else{
               msg =  msDados_db.editarUsuario(mUsuario);
               
           }
               
               
           JOptionPane.showMessageDialog(rootPane, msg);
              
           
        
        buttonPrimeiro.setEnabled(true);
        buttonAnterior.setEnabled(true);
        buttonProximo.setEnabled(true);
        buttonUltimo.setEnabled(true);
        buttonNovo.setEnabled(true);
        buttonEditar.setEnabled(true);
        buttonExcluir.setEnabled(true);
        buttonPesquisar.setEnabled(true);
        buttonSalvar.setEnabled(false);
        buttonCancelar.setEnabled(false); 
         //distabilazar o campos
        txtId.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfirmarSenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
        preencherTabela();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        buttonPrimeiro.setEnabled(true);
        buttonAnterior.setEnabled(true);
        buttonProximo.setEnabled(true);
        buttonUltimo.setEnabled(true);
        buttonNovo.setEnabled(true);
        buttonEditar.setEnabled(true);
        buttonExcluir.setEnabled(true);
        buttonPesquisar.setEnabled(true);
        buttonSalvar.setEnabled(false);
        buttonCancelar.setEnabled(false);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      preencherTabela();
      mostrarRegistro();
      
      
       
       
       
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void buttonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrimeiroActionPerformed
        usuAtual = 0;
         mostrarRegistro();
        
    }//GEN-LAST:event_buttonPrimeiroActionPerformed

    private void buttonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUltimoActionPerformed
        usuAtual = msDados_db.numeroUsuarios() - 1;
        mostrarRegistro();


    }//GEN-LAST:event_buttonUltimoActionPerformed

    private void buttonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximoActionPerformed
       usuAtual++;
       if(usuAtual== msDados_db.numeroUsuarios()){
           usuAtual = 0;
       }
       mostrarRegistro();

    }//GEN-LAST:event_buttonProximoActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "voce tem certeza que deseja excluir esse usuario");
        if(resposta !=0){
            return;
   
        }
        String msg;
        msg = msDados_db.excluir(txtId.getText());
         JOptionPane.showMessageDialog(rootPane,msg);
         usuAtual=0;
         preencherTabela();  
         mostrarRegistro();
          
    
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        String usuario = JOptionPane.showInputDialog("favor inserir o codigo do usuario");
        if(usuario.equals("")){
            return;
        }
       
        if(!msDados_db.existeUsuario(usuario)){
           JOptionPane.showMessageDialog(rootPane, "este usuario não existe");  
           return;
        }
        int num = tblTabela.getRowCount();
            
            for(int i = 0; i <num; i++){
            if(Utilidades.objectToString(tblTabela.getValueAt(i, 0)).equals(usuario)){
                usuAtual=i;
                break;
            }
            
            }
                
        mostrarRegistro();
        
    }//GEN-LAST:event_buttonPesquisarActionPerformed
        
    private void mostrarRegistro(){
            txtId.setText(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 0)));
            txtNome.setText(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 1)));
            txtSobrenome.setText(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 2)));
            txtSenha.setText("");
            txtConfirmarSenha.setText("");
            cmbPerfil.setSelectedIndex(perfil(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 3))));

    }
    private void preencherTabela(){
         try {
             String titulos[]= {"id","nome","sobrenome","perfil"};
             String registro[] = new String[5];
             mTabela = new DefaultTableModel(null,titulos);
             ResultSet rs = msDados_db.getUsuarios();
             
             while(rs.next()){
                 registro[0]= rs.getString("id");
                 registro[1]= rs.getString("nome");
                 registro[2]= rs.getString("sobrenome");
                 registro[3]= perfil(rs.getInt("idPerfil"));
                 mTabela.addRow(registro);
             }
             tblTabela.setModel(mTabela);
         } catch (SQLException ex) {
             Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
         }
            }
    private String perfil(int idPerfil){
    if(idPerfil == 1){
        return"administrativo";
        }else{
        return"usuario";
    }
    }
    
     private int perfil(String perfil){
    if(perfil.equals("administrativo")){
        return  1;
        }else{
        return 2;
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonPrimeiro;
    private javax.swing.JButton buttonProximo;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonUltimo;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}