/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.vn1.pkg1.MVC;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class Main {
    public static void main(String[] args) {
            try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin danh sách cán bộ");
            System.out.println("4. Thoát khỏi chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Xóa ký tự mới (Enter)

            switch (choice) {
                case 1:
                    // Thêm mới cán bộ
                    System.out.print("Nhập loại cán bộ (CongNhan/KySu/NhanVien): ");
                    String loaiCanBo = scanner.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Xóa ký tự mới (Enter)
                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();

                    if (loaiCanBo.equalsIgnoreCase("CongNhan")) {
                        System.out.print("Nhập bậc: ");
                        int bac = scanner.nextInt();
                        qlcb.themMoiCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                    } else if (loaiCanBo.equalsIgnoreCase("KySu")) {
                        System.out.print("Nhập ngành đào tạo: ");
                        String nganhDaoTao = scanner.nextLine();
                        qlcb.themMoiCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                    } else if (loaiCanBo.equalsIgnoreCase("NhanVien")) {
                        System.out.print("Nhập công việc: ");
                        String congViec = scanner.nextLine();
                        qlcb.themMoiCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                    } else {
                        System.out.println("Loại cán bộ không hợp lệ.");
                    }
                    System.out.println("Cán bộ đã được thêm mới thành công.");
                    break;

                case 2:
                    // Tìm kiếm theo họ tên
                    System.out.print("Nhập họ tên cần tìm kiếm: ");
                    String hoTenTimKiem = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(hoTenTimKiem);
                    break;

                case 3:
                    // Hiển thị thông tin danh sách cán bộ
                    qlcb.hienThiDanhSachCanBo();
                    break;

                case 4:
                    // Thoát khỏi chương trình
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
