package com.pro.distribuidora.frames;

import com.pro.distribuidora.Orden;

/**
 *
 * @author JESSI
 */
public class FacturaFrame extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     *
     * @param orden
     */
    public FacturaFrame(Orden orden) {
        initComponents();
        nombreText.setText(orden.getNombres());
        direccionText.setText(orden.getDireccion());
        ciudadText.setText(orden.getCiudad());
        cantidadText.setText("" + orden.getCantidad());
        modoPagoText.setText(orden.getMetodoPago());
        int totalSinIva = orden.getCantidad() * orden.getCafe().getValor();
        totalPedidoText.setText("" + totalSinIva);
        float totalIva;
        if (orden.getPedido().equalsIgnoreCase("LOCAL")) {
            totalIva = totalSinIva + (totalSinIva * 0.05f);
            totalPagarText.setText("" + totalIva);
        } else {
            totalIva = totalSinIva + (totalSinIva * 0.15f);
            totalPagarText.setText("" + totalIva);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        direccionLabel = new javax.swing.JLabel();
        direccionText = new javax.swing.JTextField();
        ciudadLabel = new javax.swing.JLabel();
        ciudadText = new javax.swing.JTextField();
        cantidadLabel = new javax.swing.JLabel();
        cantidadText = new javax.swing.JTextField();
        modoPagoLabel = new javax.swing.JLabel();
        modoPagoText = new javax.swing.JTextField();
        totalPedidoLabel = new javax.swing.JLabel();
        totalPedidoText = new javax.swing.JTextField();
        totalPagarLabel = new javax.swing.JLabel();
        totalPagarText = new javax.swing.JTextField();
        fondofactura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factura");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        nombreLabel.setText("NOMBRE ");
        getContentPane().add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        nombreText.setEditable(false);
        getContentPane().add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 152, -1));

        direccionLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        direccionLabel.setText("DIRECCION");
        getContentPane().add(direccionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        direccionText.setEditable(false);
        getContentPane().add(direccionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 152, -1));

        ciudadLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        ciudadLabel.setText("CIUDAD");
        getContentPane().add(ciudadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 81, -1, 20));

        ciudadText.setEditable(false);
        getContentPane().add(ciudadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 151, -1));

        cantidadLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        cantidadLabel.setText("CANTIDAD");
        getContentPane().add(cantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        cantidadText.setEditable(false);
        getContentPane().add(cantidadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 59, -1));

        modoPagoLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        modoPagoLabel.setText("MODO DE PAGO");
        getContentPane().add(modoPagoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        modoPagoText.setEditable(false);
        getContentPane().add(modoPagoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 114, -1));

        totalPedidoLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        totalPedidoLabel.setText("TOTAL PEDIDO");
        getContentPane().add(totalPedidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        totalPedidoText.setEditable(false);
        getContentPane().add(totalPedidoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 111, -1));

        totalPagarLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        totalPagarLabel.setText("TOTAL A PAGAR");
        getContentPane().add(totalPagarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        totalPagarText.setEditable(false);
        getContentPane().add(totalPagarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 113, -1));

        fondofactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/superb-coffee-brown-wallpaper-3.jpg"))); // NOI18N
        getContentPane().add(fondofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidadLabel;
    public javax.swing.JTextField cantidadText;
    private javax.swing.JLabel ciudadLabel;
    public javax.swing.JTextField ciudadText;
    private javax.swing.JLabel direccionLabel;
    public javax.swing.JTextField direccionText;
    private javax.swing.JLabel fondofactura;
    private javax.swing.JLabel modoPagoLabel;
    public javax.swing.JTextField modoPagoText;
    private javax.swing.JLabel nombreLabel;
    public javax.swing.JTextField nombreText;
    private javax.swing.JLabel totalPagarLabel;
    public javax.swing.JTextField totalPagarText;
    private javax.swing.JLabel totalPedidoLabel;
    public javax.swing.JTextField totalPedidoText;
    // End of variables declaration//GEN-END:variables
}
