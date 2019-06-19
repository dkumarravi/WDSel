package learnTestNg;

import org.testng.annotations.Test;

public class LearnAnnotations2 {
	@Test(dependsOnMethods="learnTestNg.LearnAnnotations.method", alwaysRun=true)
	public void method1() {
		System.out.println("Test case 2");
	
}
}