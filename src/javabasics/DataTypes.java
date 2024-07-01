package javabasics;

public class DataTypes {
	
	//strict type
	//static + dynamic
	//compile + runtime
	
	//primitive type - Don't need object/reference
	           //1.Boolean - true/false
	           //2.Numeric - char,byte,short,int,long
	           //3.Floating point - float,double
	
	//Non primitive type - need object/reference
	//Array,Class,Objects,String

	public static void main(String[] args) {

		// 1.byte
		// size 1 byte - 8 bits

		byte b = 10;
		byte b1 = 20;
		// byte b2 = -129;

		System.out.println(b);
		System.out.println(b1);

		// 2.short
		// size 2 bytes - 2 * 8 = 16 bits

		short s = 1000;
		// short s1 = 33600;

		// 3.int
		// size 4 bytes - 4 * 8 = 32 bits

		int i = 45000;
		int j = 56000;
		//int k = 12.02;

		System.out.println(i);
		System.out.println(j);

		// 4.long
		// size 8 bytes - 8 * 8 = 64 bits

		long l = 83339928281l;
		System.out.println(l);

		// 5.float
		// size 4 bytes
		// after . can take upto 7 digits

		float f = 12.34f;
		float f1 = (float) 34.54;

		System.out.println(f);
		System.out.println(f1);

		// 6.double
		// size 8 bytes
		// after . can take upto 15 digits
		
		double d  = 14.32;
		double d1 = 12.878292d;
		double d2 = 10;
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		//7.boolean - true/false is called boolean literals not keywords
		boolean flag = true;
		boolean isActive = false;
		
		System.out.println(flag);
		System.out.println(isActive);
		
		//8.char - should contain single digit and enclosed within single quote
		char c = 'a'; //a-z - 97 - 122 - ASCII equivalent
		char c1 = 'b';//A-Z - 65 - 90
		char c2 = 'A';//0-9 - 48 - 57
		char c3 = 'Z';
		char c4 = '0';
		char c5 = '9';
		
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(c+c1);//97+98 = 195
		System.out.println(c1-c);//98-97=1
		System.out.println('0'+'9');//48+57=105
		
		
		//Camel cases 
		int marks = 100;
		int studentMarks = 200;
		
		int defaultTimeOut = 10;
	}

}
