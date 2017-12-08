
public class Item {
	//attributes
	private double unitPrice;
	private int quantity;
	private String name;
	
	//methods
	//Constructor
	public Item(double up, int q, String n ) { //does not return anything
		//change this to setUnitPrice	setUnitPirce(up)
		unitPrice = up;
		//change this to setQuantity 
		quantity = q;
		
		name = n;
	}
	
	public String toString() {//to check if constructor works
		return name + "\nUnit Price: $" + unitPrice + "\nQuantity: " + quantity;
	}

}
