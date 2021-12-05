
public class Coffee extends Beverage {

	private boolean extraShot;
	private boolean extraSyrup;
	private final double shotCost = 0.50;
	private final double syrupCost = 0.50;

	
	public Coffee(String name, SIZE size,boolean extraShot, boolean extraSyrup) {
		super(name, TYPE.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		
		
	}
	
	
	@Override
	public double calcPrice() {
		double price  = super.getBasePrice();
		if (extraShot == true) {
			price = price + shotCost;
		}
		else if (extraSyrup == true) {
			price = price + syrupCost;
		}
		else if(super.getSize() == SIZE.MEDIUM) {
			price = price + getsizePrice();
		}
		else if(super.getSize() == SIZE.LARGE) {
			price = price + 2 * super.getsizePrice();
		}
		
		return 0;
	}
	
	public String toString() {
		String toSt = getname()	+ " " + getSize(); 
		if (extraShot == true) {
			toSt = toSt + "Extra Shot";
		}
		else if (extraSyrup == true) {
			toSt = toSt + "Extra Syrup";
		}
		else {
			toSt = toSt + "$" + calcPrice();
		}
		return toSt;
			}
	public boolean equals(Coffee co) {
		if (super.equals(co) && extraShot==co.getExtraShot() && extraSyrup==co.getExtraSyrup()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean  getExtraShot() {
		return extraShot;
	}
	
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	public void setExtraSyrup(boolean extraSyrup) {
		this.extraShot = extraSyrup;
	}
	
	public double geShotCost() {
		return shotCost;
	}
	public double geSyrupCost() {
		return syrupCost;
	}
	
	

}
