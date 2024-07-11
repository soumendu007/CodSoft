package number_game;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		
		int score=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the total number of Game Play: ");
        int numberOfGame = scanner.nextInt();
        int n=numberOfGame;
        while(numberOfGame>0)
        {
        	if(game())
        		score++;
        	numberOfGame--;
        }
        scanner.close(); 
        System.out.println("GAME OVER !\nYour's Score => "+score+" Out of "+n);
	}
	
	public static boolean game()
	{
		int randomNumber = (int) (Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);

        boolean guessedCorrectly = false;
        int numberOfAttempts = 0;
        System.out.println("Guess a number between 1 and 100: "	+ " \nYou have only 3 attempts remaning to win the game ");

        
        while (!guessedCorrectly && numberOfAttempts < 3) 
        {
            int userGuess = sc.nextInt();

            if (userGuess == randomNumber) 
            {
                guessedCorrectly = true;
            } 
            else 
            {
                numberOfAttempts++;
                if (userGuess > randomNumber) 
                {
                    System.out.println("Your guess is too high.");
                } 
                else 
                {
                    System.out.println("Your guess is too low.");
                }
            }
        }
        
        if (guessedCorrectly) 
        {
            System.out.println("\nCongratulations! You guessed correctly! The number was " + randomNumber+".\n");
            return true;
        } 
        else 
        {
            System.out.println("\nSorry,you ran out of guesses.The correct answer was " + randomNumber+".\n");
            return false;
        }
	}

}
