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
import javax.swing.JRadioButton;

/**
 *
 * @author Name
 */
public class Pelanggan_Edit extends javax.swing.JFrame {

    public JButton getBtnAdd() {
        return BtnAdd;
    }

    public JButton getBtnCari() {
        return BtnCari;
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

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
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
    }
    
    public void addAdapter(MouseAdapter e){
        BtnAdd.addMouseListener(e);
        Jk1.addMouseListener(e);
        Jk2.addMouseListener(e);
    }
    /**
     * Creates new form Pelanggan_Edit
     */
    public Pelanggan_Edit() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Idpel = new javax.swing.JTextField();
        BtnCari = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Namapel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamatpel = new javax.swing.JTextArea();
        BtnAdd = new javax.swing.JButton();
        Jk1 = new javax.swing.JRadioButton();
        Jk2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Biro Perjalanan");

        jLabel1.setText("Form Perubahan Data Pelanggan");

        jLabel3.setText("ID Pelanggan    :");

        Idpel.setText("Masukkan Id Pelanggan");

        BtnCari.setText("Cari");

        jLabel4.setText("Nama                :");

        jLabel5.setText("Jenis Kelamin    :");

        jLabel6.setText("Alamat             :");

        Alamatpel.setColumns(20);
        Alamatpel.setRows(5);
        jScrollPane1.setViewportView(Alamatpel);

        BtnAdd.setText("Simpan");

        buttonGroup1.add(Jk1);
        Jk1.setText("Laki-laki");
        Jk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jk1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Jk2);
        Jk2.setText("Perempuan");
        Jk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jk2ActionPerformed(evt);
            }
        });

        jMenu3.setText("Tambah");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Hapus");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Tampil");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAdd)
                    .addComponent(BtnCari)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jk2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(Idpel)
                                .addComponent(Namapel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addComponent(Jk1)))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Idpel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Namapel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Jk1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jk2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAdd)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jk1ActionPerformed

    private void Jk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jk2ActionPerformed

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
//            java.util.logging.Logger.getLogger(Pelanggan_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Pelanggan_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Pelanggan_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Pelanggan_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Pelanggan_Edit().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamatpel;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnCari;
    private javax.swing.JTextField Idpel;
    private javax.swing.JRadioButton Jk1;
    private javax.swing.JRadioButton Jk2;
    private javax.swing.JTextField Namapel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
