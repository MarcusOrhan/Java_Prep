package claseswithAttributes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(002,"ChromeBook","Lenovo", 799, 7,"Gray");
  /*
        product.setName("Laptop");
        product.id = 001;
        product.setDescription("new Asus Laptop in its unopened box");
        product.setPrice(420.99);
        product.setStockAmount(13);
*/
        System.out.println("product Name= " + product.getName());
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println("product code is: "+ product.getCode());

    }
}
