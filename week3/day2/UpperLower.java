package week3.day2;

import org.testng.annotations.Test;

public class UpperLower {
	@Test
	public void run() {
		String s = "koushik";
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2==0) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print(Character.toLowerCase(charArray[i]));

			}
		}
	}

}
