package Lesson9_tasks;
import java.util.*;

public class Payment {
    private double totalAmount;
    private List<Product> products;

    public Payment() {
        this.totalAmount = 0.0;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.totalAmount += product.getPrice();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
