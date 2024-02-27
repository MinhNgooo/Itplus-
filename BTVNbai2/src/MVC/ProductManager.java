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
class ProductManager {
    List<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(Long id, String newName, Double newPrice, Integer newQuantity, Category newCategory) {
        for (Product product : productList) {
            if (product.id.equals(id)) {
                product.name = newName;
                product.price = newPrice;
                product.quantity = newQuantity;
                product.category = newCategory;
                break;
            }
        }
    }

    public void deleteProduct(Long id) {
        productList.removeIf(product -> product.id.equals(id));
    }

    public void displayProductById(Long id) {
        for (Product product : productList) {
            if (product.id.equals(id)) {
                System.out.println(product.id + " | " + product.name + " | " + product.price + " | " +
                        product.quantity + " | " + product.category.name);
                break;
            }
        }
    }

    public void displayAllProducts() {
        for (Product product : productList) {
            System.out.println(product.id + " | " + product.name + " | " + product.price + " | " +
                    product.quantity + " | " + product.category.name);
        }
    }

    public void displayProductsByCategory(String categoryName) {
        for (Product product : productList) {
            if (product.category.name.equals(categoryName)) {
                System.out.println(product.id + " | " + product.name + " | " + product.price + " | " +
                        product.quantity + " | " + product.category.name);
            }
        }
    }

    public Double calculateTotalPrice() {
        double total = 0.0;
        for (Product product : productList) {
            total += product.price * product.quantity;
        }
        return total;
    }

    public void displayProductsAbovePrice(Double priceThreshold) {
        for (Product product : productList) {
            if (product.price > priceThreshold) {
                System.out.println(product.id + " | " + product.name + " | " + product.price + " | " +
                        product.quantity + " | " + product.category.name);
            }
        }
    }
public void displayElectronicProductsAbovePrice(Double priceThreshold) {
        for (Product product : productList) {
            if (product.price > priceThreshold && product.category.name.equals("Điện tử")) {
                System.out.println(product.id + " | " + product.name + " | " + product.price + " | " +
                        product.quantity + " | " + product.category.name);
            }
        }
    }
}
