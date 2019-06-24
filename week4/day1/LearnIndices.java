package week4.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnIndices {
	
	@Test(dataProvider= "f")
	// instead of getting as String get it as String[]
	public void data(String[] s) {
		System.out.println(s[0] +" "+s[1]);
	}
	
	@DataProvider(name = "f", indices = {0, 2})
	public String[][] setData() {
		String[][] d = new String[3][2];
		d[0][0] = "a";
		d[0][1] = "b";
		
		d[1][0] = "c";
		d[1][1] = "d";
		
		d[2][0] = "e";
		d[2][1] = "f";
		return d;
	}

}




