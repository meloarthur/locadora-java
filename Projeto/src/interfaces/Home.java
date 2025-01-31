/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Locadora;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemListarCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadastrarCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAtualizarClientes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExcluirClientes = new javax.swing.JMenuItem();
        jMenuVeiculos = new javax.swing.JMenu();
        jMenuItemListarVeiculos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadastrarVeiculos = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAtualizarVeiculos = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExcluirVeiculos = new javax.swing.JMenuItem();
        jMenuLocacoes = new javax.swing.JMenu();
        jMenuItemListarLocacoes = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadastrarLocacoes = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAtualizarLocacoes = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExcluirLocacoes = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home - Locadora de Veículos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Locadora de Veículos");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Atividades Acadêmicas -  Universidade Federal de Goiás © All Rights Reserved");

        jMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        jMenuClientes.setText("Clientes");
        jMenuClientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuClientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jMenuItemListarCliente.setText("Listar");
        jMenuItemListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemListarCliente);
        jMenuClientes.add(jSeparator4);

        jMenuItemCadastrarCliente.setText("Cadastrar");
        jMenuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemCadastrarCliente);
        jMenuClientes.add(jSeparator1);

        jMenuItemAtualizarClientes.setText("Atualizar");
        jMenuItemAtualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtualizarClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemAtualizarClientes);
        jMenuClientes.add(jSeparator2);

        jMenuItemExcluirClientes.setText("Excluir");
        jMenuItemExcluirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemExcluirClientes);

        jMenuBar1.add(jMenuClientes);

        jMenuVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/veiculo.png"))); // NOI18N
        jMenuVeiculos.setText("Veículos");
        jMenuVeiculos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuVeiculosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVeiculosMouseClicked(evt);
            }
        });

        jMenuItemListarVeiculos.setText("Listar");
        jMenuItemListarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarVeiculosActionPerformed(evt);
            }
        });
        jMenuVeiculos.add(jMenuItemListarVeiculos);
        jMenuVeiculos.add(jSeparator3);

        jMenuItemCadastrarVeiculos.setText("Cadastrar");
        jMenuItemCadastrarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarVeiculosActionPerformed(evt);
            }
        });
        jMenuVeiculos.add(jMenuItemCadastrarVeiculos);
        jMenuVeiculos.add(jSeparator5);

        jMenuItemAtualizarVeiculos.setText("Atualizar");
        jMenuItemAtualizarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtualizarVeiculosActionPerformed(evt);
            }
        });
        jMenuVeiculos.add(jMenuItemAtualizarVeiculos);
        jMenuVeiculos.add(jSeparator6);

        jMenuItemExcluirVeiculos.setText("Excluir");
        jMenuItemExcluirVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirVeiculosActionPerformed(evt);
            }
        });
        jMenuVeiculos.add(jMenuItemExcluirVeiculos);

        jMenuBar1.add(jMenuVeiculos);

        jMenuLocacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/locacao.png"))); // NOI18N
        jMenuLocacoes.setText("Locações");
        jMenuLocacoes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuLocacoesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuLocacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLocacoesMouseClicked(evt);
            }
        });

        jMenuItemListarLocacoes.setText("Listar");
        jMenuItemListarLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarLocacoesActionPerformed(evt);
            }
        });
        jMenuLocacoes.add(jMenuItemListarLocacoes);
        jMenuLocacoes.add(jSeparator7);

        jMenuItemCadastrarLocacoes.setText("Cadastrar");
        jMenuItemCadastrarLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarLocacoesActionPerformed(evt);
            }
        });
        jMenuLocacoes.add(jMenuItemCadastrarLocacoes);
        jMenuLocacoes.add(jSeparator8);

        jMenuItemAtualizarLocacoes.setText("Atualizar");
        jMenuItemAtualizarLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtualizarLocacoesActionPerformed(evt);
            }
        });
        jMenuLocacoes.add(jMenuItemAtualizarLocacoes);
        jMenuLocacoes.add(jSeparator9);

        jMenuItemExcluirLocacoes.setText("Excluir");
        jMenuItemExcluirLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirLocacoesActionPerformed(evt);
            }
        });
        jMenuLocacoes.add(jMenuItemExcluirLocacoes);

        jMenuBar1.add(jMenuLocacoes);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sobre.png"))); // NOI18N
        jMenuSobre.setText("Sobre");
        jMenuSobre.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuSobreAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuSairAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuClientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuClientesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuClientesAncestorAdded

    private void jMenuSobreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuSobreAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobreAncestorAdded

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        ViewSobre sobre = new ViewSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuSobreMouseClicked

    private void jMenuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarClienteActionPerformed
        CadastraClientes clientes = new CadastraClientes();
        clientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarClienteActionPerformed

    private void jMenuItemListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarClienteActionPerformed
        ListarClientes listarCli = new ListarClientes();
        listarCli.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarClienteActionPerformed

    private void jMenuVeiculosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuVeiculosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuVeiculosAncestorAdded

    private void jMenuVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVeiculosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuVeiculosMouseClicked

    private void jMenuLocacoesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuLocacoesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLocacoesAncestorAdded

    private void jMenuLocacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLocacoesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLocacoesMouseClicked

    private void jMenuItemExcluirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirClientesActionPerformed
        ExcluirClientes excluir = new ExcluirClientes();
        excluir.setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirClientesActionPerformed

    private void jMenuItemCadastrarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarVeiculosActionPerformed
        CadastraVeiculos cadastrar = new CadastraVeiculos();
        cadastrar.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarVeiculosActionPerformed

    private void jMenuSairAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuSairAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairAncestorAdded

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        String mensagem = "Deseja fechar o sistema?";
        String title = "Confirmar operação";
        int res = JOptionPane.showConfirmDialog(null, mensagem, title, JOptionPane.YES_NO_OPTION);

        if (res == 0)
            System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemAtualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtualizarClientesActionPerformed
        AtualizarClientes atualizar = new AtualizarClientes();
        atualizar.setVisible(true);
    }//GEN-LAST:event_jMenuItemAtualizarClientesActionPerformed

    private void jMenuItemListarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarVeiculosActionPerformed
        ListarVeiculos listar = new ListarVeiculos();
        listar.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarVeiculosActionPerformed

    private void jMenuItemAtualizarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtualizarVeiculosActionPerformed
        AtualizarVeiculos atualizar = new AtualizarVeiculos();
        atualizar.setVisible(true);
    }//GEN-LAST:event_jMenuItemAtualizarVeiculosActionPerformed

    private void jMenuItemExcluirVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirVeiculosActionPerformed
        ExcluirVeiculos excluir = new ExcluirVeiculos();
        excluir.setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirVeiculosActionPerformed

    private void jMenuItemListarLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarLocacoesActionPerformed
        ListarLocacoes listar = new ListarLocacoes();
        listar.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarLocacoesActionPerformed

    private void jMenuItemCadastrarLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarLocacoesActionPerformed
        CadastraLocacoes cadastrar = new CadastraLocacoes();
        cadastrar.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarLocacoesActionPerformed

    private void jMenuItemAtualizarLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtualizarLocacoesActionPerformed
        AtualizarLocacoes atualizar = new AtualizarLocacoes();
        atualizar.setVisible(true);
    }//GEN-LAST:event_jMenuItemAtualizarLocacoesActionPerformed

    private void jMenuItemExcluirLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirLocacoesActionPerformed
        ExcluirLocacoes excluir = new ExcluirLocacoes();
        excluir.setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirLocacoesActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAtualizarClientes;
    private javax.swing.JMenuItem jMenuItemAtualizarLocacoes;
    private javax.swing.JMenuItem jMenuItemAtualizarVeiculos;
    private javax.swing.JMenuItem jMenuItemCadastrarCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarLocacoes;
    private javax.swing.JMenuItem jMenuItemCadastrarVeiculos;
    private javax.swing.JMenuItem jMenuItemExcluirClientes;
    private javax.swing.JMenuItem jMenuItemExcluirLocacoes;
    private javax.swing.JMenuItem jMenuItemExcluirVeiculos;
    private javax.swing.JMenuItem jMenuItemListarCliente;
    private javax.swing.JMenuItem jMenuItemListarLocacoes;
    private javax.swing.JMenuItem jMenuItemListarVeiculos;
    private javax.swing.JMenu jMenuLocacoes;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenu jMenuVeiculos;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
