package staticDemo;

public class ProductValidator {
    public ProductValidator(){
        System.out.println("ProductValidator.ProductValidator Constructor ");
    }
    static{
        System.out.println(" Static maker Block constructor  runs");
    }
    static{
//there may be more than one static block - not common or never.
    }
    public  static boolean isValid(Product product) {
        if (product.price > 0 && ! product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void something(){
        System.out.println("ProductValidator.something NOT STATIC");
    }
    //inner Class
    // first class cannot be static but inner class and its methods can be static.
    public static class AnotherClass{
        public static void erase(){
        }
    }
}