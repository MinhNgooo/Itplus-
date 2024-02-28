/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.vn1.pkg1.MVC;

/**
 *
 * @author cuong
 */
class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngành đào tạo: " + nganhDaoTao);
    }
}
