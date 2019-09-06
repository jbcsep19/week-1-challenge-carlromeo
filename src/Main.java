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
        System.out.println("You are standing at the end of a hallway with 3 doors,");
        System.out.println("There is a crawl hole access in the ceiling");
        System.out.println("On the opposite side of the hallway, is an elevator" + System.lineSeparator());
        System.out.println("...So,tell me, how do you wanna proceed?");


        System.out.println("Pick a number" + " " + name + " and remember, It's your funeral!!!");

        // A loop is initiated until user inputs 6

        while (choice != 5) {
            System.out.println();
            System.out.println("(1): Door on your left!");
            System.out.println("(2): Door in the middle!");
            System.out.println("(3): Door on your right!");
            System.out.println("(4): Crawl hole access in the ceiling!");
            System.out.println("(5): Get Out!!!");
            System.out.println();
            System.out.println("So tell me, which door will it be," + " " + name + "?" + " " + "(insert sarcasm)");
            choice = key.nextInt();
            key.nextLine();
            if (choice == 1) {
                System.out.println("You appear in the middle of oncoming traffic on a highway with high speeding vehicles!");
                System.out.println("From no where an 18 wheeler comes and runs you over ");
                System.out.println("You are now mashed potatoes!" + " " + name + "!!!" + " " + "You shall NOT be missed.... HAHAHAHA");
                System.out.println("GAME OVER!!!");
                System.out.println("Press <Enter> to close");
                System.exit(0);

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
                    System.out.println("GAME OVER!!!");
                    System.out.println("Press <Enter> to close");
                    System.exit(0);


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
                    System.out.println("(x):Eat all of it");
                    System.out.println("(y):Feed the homeless ");
                    System.out.println("(z):Save it for latter");
                }
                choice = reader.nextLine().charAt(0);

                if (choice == 'x') {
                    System.out.println("Greedy swine!!! Remember, he who eats alone dies alone!!!");
                    System.out.println("GAME OVER!!!");
                    System.out.println("Press <Enter> to close");
                    System.exit(0);
                } else if (choice == 'y') {
                    System.out.println("Good job! Humanity needs more people like you!!!.");
                    System.out.println("You are now rewarded with a Platinum Badge For Humanity!");
                    System.out.println("Press <Enter> to close");
                    System.exit(0);
                } else if (choice == 'z') {
                    System.out.println("You have learnt from ants, considered their ways. Now you're wise!!!");
                    System.out.println("Press <Enter> to close");
                    System.exit(0);
            }
                else if (choice == 'b') {
                    System.out.println("Go on" + " " + name + " " + "Run and starve to death!!!");
                    System.out.println("GAME OVER!!!");
                    System.out.println("Press <Enter> to close");
                    System.exit(0);
                }
        }
            else if (choice == 4) {
                System.out.println("You are in the crawl hole, and you come face to face with a mischief of rats racing towards you");
                System.out.println("Do you;");
                System.out.println("(a):Retreat and crawl right back out of the hole?");
                System.out.println("(b):Surrender to their gross paws crawling all over you until they entire mischief gets past you?");
                choice = reader.nextLine().charAt(0);
                if (choice == 'a');
                System.out.println("The hall way is no longer there");
                System.out.println("It has become a river of volcanic larva");
                System.out.println("Does anyone smell that barbecue, or is it just me?..... HAHAHAHAHA");
                System.out.println("GAME OVER!!!");
                System.out.println("Press <Enter> to close");
                System.exit(0);
            }

            else if (choice == 5) {
                System.out.println("5 is your unlucky number!!! You have died on arrival, Like I said, It's your funeral.....HAHAHAHAH");
                System.out.println("Goodbye" + name +"!!!" + " " + " Yoe shall NOT be missed");
            }

            }
        }

    }

