import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int choice = 0;

        Scanner key = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        //Print to user

        System.out.println("WELCOME TO MY IMAGINATION" + System.lineSeparator());
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
                else if (choice == 'b') {
                    System.out.println("He who runs away from a fight, lives to fight another day!");
                    System.out.println("Well, now you're safe," + " "+ name + "... for now at least");
                    System.out.println("You are now back where you started" + " " + name + ",");
               }

            }else if (choice == 3) {
                System.out.println("This door leads into a banquet hall");
                System.out.println("In this hall is a buffet table with sorts of mouth watering delicacies");
                System.out.println("A vicious lion with 3 heads appears from no where to stop you from making a plate");


                System.out.println("What's your next move, " + name + "?" );
                System.out.println("(a): Fight!");
                System.out.println("(b): Run!");
                choice = reader.nextLine().charAt(0);
                if (choice == 'a') {
                    System.out.println("You go," + " " + name + "Fight for that food");
                    System.out.println("You defeat the 3 headed lion");
                    System.out.println("Congratulations!!!");
                    System.out.println("What do you want to do with all that food?");
                    System.out.println("(1):Eat all of it");
                    System.out.println("(2):Feed the homeless ");
                    System.out.println("(3):Save it for latter");
                    System.out.println("(6):Stop Playing");
                    break;
                } else if (choice == 6) {
                    System.out.println("Welcome to my imagination");
                    System.out.println("Press <Enter> to close");
                    System.exit(0);
                } else {
                    System.out.println("Option Not Available");
                }

            }

        }
        choice = key.nextInt();
        if (choice == 1) {
            System.out.println("Greedy swine!!! Remember, he who eats alone dies alone!!!");
            System.out.println("GAME OVER!!!");
            System.out.println("Press <Enter> to close");
            System.exit(0);
        } else if (choice == 2) {
            System.out.println("Good job! Humanity needs more people like you!!!.");
            System.out.println("You are now rewarded with a Platinum Badge For Humanity!");
            System.out.println("Press <Enter> to close");
            System.exit(0);
        } else if (choice == 3) {
            System.out.println("You have learnt from ants, considered their ways. Now you're wise!!!");
            System.out.println("Press <Enter> to close");
            System.exit(0);
        } else if (choice == 6) {
            System.out.println("Welcome to my imagination.");
            System.out.println("Press <Enter> to close");
            System.exit(0);
        } else {
            System.out.println("Option Not Available");

        }

    }
}
