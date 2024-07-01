package javabasics;

public class MathematicalOperators {

	public static void main(String[] args) {


		System.out.println(10/2);//5
		System.out.println(9/2);//4   .5 will be ignored becuase of both are pure integers
		System.out.println(9.0/2);//4.5
		System.out.println(9.0/2.0);
		//System.out.println(9/0);//AE
		
		System.out.println(0/9);//0
		//System.out.println(0/0);//AE
		System.out.println(9.0/0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		
		System.out.println('a'/2);//97/2 - >48
		System.out.println('a'/2+100);//148
		
		System.out.println(10 % 3);//1
		System.out.println(9 % 3);//0

	}

}
