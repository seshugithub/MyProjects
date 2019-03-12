package javasamples;
//Arrays
public class Arrays {

	public static void main(String[] args) {
//seshu's scripts
//Method:1		
/*		int a [];
		a = new int[3];
		//a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[1]);
		System.out.println(a[1] + (a [2]));*/
		
//Method:2
		
/*		int [] abc = new int [4];
		abc [0] = 10;
		System.out.println(abc [0]);
*/		
	
//Method:3
		
/*		int [] a = {10,20,30,30};
		System.out.println(a [1]);*/

/*		char [] c = {'A','B','C'};//Array of charactors
		int [] i = {10,20,30,40};//Array of Integer
		String [] s = {"UFT", "Selenium", "LoadRunner"};//Array of String
		boolean [] b = {true, false, false, true};//Array of boolean
		System.out.println(c[1]);
		System.out.println(s[1]);
		System.out.println(i[3]);
		System.out.println(b[3]);*/
		
//Copy value from one to Another Array	
		
/*		int [] array1 = {1,2,3,4};
		int array2 [] = array1;
		System.out.println(array2[2]);
		
		for (int i=0; i < array2.length; i ++) {
		System.out.println(array2[i]);
*/			
		//int [] array1 = {1,2,3,4,5};
		//int [][] dim = {{1,3,5,7},{2,4,6,8}};
		int [][] dim = {{1,2,3,4},{5,6,7,8}};
		System.out.println(dim[0][0]);	//1
		System.out.println(dim[1][0]);	//2
		System.out.println(dim[0][1]);	//3		
		System.out.println(dim[1][1]);	//4
		System.out.println(dim[0][2]);  //5
		System.out.println(dim[1][2]);	//6
		System.out.println(dim[0][3]);	//7
		System.out.println(dim[1][3]);	//8
		
				
 }
}