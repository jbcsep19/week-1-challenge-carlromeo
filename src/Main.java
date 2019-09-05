import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int choice = 0;

        Scanner key = new Scanner(System.in);

        //Print to user

        System.out.println("Your name FOOL!!!..... HAHAHAHAHA!!!!");
        String name = key.next();
        System.out.println("It's your funeral," + " " + name + "!" + " " +"How do you wanna proceed?");


        // A loop is initiated until user inputs 6

        while (choice != 9) {
            System.out.println();
            System.out.println("(1): Turn left!");
            System.out.println("(2): Go Straight!");
            System.out.println("(3): Turn Right!");
            System.out.println("(9): Get Out!!!");
            System.out.println();
            System.out.println("So tell me, which way," + " " + name + "!!!" + " " + "(insert sarcasm)");
            choice = key.nextInt();

        }

    }
}
