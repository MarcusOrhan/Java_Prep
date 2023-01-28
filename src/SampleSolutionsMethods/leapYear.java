package SampleSolutionsMethods;

public class leapYear {
    public static void main(String[] args) {
        isLeapYear(2023);

    }

    public static String isLeapYear(int year) {
        if (year %4 ==0 ){
            if (year%100!=0){
              if (year%400==0){
                  return year + " is Leap year";
              }else {
                  return year +" Not a leap year";
              }
            }else {
                return year + " is Leap year";
            }
        }else {
            return year + " is Leap year";
        }
    }


    //with ternary operator
    public static String isLeapYearTernary(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ?year +" is a LEAP year.":year+ " is NOT a leap year!");
    }
}
