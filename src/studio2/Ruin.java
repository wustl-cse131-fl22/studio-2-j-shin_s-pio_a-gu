package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your starting amount?");
		
		
		int startAmount = in.nextInt();
		
		System.out.println("What is win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		
		System.out.print("How many nunber of days you will simulate?");
		int totalSimulations = in.nextInt();
		
		
		
		for(int i = 0; i < totalSimulations; i++)
			{
					int dayCount = 0;
					int amount = startAmount;
					
					while  (amount > 0 && amount < winLimit) {	
					// Caculations
					
						double roll = Math.random();
								
						boolean didiWin = roll < winChance;
						if (didiWin == true) {
							amount ++;				
							
						}
						else {
							amount --;
							
						}	 
							
						dayCount ++;
					}
					
				
					if (amount == 0) {
						System.out.println("Simulation " +  (i+ 1) + "; " +dayCount + " Lose");
					
						}
						else {
							System.out.println("Simulation " +  (i+ 1) + "; " +dayCount + " Win");	
						}
				
					
				
		
			
		
		
			}

}
}
