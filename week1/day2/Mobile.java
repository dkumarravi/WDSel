package week1.day2;

public class Mobile {
	
	public int dialNumber() {
		return 123;
	}
	public String getText() {
		return "HIII";
		
	}
	// method with argument -> methodName(dataType arg);
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	public void sendSMS(String whom) {
		System.out.println("SMS sent to "+whom);
		System.out.println(1);
	}
	public void sendSMS(int a) {
		System.out.println(a);
		
	}
	public void sendSMS(int a, int b) {
		System.out.println(a);
	}
	private void lockScreen() {
		System.out.println("Locked");
	}
	void takeSelfie() {
		System.out.println("Balaji smiling");
	}

}
