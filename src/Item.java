
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
	public void setUnitPrice(double up) {
		if (up >= 0.0) {
			unitPrice = up; 
		}
		else {
			unitPrice = 1;
			System.out.println("The unit price cannot be negative. Default unit price to $1.00");
		}	
	}
	public void setQuantity(int q) {
		if (q >= 0) {
			quantity = q;
		}
		else {
			System.out.println("The quantity cannot be negative. Default quantity to 0.");
			quantity = 0;
		}
	}
	
	public void setName(String n) {
		name = n;
	}
	
	//getters
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	public String toString() {//to check if constructor works
		return name + "\nUnit Price: $" + unitPrice + "\nQuantity: " + quantity;
	}

}
