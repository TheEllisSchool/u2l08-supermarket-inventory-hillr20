
public class Flowers extends Item {
	//attributes
	private String color;
	private String variety;
	
	//constructor
	public Flowers (double up, int q, String n, String col, String var) {
		//calls superclass constructor
		super(up, q, n);
		
		setVariety(var);
		setColor(col);
	}
		
		public void setColor(String col) {
			color = col;
		}
		
		public void setVariety(String var) {
			variety = var;
		}
		//getters
		public String getColor() {
			return color;
		}
		public String getVariety() {
			return variety;
		}
		
	
	
	
	
}
