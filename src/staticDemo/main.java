package staticDemo;

public class main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.id= 010101;
        product.name = "Wireless Mouse";
        product.price= 10;
        manager.add(product);
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createC0nnection();
    }
}
//inner classes are not suggested, not best practice. increase dependency to a class SOLID (Singel class does single responsibilith