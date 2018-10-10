import java.util.Scanner;

public class AIGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + "! Think of a number.");
        System.out.println("Type the number between 1 and 100 here. I will try to guess what it is based on clues.");

        String number = input.nextLine();

        System.out.println("Okay, now that you have your number, let me guess what it is.");
        
    }
}
