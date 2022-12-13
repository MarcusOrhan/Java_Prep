package sampleproject1;

import java.util.Scanner;

public class madLibs {
    public static void main(String[] args) {
        System.out.println("Enter an Adjective: ");
        Scanner scanner = new Scanner(System.in);
        String place1 = scanner.next();
        System.out.println("Enter another Adjective: ");
        String family = scanner.next();
        System.out.println("Enter a Noun: ");
        String noun = scanner.next();
        System.out.println("Enter another Noun: ");
        String noun2 = scanner.next();
        System.out.println("Enter Plural Noun: ");
        String plural_noun = scanner.next();
        System.out.println("Enter a Game: ");
        String game = scanner.next();
        System.out.println("Enter a VERB ENDING IN “ING” ");
        String verb1 = scanner.next();
        System.out.println("Enter another VERB ENDING IN “ING” ");
        String verb2 = scanner.next();
        System.out.println("Enter a VERB ENDING IN “ING” ");
        String verb3 = scanner.next();
        System.out.println("Enter a noun ");
        String noun3 = scanner.next();
        System.out.println("Enter a PLANT ");
        String plant = scanner.next();
        System.out.println("Enter a PART OF BODY ");
        String bodyPart = scanner.next();
        System.out.println("Enter an ADJECTIVE ");
        String adjective = scanner.next();
        System.out.println("Enter a NUMBER");
        int number = scanner.nextInt();

        String text = "A vacation is when you take a trip to some " + place1 + " place\n" +
                " with your "+ family+ " family. \n" +
                "Usually you go to some place that is near a/an "+ noun +" or up on a/an "+noun2+ "\n" +
                " A good vacation place is one where you can ride " + plural_noun +
                " or play "+ game+" or go hunting for "+plural_noun+". \n" +
                "I like to spend my time "+ verb1+" or "+verb2 +
               ". When parents go on a vacation, they spend their time\n" +
                " eating three "+plural_noun+" a day, and fathers play golf, and mothers\n" +

                "sit around "+verb3+". Last summer, my little brother\n"
                +
                "fell in a/an "+noun3+" and got poison "+plant+" all\n" +

                "over his " +bodyPart+". My family is going to go to (the)\n"

                +place1+", and I will practice "+verb3+". \n" +
                "Parents " +
                "need vacations more than kids because parents are always very "+adjective+" and\n" +
                " because they have to work "+number+" hours every day all \n" +
                "year making enough "+plural_noun+" to pay for the vacation.";
        System.out.println("text = " + text);
    }

}
