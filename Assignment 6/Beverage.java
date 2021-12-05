
public abstract class Beverage {
	private String name;
	private TYPE type;
	private SIZE size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	public Beverage(String name, TYPE type, SIZE size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
public  abstract double calcPrice();

public boolean equals(Beverage bev) {
	if (name.equals(bev.getname()) && type ==bev.getType() && size ==bev.getSize()) {
		return true;
	}
	else {
		return false;
	}
}

public String toString() {
	return name + " " + size;
}

public String getname() {
	return this.name;
}
public TYPE getType() {
	return this.type;
	
}
public SIZE getSize() {
	return this.size;
}
public double getBasePrice() {
	return this.basePrice;
}
public double getsizePrice() {
	return this.sizePrice;
}

public void setname(String name) {
	 this.name = name;
}
public void setType(TYPE type) {
	 this.type = type;
	
}
public void setSize(SIZE size) {
	this.size = size;
}





	
}
