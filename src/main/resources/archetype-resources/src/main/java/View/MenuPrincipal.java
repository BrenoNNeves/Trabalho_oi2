/**
 * @author Charlie
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButtonCadastroAtividades = new javax.swing.JToggleButton();
        jToggleButtonCadastroDados = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 900));
        getContentPane().setLayout(null);

        jToggleButtonCadastroAtividades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButtonCadastroAtividades.setText("CADASTRO ATIVIDADES");
        jToggleButtonCadastroAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCadastroAtividadesActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonCadastroAtividades);
        jToggleButtonCadastroAtividades.setBounds(370, 270, 260, 40);

        jToggleButtonCadastroDados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButtonCadastroDados.setText("LISTAGEM ATIVIDADES");
        jToggleButtonCadastroDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCadastroDadosActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonCadastroDados);
        jToggleButtonCadastroDados.setBounds(370, 360, 260, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CONTROLE DE ATIVIDADES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 10, 170, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonCadastroAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCadastroAtividadesActionPerformed
        new CadastroLista().setVisible(true);
        new MenuPrincipal().dispose();
    }//GEN-LAST:event_jToggleButtonCadastroAtividadesActionPerformed

    private void jToggleButtonCadastroDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCadastroDadosActionPerformed
        new TelaListagem().setVisible(true);
        new MenuPrincipal().dispose();
    }//GEN-LAST:event_jToggleButtonCadastroDadosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButtonCadastroAtividades;
    private javax.swing.JToggleButton jToggleButtonCadastroDados;
    // End of variables declaration//GEN-END:variables
}
