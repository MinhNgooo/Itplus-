/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.vn1.pkg1.MVC;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cuong
 */
class QLCB {
    private List<CanBo> danhSachCanBo;

    public QLCB() {
        this.danhSachCanBo = new ArrayList<>();
    }

    public void themMoiCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public void timKiemTheoHoTen(String hoTen) {
        System.out.println("===== KẾT QUẢ TÌM KIẾM =====");
        boolean found = false;
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                canBo.hienThiThongTin();
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cán bộ có họ tên: " + hoTen);
        }
    }

    public void hienThiDanhSachCanBo() {
        System.out.println("===== DANH SÁCH CÁN BỘ =====");
        if (danhSachCanBo.isEmpty()) {
            System.out.println("Không có cán bộ nào trong danh sách.");
        } else {
            for (CanBo canBo : danhSachCanBo) {
                canBo.hienThiThongTin();
                System.out.println("-----------------------------");
            }
        }
    }
}

