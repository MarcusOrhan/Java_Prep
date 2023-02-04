package conditionals;

public class increment {
    public static void main(String[] args) {
        int x = 4, y = 3, z = 2;
        int result = x + y++ - --z * --x;
        System.out.println(result);

        // int x = 1;
        //   int y = 1;
        //   if (x++<++y){
        //      System.out.println("Hello");
        //    }else{
        //         System.out.println("Welcome");
        //     }
        //   System.out.println("Log "+x+" : "+ y);

        double var1 = 1 + 5;

        double var2 = var1 / 4;

        int var3 = 1 + 5;

        int var4 = var3 / 4;

        System.out.print(var2 + " " + var4);

    }
}
