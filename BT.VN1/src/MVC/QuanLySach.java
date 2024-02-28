/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cuong
 */
class QuanLySach {
     private List<TaiLieu> danhSachTaiLieu;

    public QuanLySach() {
        this.danhSachTaiLieu = new ArrayList<>();
    }

    public void themMoiTaiLieu(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
    }

    public void xoaTaiLieu(String maTaiLieu) {
        danhSachTaiLieu.removeIf(taiLieu -> taiLieu.getMaTaiLieu().equals(maTaiLieu));
    }

    public void hienThiThongTinTaiLieu() {
        System.out.println("===== THÔNG TIN TÀI LIỆU =====");
        if (danhSachTaiLieu.isEmpty()) {
            System.out.println("Không có tài liệu nào trong thư viện.");
        } else {
            for (TaiLieu taiLieu : danhSachTaiLieu) {
                taiLieu.hienThiThongTin();
                System.out.println("-----------------------------");
            }
        }
    }

    public void timKiemTheoLoai(String loai) {
        System.out.println("===== KẾT QUẢ TÌM KIẾM =====");
        boolean found = false;
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)) {
                taiLieu.hienThiThongTin();
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy tài liệu loại " + loai);
        }
    }
}