/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.OrderController;
import controller.StatusController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Order;
import model.Status;

/**
 *
 * @author yudhi
 */
public class Pembayaran extends javax.swing.JFrame {
    // Deklarasi & instansiasi

    private final DefaultTableModel model = new DefaultTableModel();
    private OrderController order = new OrderController();

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        initComponents();

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        // Matiin Resize / Maximize
        setResizable(false);

        //tabel
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Jumlah Atasan");
        model.addColumn("Jumlah Bawahan");
        model.addColumn("Paket pewangi");
        model.addColumn("Total Bayar");

        tableOrder.setModel(model);
        btnHapus.setEnabled(false);
        btnBayar.setEnabled(false);

        populateTable();
    }

    private void populateTable() {
        model.setRowCount(0);
        try {
            ArrayList<Order> lihat = order.tampilDataOrder();
            for (Order o : lihat) {
                Object[] isiData = {o.getId(), o.getNama(), o.getJumlahAtasan(), o.getJumlahBawahan(), o.getPewangi(), o.getTotal()};
                model.addRow(isiData);
            }
        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        btnBayar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Keranjang");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Jumlah Atasan", "Jumlah Bawahan", "Paket pewangi", "Total Bayar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tableOrderMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableOrderMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableOrder);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 723, 277));

        btnBayar.setBackground(new java.awt.Color(0, 153, 255));
        btnBayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 170, 36));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        btTambah.setBackground(new java.awt.Color(0, 153, 255));
        btTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTambah.setForeground(new java.awt.Color(255, 255, 255));
        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, 30));

        btnHapus.setBackground(new java.awt.Color(204, 204, 204));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(204, 0, 0));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/status2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderMouseClicked
        // TODO add your handling code here:
        btTambah.setText("Ubah");
        btnHapus.setEnabled(true);
        btnBayar.setText("Bayar Sekarang!");
        btnBayar.setEnabled(true);
    }//GEN-LAST:event_tableOrderMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableOrder.getSelectedRow();
        String id = model.getValueAt(selectedRow, 0).toString();
        int jawaban = JOptionPane.showConfirmDialog(this, "Hapus Data " + id + "?", "Hapus", JOptionPane.YES_NO_OPTION);
        if (jawaban == JOptionPane.YES_OPTION) {
            //hapus
            try {
                if (order.hapusDataPesanan(id)) {
                    JOptionPane.showMessageDialog(this, "Berhasil Hapus");
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Hapus");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Eksepsi: " + e.getMessage());
            }

        }

    }//GEN-LAST:event_btnHapusActionPerformed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        if (btTambah.getText().equals("Tambah")) {
            Pemesanan pemesanan = new Pemesanan();
            pemesanan.setVisible(true);
            this.dispose();
        } else if (btTambah.getText().equals("Ubah")) {
            int selectedRow = tableOrder.getSelectedRow();

//            String id = model.getValueAt(selectedRow, 0).toString();
            String nama = model.getValueAt(selectedRow, 1).toString();
            String jumlahAtasan = model.getValueAt(selectedRow, 2).toString();
            String jumlahBawahan = model.getValueAt(selectedRow, 3).toString();
            String pewangi = model.getValueAt(selectedRow, 4).toString();
            String total = model.getValueAt(selectedRow, 5).toString();

            Pemesanan pemesanan = new Pemesanan();
            pemesanan.setVisible(true);

            pemesanan.cbCustomer.setEnabled(false);
            pemesanan.cbCustomer.setSelectedItem(nama);
            pemesanan.inpAtasan.setText(jumlahAtasan);
            pemesanan.inpBawahan.setText(jumlahBawahan);
            pemesanan.cbPewangi.setSelectedItem(pewangi);
            pemesanan.totalbyr.setEditable(false);
            pemesanan.totalbyr.setText(total);

            //barber & totalbayar
            pemesanan.btnNext.setText("Ubah");

            this.dispose();

        }
    }//GEN-LAST:event_btTambahActionPerformed

    private void tableOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tableOrderMouseExited

    private void tableOrderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tableOrderMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        btTambah.setText("Tambah");
    }//GEN-LAST:event_formMouseClicked

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        if (btnBayar.getText().equals("Bayar Sekarang!")) {
            int selectedRow = tableOrder.getSelectedRow();
            String orderId = model.getValueAt(selectedRow, 0).toString();
            String nama = model.getValueAt(selectedRow,1).toString();
            Pengiriman pengiriman = null;
            try {
                pengiriman = new Pengiriman();
            } catch (SQLException ex) {
                Logger.getLogger(Pembayaran.class.getName()).log(Level.SEVERE, null, ex);
            }
            pengiriman.setId(Integer.parseInt(orderId));
            pengiriman.setNama(nama);
            pengiriman.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Pemesanan yg ingin dibayar");
        }
    }//GEN-LAST:event_btnBayarActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOrder;
    // End of variables declaration//GEN-END:variables
}
