package week2.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> studentNames = new TreeSet<>();
		studentNames.add("Vishwa");
		studentNames.add("Pragadeesh");
		studentNames.add("Priya");
		studentNames.add("Kamal");
		studentNames.add("Sheeba");
		studentNames.add("Prashanth");
		studentNames.add("Priya");
		studentNames.add("Koushik");
		System.out.println(studentNames);
		
		List<String> li = new ArrayList<>();
//		studentNames.
		li.addAll(studentNames);
		System.out.println(li.size());
		System.out.println(li.get(0));
		Collections.sort(li);
		System.out.println(li);
		







	}

}
