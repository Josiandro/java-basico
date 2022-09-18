/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoemvideo;

/**
 *
 * @author josia
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
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
        txtValor = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();
        lblRaizCubica = new javax.swing.JLabel();
        lblAbsoluto = new javax.swing.JLabel();
        lblResultResto = new javax.swing.JLabel();
        lblResultCubo = new javax.swing.JLabel();
        lblResultRaiz = new javax.swing.JLabel();
        lblResultCubica = new javax.swing.JLabel();
        lblResultAbsoluto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Super Calculadora");

        jLabel2.setText("Informe um valor:");

        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/operacoes.jpg"))); // NOI18N
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/calc.jpg"))); // NOI18N

        lblRes.setText("jLabel4");

        lblCubo.setText("jLabel5");

        lblRaiz.setText("jLabel6");

        lblRaizCubica.setText("jLabel7");

        lblAbsoluto.setText("jLabel8");

        lblResultResto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultResto.setForeground(new java.awt.Color(0, 51, 255));
        lblResultResto.setText("jLabel4");

        lblResultCubo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultCubo.setForeground(new java.awt.Color(0, 51, 255));
        lblResultCubo.setText("jLabel5");

        lblResultRaiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultRaiz.setForeground(new java.awt.Color(0, 51, 255));
        lblResultRaiz.setText("jLabel6");

        lblResultCubica.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultCubica.setForeground(new java.awt.Color(0, 51, 255));
        lblResultCubica.setText("jLabel7");

        lblResultAbsoluto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultAbsoluto.setForeground(new java.awt.Color(0, 51, 255));
        lblResultAbsoluto.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(151, 151, 151))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResultResto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCubo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResultCubo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAbsoluto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResultAbsoluto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRaiz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResultRaiz))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRaizCubica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResultCubica)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRes)
                            .addComponent(lblResultResto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCubo)
                            .addComponent(lblResultCubo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaiz)
                            .addComponent(lblResultRaiz))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaizCubica)
                            .addComponent(lblResultCubica))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAbsoluto)
                            .addComponent(lblResultAbsoluto))
                        .addGap(77, 77, 77)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        
        int valor    = Integer.parseInt(txtValor.getValue().toString());
        int resto    = valor % 2;
        float cubo   = (float) Math.pow(valor, 3);
        float raizq  = (float) Math.sqrt(valor);
        float raizc  = (float) Math.cbrt(valor);
        int absoluto = Math.abs(valor);
        
        lblRes.setText("Resto da Divisão por 2");
        lblResultResto.setText(Integer.toString(resto));
        
        lblCubo.setText("Elevado ao Cubo");
        lblResultCubo.setText(Float.toString(cubo));
        
        lblRaiz.setText("Raiz Quadrada");
        lblResultRaiz.setText(Float.toString(raizq));
        
        lblRaizCubica.setText("Raiz Cúbica");
        lblResultCubica.setText(Float.toString(raizc));
        
        lblAbsoluto.setText("Valor Absoluto");
        lblResultAbsoluto.setText(Integer.toString(absoluto));
        
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAbsoluto;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblRaizCubica;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblResultAbsoluto;
    private javax.swing.JLabel lblResultCubica;
    private javax.swing.JLabel lblResultCubo;
    private javax.swing.JLabel lblResultRaiz;
    private javax.swing.JLabel lblResultResto;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
