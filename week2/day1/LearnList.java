package week2.day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// <Limitation of array -> size is fixed, we cannot expand its size in runtime
		String name = "Sam Vishwa";
		// String[] names1 = {"sam","koushik"};
		// another way to declare an array
		String[] names = new String[2];
		names[0] = "Sam";
		names[1] = "Vishwa";
		System.out.println(names.length);
		/*for (String eachName : names) {
			System.out.println(eachName);
		}*/

		List<String> studentNames = new LinkedList<>();
		studentNames.add("Vishwa");
		studentNames.add("Pragadeesh");
		studentNames.add("Priya");
		studentNames.add("kamal");
		studentNames.add("Sheeba");
		studentNames.add("Prashanth");
		studentNames.add("Priya");
		studentNames.add("koushik");
		for(String sn:studentNames) {
			if (sn.startsWith("k")) {
				System.out.println(sn);
				
			}
		}
		/*System.out.println(studentNames.size());
		System.out.println(studentNames.contains("sheeba"));
		studentNames.remove(0);
		System.out.println(studentNames);
		studentNames.clear();
		System.out.println(studentNames.size());
		System.out.println(studentNames.isEmpty());*/
		//		studentNames.addAll(c)













	}

}
