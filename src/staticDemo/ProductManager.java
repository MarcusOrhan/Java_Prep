package staticDemo;

public class ProductManager {
    public void add(Product product){
        ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)){
            System.out.println("product = " + product+ " successfully added to the our....system");
        }else {
            System.out.println("Product informati0n is not valid. ");
        }
    }

}
