/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.OrderController;
import controller.koneksiController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Order;

/**
 *
 * @author A S U S
 */
public class Pemesanan extends javax.swing.JFrame {

    private OrderController order = new OrderController();
    private final koneksiController koneksi = new koneksiController();
    private Connection con;

    /**
     * Creates new form Pemesanan
     */
    public Pemesanan() {
        initComponents();

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        setResizable(false);
        loadComboNamaUser();
        cbPewangi.removeAllItems();
        cbPewangi.addItem("Pilihan");
        cbPewangi.addItem("Parfum biasa");
        cbPewangi.addItem("Parfum standar (tahan 2-5 hari)");
        cbPewangi.addItem("Parfum express (tahan 14 hari)");
    }

    private void loadComboNamaUser() {
        // membuka koneksi
        con = koneksi.getConnection();

        try {
            // membuat query untuk lihat biodata
            String kueri = "SELECT * FROM users";
            PreparedStatement ps = con.prepareStatement(kueri);

            // mengeksekusi query
            ResultSet rs = ps.executeQuery();

            // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel bio
            while (rs.next()) {
                String nama = rs.getString("username");

                cbCustomer.addItem(nama);
            }

            // menutup result set, preparedstatement dan koneksi
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inpBawahan = new javax.swing.JTextField();
        inpAtasan = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        cbCustomer = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbPewangi = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        totalbyr = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Pemesanan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 47, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Customer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Jumlah bawahan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        inpBawahan.setBackground(new java.awt.Color(255, 255, 255));
        inpBawahan.setText("0");
        getContentPane().add(inpBawahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 330, -1));

        inpAtasan.setBackground(new java.awt.Color(255, 255, 255));
        inpAtasan.setText("0");
        inpAtasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpAtasanActionPerformed(evt);
            }
        });
        getContentPane().add(inpAtasan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 330, -1));

        btnNext.setBackground(new java.awt.Color(0, 153, 204));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 86, 40));

        cbCustomer.setBackground(new java.awt.Color(255, 255, 255));
        cbCustomer.setForeground(new java.awt.Color(51, 51, 51));
        cbCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(cbCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 330, -1));
        cbCustomer.getAccessibleContext().setAccessibleName("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Jumlah atasan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Paket pewangi");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        cbPewangi.setBackground(new java.awt.Color(255, 255, 255));
        cbPewangi.setForeground(new java.awt.Color(51, 51, 51));
        cbPewangi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parfum biasa", "Parfum standar ( tahan 2-5 hari)", "Parfum express (tahan 14 hari)", " " }));
        getContentPane().add(cbPewangi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 330, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Total");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        totalbyr.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(totalbyr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 330, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

 
        String customer = cbCustomer.getSelectedItem().toString();
        int atasan = Integer.parseInt(inpAtasan.getText());
        int bawahan = Integer.parseInt(inpBawahan.getText());
        String pewangi = cbPewangi.getSelectedItem().toString();
        int biaya = 0;

        if (cbPewangi.getSelectedItem() == "Pilihan") {
            biaya = 0;
            totalbyr.setText(String.valueOf(biaya));
        } else if (pewangi.equals("Parfum biasa")) {
            biaya = 800 * (atasan + bawahan);
            totalbyr.setText(String.valueOf(biaya));
        } else if (pewangi.equals(" Parfum standar ( tahan 2-5 hari)")) {
            biaya = 1000 * (atasan + bawahan);
            totalbyr.setText(String.valueOf(biaya));
        } else if (pewangi.equals("Parfum express (tahan 14 hari)")) {
            biaya = 1500 * (atasan + bawahan);
            totalbyr.setText(String.valueOf(biaya));
        }

        Order o = new Order(customer, pewangi, atasan, bawahan, biaya);

        if (customer.equals("")) {
            JOptionPane.showMessageDialog(null, "Masukan nama!");
        } else if (String.valueOf(atasan).equals("") || String.valueOf(atasan).equals(0)) {
            JOptionPane.showMessageDialog(null, "Ada jumlah atasan? Ketik 0 jika tidak");
        } else if (String.valueOf(bawahan).equals("") || String.valueOf(bawahan).equals(0)) {
            JOptionPane.showMessageDialog(null, "Ada jumlah bawahan? Ketik 0 jika tidak");
        } else if (pewangi.equals("Pilihan")) {
            JOptionPane.showMessageDialog(null, "Masukan jenis Pewangi!");
        } else if (btnNext.getText().equals("Next")) {
            try {
                if (order.tambahPesanan(o)) {
                    JOptionPane.showMessageDialog(this, "Berhasil Tambah Data");
                    Pembayaran pembayaran = new Pembayaran();
                    pembayaran.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Tambah Data");
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
        } else {
            try {
                int jawaban = JOptionPane.showConfirmDialog(this, "Ubah Data " + o.getNama() + "?", "Ubah", JOptionPane.YES_NO_OPTION);
                if (jawaban == JOptionPane.YES_OPTION) {
                    if (order.ubahDataBooking(o)) {
                        JOptionPane.showMessageDialog(this, "Berhasil Ubah Data");
                        Pembayaran pembayaran = new Pembayaran();
                        pembayaran.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal Ubah Data");
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCustomerActionPerformed

    private void inpAtasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpAtasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpAtasanActionPerformed

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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNext;
    public javax.swing.JComboBox<String> cbCustomer;
    public javax.swing.JComboBox<String> cbPewangi;
    public javax.swing.JTextField inpAtasan;
    public javax.swing.JTextField inpBawahan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField totalbyr;
    // End of variables declaration//GEN-END:variables
}
