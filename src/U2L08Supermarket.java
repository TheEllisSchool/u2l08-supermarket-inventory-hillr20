import javax.swing.JOptionPane;

public class U2L08Supermarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an instance of a class
		Item paperPlates = new Item (2.99, 20, "Paper Plates"); //unit price, quantity, name
		//System.out.println(paperPlates);
		//create a can of soup
		Item soupCan = new Item (3.00, 50, "Tomato Soup");
		
		Produce apples = new Produce(0.99, 50, "Apples", "Dec 15", 0.5);
		//System.out.println(apples);
		//make a flower arrangement
		Flowers bouquet = new Flowers(7.99, 7, "Rose Bouquet", "Roses", "white");
		
		//Produce pears = new Produce(1.89, 25, "Pears", "Dec 23", 0.5);
		//ring up the total order for a customer
		//bananas
		Produce bananas = new Produce(.44, 75, "Bananas", "Dec 20", 0.1);
		
		//kind of like a cash register
		double totalCost = 0;
		
		//Goals: create inventory for 5 items of various categories, ask which item to buy and how many,
		//report the total cost and print out new inventory
		String input = JOptionPane.showInputDialog(null, "We have paper plates, apples, soup, bouquets, and bananas. +"
				+ "\nWhich would you like?");
		String input2 = JOptionPane.showInputDialog(null, "How many would you like?");
		int amount =Integer.parseInt(input2);
		
		//update quantity
		if (input.equals("paper plates")) {
			int newQuantity = paperPlates.getQuantity() - amount;
			paperPlates.setQuantity(newQuantity);
			
			totalCost = totalCost + amount * paperPlates.getUnitPrice();
		}
		System.out.println("You purchased " + totalCost);
		System.out.println("New paper plate values: " + paperPlates);

	}

}
