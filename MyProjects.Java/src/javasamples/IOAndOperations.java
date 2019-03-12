package javasamples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IOAndOperations {

	
	public static void main(String[] args) throws IOException {

//Reading input with Scanner Class
		
/*		Scanner scan = new Scanner(System.in);// system.in is input stream
		System.out.println("Enter the Name");
		String name = scan.nextLine();
		System.out.println("Your Name is :" +name);
		System.out.println("Enter your City");
		String city = scan.nextLine();
		System.out.println("Your City :" +city);
		System.out.println("Enter your Street");
		String street = scan.nextLine();
		System.out.println("Your Street :" +street);
		System.out.println("Enter your Zip");
		int zip = scan.nextInt();
		System.out.println("Your ZIP Code is :" +zip);
		System.out.println("Enter your Number");
		long num = scan.nextLong();
		System.out.println("Your Number is :" +num);
		System.out.println("Enter your ID");
		double num1 = scan.nextDouble();
		System.out.println("Your ID Number is :" +num1);
		System.out.println("Enter a Charactor");
		char a = scan.next().charAt(1);
		System.out.println("Your Value is :" +a);
		System.out.println("Enter a Condition");
		boolean b = scan.nextBoolean();
		System.out.println("Your Value is :" +b);
*/		

//Create a folder		
		
/*		File fileObject = new File("C:/Users/user/Desktop/Job");
		fileObject.mkdir();
*/		

//Check the file exists or not
		
/*		File fileObject = new File("C:/Users/user/Desktop/Job");
		boolean a= fileObject.exists();
		if (a == true) 
		//fileObject.delete();
		{
			System.out.println("Folder Exists");
		}
		else
			System.out.println("Folder Not Exists");
*/
//Delete the folder
		
		File fileObject = new File("C:/Users/user/Desktop/Job");
		fileObject.delete();
		
//Create a Text file
		
/*		File fileObject = new File("C:/Users/user/Desktop/Job.txt");
		fileObject.createNewFile ();
		//fileObject.delete();
*/		
	
			}

}
