package javaProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("input.txt");
			FileInputStream fin = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			
			fin.read(data);
			String fileContents = new String(data);
			System.out.println("File Contents are: ");
			System.out.println(fileContents);
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found..."+e);
		}
		catch (IOException ex) {
			System.out.println(ex);
		}

	}

}
