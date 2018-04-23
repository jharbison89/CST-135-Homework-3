
public class Main {
	/* 
	 * Created by James Harbison and Chase Hausman
	 * This class tests the compareTo() method of both the Snack and Drink classes it 
	 * does this by directly using the compareTo() method for an array of Chips, a subclass of 
	 * Snack, then by invoking the java.util.Arrays.sort() method for that same array of Chips
	 * then also for an array of Drinks to ensure proper sorting 
	 */
	
	public static void main(String[] args) {
		
		// initialize an array of Chips using the overloaded arg constructor
		Chips[] chips = {new Chips("Lays Ridges", 1.99, 5, 5, "Original", "Kettle", 16), 
			new Chips("Ruffles", 1.99, 5, 5, "Original", "Kettle", 16),
			new Chips("Lays", 1.99, 5, 5, "Original", "Kettle", 16),
			new Chips("Lays Ridges", 2.99, 5, 5, "Original", "Kettle", 16)};
		
		// compare the first entry of chips to every other entry and display whether it comes before or comes after
		// using the compareTo() method
		for(int i = 0; i < chips.length; i ++) {
			if(chips[0].compareTo(chips[i]) < 0) {
				System.out.println(chips[0].getName() + " $" + chips[0].getPrice() + " comes before " +
						chips[i].getName()  +" $" + chips[i].getPrice());
			}
			else if(chips[0].compareTo(chips[i]) > 0) {
				System.out.println(chips[0].getName() + " $" + chips[0].getPrice() + " comes after " +
						chips[i].getName()  +" $" + chips[i].getPrice());
			}
			else if(chips[0].compareTo(chips[i]) == 0) {
				System.out.println(chips[0].getName() + " $" + chips[0].getPrice() + " is equal to " +
						chips[i].getName()  +" $" + chips[i].getPrice());
			}
		}
		
		// sorts chips using the java.util.Arrays.sort() method to put in order
		java.util.Arrays.sort(chips);
		
		// displays the newly sorted array of chips
		System.out.println("\nChips");
		for(int i = 0; i < chips.length; i++) {
			System.out.println(chips[i].getName() + "\t" + chips[i].getPrice());
		}
		
		// initialize an array of Drinks using the overloaded arg constructor		
		Drink[] drinks = {new Drink("Sprite", 1.75, 10, 10, 12),
				new Drink("Coke", 1.75, 10, 10, 12),
				new Drink("Sprite", 2.75, 10, 10, 12),
				new Drink("Fanta", 1.75, 10, 10, 12)};
		
		// sorts drinks using the java.util.Arrays.sort() method to put in order
		java.util.Arrays.sort(drinks);
		
		// displays the newly sorted array of drinks
		System.out.println("\nDrinks");
		for(int i = 0; i < drinks.length; i ++) {
			System.out.println(drinks[i].getName() + "\t" + drinks[i].getPrice());
		}
	}
}
