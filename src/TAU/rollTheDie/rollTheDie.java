package TAU.rollTheDie;

import java.util.Random;
 /* After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.*/

public class rollTheDie {
    public static void main(String[] args) {
        Random random = new Random();
        int space = 0;
        int remaining = 20;

        int die = random.nextInt(6) + 1;

        for (int i = 1; i <= 5; i++) {
            space += die;
            remaining = 20 - space;
            if (space > 20) {
                break;
            }
            System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space " + space + " and have " + remaining + " more to go.");


        die= random.nextInt(6) + 1;
        }
        if (space!=20) {
            System.out.println("You loooooseer");
        }else {
            System.out.println("Congrats we have a winner hereeeee!!");
        }

    }
}


