/*Radhika Banerjea
 * September 13, 2021
 * Determine the frequency of each letter of the alphabet in a line of characters.
 * This program continues accepting input until the input is ‘stop’.
 */
//importing the scanner
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		//defining a scanner variable
		Scanner input = new Scanner(System.in);
		
		//initializing a variable to hold the sentence.
		String sentence = " ";
		
		while (!(sentence.equalsIgnoreCase("stop"))) {
			//communicating to the user to enter a sentence and reading the user's input 
			System.out.println();
			System.out.println("Type in a sentence and I will tell you how many of each letter there is in the sentence.");
			sentence = input.nextLine();
			
			//if the user types stop then the code will stop running
			if ((sentence.equalsIgnoreCase("stop"))) {
				System.exit(0);
			}
			
			//splitting the sentence into characters and putting them in an array.
			char[]letters = sentence.toCharArray();
			
			//array that keeps track of the number of times each character appears in the array.
			int[] count = new int [26];
			
			//array that has all the letter in the alphabet
			char[]alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			
			//fills each spot in the counting array with a 0
			for (int i = 0; i< count.length; i++) {
				count[i] = 0;
			}
			
		
			//cycles through the sentence array and searches for each letter in the alphabet
			//Every time a specific letter appears the count increases for the occurences of that letter.
			for (int i =0;i<sentence.length();i++) {
				switch(letters[i]) {
				case 'a','A':
					count[0] ++;
					break;
				
				case 'B','b':
					count[1] ++;
					break;
				
				case 'C','c':
					count[2] ++;
					break;
				
				case 'D','d':
					count[3] ++;
					break;
				
				case 'E','e':
					count[4] ++;
					break;
				
				case 'F','f':
					count[5] ++;
					break;
	
				case 'G','g':
					count[6] ++;
					break;
				
				case 'H','h':
					count[7] ++;
					break;
				
				case 'I','i':
					count[8] ++;
					break;
				
				case 'j','J':
					count[9] ++;
					break;
				
				case 'K','k':
					count[10] ++;
					break;
	
				case 'L','l':
					count[11] ++;
					break;
				
				case 'M','m':
					count[12] ++;
					break;
				
				case 'N','n':
					count[13] ++;
					break;
				
				case 'O','o':
					count[14] ++;
					break;
				
				case 'P','p':
					count[15] ++;
					break;
				
				case 'Q','q':
					count[16] ++;
					break;
				
				case 'R','r':
					count[17] ++;
					break;
				
				case 'S','s':
					count[18] ++;
					break;
				
				case 'T','t':
					count[19] ++;
					break;
				
				case 'U','u':
					count[20] ++;
					break;
				
				case 'V','v':
					count[21] ++;
					break;
				
				case 'W','w':
					count[22] ++;
					break;
				
				case 'X','x':
					count[23] ++;
					break;
				
				case 'Y','y':
					count[24] ++;
					break;
				
				case 'Z','z':
					count[25] ++;
					break;
				}
				
				
				}
			//if the count for a letter is greater than 0 then it prints out that letter and how many times it appeared in the sentence.
			for (int j=0;j<alphabet.length;j++) {
				if (count[j]>0) {
					System.out.print(" " + alphabet[j] + ":" + count[j]);
				}
				
			}
			
			
			
		}
	}
}


