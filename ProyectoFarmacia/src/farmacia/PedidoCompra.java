package farmacia;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


/**
 *
 * @author CAMILO
 */
public class PedidoCompra extends javax.swing.JFrame {


    public PedidoCompra() {
        initComponents();
        setTitle("ORDEN DE MEDICAMENTOS");
        setLocationRelativeTo(null);
        Border bordePersonalizado = BorderFactory.createLineBorder(new Color(0, 120, 150), 2, true);
        getRootPane().setBorder(bordePersonalizado);
        

       
    }
    public static String Nombre = "";
    public static String Cantidad = "";
    public static String TipoMedicamento = "";
    public static String Distribuidor = "";
    public static String Sucursal = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGDistribuidor = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        btnGSucursal = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblDistribuidor = new javax.swing.JLabel();
        rbCofarma = new javax.swing.JRadioButton();
        rbEmpsephar = new javax.swing.JRadioButton();
        rbCemefar = new javax.swing.JRadioButton();
        lblSucursal = new javax.swing.JLabel();
        cboPrincipal = new javax.swing.JCheckBox();
        cboSecundaria = new javax.swing.JCheckBox();
        btnBorrar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        cboTipo = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText(" ¡NUEVA ORDEN DE COMPRA!");
        jLabel1.setToolTipText("");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombre.setText("Nombre Del Medicamento");

        txtNombre.setBackground(new java.awt.Color(204, 255, 204));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTipo.setText("Tipo De Medicamento ");

        lblCantidad.setBackground(new java.awt.Color(204, 51, 0));
        lblCantidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantidad.setText("Cantidad");

        txtCantidad.setBackground(new java.awt.Color(204, 255, 204));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        lblDistribuidor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDistribuidor.setText("Distribuidor ");

        btnGDistribuidor.add(rbCofarma);
        rbCofarma.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rbCofarma.setText("Cofarma");
        rbCofarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCofarmaActionPerformed(evt);
            }
        });

        btnGDistribuidor.add(rbEmpsephar);
        rbEmpsephar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rbEmpsephar.setText("Empsephar");
        rbEmpsephar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmpsepharActionPerformed(evt);
            }
        });

        btnGDistribuidor.add(rbCemefar);
        rbCemefar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rbCemefar.setText("Cemefar");
        rbCemefar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCemefarActionPerformed(evt);
            }
        });

        lblSucursal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSucursal.setText("Sucursal");

        btnGSucursal.add(cboPrincipal);
        cboPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cboPrincipal.setText("Principal");
        cboPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPrincipalActionPerformed(evt);
            }
        });

        btnGSucursal.add(cboSecundaria);
        cboSecundaria.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cboSecundaria.setText("Secundaria");
        cboSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSecundariaActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 153, 153));
        btnBorrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(102, 255, 204));
        btnConfirmar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        cboTipo.setBackground(new java.awt.Color(204, 255, 204));
        cboTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibióticos" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 51));
        btnSalir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia/imagenes/farmacia (1).png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia/imagenes/medicamento.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbCofarma)
                                    .addComponent(rbEmpsephar)
                                    .addComponent(lblDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbCemefar))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboSecundaria)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirmar)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTipo)
                    .addComponent(txtNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addGap(9, 9, 9)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSucursal)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(rbCofarma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbEmpsephar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cboPrincipal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboSecundaria)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCemefar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar)
                    .addComponent(btnConfirmar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void rbCofarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCofarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCofarmaActionPerformed

    private void cboPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPrincipalActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        txtNombre.setText("");
        txtCantidad.setText("");
        cboTipo.setSelectedItem("Seleccione...");
        btnGDistribuidor.clearSelection(); //distribuidor
        btnGSucursal.clearSelection(); //sucursal
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        try {
           if (txtNombre.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Tiene que ingresar nombre medicamento", "Advertencia", JOptionPane.WARNING_MESSAGE);    
       
       } finally
       
       {
       
       }  
        try {
           if (Integer.parseInt(txtCantidad.getText())<0)
                JOptionPane.showMessageDialog(this, "el numero debe ser mayor a 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
       } catch (Exception e)
       
       {          
           JOptionPane.showMessageDialog(this, "Tiene que ingresar la cantidad de medicamentos en número", "Advertencia", JOptionPane.WARNING_MESSAGE);
       }
       try {
           if (cboTipo.getSelectedItem().equals("Seleccione..."))
                JOptionPane.showMessageDialog(this, "Tiene que elegir un tipo de medicamento", "Advertencia", JOptionPane.WARNING_MESSAGE);    
       
       } finally
       
       {
       
       }
       try{
           boolean condicionDistribuidor1 = rbCofarma.isSelected()== true;
           boolean condicionDistribuidor2 = rbEmpsephar.isSelected()== true;
           boolean condicion3Distribuidor3 = rbCemefar.isSelected()== true;
           if(condicionDistribuidor1 == false && condicionDistribuidor2 == false && condicion3Distribuidor3 == false){
                JOptionPane.showMessageDialog(this, "Tiene que eligir un distribuidor", "Advertencia", JOptionPane.WARNING_MESSAGE);     
           }
       } finally
       {

       }
       try {
           boolean condicionSucursal1 = cboPrincipal.isSelected()==true;
           boolean condicionSucursal2 = cboSecundaria.isSelected()==true;
           if(condicionSucursal1 == false && condicionSucursal2 == false){
                JOptionPane.showMessageDialog(this, "Tiene que eligir una sucursal ", "Advertencia", JOptionPane.WARNING_MESSAGE);  
           }
       
       } finally
       {
       }
        Nombre = txtNombre.getText();
        Cantidad = txtCantidad.getText();
        TipoMedicamento = (String) cboTipo.getSelectedItem();
        if(rbCofarma.isSelected())
            Distribuidor="Cofarma";
        else if (rbEmpsephar.isSelected())
            Distribuidor = "Empsephar";
        else if (rbCemefar.isSelected())
                Distribuidor = "Cemefar";
        
        if(cboPrincipal.isSelected())
            Sucursal = "Calle de la Rosa n. 28";
        else if (cboSecundaria.isSelected())
            Sucursal = "Calle Alcazabilla n. 3";
        
   
        ConfirmacionPedido confirmarpedido = new ConfirmacionPedido();
        confirmarpedido.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoActionPerformed

    private void cboSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSecundariaActionPerformed

    private void rbEmpsepharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmpsepharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEmpsepharActionPerformed

    private void rbCemefarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCemefarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCemefarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PedidoCompra().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConfirmar;
    public javax.swing.ButtonGroup btnGDistribuidor;
    private javax.swing.ButtonGroup btnGSucursal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cboPrincipal;
    private javax.swing.JCheckBox cboSecundaria;
    public javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDistribuidor;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rbCemefar;
    private javax.swing.JRadioButton rbCofarma;
    private javax.swing.JRadioButton rbEmpsephar;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}