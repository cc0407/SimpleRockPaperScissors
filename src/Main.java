import java.util.Random;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	String[] choices = {"rock","paper","scissors"};
	int input;
	int enemyChoice;
	while(true)
	{
		System.out.println("-----------------------------------------");
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("Select one: 1. Rock, 2. Paper, 3. Scissors, 4. to exit");
		
		
		input = sc.nextInt() - 1;
		if (input == 3) {
			System.out.println("Goodbye.");
			return;
		}
		
		
		enemyChoice = r.nextInt(2 - 0 + 1);
		
		System.out.println("Your choice: " + choices[input]);
		System.out.println("Enemy choice: " + choices[enemyChoice]);
		
		
		if(input - enemyChoice == 1 || (input == 0 && enemyChoice == 2))
			System.out.println("You win!");
	
		else if(enemyChoice - input == 1 || (enemyChoice == 1 && input == 2))
			System.out.println("You lose!");
		else
			System.out.println("It's a tie!");
	}
	
}

}
