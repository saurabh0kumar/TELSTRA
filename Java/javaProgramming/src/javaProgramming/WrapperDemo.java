package javaProgramming;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer number = 10;
		System.out.println(number);
		
		Float f = 0.2f;
		double d = 9.878;
		
		Double dObj = d;
		
		Integer c = number+78;
		int value = 0;
		
		System.out.println(f+"\n"+d+"\n"+dObj+"\n"+c+"\n"+value);
		c++;
		
		//Create wrapper class object, do atleast 1-2 operations on them
		//for all 8 data types and print them
		
		Character character = 'c';
		System.out.println(character);
	}

}
