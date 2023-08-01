package javaProgramming;

import java.util.Scanner;

public class ExceptionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=null,str2=null;
		
		Scanner sc = new Scanner(System.in);
		
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		
		String str3 = concat(str1,str2);
		System.out.println(str3);
		
	}

	private static String concat(String str1, String str2) {
		try {
			if (str1=="" || str2=="") {
				throw new NullPointerException();
			}
			else
			{
				str2 = str1+str2;
			}
		}
		catch(NullPointerException e){
			System.out.println("One of the strings are empty \n"+e);
		}
		
		return str2;
		// TODO Auto-generated method stub		
	}

}
