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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Name
 */
public class Petugas_Edit extends javax.swing.JFrame {

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

    public JButton getBtnCari() {
        return BtnCari;
    }

    public String getIdPetugas(){
        return Idpet.getText();
    }
    
    public void setIdPetugas(String IdPetugas){
        Idpet.setText(IdPetugas);
    }
    
    public String getNama(){
        return Namapet.getText(); 
    }
    
    public JRadioButton getJk1() {
        return Jk1;
    }

    public JRadioButton getJk2() {
        return Jk2;
    }
  
    public String getAlamat(){
        return Alamatpet.getText();
    }
    
    public void setAlamat(String alamat){
        Alamatpet.setText(alamat);
    }
    
    public void setNama(String nama){
        Namapet.setText(nama);
    }
    
    public void addListener(ActionListener e){
        BtnAdd.addActionListener(e);
        BtnCari.addActionListener(e);
        Jk1.addActionListener(e);
        Jk2.addActionListener(e);
        Tambah.addActionListener(e);
        Edit.addActionListener(e);
        Hapus.addActionListener(e);
        Tampil.addActionListener(e);   
    }
    
    
    
    /**
     * Creates new form Petugas_Edit
     */
    public Petugas_Edit() {
        initComponents();
    }

    public JTextArea getAlamatpet() {
        return Alamatpet;
    }

    public JTextField getIdpet() {
        return Idpet;
    }

    public JTextField getNamapet() {
        return Namapet;
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Idpet = new javax.swing.JTextField();
        BtnCari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Namapet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamatpet = new javax.swing.JTextArea();
        BtnAdd = new javax.swing.JButton();
        Jk1 = new javax.swing.JRadioButton();
        Jk2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Tambah = new javax.swing.JMenu();
        Edit = new javax.swing.JMenu();
        Hapus = new javax.swing.JMenu();
        Tampil = new javax.swing.JMenu();

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
        setTitle("Aplikasi Biro Perjalanan");

        jLabel1.setText("Form Perubahan Data Petugas");

        jLabel3.setText("ID Petugas     :");

        Idpet.setText("Masukkan Id Petugas ");
        Idpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdpetActionPerformed(evt);
            }
        });

        BtnCari.setText("Cari");

        jLabel2.setText("Nama             :");

        jLabel4.setText("Jenis Kelamin :");

        jLabel5.setText("Alamat           :");

        Alamatpet.setColumns(20);
        Alamatpet.setRows(5);
        jScrollPane1.setViewportView(Alamatpet);

        BtnAdd.setText("Simpan");

        buttonGroup1.add(Jk1);
        Jk1.setText("Laki-Laki");

        buttonGroup1.add(Jk2);
        Jk2.setText("Perempuan");

        Tambah.setText("Tambah");
        jMenuBar1.add(Tambah);

        Edit.setText("Edit");
        jMenuBar1.add(Edit);

        Hapus.setText("Hapus");
        jMenuBar1.add(Hapus);

        Tampil.setText("Tampil");
        jMenuBar1.add(Tampil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCari)))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Namapet)
                            .addComponent(Idpet, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jk1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jk2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnAdd)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Idpet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namapet, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jk1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jk2)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnAdd)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdpetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdpetActionPerformed

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
//            java.util.logging.Logger.getLogger(Petugas_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Petugas_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Petugas_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Petugas_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Petugas_Edit().setVisible(true);
//            }
//        });
//    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamatpet;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnCari;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu Hapus;
    private javax.swing.JTextField Idpet;
    private javax.swing.JRadioButton Jk1;
    private javax.swing.JRadioButton Jk2;
    private javax.swing.JTextField Namapet;
    private javax.swing.JMenu Tambah;
    private javax.swing.JMenu Tampil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}