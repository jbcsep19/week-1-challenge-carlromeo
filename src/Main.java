import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int choice = 0;

        Scanner key = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        //Print to user

        System.out.println("Your name FOOL!!!..... HAHAHAHAHA!!!!");
        String name = key.next();
        System.out.println("You are standing at the end of a hallway with 3 doors," + " " + name + "!" + " " +"How do you wanna proceed?");
        System.out.println("Pick a number" + " " + name + " and remember, It's your funeral!!!");

        // A loop is initiated until user inputs 6

        while (choice != 6) {
            System.out.println();
            System.out.println("(1): Door on your left!");
            System.out.println("(2): Door in the middle!");
            System.out.println("(3): Door on your right!");
            System.out.println("(6): Get Out!!!");
            System.out.println();
            System.out.println("So tell me, which door will it be," + " " + name + "?" + " " + "(insert sarcasm)");
            choice = key.nextInt();
            if (choice == 1) {
                System.out.println("You appear in the middle of oncoming traffic on a highway with high speeding vehicles!");
                System.out.println("From no where an 18 wheeler comes and runs you over ");
                System.out.println("You are now mashed potatoes!" + " " + name + "!!!" + " " + "You shall NOT be missed.... HAHAHAHA");
            } else if (choice == 2) {
                System.out.println("You appear in the middle of a boxing ring.");
                System.out.println("The fight is on going");
                System.out.println("Half the crowd is chanting your name" + " " + name + "!"  + " " + name + "!!"  + " " + name + "!!!");
                System.out.println("The other half is chanting the name of your opponent, Deontay Wilder!!!");

                System.out.println("What's your next move, " + name + "?" );
                System.out.println("(a): Fight!");
                System.out.println("(b): Run!");
                choice = reader.nextLine().charAt(0);
                if (choice == 'a') {
                    System.out.println("Here comes a 120 pound punch straight to your face!!!");
                    System.out.println("You are now seeing stars!" + " " + "* * * * *");
                    System.out.println("You BLACKOUT!!! Night Night");


                }


            }

        }

    }
}
