package com.mycompany.View;

import Model.CadastroLista;
import com.mycompany.DAO.atividadeDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie
 */
public class TelaListagem extends javax.swing.JFrame {

    atividadeDAO atv = new atividadeDAO();
    int id;

    String busca;
    public TelaListagem() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEditarNome = new javax.swing.JButton();
        jButtonDeletarNome = new javax.swing.JButton();
        jButtonVoltarNome = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_atividade = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldBuscarDt = new javax.swing.JTextField();
        jButtonBuscarData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 900));
        getContentPane().setLayout(null);

        jButtonEditarNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditarNome.setText("EDITAR");
        jButtonEditarNome.setToolTipText("");
        jButtonEditarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarNome);
        jButtonEditarNome.setBounds(600, 760, 100, 40);

        jButtonDeletarNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDeletarNome.setText("DELETAR");
        jButtonDeletarNome.setToolTipText("");
        jButtonDeletarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarNome);
        jButtonDeletarNome.setBounds(600, 110, 100, 40);

        jButtonVoltarNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVoltarNome.setText("VOLTAR");
        jButtonVoltarNome.setToolTipText("");
        jButtonVoltarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarNome);
        jButtonVoltarNome.setBounds(720, 760, 100, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("CONTROLE DE ATIVIDADES");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 10, 250, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("BUSCAR:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 20, 90, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("ATIVIDADES CADASTRADAS:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 230, 250, 25);
        getContentPane().add(jTextFieldBuscar);
        jTextFieldBuscar.setBounds(60, 60, 750, 30);

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setToolTipText("");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(710, 110, 100, 40);

        tabela_atividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Matéria", "Nome", "Finalizado"
            }
        ));
        jScrollPane1.setViewportView(tabela_atividade);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 280, 750, 460);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("BUSCAR POR DATA (EX:dd/mm/aaaa):");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 120, 360, 25);
        getContentPane().add(jTextFieldBuscarDt);
        jTextFieldBuscarDt.setBounds(60, 160, 750, 30);

        jButtonBuscarData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscarData.setText("BUSCAR");
        jButtonBuscarData.setToolTipText("");
        jButtonBuscarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarDataActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarData);
        jButtonBuscarData.setBounds(710, 210, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarNomeActionPerformed

    private void jButtonDeletarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarNomeActionPerformed
        try {
            atividadeDAO.excluir(id);
        } catch (Exception ex) {
            Logger.getLogger(TelaListagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeletarNomeActionPerformed

    private void jButtonVoltarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarNomeActionPerformed
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarNomeActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            listaratv();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBuscarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarDataActionPerformed
        try {
            // TODO add your handling code here:
            listaratvDt();
        } catch (Exception ex) {
            Logger.getLogger(TelaListagem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonBuscarDataActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarData;
    private javax.swing.JButton jButtonDeletarNome;
    private javax.swing.JButton jButtonEditarNome;
    private javax.swing.JButton jButtonVoltarNome;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldBuscarDt;
    private javax.swing.JTable tabela_atividade;
    // End of variables declaration//GEN-END:variables

    private void listaratv() throws Exception {
        try {
            atividadeDAO objatv = new atividadeDAO();
            busca = jTextFieldBuscar.getText();

            DefaultTableModel model = (DefaultTableModel) tabela_atividade.getModel();
            model.setNumRows(0);
            ArrayList<CadastroLista> lista = (ArrayList<CadastroLista>) atividadeDAO.procurar(busca);

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    id=lista.get(num).getIdAtv(),
                    lista.get(num).getDataAtv(),
                    lista.get(num).getMateriaAtv(),
                    lista.get(num).getNomeAtv(),
                    lista.get(num).isStatus() ? "Finalizado" : "Não Finalizado"
                });
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Listar Atividades" + erro);
        }
    }
    private void listaratvDt() throws Exception {
        try {
            atividadeDAO objatv = new atividadeDAO();
            busca = jTextFieldBuscarDt.getText();

            DefaultTableModel model = (DefaultTableModel) tabela_atividade.getModel();
            model.setNumRows(0);
            ArrayList<CadastroLista> lista = (ArrayList<CadastroLista>) atividadeDAO.procurarDt(busca);

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdAtv(),
                    lista.get(num).getDataAtv(),
                    lista.get(num).getMateriaAtv(),
                    lista.get(num).getNomeAtv(),
                    lista.get(num).isStatus() ? "Finalizado" : "Não Finalizado"
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Listar Atividades" + erro);
        }
    }
}
