/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Carlos Garcia
 */
public class frmCalculadora extends javax.swing.JFrame implements ActionListener{
    
    private int panelActual = 0;
    private panel_saldo pnlSaldo = new panel_saldo();
    private panel_retiro_efectivo pnlRetiroEfectivo = new panel_retiro_efectivo();
    private Container contain;
    private double saldoCuenta = 8000;
    
    /**
     * Creates new form frmCalculadora
     */
    public frmCalculadora() {
        initComponents();    
        lblNipIncorrecto.setVisible(false);
        txtNIP.setEditable(false);
        fondo();
        btn1.addActionListener(this);
        btn0.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);      
        // Agregar los botones del panel de Saldo a los eventos de esta clase
        pnlSaldo.btnNo.addActionListener(this);
        pnlSaldo.btnSi.addActionListener(this);
        // Agregar los botones del panel de Saldo a los eventos de esta clase
        pnlRetiroEfectivo.btn50.addActionListener(this);
        pnlRetiroEfectivo.btn100.addActionListener(this);
        pnlRetiroEfectivo.btn200.addActionListener(this);
        pnlRetiroEfectivo.btn500.addActionListener(this);
        pnlRetiroEfectivo.btnSalir.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNIP = new javax.swing.JPasswordField();
        lblNipIncorrecto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANCO DE MEXICO SA");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(630, 533));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("INGRESE EL NIP DE 4 DIGITOS");

        txtNIP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblNipIncorrecto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNipIncorrecto.setText("EL NIP INGRESADO ES INCORRECTO");
        lblNipIncorrecto.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNipIncorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNipIncorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridLayout(4, 3, 3, 4));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn1);

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn2);

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn3);

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn4);

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn5);

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn6);

        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn7);

        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn8);

        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn9);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btnCancel);

        btn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btn0);

        btnOk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOk.setText("OK");
        btnOk.setPreferredSize(new java.awt.Dimension(150, 250));
        jPanel4.add(btnOk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblNipIncorrecto;
    private javax.swing.JPasswordField txtNIP;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {        
        if (e.getSource() == btn1 || e.getSource() == btn2 || e.getSource() == btn3 || e.getSource() == btn4 || e.getSource() == btn5 ||
            e.getSource() == btn8 || e.getSource() == btn6 || e.getSource() == btn7 || e.getSource() == btn9 || e.getSource() == btn0){
            //System.out.println("Se oprimió boton " + e.getActionCommand());             
            if (panelActual == 0) {
                String nip = txtNIP.getText();
                if(e.getSource() == btn1 ) { nip += "1"; txtNIP.setText(nip); }
                if(e.getSource() == btn2 ) { nip += "2"; txtNIP.setText(nip); }
                if(e.getSource() == btn3 ) { nip += "3"; txtNIP.setText(nip); }
                if(e.getSource() == btn4 ) { nip += "4"; txtNIP.setText(nip); }
                if(e.getSource() == btn5 ) { nip += "5"; txtNIP.setText(nip); }
                if(e.getSource() == btn6 ) { nip += "6"; txtNIP.setText(nip); }
                if(e.getSource() == btn7 ) { nip += "7"; txtNIP.setText(nip); }
                if(e.getSource() == btn8 ) { nip += "8"; txtNIP.setText(nip); }
                if(e.getSource() == btn9 ) { nip += "9"; txtNIP.setText(nip); }
                if(e.getSource() == btn0 ) { nip += "0"; txtNIP.setText(nip); }                
            } 
        }
        
        if (e.getSource() == btnCancel || e.getSource() == pnlSaldo.btnNo
                || e.getSource() == pnlRetiroEfectivo.btnSalir){
            panelActual = 0;
            reseteoNip();
            lblNipIncorrecto.setVisible(false);
            pintarPanel();
        }
        
        if (e.getSource() == btnOk){
            /* La clave para ingresar al sistema es 4591*/
            System.out.println("El NIP Ingresado es " + txtNIP.getText());
            if (txtNIP.getText().equals("4591")){
                lblNipIncorrecto.setVisible(false);
                panelActual++;
                pintarPanel();
            } else {
                reseteoNip();
                lblNipIncorrecto.setVisible(true);
            }
        }
        
        if(e.getSource() == pnlSaldo.btnSi){
            panelActual++;
            pnlRetiroEfectivo.btn50.setVisible(true);
            pnlRetiroEfectivo.btn100.setVisible(true);
            pnlRetiroEfectivo.btn200.setVisible(true);
            pnlRetiroEfectivo.btn500.setVisible(true);
            pnlRetiroEfectivo.btnSalir.setVisible(false);
            pnlRetiroEfectivo.lblMontoRetirar.setVisible(true);
            pnlRetiroEfectivo.lblRetiroEfectivo.setVisible(false);
            pnlRetiroEfectivo.lblRetiroEfectivoDos.setVisible(false);
            pintarPanel();
        }
        
        if(e.getSource() == pnlRetiroEfectivo.btn50 || e.getSource() == pnlRetiroEfectivo.btn100 
                || e.getSource() == pnlRetiroEfectivo.btn200 || e.getSource() == pnlRetiroEfectivo.btn500){
            pnlRetiroEfectivo.btn50.setVisible(false);
            pnlRetiroEfectivo.btn100.setVisible(false);
            pnlRetiroEfectivo.btn200.setVisible(false);
            pnlRetiroEfectivo.btn500.setVisible(false);
            pnlRetiroEfectivo.btnSalir.setVisible(true);
            pnlRetiroEfectivo.lblMontoRetirar.setVisible(false);
            pnlRetiroEfectivo.lblRetiroEfectivo.setVisible(true);
            pnlRetiroEfectivo.lblRetiroEfectivoDos.setVisible(true);
        }
        
    }
    
    private void pintarPanel(){
        // Panel del Banco
        contain = jPanel3;
        switch (panelActual) {
            case 0: contain.removeAll();  
                    jPanel1.setSize(jPanel3.getSize());
                    jPanel1.setBounds(jPanel3.getBounds());
                    contain.add(jPanel1);                    
                    contain.repaint();
                    contain.validate();
                    break;
            
            case 1: contain.removeAll();  
                    pnlSaldo.setSize(jPanel3.getSize());
                    pnlSaldo.setBounds(jPanel3.getBounds());
                    contain.add(pnlSaldo);                    
                    contain.repaint();
                    contain.validate();
                    break;
            
            case 2: contain.removeAll();  
                    pnlRetiroEfectivo.setSize(jPanel3.getSize());
                    pnlRetiroEfectivo.setBounds(jPanel3.getBounds());
                    contain.add(pnlRetiroEfectivo);                    
                    contain.repaint();
                    contain.validate();
                    break;
        }
    }

    /* Establece el fondo de pantalla del Banco */
    private void fondo() {
        File file = new File("img/panel_inicio.png");
        Resizable resizable = new Resizable();
        try {
            BufferedImage imagen =  ImageIO.read(file);
            BufferedImage imagenredimensionada = resizable.resize(imagen, 630, 533);
            jPanel1.setBorder(new ImagenBorder(imagenredimensionada));            
            System.out.println("Imagen cargada");
        } catch (IOException ex) {
            System.err.println("Error al cargar imagen " + ex.getMessage());
        }
    }
    
    private void reseteoNip(){
        txtNIP.setText("");
    }
}
