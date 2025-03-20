package module_1.lesson_7;
import java.util.Random;
import java.util.Scanner;

/*
    Not the most elegant of solutions but the first version I attempted started getting a little complex
    there is no input validation which I could add but its getting late.
 */
public class Hangman {
    final static int NUMBER_OF_GUESSES = 5;
    final static String[] SECRET_WORDS = {"Polymorphism", "Abstraction", "Inheritance","Encapsulation"};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String hiddenWord = SECRET_WORDS[rand.nextInt(SECRET_WORDS.length)];
        String guessedLetters = "";
        int guessCount = 0;
        String guess = "";
        int letterCount = 0;


        while(guessCount < NUMBER_OF_GUESSES){
            System.out.println("You have " + (NUMBER_OF_GUESSES - guessCount) + " guesses left");
            letterCount = 0;

            for(char letter : hiddenWord.toCharArray()){
                if(guessedLetters.toLowerCase().indexOf(Character.toLowerCase(letter)) != -1){
                    System.out.print(letter);
                    letterCount++;
                } else {
                    System.out.print("_");
                }
                System.out.print(" ");
            }

            if(letterCount == hiddenWord.length()) {
                System.out.println();
                System.out.println("Congratulations you got the word!");
                break;
            }

            System.out.println();
            System.out.print("Guess a Letter: ");
            guess = input.next();
            guessedLetters += guess;

            if(!hiddenWord.toLowerCase().contains(guess.toLowerCase())) {
                guessCount++;
            }

        }
        System.out.println("Game Over!");
    }
}