/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

/**
 *
 * @author cuong
 */
class Sach extends TaiLieu {
     private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tên tác giả: " + tenTacGia);
        System.out.println("Số trang: " + soTrang);
    }
}
