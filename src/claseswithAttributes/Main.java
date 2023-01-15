package claseswithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 001;
        product.description = "new Asus Laptop in its unopened box";
        product.price = 420.99;
        product.stockAmount = 13;

        System.out.println("product Name= " +product.name);

    }
}
