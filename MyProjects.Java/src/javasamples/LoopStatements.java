package javasamples;

public class LoopStatements {

	public static void main(String[] args) {

//For Loop statement 
		
/*		for (int i = 10; i>= 1; i--) {

			System.out.println(i);
		}

		for (int i = 1; i<= 10; i++) {

			System.out.println(i);
		}
		for (int i =1; i<=10; i++) {
			if((i !=4) && (i !=7)){
				System.out.println(i);
			}
		}
*/	

//while Loop statement
		
/*		int i =1;
		while (i<=10){
			System.out.println(i);
			i ++;
		}*/
		
/*		int i =10;
		while (i>=1){
			System.out.println(i);
			i --;
		}*/
	
/*		int i = 1;
		while (i<=10) {
			if (i !=7) {
				System.out.println(i);
			}
			i ++;
		}
*/	

//do while loop
		
/*		int i = 1;
		do  {
			System.out.println(i);
			i ++;
		} while (i<=10);
*/	
//Enhanced for loop
		
/*		String [] Languages ={"C", "COBOL", "JAVA"};
		for (String lang: Languages) {
			System.out.println(lang);
		}*/
		
		double [] MathOperators = new double[6];
		double a =10, b = 20;
		MathOperators[0]= a+b;
		MathOperators[1]= a-b;
		MathOperators[2]= a*b;
		MathOperators[3]= a/b;
		
		for (double operation: MathOperators) {
			System.out.println(operation);
		}

		
	}

}
