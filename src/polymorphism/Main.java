package polymorphism;

public class Main {
    public static void main(String[] args) {

//BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger(), new ConsoleLogger()};
//        for (BaseLogger logger:loggers) {
//            logger.log("This is the The Log message ! &#122336");
//        }

CustomerManager customerManager = new CustomerManager(new ConsoleLogger() );
customerManager.add();
    }
}
