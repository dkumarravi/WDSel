package week1.day2;

public class Calc {
	static int i = 0;
	public static int add(int a , int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a = add(12, 2);
		if(a>= 18) {
			System.out.println("Adult");
			
		}else{
			System.out.println("Kid");
		}
	}
	
}
