package View;

/**
 * @author Charlie
 */
public class TelaListagem extends javax.swing.JFrame {

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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDadosEventos1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

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
        jButtonDeletarNome.setBounds(480, 760, 100, 40);

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

        jTextAreaDadosEventos1.setColumns(20);
        jTextAreaDadosEventos1.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDadosEventos1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(80, 270, 740, 460);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("BUSCAR:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 100, 90, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("ATIVIDADES CADASTRADAS:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 230, 250, 25);
        getContentPane().add(jTextFieldBuscar);
        jTextFieldBuscar.setBounds(80, 140, 740, 30);

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setToolTipText("");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(720, 190, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarNomeActionPerformed

    private void jButtonDeletarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeletarNomeActionPerformed

    private void jButtonVoltarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarNomeActionPerformed
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarNomeActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDeletarNome;
    private javax.swing.JButton jButtonEditarNome;
    private javax.swing.JButton jButtonVoltarNome;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDadosEventos1;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
