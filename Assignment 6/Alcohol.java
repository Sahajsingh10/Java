
public class Alcohol extends Beverage {
	
	
	private boolean order_weekend;
	private double weekendCost = .60;
	
	
	

	
	public Alcohol( String name, SIZE size, boolean order_weekend) {
		super(name, TYPE.ALCOHOL, size);
		this.order_weekend = order_weekend;
		
		
		
	}
	 
	
	@Override
	public double calcPrice() {
		double price  = super.getBasePrice();
		if (order_weekend == true) {
			price = price + weekendCost;
		}
		else if(super.getSize() == SIZE.MEDIUM) {
			price = price + getsizePrice();
		}
		else if(super.getSize() == SIZE.LARGE) {
			price = price + 2 * super.getsizePrice();
		
		}

		return price;
	}
	
	public String toString() {
		String toSt = getname()	+ " " + getSize(); 
		if (order_weekend == true) {
			toSt = toSt + "Weekend order";
		}
		
		
			toSt = toSt + "$" + calcPrice();
		
		return toSt;
			}
	
	public boolean equals(Alcohol a) {
		if (super.equals(a) && order_weekend == a.getWeekend()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean getWeekend() {
		return order_weekend;
	}
	
	public double getWeekendCost() {
		return weekendCost;
	}
	
	public void setWeekend(boolean order_weekend) {
		this.order_weekend = order_weekend;
	}
	
	
	
	
	

}