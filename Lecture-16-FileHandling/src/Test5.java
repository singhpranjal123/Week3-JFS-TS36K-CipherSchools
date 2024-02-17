import java.io.*;
import java.util.*;

class Product {
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

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> cart = new ArrayList<>();

        System.out.print("How many products do you want to add to the shopping cart? ");
        int numProducts = scanner.nextInt();

        for (int i = 1; i <= numProducts; i++) {
            System.out.print("Enter product name: ");
            String productName = scanner.next();

            System.out.print("Enter product price: ");
            double productPrice = scanner.nextDouble();

            cart.add(new Product(productName, productPrice));
        }

        // Save products to cart.txt
        try (PrintWriter writer = new PrintWriter("cart.txt")) {
            for (Product product : cart) {
                writer.println(product.getName() + "," + product.getPrice());
            }
            System.out.println("Products saved to cart.txt");
        } catch (IOException e) {
            System.err.println("Error writing to cart.txt: " + e.getMessage());
        }
    }
}

