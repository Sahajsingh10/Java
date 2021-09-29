package lab4;

public class Television {
	
	private int screenSize;
	private String manu;
	private int volume;
	private int station;
	private boolean power;
	
	public Television() {
		power = false;
	}
	
	public Television(String manu, int screenSize) {
		
		this.screenSize = screenSize;
		this.manu = manu;
		power = false;
		volume = 20;
		station  = 2;
	}
	
	public  int getScreenSize() {
		return screenSize;
	}
	
	public  String getManufacturer() {
		return manu;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public  int getChannel() {
		return station;
	}
	
	public void setChannel(int station) {
		this.station = station;
	}
	
	public void power() {
		power = true;
	}
	
	public void increaseVolume() {
		volume = volume + 1;
		
	}
	
	public void decreaseVolume() {
	volume = volume - 1;
		
	}
	
	
	
}
