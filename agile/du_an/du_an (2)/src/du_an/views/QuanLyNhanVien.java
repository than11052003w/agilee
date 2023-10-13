/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package du_an.views;

import du_an.models.NhanVien;
import du_an.services.impl.NhanVienService;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suppe
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private NhanVienService nhanViens = new NhanVienService();

    public QuanLyNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        dtm = new DefaultTableModel();
        tblNhanViens.setModel(dtm);

        String[] headers = {"Mã", "Họ tên", "Năm sinh", "Giới tính", "Số điện thoại", "CCCD/CMT", "Địa chỉ"};
        dtm.setColumnIdentifiers(headers);
        addDL();
        docFile();
        showDataTable();
    }

    public static void addDL() {
        if (NhanVienService.nhanViens.size() == 0) {
            NhanVienService.nhanViens.add(new NhanVien("NV01", "Nguyễn Trà My", 2003, false, "0294475553", "00123654851", "Hà Nội"));
            NhanVienService.nhanViens.add(new NhanVien("NV03", "Trịnh Văn Bô", 1999, true, "0698547588", "01235569878", "Nghệ An"));
            NhanVienService.nhanViens.add(new NhanVien("NV02", "Nguyễn Tiến Mạnh", 2003, true, "0294475115", "00232365658", "Sài Gòn"));
            NhanVienService.nhanViens.add(new NhanVien("NV04", "Trần Văn Nam", 2003, true, "0294475115", "00232365658", "Ninh BÌnh"));
            NhanVienService.nhanViens.add(new NhanVien("NV06", "Đinh Văn Quang", 2003, true, "0294475115", "00232365658", "Hòa Bình"));
            NhanVienService.nhanViens.add(new NhanVien("NV05", "Nguyễn Thu Hằng", 2003, false, "0294475115", "00232365658", "Nam Định"));

        }
    }

    public static void docFile() {
        try {
            FileInputStream fis = new FileInputStream("NhanVien.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<NhanVien> nvs = (List<NhanVien>) ois.readObject();
            NhanVienService.nhanViens.removeAll(NhanVienService.nhanViens);
            for (NhanVien nv : nvs) {
                NhanVienService.nhanViens.add(nv);
            }
            fis.close();
            ois.close();

        } catch (Exception e) {
        }
    }

    private void showDataTable() {

        dtm.setRowCount(0);
        for (NhanVien nv : nhanViens.selectAll()) {
            dtm.addRow(nv.getObject());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNamSinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonSuaThongTin = new javax.swing.JButton();
        buttonSapXep = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        buttonTimKiem = new javax.swing.JButton();
        buttonThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanViens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(251, 246, 246));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 69, 204));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        txtHoVaTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 231, 252)));

        jLabel2.setText("Họ và tên:");

        txtNamSinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 231, 252)));

        jLabel3.setText("Năm sinh:");

        buttonGroup1.add(radioNam);
        radioNam.setText("Nam");

        buttonGroup1.add(radioNu);
        radioNu.setText("Nữ");
        radioNu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 243, 253), 1, true));

        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 231, 252)));

        jLabel4.setText("Giới tính:");

        jLabel5.setText("Số điện thoại:");

        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 231, 252)));

        jLabel6.setText("Địa chỉ:");

        txtCCCD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 231, 252)));

        txtMaNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 231, 252)));

        jLabel7.setText("Mã nhân viên:");

        jLabel8.setText("CCCD/ CMT:");

        buttonSuaThongTin.setBackground(new java.awt.Color(178, 204, 184));
        buttonSuaThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/du_an/icon/Upload.png"))); // NOI18N
        buttonSuaThongTin.setText("Sửa thông tin");
        buttonSuaThongTin.setBorder(null);
        buttonSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaThongTinActionPerformed(evt);
            }
        });

        buttonSapXep.setBackground(new java.awt.Color(178, 204, 184));
        buttonSapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/du_an/icon/Statistics.png"))); // NOI18N
        buttonSapXep.setText("Sắp xếp");
        buttonSapXep.setBorder(null);
        buttonSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSapXepActionPerformed(evt);
            }
        });

        buttonXoa.setBackground(new java.awt.Color(178, 204, 184));
        buttonXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/du_an/icon/Delete.png"))); // NOI18N
        buttonXoa.setText("Xóa");
        buttonXoa.setBorder(null);
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });

        buttonTimKiem.setBackground(new java.awt.Color(178, 204, 184));
        buttonTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/du_an/icon/Search.png"))); // NOI18N
        buttonTimKiem.setText("Tìm kiếm");
        buttonTimKiem.setBorder(null);
        buttonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimKiemActionPerformed(evt);
            }
        });

        buttonThoat.setBackground(new java.awt.Color(178, 204, 184));
        buttonThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/du_an/icon/Open door.png"))); // NOI18N
        buttonThoat.setText("Thoát");
        buttonThoat.setBorder(null);
        buttonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThoatActionPerformed(evt);
            }
        });

        tblNhanViens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Họ tên", "Năm sinh", "Giới tính", "Số điện thoại", "CCCD/ CMT", "Địa chỉ"
            }
        ));
        tblNhanViens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanViensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanViens);
        if (tblNhanViens.getColumnModel().getColumnCount() > 0) {
            tblNhanViens.getColumnModel().getColumn(0).setMinWidth(100);
            tblNhanViens.getColumnModel().getColumn(1).setMinWidth(160);
            tblNhanViens.getColumnModel().getColumn(2).setMinWidth(80);
            tblNhanViens.getColumnModel().getColumn(3).setMinWidth(80);
            tblNhanViens.getColumnModel().getColumn(4).setMinWidth(90);
            tblNhanViens.getColumnModel().getColumn(5).setMinWidth(90);
            tblNhanViens.getColumnModel().getColumn(6).setMinWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioNam)
                                        .addGap(36, 36, 36)
                                        .addComponent(radioNu))
                                    .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(buttonSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(buttonSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(buttonThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(buttonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioNu)
                            .addComponent(radioNam)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanViensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanViensMouseClicked
        int row = tblNhanViens.getSelectedRow();
        fillPhanTu(row);
    }//GEN-LAST:event_tblNhanViensMouseClicked

    private void buttonSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSapXepActionPerformed
        ImageIcon icon = new ImageIcon("src/du_an/icon/Pointer");
        String sapXep[] = {"Sắp xếp theo mã", "Sắp xếp theo tên"};
        int hoi = JOptionPane.showOptionDialog(this,
                "Mời lựa lựa chọn cách sắp xếp",
                "Sắp xếp",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon,
                sapXep,
                sapXep[0]);
        if (hoi == 0) {
            JOptionPane.showMessageDialog(this, "Bạn đã lựa chọn sắp xếp theo mã");
            nhanViens.sortMa();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã lựa chọn sắp xếp theo tên");
            nhanViens.sortTen();
        }
        showDataTable();
    }//GEN-LAST:event_buttonSapXepActionPerformed

    private void buttonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThoatActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không") == JOptionPane.YES_OPTION) {
            this.dispose();
            new ChonCongViec().setVisible(true);
        }
    }//GEN-LAST:event_buttonThoatActionPerformed

    private void buttonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimKiemActionPerformed
        List<NhanVien> listNV = nhanViens.selectAll();
        new TimKiemNhanVien(listNV).setVisible(true);
    }//GEN-LAST:event_buttonTimKiemActionPerformed

    private void buttonSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaThongTinActionPerformed
        // TODO add your handling code here:
        int index = tblNhanViens.getSelectedRow();
        if (check()) {
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần sửa",
                        "Sửa không thành công", JOptionPane.ERROR_MESSAGE);
            } else {
                if (JOptionPane.showConfirmDialog(this,
                        "Bạn có chắc chắn muốn sửa thông tin không?") == JOptionPane.YES_OPTION) {
                    nhanViens.update(index, new NhanVien(txtMaNV.getText(), txtHoVaTen.getText(),
                            Integer.parseInt(txtNamSinh.getText()), radioNam.isSelected(),
                            txtSoDienThoai.getText(), txtCCCD.getText(), txtDiaChi.getText()));
                    NhanVienService.ghiDuLieu();
                    showDataTable();
                    JOptionPane.showMessageDialog(this, "Sửa thông tin nhân viên thành công");
                } else {
                    return;
                }
            }
        }
    }//GEN-LAST:event_buttonSuaThongTinActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
        int row = tblNhanViens.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Chưa chọn dòng", "", JOptionPane.ERROR_MESSAGE);
        } else {
            int check = JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc chắn muốn xóa không");
            if (check == 0) {
                nhanViens.delete(nhanViens.selectAll().get(row));
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                nhanViens.ghiDuLieu();
                showDataTable();
            }
        }
    }//GEN-LAST:event_buttonXoaActionPerformed
    private boolean check() {
        StringBuilder err = new StringBuilder();
        if (txtMaNV.getText().isEmpty()) {
            err.append("Mã nhân viên không được để trống\n");
        } else if (txtHoVaTen.getText().isEmpty()) {
            err.append("Họ tên không được để trống\n");
        } else if (!txtHoVaTen.getText().matches("\\D+")) {
            err.append("Họ tên không hợp lệ\n");
        } else if (txtNamSinh.getText().isEmpty()) {
            err.append("Năm sinh không được để trống\n");
        } else if (!txtNamSinh.getText().matches("^\\d+$")) {
            err.append("Năm sinh không hợp lệ\n");
        } else if (radioNam.isSelected() == false && radioNu.isSelected() == false) {
            err.append("Giới tính không được để trống\n");
        } else if (txtSoDienThoai.getText().isEmpty()) {
            err.append("Số điện thoại không được để trống\n");
        } else if (!txtSoDienThoai.getText().matches("^0\\d{9}$")) {
            err.append("Số điện thoại không hợp lệ\n");
        } else if (txtDiaChi.getText().isEmpty()) {
            err.append("Địa chỉ không được để trống\n");
        } else if (txtCCCD.getText().isEmpty()) {
            err.append("CCCD không được để trống\n");
        } else if (!txtCCCD.getText().matches("^\\d{12}$")) {
            err.append("CCCD không hợp lệ\n");
        }

        if (err.length() > 0) {
            JOptionPane.showMessageDialog(this, err, "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    private void fillPhanTu(int row) {
        NhanVien nv = nhanViens.selectAll().get(row);
        txtHoVaTen.setText(nv.getHoTen());
        txtNamSinh.setText(String.valueOf(nv.getNamSinh()));
        txtSoDienThoai.setText(nv.getSdt());
        txtDiaChi.setText(nv.getDiaChi());
        txtMaNV.setText(nv.getMa());
        txtCCCD.setText(nv.getCccd());
        boolean gioiTinh = nv.isGioiTinh();
        if (gioiTinh == true) {
            radioNam.setSelected(true);
        } else {
            radioNu.setSelected(true);
        }
    }

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
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSapXep;
    private javax.swing.JButton buttonSuaThongTin;
    private javax.swing.JButton buttonThoat;
    private javax.swing.JButton buttonTimKiem;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JTable tblNhanViens;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
