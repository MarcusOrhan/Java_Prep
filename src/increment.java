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


        System.out.println("Log "+x+" : "+ y);
    }
}
