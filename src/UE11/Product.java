package UE11;

public class Product {

    private String productName;
    private double Price;
    private String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        Price = price;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", Price=" + Price +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
