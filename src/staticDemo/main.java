package staticDemo;

public class main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.id= 010101;
        product.name = "Wireless Mouse";
        product.price= 10;
        manager.add(product);
    }
}
