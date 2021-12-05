import java.util.ArrayList;
public class BevShop implements BevShopInterfce {

	private int numOfAlcoholorder;
	private int currentOrderindex;
	private ArrayList<Order> orders;
	
	
	public BevShop() {
		orders = new ArrayList<>();
		
	}
	
	public String toString() {
        String st = "Monthly Orders";

        for (Order o : orders) {
            st = st+ o.toString();
        }
        st = st+ "Total Sale: " +totalMonthlySale(); 

        return st;
    }
	
	public boolean validAge(int age) {
        if (age >= MIN_AGE_FOR_ALCOHOL) {
            return true;
        }
        return false;
}
	 public boolean validTime(int time) {
	        if (time >= MIN_TIME && time <= MAX_TIME) {
	            return true;
	        }
	        return false;
	    }
	  public boolean eligibleForMore() {
	        if (numOfAlcoholorder < 3) {
	            return true;
	        }
	        return false;
	
}
	  
	  public boolean isMaxFruit(int num) {
	        if (num > MAX_FRUIT) {
	            return true;
	        }
	        return false;
	    }
	  
	  public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
	        orders.get(currentOrderindex).addNewBeverage(bevName, size, extraShot, extraSyrup);
	    }
	    public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
	        orders.get(currentOrderindex).addNewBeverage(bevName, size, numOfFruits, addProtein);
	    }
	    public void processAlcoholOrder(String bevName, SIZE size) {
	        orders.get(currentOrderindex).addNewBeverage(bevName, size);
	        numOfAlcoholorder++;
	    }
	    
	    public int findOrder(int orderNo) {
	        for (int i = 0; i < orders.size(); i++) {
	            if (orders.get(i).getOrderNo() == orderNo) {
	                return i;
	            }
	        }

	        return -1;
	    }
	    
	    public double totalOrderPrice(int orderNo) {
	        double purch = 0;

	        for (Order o : orders) {
	            if (o.getOrderNo() == orderNo) {
	                for (Beverage b : o.getBeverage()) {
	                    purch += b.calcPrice();
	                }
	            }
	        }

	        return purch;
	    }
	    
	    public double totalMonthlySale() {
	        double totalsale = 0;

	        for (Order o : orders) {
	            for (Beverage b : o.getBeverage()) {
	                totalsale += b.calcPrice();
	            }
	        }

	        return totalsale;
	    }
	    public int totalNumOfMonthlyOrders() {
	        return orders.size();
	    }
	    
	    public void sortOrders() {

	        for (int i = 0; i < orders.size()-1; i++) {
	            int minindex = i;
	            for (int j = i+1; j < orders.size(); j++) {
	                if (orders.get(j).getOrderNo() < orders.get(minindex).getOrderNo()) {
	                    minindex = j;
	                }
	            }

	            Order temp = orders.get(minindex);
	            orders.set(minindex, orders.get(i));
	            orders.set(i, temp);
	        }
	    }
	    
	    public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
	        Customer customer = new Customer(customerName, customerAge);
	        Order ord = new Order(time, day, customer);
	        orders.add(ord);
	        currentOrderindex = orders.indexOf(ord);
	        numOfAlcoholorder = 0;
	    }
	    
	    public Order getOrderAtIndex(int ind) {
	        return orders.get(ind);
	    }
	  
	    public int getmaxAlcOrder() {
	        return MAX_ORDER_FOR_ALCOHOL;
	    }
	   
	    public int getMinageAlc() {
	        return MIN_AGE_FOR_ALCOHOL;
	    }
	    
	    public int getNumAlc() {
	    	return numOfAlcoholorder;
	    }
	    
	    public Order getCurrentOrder() {
	        return orders.get(currentOrderindex);
	    }
	  
	  
	  
	  
	  
}
	
