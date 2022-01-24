/*Radhika Banerjea
 * September 21	, 2021
 * This program takes input from the user of rock, paper, scissors plays. The user can type r for rock, p for paper, and s for scissors.
 * the user can type in whatever they want but the program will recongize it for a point if the input is to characters that are a combination of s/p/r and are separated by spaces on either ends.
If the user types in Q by itself the prgram will stop running. 
*/
import java.io.*;

public class Question4 {

	public static void main(String[] args)  throws IOException{
		//defining a BufferedReader variable
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		//communicating to the user, telling them how to stop the game.
		System.out.println("Its time to play Rock Paper Scissors. Press Q when you want to quit.");
		
		//variables collecting the users input and counting the amount of rounds each player wins.
		String input = "W";
		int one = 0;
		int two = 0;
		
		//loop that keep running until the user types Q
		while (!(input.equals("Q"))){
			
			//if one of the users won two rounds, then it gives the following messages
			if (one==2) {
				System.out.println("Player one has won two rounds. Type Q to quit or continue playing.");
			}
			if (two==2) {
				System.out.println("Player two has won two rounds. Type Q to quit or continue playing.");
			}
			
			//sets the variables one and two to zero
			one = 0;
			two = 0;
			
			//while loop that runs as long as a user doesn't have two points.
			while (one!=2 && two !=2) {	
				//getting the users input
				input = reader.readLine();
				
				//if the users input is Q then the code stops running.
				if (input.equals("Q")) {
					System.out.println ("Goodbye");
					System.exit(0);
				}
				
				//changes the input to upper case letters so that case doesn't matter when checking through the input.
				input = input.toUpperCase();
				
				//splits up the input into an array with a division at each space.
				String [] tokens = input.split(" ");				
				
				
				//for loop that checks for who wins each round.
				for (int i = 0; i<tokens.length;i++) {
					
					switch(tokens[i]) {
					 	//in any of these situations player one wins. Then i becomes tokens.length to exit the for loop
						case "RS","PR","SP":
							System.out.println ("			Player 1 wins this round.");
					 		i = tokens.length;
							one++;
							break;
						
						//in any of these situations player two wins. Then i becomes tokens.length to exit the for loop
						case "SR","RP","PS":
							System.out.println ("			Player 2 wins this round.");
							i = tokens.length;
							two++;
							break; 	
							
						//if player one, nor two wins and all of the spaces in the array were checked, then it says its a draw.
						default :
							if ((i+1)==tokens.length) {
								System.out.println("			This round is a draw.");
							}
					 }
				}
			}
		
		}

}
}
