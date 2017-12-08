
public class Item {
	//attributes
	private double unitPrice;
	private int quantity;
	private String name;
	
	//methods
	//Constructor
	public Item(double up, int q, String n ) { //does not return anything
		//change this to setUnitPrice	setUnitPirce(up)
		/*unitPrice = up;
		//change this to setQuantity 
		quantity = q;
		
		name = n;*/
	}
	//setters
	public void setUnitPrice(up) {
		if (up >= 0.0) {
			unitPrice = up;
		}
		else {
			System.out.println("The unit price must be greater than or equal to 0.");
		}	
	}
	public void setQuantity(q) {
		if (q >= 0) {
			quantity = q;
		}
		else {
			System.out.println("The quantity must be greater than or equal to 0.");
		}
	}
	
	//getters
	public double getUnitPrice(up) {
		return unitPrice;
	}
	
	public int getQuantity(q) {
		return quantity;
	}
	
	
	
	
	public String toString() {//to check if constructor works
		return name + "\nUnit Price: $" + unitPrice + "\nQuantity: " + quantity;
	}

}
