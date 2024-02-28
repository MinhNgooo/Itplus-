/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.vn1.pkg1.MVC;

/**
 *
 * @author cuong
 */
public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
