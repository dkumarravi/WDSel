package week1.day2;

public class MyMobile {
	public static void main(String[] args) {
		// object creation
		// syntax:					  Constructor
		// ClassName objectName = new ClassName();
		Mobile mob = new Mobile();
		// to call a method syntax
		// objName.methodName();
		mob.sendSMS("koushik");
		mob.sendSMS(1, 2);
		System.out.println(mob.dialNumber());
		
		mob.takeSelfie();
		int a = mob.dialNumber();
		System.out.println(a);
		String text = mob.getText();
		System.out.println(text);
		int add = mob.add(15, 10);
		System.out.println(add);
		
	}

}
