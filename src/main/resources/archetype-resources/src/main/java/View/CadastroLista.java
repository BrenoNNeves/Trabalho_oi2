/**
 * @author Charlie
 */
public class CadastroLista extends javax.swing.JFrame {

    public CadastroLista() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldDate = new javax.swing.JTextField();
        TextFieldDisciplina = new javax.swing.JTextField();
        TextFieldAtividade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaItensCadastrados = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        ButtonSalvar2 = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(1000, 1000, 1000, 10000));
        setMaximumSize(new java.awt.Dimension(10000, 10000));
        setMinimumSize(new java.awt.Dimension(1000, 900));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ATIVIDADES CADASTRADAS:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 350, 370, 47);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CONTROLE DE ATIVIDADES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 0, 310, 47);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ATIVIDADE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 109, 47);

        TextFieldDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDateActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldDate);
        TextFieldDate.setBounds(140, 200, 709, 33);

        TextFieldDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldDisciplina);
        TextFieldDisciplina.setBounds(140, 90, 709, 33);

        TextFieldAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAtividadeActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldAtividade);
        TextFieldAtividade.setBounds(140, 140, 709, 33);

        TextAreaItensCadastrados.setColumns(20);
        TextAreaItensCadastrados.setRows(5);
        jScrollPane1.setViewportView(TextAreaItensCadastrados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 410, 709, 370);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("DISCIPLINA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 80, 109, 47);

        ButtonSalvar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSalvar2.setLabel("SALVAR");
        ButtonSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvar2ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalvar2);
        ButtonSalvar2.setBounds(740, 290, 110, 40);

        ButtonVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonVoltar.setText("VOLTAR");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonVoltar);
        ButtonVoltar.setBounds(740, 810, 110, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("DATA:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 190, 109, 47);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDateActionPerformed

    private void TextFieldDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDisciplinaActionPerformed

    private void TextFieldAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAtividadeActionPerformed

    private void ButtonSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSalvar2ActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalvar2;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JTextArea TextAreaItensCadastrados;
    private javax.swing.JTextField TextFieldAtividade;
    private javax.swing.JTextField TextFieldDate;
    private javax.swing.JTextField TextFieldDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
