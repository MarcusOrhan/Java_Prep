package staticDemo;

public class ProductValidator {
    public ProductValidator(){
        System.out.println("ProductValidator.ProductValidator Constructor ");
    }
    static{
        System.out.println(" Static maker Block constructor  runs");
    }
    static{

    }
    public boolean isValid(Product product) {
        if (product.price > 0 && ! product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void something(){
        System.out.println("ProductValidator.something NOT STATIC");
    }
}