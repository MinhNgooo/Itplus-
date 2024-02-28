/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

/**
 *
 * @author cuong
 */
public class TaiLieu {
   private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void hienThiThongTin() {
        System.out.println("Mã tài liệu: " + maTaiLieu);
        System.out.println("Nhà xuất bản: " + tenNhaXuatBan);
        System.out.println("Số bản phát hành: " + soBanPhatHanh);
    }
}
