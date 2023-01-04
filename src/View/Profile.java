/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.userController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;

/**
 *
 * @author yudhi
 */
public class Profile extends javax.swing.JFrame {

    //deklarasi
    private final DefaultTableModel model = new DefaultTableModel();
    private userController user = new userController();

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        setResizable(false);

        //tabel
        model.addColumn("id");
        model.addColumn("Nama");
        model.addColumn("NO Telp");
        model.addColumn("Email");
        model.addColumn("Alamat");

        tableUser.setModel(model);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        populateTable();
    }

    private void populateTable() {
        model.setRowCount(0);
        try {
            ArrayList<User> lihat = user.tampilData();
            for (User u : lihat) {
                Object[] isiData = {u.getId(), u.getUsername(), u.getNoTelp(), u.getEmail(), u.getAlamat()};
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
        tableUser = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pengguna");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 196, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 153));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No Telp", "Email", "Alamat"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 509, 312));

        btnHome.setBackground(new java.awt.Color(0, 102, 153));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        btnUbah.setBackground(new java.awt.Color(0, 102, 153));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah Alamat");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        btnHapus.setBackground(new java.awt.Color(0, 102, 153));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/status2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -50, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableUser.getSelectedRow();
        String id = model.getValueAt(selectedRow, 0).toString();
        int jawaban = JOptionPane.showConfirmDialog(this, "Hapus Data " + id + "?", "Hapus", JOptionPane.YES_NO_OPTION);
        if (jawaban == JOptionPane.YES_OPTION) {
            //hapus
            try {
                if (user.hapusUser(id)) {
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

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        if (btnUbah.getText().equals("Ubah Alamat")) {
            int selectedRow = tableUser.getSelectedRow();

//            String id = model.getValueAt(selectedRow, 0).toString();
            String username = model.getValueAt(selectedRow, 1).toString();
            String noTelp = model.getValueAt(selectedRow, 2).toString();
            String email = model.getValueAt(selectedRow, 3).toString();
            String alamat = model.getValueAt(selectedRow, 4).toString();
//            String password = model.getValueAt(selectedRow, 5).toString();
            String password = user.cekPassword(username);

            Register register = new Register();
            register.setVisible(true);

            register.inpUser.setText(username);
            register.inpUser.setEnabled(false);
            register.inpNoTelp.setText(noTelp);
            register.inpNoTelp.setEnabled(false);
            register.inpEmail.setText(email);
            register.inpEmail.setEnabled(false);
            register.inpAlamat.setText(alamat);
            register.inpPass.setText(password);
            register.inpPass.setEnabled(false);

            register.btnDaftar.setText("Ubah");

            this.dispose();
        }

    }//GEN-LAST:event_btnUbahActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        // TODO add your handling code here:
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_tableUserMouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}
