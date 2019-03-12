package javasamples;

//Creating Strings

public class StringHandling {

	public static void main(String[] args) {
/*		System.out.println("Selenium");
		System.out.println("Selenium123");
		System.out.println("ufy344if8eyr8234gu3j3ki");
*/		
/*		String myTool = "Selenium";//String variable
		System.out.println(myTool);
		String []myTools = {"UFT","LoadRunner","RFT"};//Arry of Strings
		
		for (String tool: myTools) {
			System.out.println(tool);
*/
			
//Concatenation
			
/*		String str1 = "Selenium";
		String str2 = "Testing";
		int a = 1;
		int b = 2;
		System.out.println(str1 + str2);
		System.out.println("Selenium" + (a + b));
		System.out.println("Selenium" + a + b);
		System.out.println(a + b +"Selenium");*/

//String Comparison
		
		String str1 = "selenium";
		String str2 = "SELENIUM";
		String str3 = "SELENIUM";
		String str4 = "zSELENIUM";
		//String comparison using == operator
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str2 == str4);
		//String comparison using equals operator
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		//String comparison using  operator
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str1.compareTo(str4));
	}

}
