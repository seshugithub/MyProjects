package javasamples;

public class Variables {

	static int a=100;//Class level variable before main method
	
	public int salary() {;//mysalary is Local variable
	int mysalary = 10000 + 5000 + 500;
	mysalary = mysalary + a;
	return mysalary;
	}
	
	public static void main(String[] args){
	int b = 200;// Instance variable
	System.out.println(a);
	System.out.println(b);
	
	Variables obj = new Variables();
	obj.salary();
	System.out.println(obj.salary());//1300
	
	for (int i = 1; i<= 5; i++) {
		System.out.println(i);
		System.out.println(a);
		System.out.println(b);
	}
	
	}

}
