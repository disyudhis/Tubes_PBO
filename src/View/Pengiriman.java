/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.OrderController;
import controller.ShipmentController;
import controller.StatusController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Order;
import model.Shipment;
import model.Status;

/**
 *
 * @author yudhi
 */
public class Pengiriman extends javax.swing.JFrame {
    ShipmentController ship = new ShipmentController();
    StatusController sc = new StatusController();
    /**
     * Creates new form Pengiriman
     */
    
    int id;
    String nama;
    String status = "Sedang Dikerjakan";
    public Pengiriman(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    

    public int getId() {
        return id;
    }      

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public Pengiriman() throws SQLException {
//        initComponents();

        initComponents();

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        setResizable(false);
        cbOutlet.removeAllItems();
        cbOutlet.addItem("Pilihan");
        cbOutlet.addItem("Bojongsoang");
        cbOutlet.addItem("Banjaran");
        cbOutlet.addItem("Buah Batu");
        cbOutlet.addItem("Cipagalo");

        cbEstimasi.removeAllItems();
        cbEstimasi.addItem("Pilihan");
        cbEstimasi.addItem("1-2 Hari");
        cbEstimasi.addItem("2-4 Hari");
        
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
        cbOutlet = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inpAlamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cbEstimasi = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Pengiriman");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 157, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Outlet");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 173, -1));

        cbOutlet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbOutlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 374, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Keterangan Alamat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 173, -1));

        inpAlamat.setColumns(20);
        inpAlamat.setRows(5);
        jScrollPane1.setViewportView(inpAlamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 374, 120));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Estimasi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 173, -1));

        cbEstimasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEstimasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstimasiActionPerformed(evt);
            }
        });
        getContentPane().add(cbEstimasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 374, -1));

        jButton1.setText("Lanjut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 149, 37));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/LEAVE CLEANING (18).png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String outlet = cbOutlet.getSelectedItem().toString();
        String estimasi = cbEstimasi.getSelectedItem().toString();
        String alamat = inpAlamat.getText();

        Shipment s = new Shipment(id, alamat, outlet, estimasi);
        Status stat = new Status(id,nama,alamat,outlet,estimasi,status);

        if (cbOutlet.equals("Pilihan")) {
            JOptionPane.showMessageDialog(null, "Masukan nama!");
        } else if (String.valueOf(inpAlamat).equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan Alamat");
        } else if (cbEstimasi.equals("Pilihan")) {
            JOptionPane.showMessageDialog(null, "Masukkan Estimasi");
        } else {
            try {
                if (ship.tambahShipment(s) && sc.tambahStatus(stat)) {
                    JOptionPane.showMessageDialog(this, "Tambah Data Berhasil");
                    Stats status = new Stats();
                    status.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Tambah Data");
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbEstimasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstimasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstimasiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Pembayaran b = new Pembayaran();
        b.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pengiriman().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Pengiriman.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEstimasi;
    private javax.swing.JComboBox<String> cbOutlet;
    private javax.swing.JTextArea inpAlamat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}



