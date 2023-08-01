package javaProgramming;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> intHashSet = new HashSet();
		
		intHashSet.add(10);
		intHashSet.add(100);
		intHashSet.add(10);
		intHashSet.add(55);
		intHashSet.add(89);
		intHashSet.add(1);
		intHashSet.add(10);
		System.out.println(intHashSet);
		
		TreeSet<Integer> intTreeSet = new TreeSet();
		
		intTreeSet.add(10);
		intTreeSet.add(10);
		intTreeSet.add(100);
		intTreeSet.add(55);
		intTreeSet.add(89);
		intTreeSet.add(1);
		intTreeSet.add(10);
		System.out.println(intTreeSet);
		
	}

}
