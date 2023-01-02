package testApplience;

public class SmartFridge extends KitchenAppliance implements WifiEnabled{
	Boolean isON;
	public SmartFridge() {
		// TODO Auto-generated constructor stub
		super("Smart Fridge", "Samsung");
	}
	

	@Override
	public void turnOFF() {
		isON=false;
	}
	
	@Override
	public void turnON() {
		isON=true;
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
		if (isON) {
			System.out.println("Passed");
		}
		System.out.println("Failed");
	}
}
