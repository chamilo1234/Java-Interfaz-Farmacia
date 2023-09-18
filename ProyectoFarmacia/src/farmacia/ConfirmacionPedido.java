package farmacia;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMILO
 */
public class ConfirmacionPedido extends javax.swing.JFrame {

    public ConfirmacionPedido() {
        initComponents();
        String Titulo = "";
        String Tipo = "";
        String Nombre = "";
        setLocationRelativeTo(null);
        PedidoCompra pedidocompra = new PedidoCompra();    
        jlbNombre.setText(pedidocompra.Nombre);
        jlbNombre.setVisible(false);
        Nombre = jlbNombre.getText();
        jlbTipo.setText(pedidocompra.TipoMedicamento); 
        jlbTipo.setVisible(false);
        Tipo = jlbTipo.getText();   
        jlbCantidad.setText(pedidocompra.Cantidad+ " Unidades del " + Tipo + "  " + Nombre);     
        jlbTipo.setText(pedidocompra.TipoMedicamento);
        jlbDistribuidor.setText("Pedido al distribuidor: "+pedidocompra.Distribuidor);
        jlbSucursal.setText("Para la farmacia Situada en: "+pedidocompra.Sucursal);
        Titulo = jlbDistribuidor.getText();
        setTitle(" "+Titulo);
    }

    ConfirmacionPedido(PedidoCompra aThis, boolean b) {
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPConfirmarPedido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlblCantidad = new javax.swing.JLabel();
        jlbCantidad = new javax.swing.JLabel();
        jlbTipo = new javax.swing.JLabel();
        jlbDistribuidor = new javax.swing.JLabel();
        jlbSucursal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboCancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        JPConfirmarPedido.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("    ¡CONFIRMACION DE PEDIDO!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia/imagenes/pastillas.png"))); // NOI18N

        jlbCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbCantidad.setText("Cantidad");

        jlbDistribuidor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbDistribuidor.setText("Distribuidor");

        jlbSucursal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbSucursal.setText("Sucursal");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("--------------------------------------------------------------");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("--------------------------------------------------------------");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("--------------------------------------------------------------");

        javax.swing.GroupLayout JPConfirmarPedidoLayout = new javax.swing.GroupLayout(JPConfirmarPedido);
        JPConfirmarPedido.setLayout(JPConfirmarPedidoLayout);
        JPConfirmarPedidoLayout.setHorizontalGroup(
            JPConfirmarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                .addGroup(JPConfirmarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPConfirmarPedidoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPConfirmarPedidoLayout.createSequentialGroup()
                        .addGroup(JPConfirmarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblCantidad))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                        .addGroup(JPConfirmarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jlbTipo)
                                .addGap(36, 36, 36)
                                .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jlbCantidad))
                            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jlbSucursal))
                            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jlbDistribuidor)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPConfirmarPedidoLayout.setVerticalGroup(
            JPConfirmarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPConfirmarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jlblCantidad))
                    .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbDistribuidor)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jlbCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jlbSucursal)
                .addGap(7, 7, 7)
                .addGroup(JPConfirmarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPConfirmarPedidoLayout.createSequentialGroup()
                        .addComponent(jlbTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cboCancelar.setBackground(new java.awt.Color(255, 204, 204));
        cboCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboCancelar.setText("CANCELAR");
        cboCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCancelarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("ENVIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(cboCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCancelarActionPerformed
        PedidoCompra regresar = new PedidoCompra();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cboCancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       JOptionPane.showMessageDialog(null, "Pedido Enviado", "Confirmación Pedido", JOptionPane.INFORMATION_MESSAGE);
       PedidoCompra regresar = new PedidoCompra();
       this.setVisible(false);
       regresar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmacionPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JPConfirmarPedido;
    private javax.swing.JButton cboCancelar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel jlbCantidad;
    public javax.swing.JLabel jlbDistribuidor;
    private javax.swing.JLabel jlbNombre;
    public javax.swing.JLabel jlbSucursal;
    private javax.swing.JLabel jlbTipo;
    public javax.swing.JLabel jlblCantidad;
    // End of variables declaration//GEN-END:variables
}
