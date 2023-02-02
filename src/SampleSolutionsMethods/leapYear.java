package SampleSolutionsMethods;

public class leapYear {
    public static void main(String[] args) {
        isLeapYear(2022);

        isLeapYear(400);
        int year = 2020;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

    public static String isLeapYear(int year) {
        if (year %4 ==0 ){
            if (year%100!=0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is Leap year");
                    return year + "leap yeah!";
                } else {
                    return year + " Not a leap year";
                }
            }else {
                return year + " is Leap year";
            }
        }else {
            return year + " is not Leap year";
        }
    }


    //with ternary operator
    public static String isLeapYearTernary(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ?year +" is a LEAP year.":year+ " is NOT a LEAP year!");
    }

    // new comment to stashc

}
