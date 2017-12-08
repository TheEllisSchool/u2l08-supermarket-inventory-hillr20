
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
		
		public void setWeight(w) {
			if (w > 0) {
				weight = w;
			}
			else {
				System.out.println("Weight must be greater than 0.");
			}
		}
		public String getExpiration(exp) {
			return expiration;
		}
		public double getWeight(w) {
			return weight;
		}
		
		
	}
}
