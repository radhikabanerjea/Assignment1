/*Radhika Banerjea
 * September 16,2021
 * This program takes input of n adjectives (1 _ n _ 5) and m nouns (1 _ m _5), and prints out all possible similes. 
 * The first two lines of input will provide the values of n
and m, in that order followed, one per line, by n adjectives and m nouns. 
 */

//importing the scanner

import java.io.*;

public class Question5 {

	public static void main(String[] args) throws IOException{
		//defining a Buffered Reader variable
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		//asking the user for the number of adjectives and making an array with that number of spaces.
		System.out.println ("How many adjectives are there?");
	
		//introducing the integers that the while loops will use and the one that the users input is stored in.
		boolean c = true;
		int numad =0;
		//while loop that checks whether the user enters an integer
		while (c) {
			try 
			{ 
				numad = Integer.parseInt(reader.readLine());
				c = false;
			}  
			catch (NumberFormatException e)  
			{ 
				System.out.println("not a valid integer"); 
			} 
			
		}
		
		String [] adjectives = new String [numad];
		
		//asking the user for the number of nouns and making an array with that number of spaces.
		System.out.println("How many nouns are there?");
		
		//introducing the integers that the while loops will use and the one that the users input is stored in.
		boolean co = true;
		int numno = 0;
		//while loop that checks whether the user enters an integer
		while (co) {
			try 
			{ 
				numno = Integer.parseInt(reader.readLine());
				co = false;
			}  
			catch (NumberFormatException e)  
			{ 
				System.out.println("not a valid integer"); 
			} 
			
		}
	
		String [] nouns = new String [numno];
		
		//asking the user for adjectives the amount of times they said there were adjectives.
		for (int i = 0; i< adjectives.length; i++) {
			System.out.println("What is adjective " + (i+1) + "? Press enter after each adjective.");
			adjectives[i] = reader.readLine();
		}
		//asking the user for nouns the amount of times they said there were nouns.
		for (int i = 0; i< nouns.length; i++) {
			System.out.println("What is noun " + (i+1) + "? Press enter after each noun.");
			nouns[i] =  reader.readLine();
		}
		
		//a loop in a loop so that it cycles through all the possibilities of the combinations of adjectives and nouns.
		for(int i=0; i<adjectives.length; i++) {
			for (int j = 0; j< nouns.length; j++) {
				System.out.println(adjectives[i] + " as " + nouns[j]);
			}
		}


	}

}
