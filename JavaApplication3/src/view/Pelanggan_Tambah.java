/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JRadioButton;

/**
 *
 * @author Name
 */
public class Pelanggan_Tambah extends javax.swing.JFrame {

    public JMenu getEdit() {
        return Edit;
    }

    public JMenu getHapus() {
        return Hapus;
    }

    public JMenu getTambah() {
        return Tambah;
    }

    public JMenu getTampil() {
        return Tampil;
    }

    public JButton getBtnAdd() {
        return BtnAdd;
    }
    
    public String getIdPelanggan(){
        return Idpel.getText();
    }
    
    public void setIdPelanggan(String IdPelanggan){
        Idpel.setText(IdPelanggan);
    }
    
    public String getNama(){
        return Namapel.getText(); 
    }
    
    public void setNama(String nama){
        Namapel.setText(nama);
    }

    public JRadioButton getJk1() {
        return Jk1;
    }

    public JRadioButton getJk2() {
        return Jk2;
    }
    
    public String getAlamat(){
        return Alamatpel.getText();
    }
    
    public void setAlamat(String alamat){
        Alamatpel.setText(alamat);
    }
    
    public void addListener(ActionListener e){
        BtnAdd.addActionListener(e);
        Jk1.addActionListener(e);
        Jk2.addActionListener(e);
        Tambah.addActionListener(e);
        Edit.addActionListener(e);
        Hapus.addActionListener(e);
        Tampil.addActionListener(e);  
    }
    /**
     * Creates new form Pelanggan_Tambah
     */
    public Pelanggan_Tambah() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Idpel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Namapel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamatpel = new javax.swing.JTextArea();
        BtnAdd = new javax.swing.JButton();
        Jk1 = new javax.swing.JRadioButton();
        Jk2 = new javax.swing.JRadioButton();
        Menu = new javax.swing.JMenuBar();
        Tambah = new javax.swing.JMenu();
        Edit = new javax.swing.JMenu();
        Hapus = new javax.swing.JMenu();
        Tampil = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Biro Perjalanan");

        jLabel3.setText("ID Pelanggan    :");

        jLabel1.setText("Form Penambahan Pelanggan");

        Idpel.setText("*id akan otomatis increment +1");

        jLabel4.setText("Nama                :");

        jLabel5.setText("Jenis Kelamin    :");

        jLabel6.setText("Alamat             :");

        Alamatpel.setColumns(20);
        Alamatpel.setRows(5);
        jScrollPane1.setViewportView(Alamatpel);

        BtnAdd.setText("Simpan");

        buttonGroup1.add(Jk1);
        Jk1.setText("Laki-laki");

        buttonGroup1.add(Jk2);
        Jk2.setText("Perempuan");

        Tambah.setText("Tambah");
        Menu.add(Tambah);

        Edit.setText("Edit");
        Menu.add(Edit);

        Hapus.setText("Hapus");
        Menu.add(Hapus);

        Tampil.setText("Tampil");
        Menu.add(Tampil);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAdd)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Idpel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jk2)
                            .addComponent(Jk1)
                            .addComponent(Namapel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Idpel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Namapel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Jk1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jk2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAdd)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Pelanggan_Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Pelanggan_Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Pelanggan_Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Pelanggan_Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Pelanggan_Tambah().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamatpel;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu Hapus;
    private javax.swing.JTextField Idpel;
    private javax.swing.JRadioButton Jk1;
    private javax.swing.JRadioButton Jk2;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JTextField Namapel;
    private javax.swing.JMenu Tambah;
    private javax.swing.JMenu Tampil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}