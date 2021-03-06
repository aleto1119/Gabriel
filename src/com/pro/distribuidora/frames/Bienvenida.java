package com.pro.distribuidora.frames;

/**
 *
 * @author JESSI
 */
public class Bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
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

        tituloLabel = new javax.swing.JLabel();
        javax.swing.JButton pedidoButton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Distribuida de Café");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloLabel.setFont(new java.awt.Font("Prestige Elite Std", 0, 48)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("DISTRIBUIDORA PRO");
        getContentPane().add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 500, 180));

        pedidoButton.setBackground(new java.awt.Color(153, 0, 0));
        pedidoButton.setFont(new java.awt.Font("Tekton Pro Ext", 2, 11)); // NOI18N
        pedidoButton.setForeground(new java.awt.Color(51, 0, 0));
        pedidoButton.setText("PEDIDO");
        pedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pedidoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 140, 40));
        pedidoButton.getAccessibleContext().setAccessibleName("pedido");

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bean-to-Cup-Coffee-Machine.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoButtonActionPerformed
        Pedido g = new Pedido();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pedidoButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
