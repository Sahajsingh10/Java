
public class Smoothie extends Beverage {
	
	private int numOfFruits;
	private boolean addPRotien;
	private final double protienCost = 1.50;
	private final double fruitCost = .50;

	
	public Smoothie( String name, SIZE size, boolean addPRotien, int numOfFruits) {
		super(name, TYPE.SMOOTHIE, size);
		this.addPRotien = addPRotien;
		this.numOfFruits = numOfFruits;
		
		
	}
	 
	


	@Override
	public double calcPrice() {
		double price  = super.getBasePrice();
		if (addPRotien == true) {
			price = price + protienCost;
		}
		else if(super.getSize() == SIZE.MEDIUM) {
			price = price + getsizePrice();
		}
		else if(super.getSize() == SIZE.LARGE) {
			price = price + 2 * super.getsizePrice();
		
		}
		price = price + numOfFruits * fruitCost;

		return price;
	}
	
	public String toString() {
		String toSt = getname()	+ " " + getSize() + " "+ numOfFruits + " " + " Fruits"; 
		if (addPRotien == true) {
			toSt = toSt + "Protien added";
		}
		
		else {
			toSt = toSt + "$" + calcPrice();
		}
		return toSt;
			}
	
	public boolean equals(Smoothie s) {
		if (super.equals(s) && addPRotien ==s.getPowder() && numOfFruits == s.getnoFruits()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean getPowder() {
		return addPRotien;
	}
	
	
	public int getnoFruits() {
		return numOfFruits;
	}
	public double getFruitCost() {
		return fruitCost;
	}
	public double powderCost() {
		return protienCost;
	}
	
	public void setExtraSyrup(boolean powder_added) {
		this.addPRotien = powder_added;;
	}
	
	public void setnoFruits(int noFruits) {
		this.numOfFruits = noFruits;
	}
	
	
	

}



