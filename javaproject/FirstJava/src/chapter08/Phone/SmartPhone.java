package chapter08.Phone;

public abstract class SmartPhone extends Computer implements Phone {

	boolean power;

	public SmartPhone(String account) {
		super(account);
		this.power = false;
		
		
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
