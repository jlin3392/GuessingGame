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
        int range = 50;
        int guessNum = 0;

        double generateGuess = Math.random();
        int guessInt = (int)(generateGuess*max + 1);

        String guess = Integer.toString(guessInt);
        boolean correct = false;

        System.out.println("Type 'higher' if the number is higher than my guess, 'lower' if the number is lower than my guess, and 'correct' if I guess correctly.");


        while (correct == false) {
            System.out.println("Is your number " + guess + "?");
            String answer = input.nextLine();

            if (answer.equals("higher")) {
                generateGuess = Math.random();
                guessInt = (int) (generateGuess * ((max - min) + 1))+ min;
                guess = Integer.toString(guessInt);
                guessNum++;
                max = max;
                min = min + range/2;
            } else if (answer.equals("lower")) {
                generateGuess = Math.random();
                guessInt = (int) (generateGuess * ((max - min) + 1)) + min;
                guess = Integer.toString(guessInt);
                guessNum++;
                min = min;
                max = max - range/2;
            } else if (answer.equals("correct")) {
                correct = true;
                System.out.print("Yay, I guessed correctly! ");
                System.out.print("It took me " + guessNum + " tries to guess correctly.");
            }
        }
    }
}

