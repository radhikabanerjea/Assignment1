/*Radhika Banerjea
 * September 20, 2021
 * Ms. Toms, who coaches the senior girls’ basketball team, wishes to know the foul shot
percentage of her top five shooters. She needs to know this so she can send her best foul
shooter to the line when her team shoots a technical foul.
This program asks for the name of the shooter, the amount of shots taken then the amount of shots made. It then 
calculates the percentage of shots made and tells the user who the best scorer was.
 * 
 */
import java.io.*;
import java.text.DecimalFormat;

public class Question3 {

	public static void main(String[] args) throws IOException{
	
		//defining a BufferedReader variable and making a decimal format variable for two decimal places.
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		DecimalFormat d = new DecimalFormat("0.00");
		
		//arrays to collect the names of the people and the percentages of shots for each person.
		String [] names = new String [4];
		double [] percentage = new double [4];
		
		//variables that will be used to keep track of the name and numbers of the maximum players
		String maxname = null;
		double maxnumber = 0;
		
		//loop that runs three times
		for (int i = 0;i<=3 ; i++) {
			//communicates to the user and takes the input
			System.out.println("Input the players name, the number of shots taken, and the number of successful shots ");
			String input = reader.readLine();
			
			//splits the input from the user with spaces.
			String[] tokens = input.split(" ");
			
			//takes the first word from each input and puts it into an array.
			names [i] = tokens [0];
			
			//calculates percentage of successful shots from the person inputed.
			percentage [i] = (Double.parseDouble(tokens [2])/Double.parseDouble(tokens [1])) * 100;
			
			//prints out the percentage the person input got.
			System.out.println (names [i] + " - " + d.format(percentage [i]));
			
			//calculates who the highest percentage scorer was.
			if (percentage [i] > maxnumber) {
	                maxname = names [i];
	           }
		}
		
		System.out.println (maxname + " is the best player. (If two people have the same percentage, then they are implied to be included)");
		
	}
	
	
}
