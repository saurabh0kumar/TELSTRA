package javaProgramming;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str=null;
			System.out.println(str.length());	//Null pointer exception
			
			int a=10,b=0;
			int c = a/b;						//Arithmetic Exception
			
			int[] array = new int[10];
			array[20] = 100;					//ArrayIndexOutOfBoundsException
			
		}
//		catch(NullPointerException ex) {
//			System.out.println("Null Pointer Exception Generated..\n"+ex);
//		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException ex) {
			System.out.println("Multi-catch Exception block...\n"+ex);
		}
		catch(Exception ex) {
			System.out.println("Generic Exception Handling..\n"+ex);;
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("After catch block..");
	}

}
