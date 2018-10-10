import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + "! Try to guess my number between 1-100!");

        int guessNum = 0;
        double a = Math.random();
        int number = (int)(a*101);

        String answer = Integer.toString(number);
        String guess = input.nextLine();

        while(!guess.equals(answer)) {
            System.out.println("Sorry, guess again.");
            guess = input.nextLine();
            guessNum++;
        }

        System.out.println("Congratulations, " + name + "! You guessed the number.");
        System.out.println("It took you " + guessNum + " tries to guess the answer.");
    }
}
