/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DoanhThu;

import JDBC.JDBC;
import static JDBC.JDBC.getJDBCConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuant
 */
public class ThongKeDoanhThu extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeDoanhThu
     */
    public ThongKeDoanhThu() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTin = new javax.swing.JTable();
        lbDoanhThu = new javax.swing.JLabel();
        lbTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btXuatDS = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbDoanhThu1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thống kê doanh thu");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ DOANH THU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tbThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày thanh toán", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThongTin.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbThongTin);
        if (tbThongTin.getColumnModel().getColumnCount() > 0) {
            tbThongTin.getColumnModel().getColumn(0).setResizable(false);
            tbThongTin.getColumnModel().getColumn(1).setResizable(false);
            tbThongTin.getColumnModel().getColumn(2).setResizable(false);
        }

        lbDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lbTimKiem.setText("Tìm kiếm theo ngày:");

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btXuatDS.setText("Tìm kiếm");
        btXuatDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatDSActionPerformed(evt);
            }
        });

        jButton1.setText("Xóa danh sách");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbDoanhThu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDoanhThu1.setText(" Tổng doanh thu: ");

        jButton2.setText("Xuất danh sách các hóa đơn đã thanh toán");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btXuatDS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbDoanhThu1)
                                .addGap(18, 18, 18)
                                .addComponent(lbDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTimKiem))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXuatDS)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDoanhThu)
                    .addComponent(lbDoanhThu1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btXuatDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatDSActionPerformed
        // TODO add your handling code here:
        Connection con = getJDBCConnection();
        String datett = txtTimKiem.getText();
        try {
            String sql = "Select MAHD, NGTT, TONGTIEN FROM HOADON where TO_CHAR(NGTT, 'DD-MM') = ? and TTTT = 'Thanh toán'";
            java.sql.PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, datett);
            java.sql.ResultSet rs = ps.executeQuery();
            DefaultTableModel tblModel = (DefaultTableModel) tbThongTin.getModel();
            tblModel.setRowCount(0);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
            while(rs.next()){
                String mahd = String.valueOf(rs.getInt("MaHD"));
                String ngaytt = rs.getDate("ngtt").toString();
                String tongtien = String.valueOf(rs.getDouble("tongtien"));
                
                String tbData[] = {mahd, ngaytt, tongtien};
                tblModel.addRow(tbData);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        int numrow = tbThongTin.getRowCount();
        double tong = 0;
        for(int i = 0; i < numrow; i++){
            double val = Double.valueOf(tbThongTin.getValueAt(i, 2).toString());
            tong += val;
        }
        lbDoanhThu.setText(Double.toString(tong));
    }//GEN-LAST:event_btXuatDSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lbDoanhThu.setText("");
        DefaultTableModel tblModel = (DefaultTableModel) tbThongTin.getModel();
        tblModel.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = getJDBCConnection();
        try {            
            java.sql.Statement st = con.createStatement();
            String sql = "Select MAHD, NGTT, TONGTIEN FROM HOADON where TTTT = 'Thanh toán'";
            java.sql.ResultSet rs = st.executeQuery(sql);
            DefaultTableModel tblModel = (DefaultTableModel) tbThongTin.getModel();
            tblModel.setRowCount(0);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
            while(rs.next()){
                String mahd = String.valueOf(rs.getInt("MaHD"));
                String ngaytt = rs.getDate("ngtt").toString();
                String tongtien = String.valueOf(rs.getDouble("tongtien"));
                
                String tbData[] = {mahd, ngaytt, tongtien};
                tblModel.addRow(tbData);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        int numrow = tbThongTin.getRowCount();
        double tong = 0;
        for(int i = 0; i < numrow; i++){
            double val = Double.valueOf(tbThongTin.getValueAt(i, 2).toString());
            tong += val;
        }
        lbDoanhThu.setText(Double.toString(tong));
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
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeDoanhThu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btXuatDS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDoanhThu;
    private javax.swing.JLabel lbDoanhThu1;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JTable tbThongTin;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}