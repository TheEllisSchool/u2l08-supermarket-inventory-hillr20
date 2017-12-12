
public class Produce extends Item {
	//attributes
	private String expiration;
	private double weight;
	
	//Constructor
	public Produce(double up, int q, String n, String exp, double w) {
		//calls superclass constructor
		super(up, q, n);
		
		//call setters
		setExpiration(exp);
	}
		//do all the things this constructor needs to
		public void setExpiration(String exp) {
			expiration = exp;
		}
		//setExpiration(exp);
		
		//setWeight(w);
		
		public void setWeight(double w) {
			if (w > 0) {
				weight = w;
			}
			else {
				//weight = 1;
				System.out.println("Weight not set. \nWeight must be greater than 0.");
			}
		}
			
		public String getExpiration() {
			return expiration;
		}
		public double getWeight() {
			return weight;
		}
		
		

}
