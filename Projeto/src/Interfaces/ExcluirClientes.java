/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Locadora;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur
 */
public class ExcluirClientes extends javax.swing.JFrame {

    private final String filePath = "C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\clientes.txt";
    private final File file = new File(filePath);
    
    public ExcluirClientes() {
        initComponents();
        this.buscaTabelaInteira(file);
        TabelaClientes.setEnabled(false);
    }

    private void buscaTabelaInteira(File file){
        try {

                BufferedReader br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine().trim();
                String[] colunas = firstLine.split(",");
                DefaultTableModel modelo = (DefaultTableModel) TabelaClientes.getModel();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(colunas);

                Object[] linhas = br.lines().toArray();

                for (int i=0; i<linhas.length; i++){
                    String line = linhas[i].toString().trim();
                    String[] dataRow = line.split(";");
                    modelo.addRow(dataRow);
                }
                
                return;

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                ex.printStackTrace();
                return;

            }
        
    }
    
    public boolean temNumeros(String str) {

        try {

            int valor = Integer.parseInt(str);
            return true;

        } catch (NumberFormatException e) {

            return false;

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

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        EntradaPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnExcluir = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exclusão de Clientes");

        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClientesMouseClicked(evt);
            }
        });
        TabelaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaClientes);

        EntradaPesquisar.setToolTipText("Insira o nome da pesquisa");

        BtnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisa.png"))); // NOI18N
        BtnPesquisar.setToolTipText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exclusão de Clientes");

        EntradaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        BtnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        BtnExcluir.setToolTipText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        BtnLimpar.setToolTipText("Limpar dados");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EntradaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpar)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EntradaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnPesquisar))
                    .addComponent(jLabel1)
                    .addComponent(BtnLimpar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BtnExcluir)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMouseClicked

        if (TabelaClientes.getSelectedRow() != -1){

            try {

                EntradaPesquisar.setText(String.valueOf(TabelaClientes.getModel().getValueAt(TabelaClientes.getSelectedRow(), 1)));

            } catch (Exception e){

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_TabelaClientesMouseClicked

    private void TabelaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaClientesKeyReleased

        if (TabelaClientes.getSelectedRow() != -1){

            try {

                EntradaPesquisar.setText(String.valueOf(TabelaClientes.getModel().getValueAt(TabelaClientes.getSelectedRow(), 1)));

            } catch (Exception e){

                JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_TabelaClientesKeyReleased

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed

        this.buscaTabelaInteira(file);

        Vector originalTableModel = (Vector) ((DefaultTableModel) TabelaClientes.getModel()).getDataVector().clone();

        Vector registrosEncontrados = new Vector();
        
        //Verificando se o campo está vazio
        if (EntradaPesquisar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo vazio!", "Dados Incompletos", JOptionPane.OK_OPTION);
            EntradaPesquisar.requestFocus();
            return;
        }
        
        //Verificando se o texto é composto apenas por letras
        if (EntradaPesquisar.getText().matches(".*\\d.*")){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaPesquisar.requestFocus();
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) TabelaClientes.getModel();
        modelo.setRowCount(0);

        for (Object linhas : originalTableModel){
            Vector rowVector = (Vector) linhas;
            for (Object colunas : rowVector){
                if (colunas.toString().contains(EntradaPesquisar.getText())){
                    registrosEncontrados.add(rowVector);
                }
            }
        }

        for (Object cliente: registrosEncontrados){
            modelo.addRow((Vector<?>) cliente);
        }

    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void EntradaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCodigoActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed

        //Verificando se algum campo está vazio
        if (EntradaCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Dados incompletos", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        //Verificando se "Código" é composto apenas por números
        if (!temNumeros(EntradaCodigo.getText())){
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente!", "Falha Encontrada", JOptionPane.OK_OPTION);
            EntradaCodigo.requestFocus();
            return;
        }
        
        String mensagem = "Deseja excluir os dados?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0) {
            
            try {
                
                Locadora locadora = new Locadora();
                locadora.deletaCliente(EntradaCodigo.getText());
                EntradaCodigo.setText("");
                EntradaPesquisar.setText("");
                EntradaCodigo.requestFocus();
                this.buscaTabelaInteira(file);
                
            } catch (IOException ex) {
                
                JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
                ex.printStackTrace();
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "", JOptionPane.OK_OPTION);
            
        }
        
        
        
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        EntradaCodigo.setText("");
        EntradaPesquisar.setText("");
        EntradaCodigo.requestFocus();
        buscaTabelaInteira(file);
    }//GEN-LAST:event_BtnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaPesquisar;
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
