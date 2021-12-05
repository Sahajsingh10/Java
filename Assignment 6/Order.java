
import java.util.*;
public class Order implements OrderInterface, Comparable<Order> {
	
	private int orderNum;
	private int orderTime;
	private DAY orderDay;
	private Customer customer;
	 private ArrayList<Beverage> beverages;
	
	public Order(int orderTime, DAY orderDay, Customer customer) {
		this.orderNum = randomNum(); 
		this.orderDay = orderDay;
		this.orderTime = orderTime;
		this.customer = customer;
		beverages = new ArrayList<>();
		
	}
	
	public int randomNum() {
		Random r = new Random();
		
		int high = 90000; 
		int low = 10000;
		int result = r.nextInt(high-low) + low;
		
		return result;
	}
	
	public Beverage getBeverage(int itemNum) {

        return beverages.get(itemNum);

    }
	
	public void  addNewBeverage(String bevName,SIZE size,boolean extraShot,boolean extraSyrup) {
		Coffee co = new Coffee(bevName, size, extraShot, extraSyrup);
		
		beverages.add(co);
		
	}
	
	public void  addNewBeverage( String bevName,SIZE size) {
		
		boolean weekend = false;
		
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
			weekend = false;
		}
		Alcohol a = new Alcohol(bevName, size, weekend);
		
		beverages.add(a);
	}
	
	
	public String toString() {
		String st = orderDay.toString()+"  " + orderTime+ "\n" + customer.toString() + "Order Number: " + orderNum;
		
		for (Beverage b: beverages) {
			st = st + "\n" + b.toString();
		}
		st += "\n Order Total: " + calcOrderTotal();
		
		return st;
	}
	public int compareTo(Order o) {
		if (orderNum == o.getOrderNo()) {
			return 0;
		}
		else if (orderNum > o.getOrderNo()) {
			return 1;
		}
		else {
			return -1;
			
			
		}
	}
	public double calcOrderTotal() {

        double orderTotal = 0;



        for (Beverage b : beverages) {

            orderTotal += b.calcPrice();

        }
        return orderTotal;
	}
	
	 public int findNumOfBeveType(TYPE type) {

	        int c = 0;


	        for (Beverage b : beverages) {
	            if (b.getType() == type) {
	                c++;
	            }
	        }

	        return c;
	    }
	 
	  public int getTotalItems() {

	        return beverages.size();

	    }
	  
	
	public int getOrderNo() {
		return orderNum;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public DAY getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {
		return new Customer(customer);
	}
	
	public ArrayList<Beverage> getBeverage(){
		
		return beverages;
	}
	
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	
	public void setOrderDay(DAY orderDay) {
		this.orderDay = orderDay;
	}
	
	public void setCustomer( Customer customer) {
		this.customer = customer;
	}

	@Override
	public boolean isWeekend() {

	        if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {

	            return true;

	        }

	        return false;
	    }
	

	@Override
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		Smoothie s  = new Smoothie(bevName, size, addPRotien, numOfFruits);
		
		beverages.add(s);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
