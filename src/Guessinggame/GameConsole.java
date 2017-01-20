package Guessinggame;
import java.util.Scanner;

/**
 * 
 * @author Patcharapol Nirunpornputta
 *
 */
public class GameConsole {
	/**
	 * Ask users to guess a number
	 * @param game
	 * @return a secret number
	 */
	
	public int play (GuessingGame game){
		Scanner input= new Scanner(System.in);
		String title="Guessing game";
		String prompt="Your guess? ";
		System.out.println(title);
		System.out.println(game.getHint());
		System.out.print(prompt);
		int number = input.nextInt();
		
		
		while(!game.guess(number)){
			
			
			System.out.println(game.getHint());
			System.out.print(prompt);
			number = input.nextInt();
			game.setCount();
		}System.out.println(game.getHint());
		System.out.println("You used "+game.getCount()   +" guesses");
		return number;
		
	}

}
