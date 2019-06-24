package week4.day1;

public class LearnStatic{
	int a = 0;
	static int b = 0;
	public void counter() {
		a++;
		b++;
		System.out.println("non static "+a +" static "+b);
	}
	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		ls.counter();
		ls.counter();
		ls.counter();
		LearnStatic ls1 = new LearnStatic();
		ls1.counter();
		ls1.counter();
		
	}
	

}
