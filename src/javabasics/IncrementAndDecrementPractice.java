package javabasics;

public class IncrementAndDecrementPractice {

	public static void main(String[] args) {

		//1.
//		byte j = 1;
//		int i = j++ + ++j;
//		System.out.println(i);// 4
//		System.out.println(j);// 3

		//2.
		byte a = 11, b = 22, c = 0;

		int d = a++ + ++b + --a + ++c;

		System.out.println("a=" + a);//11
		System.out.println("b=" + b);//23
		System.out.println("c=" + c);//1
		System.out.println("d=" + d);//46
		
		//3.
		int i = 1,j=0;
		int k = i-- + ++j + --i;
		System.out.println(i);//-1
		System.out.println(j);//1
		System.out.println(k);//1
		
		//4.
		int m = -1,n=-2,o=1;
		int p = ++m * --n * o-- * --m;
		System.out.println(m);//-1
		System.out.println(n);//-3
		System.out.println(o);//0
		System.out.println(p);//0
		
		//5.
		int ch ='A';
		System.out.println(ch);//65
		System.out.println(++ch);//66
		
		//6.
		char ch1 = 'A';
		System.out.println(ch1++);//A
		System.out.println(ch1);//B
		
		//7.
		int x = 3 , y = -10 , z = -3;
		int a1 = --x / z++ * ++y - x++ + --z ; 
		   // a1 = 2/ -3* -9 - 3 + -3
		System.out.println(x);//3
		System.out.println(y);//-9
		System.out.println(z);//-3
		System.out.println(a1);//-5
		
		
		

	}

}
