package unl.cse.utils;


import java.util.HashSet;
import java.util.Set;

public class main {

	public static <T> void main(String[] args) {
		Set<String> a = new HashSet<String>();
		a.add("a");
		a.add("B");
		a.add("c");
		a.add("d");
		a.add("e");
		
		System.out.println(SetUtils.getPowerSet(a));

	}

}
