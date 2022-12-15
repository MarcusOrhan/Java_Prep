package logicaloperations;

import java.util.Scanner;

public class LogicalOperationsRelationalOp {
    public static void main(String[] args) {
/*
* You'll ask them how many numOfPennies would you like?
How many numOfNickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
Feel free to change this game for your country's currency, so if you don't use dollars and you use something else that's fine.

So, for an example of this let's say that I ask the user:

How many numOfPennies? - And they said 0.
How many numOfNickels? - 0
How many dimes? - 0
How many quarters? - 4
Then my program would know that, okay quarters are worth 25 cents. There's 4 of these, let me multiply those and get the value. Oh! that equals two dollars, so I let them know that they win. So that's an example of the game.*/

        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        double looney = 1;
        double tooney = 2;

    Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $2.00");
        System.out.println("How many numOfPennies- 1C?: ");
        int numOfPennies = scan.nextInt();
        System.out.println("How many numOfNickels 5C?: ");
        int numOfNickels = scan.nextInt();
        System.out.println("How many dimes- 10c?: ");
        int numOfDimes = scan.nextInt();
        System.out.println("How many quarters?: ");
        int numOfQuarters = scan.nextInt();
        System.out.println("How many Loonies?: ");
        int numOfLoonies = scan.nextInt();
        System.out.println("How many Toonies?: ");
        int numOfToonies = scan.nextInt();
        scan.close();

        double total = numOfPennies*penny + numOfNickels *nickel + numOfDimes*dime + numOfLoonies*looney ;
        if (total <tooney){
            System.out.println("Sorry you are short of  $" + (tooney - total) + "");
        }
         else if (total>tooney) {
            System.out.println("Sorry hou have "+(total-tooney)+"cents more");
        }else
                System.out.println("You win! your total change = " + total);

    }
}
