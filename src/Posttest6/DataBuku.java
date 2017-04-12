/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest6;

import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane; // untuk fungsi option pane pada try & catch
import javax.swing.table.DefaultTableModel; // fungsi untuk memberikan default sebuah table ketika komponent table itu di pakai
public class FormDataBuku extends javax.swing.JFrame { // class formdatabuku adalah child dari class javax.swing.Jframe

    private DefaultTableModel model; // memberikan sebuah fungsi  table default pada fungsi properties model
    private Connection con= koneksi.getConnection(); // membuat sebuah fungsi Koneksi database dengan sebuah table yang kita buat
    private Statement stt; // digunakan untuk mengeksekusi query yang static seperti select * from nama_tabel & tdk memiliki parameter
    private ResultSet rss; // mengakses nilai database (DML) dimana tipe data ini hasil eksekusi query
    
    public FormDataBuku() { //membuat sebuah method Form data Buku
        initComponents();
    }
    
    private void InitTable(){ // membuat sebuah method InitTable
        model = new DefaultTableModel(); // dimana kita mebuat sebuah new DefaultTableModel untuk default table 
        model.addColumn("JUDUL"); // pada sebuah model table di berikan colom" yang dapat mengambil hasil eksekusi query ke sebuah table database
        model.addColumn("PENULIS");
        model.addColumn("HARGA");
        
        jTable1.setModel(model); // di gunakan untuk mengsetting sebuah kolom yang ada ke dalam table yang telah di tentukan
    }
    
    private boolean validasi(String Judul){ // memberi sebuah validasi pada pada sebuah Judul
        try {
            stt = con.createStatement(); //dimana untuk membuat/meng-create hasil eksekusi query
            String sql = "SELECT * FROM buku WHERE judul='"+judul+"'"; // penetapan sebuah query untuk mencari sebuah query dari hasil eksekusi query yang di berikan
            rss = stt.executeQuery(sql); // setelah di berikan eksekusi query selanjutnya di berikan tipe data hasil query atau mengekstrak data hasil eksekusi query
            if(rss.next()) // jika ekstrak  data hasil query bernilai true maka ia akan menampilkan hasil pencariannya
                return true;
            else 
                return false; // jika ekstrak  data hasil query bernilai false maka ia tidak akan menampilkan hasil apapun / data apapun
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }
    
    private void TampilData(){// memberikan sebuah method untuk menampilkan isi table
        try{
            String sql = "SELECT * FROM buku"; // memberikan sebuah query data dari keseluruhan data yang ada pada table tersebut
            stt =con.createStatement();//dimana untuk membuat/meng-create hasil eksekusi query
            rss = stt.executeQuery(sql); // setelah di berikan eksekusi query selanjutnya di berikan tipe data hasil query atau mengekstrak data hasil eksekusi query
            while(rss.next()){ // memberikan sebuah pernyataan ketika mengekstrak data hasil eksekusi query
                Object[] o = new Object[3]; // memberikan 3 object baru pada setiap kolom
                o[0] = rss.getString("judul"); // setiap kolom pertama akan di berikan ketetapan awal hitunggannya adalah 0 sampai seterusnya
                o[1] = rss.getString("penulis"); // membuat data hasil eksekusi query pada setiap nama kolom dan letaknya sesuai array yang ada
                o[2] = rss.getInt("harga");
              model.addRow(o);   // menetapkan hasil query yang di inputkan kedalam setiap barisnya
            }     
    }catch(SQLException e){
            System.out.println(e.getMessage());
}
}
    
    private void TambahData(String judul, String penulis, String harga){ //memberikan sebuah method untuk memberikan/memasukan sebuah data pada table
        try{
            String sql =// memasukan sebuah query data dari setiap inputan data yang ada pada pengisiaan kolom tersebut
                    "INSERT INTO buku VALUES (NULL, '"+
                    judul+"','"+penulis+"',"+harga+")";
            stt = con.createStatement(); //dimana untuk membuat/meng-create hasil data eksekusi query
            stt.executeUpdate(sql); // memberikan sebuah perubahan nilai data hasil inputan kita
            model.addRow(new Object[]{judul,penulis,harga}); // memberikan tempat  atau hasil eksekusi data query yang dibuat ke dalam object baru/ kolom/baris baru
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
     private void HapusData(String judul){ //memberikan sebuah method tampildata pada action hapus
         try{
            String sql = "DELETE From buku  WHERE judul= "+judul; 
            stt = con.createStatement();
             stt. executeUpdate(sql);
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
     }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        judul = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        penulis = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        simpan = new usu.widget.ButtonGlass();
        ubah = new usu.widget.ButtonGlass();
        buttonGlass1 = new usu.widget.ButtonGlass();
        hapus = new usu.widget.ButtonGlass();
        keluar = new usu.widget.ButtonGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        by = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA BUKU");

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel2.setText("Judul");

        jLabel3.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel3.setText("Penulis");

        jLabel4.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel4.setText("Harga");

        judul.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N

        harga.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hargaKeyPressed(evt);
            }
        });

        penulis.setBackground(new java.awt.Color(153, 153, 255));
        penulis.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 12)); // NOI18N
        penulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Felix Saluw", "Asma Nadia", "Dewi Lestrai" }));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        simpan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("KaiTi", 1, 12))); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel3.add(simpan);

        ubah.setBackground(new java.awt.Color(0, 0, 0));
        ubah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel3.add(ubah);

        buttonGlass1.setText("RESET");
        buttonGlass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGlass1ActionPerformed(evt);
            }
        });
        jPanel3.add(buttonGlass1);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel3.add(hapus);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel3.add(keluar);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Judul", "Penulis", "Harga"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel5.setText("Search :");

        search.setFont(new java.awt.Font("PMingLiU", 1, 12)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel6.setText("By :");

        by.setFont(new java.awt.Font("Gungsuh", 1, 12)); // NOI18N
        by.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis", "Harga" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(harga, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(judul)
                            .addComponent(penulis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();// menampilkan semua komponent yang terlibat dalam method tersebut
        TampilData();
        
    }//GEN-LAST:event_formComponentShown

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
         if (judul.getText().length()!=0 && harga.getText().length()!=0) {
            String Judul = judul.getText();
            String Penulis = penulis.getSelectedItem().toString();
            String Harga = harga.getText();
            
            if(validasi(Judul)){
                JOptionPane.showMessageDialog(this, "Judul Sama");
            }
            else{
            TambahData(Judul,Penulis,Harga);
            InitTable();
            TampilData();
            JOptionPane.showMessageDialog(this, "Berhasil Simpan Data");
            }
        } 
        else {
        JOptionPane.showMessageDialog(this, "Data Harus di isi");    
        
        }
        
//        String Judul = judul.getText();
//        String Penulis = penulis.getSelectedItem().toString();
//        String Harga = harga.getText();
//        TambahData(Judul,Penulis,Harga);
//        InitTable();
//        TampilData();
    }//GEN-LAST:event_simpanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(1); // memberikan nilai exit/keluar pada proses running/berjalannya jendela tersebut
    }//GEN-LAST:event_keluarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int baris = jTable1.getSelectedRow(); 
         String judul1 = jTable1.getValueAt(baris,0).toString();
         String penulis1 = jTable1.getValueAt(baris,1).toString();
         String harga1 = jTable1.getValueAt(baris,2).toString();
        judul.setText(judul1);
        penulis.setSelectedItem(penulis1);
        harga.setText(harga1);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void hargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaKeyPressed
        // TODO add your handling code here:
        harga.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
            char k = e.getKeyChar();
            if(!((k >= '0') && (k <= '9')) || (k == '\b')){
                e.consume();
            }
            }
            
}); 
    }//GEN-LAST:event_hargaKeyPressed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
