package javasamples;

public class Sample {

//Creating Method

public int multiply(int a, int b, int c) {
	int result = a * b * c;
	return result;
}

	public static void main(String[] args) {
		int a=10, b=30;
		//b=30; c=20;
		
		System.out.println("Hai There");
		System.out.println("Hai Its Selenium People");

//Condition Block
		if (a>b) {
	System.out.println("A is Big Number");
}
else {
	System.out.println("B is Big Number");
}

//Loop Block
for (int i=1; i<=10; i++) {
	System.out.println(i);
}
//Create Object and access method
//
Sample obj = new Sample();
int x = obj.multiply(10, 34, 24);{
	System.out.println(x);
}

	}
	}

