package javasamples;

//Conditional Statements

public class FlowControls {

	public static void main(String[] args) {
	
//Single Condition	
	/*int a, b;
	a = 50; b = 20;
	
	if (a>b) {
		System.out.println("A is big number: ");
	}*/
	
// Compoud Condition

	/*int a, b, c;
	a = 50; b = 40; c = 30;
	
	if ((a>b) && (a>c)) {
	System.out.println("A is big number: ");
	}*/
	
	/*	int a, b ;
		a = 40; b =40;
		if (a>b) {
		System.out.println("A is big number: ");
		}
		else {
			System.out.println("B is big number: ");
		}*/
		
/*		int a = -30;
		if ((a >= 1) && (a <=100)) {
			System.out.println("A is Small number");
		}
		else if ((a >=100) && (a <=1000)) {
			System.out.println("A is Medium number");
		}
		else if ((a >=1000) && (a <=10000)) {
			System.out.println("A is Big number");
		}
		else if (a > 10000) {
			System.out.println("A is High number");
		}
		else{
			System.out.println("Otherwise it is either Zero or Negitive number");
		}
*/		
	//int a = 100, b = 40, c =70, d =20;
	
//Only First Condition
	
	/*if (a>b) {
		if (a > c) {
			if (a > d) {
				System.out.println("A is Big number");
			}
		    }
	        }
		    else {
			System.out.println("A is Not a big Number");
	        }	*/
		
//Only Second Condition
	/*if (a>b) {
		if (a > c) {
			if (a > d) {
				System.out.println("A is Big number");
			}
		    }
		    else {
			System.out.println("A is Not a big Number");
	        }	
		}*/
	
//Only Third condition
/*	if (a>b) {
		if (a > c) {
			if (a > d) {
				System.out.println("A is Big number");
			}
			else {
				System.out.println("A is Not a big Number");
		    }	
		}
		}*/

// Else part for all conditions	
	/*if (a>b) {
		if (a > c) {
			if (a > d) {
				System.out.println("A is Big number");
			}	
			else {
				System.out.println("A is Not a big Number");
		    }	
		    }
			else {
			System.out.println("A is Not a big Number");
	        }	
	        }
			else {
				System.out.println("A is Not a big Number");
		    }	*/
		
	//
	/*if (((a>b) && (a>c) && (a>d))) {
		System.out.println("A is a big Number");
	}

	else if (((b>a) && (b>c) && (b>d))) {
		System.out.println("B is a big Number");
	}
	
	else if (((c>a) && (c>b) && (c>d))) {
		System.out.println("C is a big Number");
	}
	
	else{
		System.out.println("D is a big Number");
	}*/
		
//Switch Case Statement
		
	char grade = 'B';
    
	switch (grade) {
	
	case 'A':
		System.out.println("Excellent");
		break;
	case 'B':
		System.out.println("Well Done");
		break;
	case 'C':
		System.out.println("Better");
		break;
		default:
		System.out.println("Fail");
	}
				
	}
}
