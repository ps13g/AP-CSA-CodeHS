import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args){
        Scanner random = new Scanner(System.in);
        int guessNumber;
        int guess;
        int attempts = 0;
        guessNumber = (int) (Math.random()*100+1);
        System.out.println("You will have to guess a number 1-100 in the fewest amount of tries possible. The system will tell you if you are too high or too low.");
        System.out.println("Enter your number: ");
        guess = random.nextInt();
        while (guess!=guessNumber){
            if (guess>guessNumber){
                System.out.println("Your guess is too high");
            }
            else if(guess<guessNumber){
                System.out.println("Your guess is too low");
            }
            System.out.println("Guess Again!");
            guess = random.nextInt();
            attempts++;
        }
        attempts++;
        System.out.println("Great job! You got the number in " + attempts + " guesses");
    }

}
