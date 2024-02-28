/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();

        // Thêm đoạn mã dưới để hiển thị tiếng Việt
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
         while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xóa tài liệu theo mã tài liệu");
            System.out.println("3. Hiển thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát khỏi chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Xóa ký tự mới (Enter)

            switch (choice) {
                case 1:
                    // Thêm mới tài liệu
                    System.out.print("Nhập loại tài liệu (Sach/TapChi/Bao): ");
                    String loaiTaiLieu = scanner.nextLine();
                    System.out.print("Nhập mã tài liệu: ");
                    String maTaiLieu = scanner.nextLine();
                    System.out.print("Nhập tên nhà xuất bản: ");
                    String tenNhaXuatBan = scanner.nextLine();
                    System.out.print("Nhập số bản phát hành: ");
                    int soBanPhatHanh = scanner.nextInt();
                    scanner.nextLine(); // Xóa ký tự mới (Enter)

                    if (loaiTaiLieu.equalsIgnoreCase("Sach")) {
                        System.out.print("Nhập tên tác giả: ");
                        String tenTacGia = scanner.nextLine();
                        System.out.print("Nhập số trang: ");
                        int soTrang = scanner.nextInt();
                        quanLySach.themMoiTaiLieu(new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
                    } else if (loaiTaiLieu.equalsIgnoreCase("TapChi")) {
                        System.out.print("Nhập số phát hành: ");
                        int soPhatHanh = scanner.nextInt();
                        System.out.print("Nhập tháng phát hành: ");
                        int thangPhatHanh = scanner.nextInt();
                        quanLySach.themMoiTaiLieu(new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                    } else if (loaiTaiLieu.equalsIgnoreCase("Bao")) {
                        System.out.print("Nhập ngày phát hành: ");
                        String ngayPhatHanh = scanner.nextLine();
                        quanLySach.themMoiTaiLieu(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
                    } else {
                        System.out.println("Loại tài liệu không hợp lệ.");
                    }
                    System.out.println("Tài liệu đã được thêm mới thành công.");
                    break;

                case 2:
                    // Xóa tài liệu theo mã tài liệu
                    System.out.print("Nhập mã tài liệu cần xóa: ");
                    String maTaiLieuXoa = scanner.nextLine();
                    quanLySach.xoaTaiLieu(maTaiLieuXoa);
                    System.out.println("Tài liệu đã được xóa thành công.");
                    break;

                case 3:
                    // Hiển thị thông tin về tài liệu
                    quanLySach.hienThiThongTinTaiLieu();
                    break;

                case 4:
                    // Tìm kiếm tài liệu theo loại
                    System.out.print("Nhập loại tài liệu cần tìm kiếm (Sach/TapChi/Bao): ");
                    String loaiTimKiem = scanner.nextLine();
                    quanLySach.timKiemTheoLoai(loaiTimKiem);
                    break;

                case 5:
                    // Thoát khỏi chương trình
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}