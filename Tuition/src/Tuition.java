/**
 * @author Jae
 * Tuition takes no inputs, gives no returns; calculates the 4-year total tuition costs of a student given initial tuition and VARIABLE %INCREASES IN TUITION***
 * NOTE: If the %increase in tuition per year is CONSTANT, then we can use Math.pow(1+increase, year) to easily compound the increase.
 * Variables: 
 * input: a Scanner
 * tuition: a double, input from the user for initial tuition
 * increase2: a double, input from the user for %increase in tuition Year 2
 * increase3: a double, input from the user for %increase in tuition Year 3
 * increase4: a double, input from the user for %incraese in tuition Year 4
 * newTuition: a double, keeps track of the tuition as %increases accumulate
 * TotalTuition: a double, keeps track of total tuition
 * increase: a double, keeps track of which %increase in tuition to apply based on year 
 */

import java.util.Scanner;

public class Tuition {	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the current annual rate of tuition ($12342 for 2014-2015): ");
		double tuition = input.nextDouble();
		
		System.out.print("What is the percentage rate of increase in tuition for year 2 (as a percent, ie. 1.9): ");
		double increase2 = input.nextDouble()/100;
		
		System.out.print("What is the percentage rate of increase in tuition for year 3: ");
		double increase3 = input.nextDouble()/100;
		
		System.out.print("What is the percentage rate of increase in tuition for year 4: ");
		double increase4 = input.nextDouble()/100;
		
		double newTuition = tuition;
		double TotalTuition = 0;
		double increase = 0;
		
		for (int year=0; year < 4; year++){
			switch (year){
				case 0: increase = 0; break;
				case 1: increase = increase2; break; 
				case 2: increase = increase3; break; 
				case 3: increase = increase4; break;
			}
			newTuition += newTuition*increase;
			TotalTuition += newTuition;
		}
		
		System.out.printf("Your total tuition comes to $%5.2f", TotalTuition);
		
		input.close();
	}
						
		
}
	
	
