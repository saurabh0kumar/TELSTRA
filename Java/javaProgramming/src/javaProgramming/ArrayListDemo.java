package javaProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(234);
		intList.add(123);
		intList.add(99);
		System.out.println(intList);
		
		intList.add(2, 25);
		
		System.out.println(intList);
		
		intList.remove(1);
		int a = intList.get(2);
		System.out.println(intList);
		System.out.println(a);
		intList.sort(null);
		System.out.println(intList);
		Collections.reverse(intList);
		System.out.println(intList);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World");
		System.out.println(strList);
		
		for(String str:strList) {
			System.out.println(str);
		}
		
		increament(intList);
		intList.forEach((n)->System.out.println(n));
		System.out.println(intList);
		
	}
	
	public static void increament(ArrayList<Integer> intList) {
		int i = 0;
		int n = intList.size() - 1;
		int sal;
		for(i=0;i<n;i++) {
			sal = intList.get(n);
			sal = (int) (sal+(sal*0.1));
			intList.add(n,sal);
		}
		
	}

}
