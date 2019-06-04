package week1.day2;

public class LearnConstructor {
	
	
	public LearnConstructor() {
		System.out.println("hi im in cons");
	}
	public LearnConstructor(int a ) {
		System.out.println("hi im in paremeterized cons " +a);
	}
	
	public static void main(String[] args) {
		// default cons calling
		LearnConstructor cons = new LearnConstructor();
		// paremeterized cons calling
		LearnConstructor con1 = new LearnConstructor(1);
	}
	static {
		System.out.println("Im in static");
	}

}
