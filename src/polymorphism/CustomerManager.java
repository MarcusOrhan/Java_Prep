package polymorphism;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }

    public void add(){
        System.out.println("(codes for) Customer added");
        this.logger.log("log mesaji");
    }
}