//        int baris = jTable1.getSelectedRow();
//        model.removeRow(baris);
        int i= jTable1.getSelectedRow();
        if(i==-1)
        {
            return;
        }
        String judul=(String) model.getValueAt(i, 0);
        HapusData(judul);
        
//        try {
//            int pilih = JOptionPane.showConfirmDialog(this,"ingin hapus","Confirmasi hapus ",JOptionPane.YES_OPTION);
//        if(pilih==JOptionPane.YES_OPTION){
//        int baris = jTable1.getSelectedRow();
//        model.removeRow(baris);}
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this,"Tolong pilih data yang ingin dihapus");
//        }
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
         try {
        int baris = jTable1.getSelectedRow();
        jTable1.setValueAt(judul.getText(), baris, 0);
        jTable1.setValueAt(penulis.getSelectedItem(), baris, 1); 
        jTable1.setValueAt(harga.getText(), baris, 2);        
        } catch (Exception e) {
             System.out.println("Ini Eror");
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void buttonGlass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGlass1ActionPerformed
        // TODO add your handling code here:
        judul.setText("");
        harga.setText("");
        penulis.setSelectedItem(null);     
        judul.requestFocus();
    }//GEN-LAST:event_buttonGlass1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        String cariahh = by.getSelectedItem().toString();
        if (search.getText().length()>1){
        try {
            
             String sql="select * from buku where "+cariahh+" like '%"+search.getText()+"%'";
           stt = con. createStatement();
            rss = stt. executeQuery(sql);
                       ResultSet rss=stt.executeQuery(sql);
            while (rss.next()) {
                Object[] o=new Object[3];
                o[0]=rss.getString("JUDUL");
                o[1]=rss.getString("PENULIS");
                o[2]=rss.getString("HARGA");
                

            model.addRow(o);
            }
            stt.close();
            rss.close();
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan");
        }
        }
        
    }//GEN-LAST:event_searchKeyTyped

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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass buttonGlass1;
    private javax.swing.JComboBox by;
    private usu.widget.ButtonGlass hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField judul;
    private usu.widget.ButtonGlass keluar;
    private javax.swing.JComboBox penulis;
    private javax.swing.JTextField search;
    private usu.widget.ButtonGlass simpan;
    private usu.widget.ButtonGlass ubah;
    // End of variables declaration//GEN-END:variables
}
