/*Radhika Banerjea
 * September 10, 2021
 * A transistor’s current gain is calculated using the formula β = IC / IB, where β (Beta) is the
current gain, IC is the collector current, and IB is the base current. This
prompts for Base and Collector currents, and outputs the current gain. The program
continuously runs until 0 (zero) is entered for the collector current.
 */
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		//defining a scanner variable
		Scanner input = new Scanner(System.in);
		//defining variables for the collecter current and base current
		double IC=5;
		double IB;
		
		//a while loop that cycles through the code
		while (IC != 0) {
			
			//asks for the collector current 
			System.out.println("\n"+"Enter the amount of collector current (in Amperes):");
			IC = input.nextDouble();
			
			//if the collector current is 0, it exists the code.
			if (IC==0) {
				System.exit(0);;
			}
			
			//asks or the base current
			System.out.println("Enter the amount of base current (in Amperes):");
			IB = input.nextDouble();
			
			//prints the transistor current gain
			System.out.println ("The transistor current gain is " + IC/IB);
			
		}
	}

}
