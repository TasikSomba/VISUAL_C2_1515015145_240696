/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Input extends javax.swing.JFrame {

    /**
     * Creates new form Input
     */
    public Input() {
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

        jk = new javax.swing.ButtonGroup();
        kwn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jNama = new javax.swing.JLabel();
        jTtl = new javax.swing.JLabel();
        jJk = new javax.swing.JLabel();
        jAlamat = new javax.swing.JLabel();
        jRt = new javax.swing.JLabel();
        jKel = new javax.swing.JLabel();
        jKec = new javax.swing.JLabel();
        jKota = new javax.swing.JLabel();
        jAgama = new javax.swing.JLabel();
        jStatus = new javax.swing.JLabel();
        jGol = new javax.swing.JLabel();
        jPkrj = new javax.swing.JLabel();
        jWna = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTempat = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        rPr = new javax.swing.JRadioButton();
        rLk = new javax.swing.JRadioButton();
        txtAlamat = new javax.swing.JTextField();
        txtRt = new javax.swing.JTextField();
        txtRw = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtKel = new javax.swing.JTextField();
        txtKec = new javax.swing.JTextField();
        txtKota = new javax.swing.JTextField();
        cbAgama = new javax.swing.JComboBox();
        cbStatus = new javax.swing.JComboBox();
        cbGol = new javax.swing.JComboBox();
        txtPekerjaan = new javax.swing.JTextField();
        rWni = new javax.swing.JRadioButton();
        rWna = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        bRegister = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM ISIAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jNama.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jNama.setText("Nama");

        jTtl.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jTtl.setText("Tempat/Tanggal Lahir");

        jJk.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jJk.setText("Jenis Kelamin");

        jAlamat.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jAlamat.setText("Alamat");

        jRt.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jRt.setText("RT/RW");

        jKel.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jKel.setText("Kel/Desa");

        jKec.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jKec.setText("Kecamatan");

        jKota.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jKota.setText("Kota");

        jAgama.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jAgama.setText("Agama");

        jStatus.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jStatus.setText("Status");

        jGol.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jGol.setText("Golongan Darah");

        jPkrj.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jPkrj.setText("Pekerjaan");

        jWna.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jWna.setText("Kewarganegaraan");

        txtNama.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        txtTempat.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        txtTgl.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel16.setText("/");

        jk.add(rPr);
        rPr.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        rPr.setText("Perempuan");

        jk.add(rLk);
        rLk.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        rLk.setText("Laki-Laki");

        txtAlamat.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        txtRt.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        txtRw.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel17.setText("/");

        txtKel.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        txtKec.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        txtKota.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        cbAgama.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        cbAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kristen", "Islam", "Budha", "Hindu", "Konghucu" }));

        cbStatus.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kawin", "Belum Kawin" }));

        cbGol.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        cbGol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "O", "AB", "B" }));

        txtPekerjaan.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N

        kwn.add(rWni);
        rWni.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        rWni.setText("WNI");

        kwn.add(rWna);
        rWna.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        rWna.setText("WNA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRt)
                                    .addComponent(jKel)
                                    .addComponent(jKec)
                                    .addComponent(jKota)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jAgama))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jStatus))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jGol))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPkrj))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jWna)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtRt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtRw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtKel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKec, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rWni)
                                .addGap(45, 45, 45)
                                .addComponent(rWna))
                            .addComponent(txtPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNama)
                                    .addComponent(jTtl)
                                    .addComponent(jJk))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(rPr)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rLk))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jAlamat)
                                .addGap(130, 130, 130)
                                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jNama)
                        .addGap(7, 7, 7)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTtl)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rPr)
                        .addComponent(rLk))
                    .addComponent(jJk))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAlamat)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRt)
                    .addComponent(txtRt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKel)
                    .addComponent(txtKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKec)
                    .addComponent(txtKec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKota)
                    .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgama)
                    .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStatus)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGol)
                    .addComponent(cbGol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPkrj)
                    .addComponent(txtPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jWna)
                    .addComponent(rWni)
                    .addComponent(rWna))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("FORM KARTU PENDUDUK");

        bRegister.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        bRegister.setText("Register");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(bRegister))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(bRegister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
       String Nama = txtNama.getText();
       String Tempat = txtTempat.getText();
       String Tanggal = txtTgl.getText();
       String Alamat = txtAlamat.getText(); 
       String Rt = txtRw.getText();
       String Rw = txtRt.getText();
       String Kel = txtKel.getText();
       String Kec = txtKec.getText();
       String Kota = txtKota.getText();
       String Pekerjaan = txtPekerjaan.getText();
       
       String Agama = cbAgama.getSelectedItem().toString();
       String Status = cbStatus.getSelectedItem().toString();
       String Gol = cbGol.getSelectedItem().toString();
       
       String jk = null;
       if(rLk.isSelected())
           jk = rLk.getText();
       else if(rLk.isSelected())
           jk = rLk.getText();
       else if(rPr.isSelected())
           jk = rPr.getText();
       
       String Kwn = null;
       if(rWna.isSelected())
           jk = rWna.getText();
       else if(rWna.isSelected())
           jk = rWna.getText();
       else if(rWni.isSelected())
           jk = rWni.getText();
       
       Output output = new Output (Nama,Tempat,Tanggal,jk,Alamat,Rt,Rw,Kel,Kec,Kota,Agama,Status,Gol,Pekerjaan,Kwn);
       output.setVisible(true);
    }//GEN-LAST:event_bRegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtAlamat.setText("");
        txtTempat.setText("");
        txtTgl.setText("");
        txtRw.setText("");
        txtRt.setText("");
        txtKec.setText("");
        txtKel.setText("");
        txtKota.setText("");
        txtPekerjaan.setText("");
        
        jk.clearSelection();
        kwn.clearSelection();
        
        cbGol.setSelectedItem(null);
        cbAgama.setSelectedItem(null);
        cbStatus.setSelectedItem(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegister;
    private javax.swing.JComboBox cbAgama;
    private javax.swing.JComboBox cbGol;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel jAgama;
    private javax.swing.JLabel jAlamat;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jGol;
    private javax.swing.JLabel jJk;
    private javax.swing.JLabel jKec;
    private javax.swing.JLabel jKel;
    private javax.swing.JLabel jKota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jNama;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPkrj;
    private javax.swing.JLabel jRt;
    private javax.swing.JLabel jStatus;
    private javax.swing.JLabel jTtl;
    private javax.swing.JLabel jWna;
    private javax.swing.ButtonGroup jk;
    private javax.swing.ButtonGroup kwn;
    private javax.swing.JRadioButton rLk;
    private javax.swing.JRadioButton rPr;
    private javax.swing.JRadioButton rWna;
    private javax.swing.JRadioButton rWni;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKec;
    private javax.swing.JTextField txtKel;
    private javax.swing.JTextField txtKota;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPekerjaan;
    private javax.swing.JTextField txtRt;
    private javax.swing.JTextField txtRw;
    private javax.swing.JTextField txtTempat;
    private javax.swing.JTextField txtTgl;
    // End of variables declaration//GEN-END:variables
}
