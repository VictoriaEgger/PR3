package UE11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("ue11 starting up...");


        Product p1 = new Product("n", 100.00, "Salat");
        Product p2 = new Product("a", 100.00, "Salat");
        Product p3 = new Product("w", 100.00, "Salat");
        ProductManager products = new ProductManager();

        products.add(p1);
        products.add(p2);
        products.add(p3);

products.saveToFile("products.txt");

products.readFromFile("products.txt");
    }
}
