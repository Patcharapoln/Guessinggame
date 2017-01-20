package Guessinggame;

import java.util.Random;
import java.util.Scanner;
/**
* Game of guessing a secret number.
* @author Patcharapol Nirunpornputta
*/

public class GuessingGame {
	/* properties of a guessing game */
	private int upperBound;
	private int secret;
	private String hint;
	private int count=1;
	/**
	* Initialize a new game.
	* @param upperbound is the max value for the secret number (>1).
	*/

	
	public GuessingGame( int upperbound ) {
		this.upperBound=upperbound;
		this.secret=getRandomNumber(upperbound);
		this.hint="I'm thinking of a number between 1 and "+upperbound;
		
	}
	
	/**
	* Create a random number between 1 and limit.
	* @param limit is the upper limit for random number
	* @return a random number between 1 and limit (inclusive)
	*/
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis( );
		Random rand = new Random( seed );
		return rand.nextInt(limit) + 1;
		}
	/**
	 * Show a hint if user input wrong number and show secret number when user input correct number
	 * @param number input by user
	 * @return
	 */
	public boolean guess(int number){
		if(number==this.secret){
			setHint("Correct.The secret is "+this.secret);
			return true;
			
		
		}
		else if(number>this.secret){
			setHint("Sorry you're guess is too large");
			return false;
			}
		else if(number<this.secret){
			setHint("Sorry you're guess is too small");
			return false;
		}
		else
			return false;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}
	
	/**
	* Return a hint based on the most recent guess.
	* @return hint based on most recent guess
	*/
	public String getHint() {
		return hint;
	}

	/**
	 * Get the number of guesses submitted.
	 * @return the number of guesses
	 */
	public int getCount(){
		return count;
	}
	
	/**
	 * increase the number of guesses
	 */
	public void setCount(){
		count++;
	}
	
}