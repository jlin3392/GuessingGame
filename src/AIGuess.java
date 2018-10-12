import java.util.Scanner;

public class AIGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + "! Think of a number.");

        System.out.println("Okay, now that you have your number, let me guess what it is.");

        int max = 100;
        int min = 1;
        int guess = 50;
        int guessNum = 0;
        boolean correct = false; 

        System.out.println("Type 'higher' if the number is higher than my guess, 'lower' if the number is lower than my guess, and 'correct' if I guess correctly.");


        while (correct == false) {
            System.out.println("Is your number " + guess + "?");
            String answer = input.nextLine();

            if (answer.equals("higher")) {
                min = guess;
                guess = (int)(max - min)/2 + min;
                guessNum++;
            } else if (answer.equals("lower")) {
                max = guess;
                guess = (int)(max - min)/2 + min;
                guessNum++;
            } else if (answer.equals("correct")) {
                correct = true;
                System.out.println("Yay, I guessed correctly! ");
                System.out.println("It took me " + guessNum + " tries to guess correctly.");
            } else {
                System.out.println("Please enter a valid message.");
            }
        }
    }
}

