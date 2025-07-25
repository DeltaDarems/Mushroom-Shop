package chester;

import java.util.Scanner;
		// Mushroom shop where you select and pay to get mushroom, must have a shopping cart of some sorts
public class Hello {
	
	static Scanner scan = new Scanner(System.in);
	static int oysterCount = 0;
	static int kingOysterCount = 0;
	static int enokiCount = 0;
	static int oysterPrice = 50;
	static int kingOysterPrice = 100;
	static int enokiPrice = 25;
	public static void main(String[] args) {
	
		
		
		// Variables
		int choices;
		boolean isRunning = true;
		int x = 0;
		int sample = 0;
		
		while (isRunning == true && x == 0) {
	 		welcomeMenu();
	 		
				
		choices = scan.nextInt();
		switch (choices) {
			case 1 -> mushroomAvail();
			case 2 -> {
                            System.out.println("Shopping cart:");
                            shoppingCart();
                        }
			case 3 -> {
                            System.out.println("Program ended");
                            isRunning = false;
                        }
			default -> System.out.println("Invalid choice");
					}
		
		}
	}
	
	 static void welcomeMenu() {		
		System.out.println("Welcome to Chester's Mushroom shop");
		System.out.println("Choose the following that fits you");
		System.out.println("1. Buy mushrooms");
		System.out.println("2. Shopping cart");
		System.out.println("3. Exit");
		
		}

	 
	static void mushroomAvail() {
		 
		 boolean repeatBuy = true;
		 boolean balanceRuntime = true;
		 
		 
		 while (balanceRuntime == true || repeatBuy == true) {
			 if (repeatBuy == false) {
			 	System.out.println("What else would you like");
			 	System.out.println("1. Oyster mushroom seeds");
			 	System.out.println("2. King oyster mushroom seeds");
			 	System.out.println("3. Enoki mushroom seeds");
			 	System.out.println("4. Exit");
			 	}
			 else {
		 System.out.println("Mushrooms available:");
		 System.out.println("1. Oyster mushroom seeds");
		 System.out.println("2. King oyster mushroom seeds");
		 System.out.println("3. Enoki mushroom seeds");
		 System.out.println("4. Exit");
			 }
		 
		 
		 int mushChoices;
		 int mushroomTotal = 0;

		
		 
		 mushChoices = scan.nextInt();
		 switch (mushChoices) {
		 	case 1 -> {
                            System.out.println("You have selected Oyster mushroom seeds");
                            System.out.println("How many would you like?");
                            oysterCount = scan.nextInt();
                            mushroomTotal = oysterPrice * oysterCount;
                            System.out.println("The total is " + mushroomTotal);
                            mushroomTotal = 0;
                            repeatBuy = false;
                         }
		 	case 2 -> {
                            System.out.println("You have selected King Oyster mushroom seeds");
                            System.out.println("How many would you like?");
                            kingOysterCount = scan.nextInt();
                            mushroomTotal = kingOysterPrice * kingOysterCount;
                            System.out.println("The total is " + mushroomTotal);
                            mushroomTotal = 0;
                            repeatBuy = false;
                         }
		 		
		 	case 3 -> {
                            System.out.println("You have selected Enoki mushroom seeds");
                            System.out.println("How many would you like?");
                            enokiCount = scan.nextInt();
                            mushroomTotal = enokiPrice * enokiCount;
                            System.out.println("The total is " + mushroomTotal);
                            mushroomTotal = 0;
                            repeatBuy = false;
                         }
		 	
		 	case 4 -> {
                            balanceRuntime = false;
                            return;
                         }

		 	default -> System.out.println("Invalid choice");
		 }
		 				}
		 		
		
	 }
	 static void shoppingCart() {
		 
		int oysterMushroomTotal = oysterCount * oysterPrice;
		int kingOysterMushroomTotal = kingOysterCount * kingOysterPrice;
		int enokiTotal = enokiCount * enokiPrice;
		int totalSpent = enokiTotal + kingOysterMushroomTotal + oysterMushroomTotal;
		boolean cartRuntime = true;
		int balance = 0;
		boolean shopBalanceRuntime = false;
		
		
		while (cartRuntime == true) {
		 System.out.println("Shopping cart:");
		 System.out.println("Oyster mushroom seeds: " + oysterCount + "\t" + oysterMushroomTotal );
		 System.out.println("King oyster mushroom seeds: " + kingOysterCount + "\t" + kingOysterMushroomTotal );
		 System.out.println("Enoki mushroom seeds: " + enokiCount + "\t" + enokiTotal );
		 
		 System.out.println("Your total: " + "\t \t" + totalSpent);
		 shopBalanceRuntime = true;
			while (shopBalanceRuntime == true) {
				System.out.println("How much will you pay?");
				balance = scan.nextInt();{
					if (balance > totalSpent) { 
						System.out.println("Purchase succesful");
						shopBalanceRuntime = false;
						return;
					}
					else {
						System.out.println("Balance is not enough");
						shopBalanceRuntime = true; 
					}
		}
	 }
}
	 }
}
	


