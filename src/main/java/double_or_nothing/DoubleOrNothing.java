package double_or_nothing;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

    private static int starterPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int currentPoints = starterPoints;
    private boolean isStillPlaying = true;

    public void playGame(){
        printWelcome();
        askUserToContinue();

        while(isStillPlaying){
            printTryToDouble();

            if(shouldDouble()){
                doubleCurrent();
                printCongrats();
                askUserToContinue();
            }else{
                printLost();
                return;
            }
        }
        printWalkAwayMessage();
    }

    private void printWelcome(){
        System.out.print("Let's play Double or Nothing. "+
                "We'll start you off with "+starterPoints+
                " points\n");
    }

    private void printTryToDouble(){
        System.out.println("Let's try to double it!");
    }

    private void printCongrats() {
        System.out.println("Congrats! you now have "+this.currentPoints+" points\n");
    }

    private void printLost() {
        System.out.println("Uh oh. You've lost no points for you");
    }

    private void printWalkAwayMessage() {
        System.out.println("Congrats! you finished with "+this.currentPoints+" points\n");
    }

    private boolean shouldDouble() {
        return this.random.nextInt(2) == 0;
    }

    private void doubleCurrent() {
        this.currentPoints = currentPoints * 2;
    }

    private void askUserToContinue(){
        System.out.println("Would you like to continue and try to double your winnings? "+
                "Enter YES to continue");

        this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
    }
}


