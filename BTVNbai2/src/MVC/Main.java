/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        // Tạo sẵn danh sách 3 đối tượng Category
        Category category1 = new Category("Điện tử");
        Category category2 = new Category("Thời trang");
        Category category3 = new Category("Đồ gia dụng");

        // Menu
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị thông tin sản phẩm theo ID");
            System.out.println("5. Hiển thị tất cả sản phẩm");
            System.out.println("6. Hiển thị tất cả sản phẩm theo danh mục");
            System.out.println("7. Tính tổng tiền của các sản phẩm");
            System.out.println("8. Hiển thị sản phẩm có giá > 100000");
            System.out.println("9. Hiển thị sản phẩm có giá > 200000 và có danh mục là 'Điện tử'");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
             case 1:
    // Thêm mới sản phẩm
    System.out.print("Nhập ID sản phẩm: ");
    Long newId = scanner.nextLong();
    scanner.nextLine(); // Dọn bộ đệm
    System.out.print("Nhập tên sản phẩm: ");
    String newName = scanner.nextLine();
    System.out.print("Nhập giá sản phẩm: ");
    Double newPrice = scanner.nextDouble();
    System.out.print("Nhập số lượng sản phẩm: ");
    Integer newQuantity = scanner.nextInt();
    scanner.nextLine(); // Dọn bộ đệm
    System.out.print("Nhập tên danh mục: ");
    String categoryInput = scanner.nextLine();
    Category newCategory = new Category(categoryInput);
    Product newProduct = new Product(newId, newName, newPrice, newQuantity, newCategory);
    productManager.addProduct(newProduct);
    System.out.println("Sản phẩm đã được thêm mới thành công.");
    break;

case 2:
    // Sửa thông tin sản phẩm
    System.out.print("Nhập ID sản phẩm cần sửa: ");
    Long productIdToUpdate = scanner.nextLong();
    scanner.nextLine(); // Dọn bộ đệm
    System.out.print("Nhập tên mới cho sản phẩm: ");
    String updatedName = scanner.nextLine();
    System.out.print("Nhập giá mới cho sản phẩm: ");
    Double updatedPrice = scanner.nextDouble();
    System.out.print("Nhập số lượng mới cho sản phẩm: ");
    Integer updatedQuantity = scanner.nextInt();
    scanner.nextLine(); // Dọn bộ đệm
    System.out.print("Nhập tên danh mục mới: ");
    String updatedCategoryInput = scanner.nextLine();
    Category updatedCategory = new Category(updatedCategoryInput);
    productManager.updateProduct(productIdToUpdate, updatedName, updatedPrice, updatedQuantity, updatedCategory);
    System.out.println("Thông tin sản phẩm đã được cập nhật thành công.");
    break;

case 3:
    // Xóa sản phẩm
    System.out.print("Nhập ID sản phẩm cần xóa: ");
    Long productIdToDelete = scanner.nextLong();
    productManager.deleteProduct(productIdToDelete);
    System.out.println("Sản phẩm đã được xóa thành công.");
    break;

case 4:
    // Hiển thị thông tin sản phẩm theo ID
    System.out.print("Nhập ID sản phẩm cần hiển thị: ");
    Long productIdToDisplay = scanner.nextLong();
    productManager.displayProductById(productIdToDisplay);
    break;

case 5:
    // Hiển thị tất cả sản phẩm
    productManager.displayAllProducts();
    break;

case 6:
    // Hiển thị tất cả sản phẩm theo danh mục
    System.out.print("Nhập tên danh mục cần hiển thị: ");
    String categoryToDisplay = scanner.nextLine();
    productManager.displayProductsByCategory(categoryToDisplay);
    break;
                case 7:
    // Tính tổng tiền của các sản phẩm
    System.out.println("Tổng tiền của các sản phẩm là: " + productManager.calculateTotalPrice());
    break;

case 8:
    // Hiển thị sản phẩm có giá > 100000
    System.out.println("Danh sách sản phẩm có giá trên 100000:");
    productManager.displayProductsAbovePrice(100000.0);
    break;

case 9:
    // Hiển thị sản phẩm có giá > 200000 và có danh mục là 'Điện tử'
    System.out.println("Danh sách sản phẩm có giá trên 200000 và thuộc danh mục 'Điện tử':");
    productManager.displayElectronicProductsAbovePrice(200000.0);
    break;

case 0:
    // Thoát
    System.exit(0);
    break;

default:
    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}