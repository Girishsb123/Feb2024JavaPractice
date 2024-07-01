package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// 1.String to int
		String x = "100";
		System.out.println(x + 20);// 10020

		int i = Integer.parseInt(x);
		System.out.println(i + 20);// 120

		// 2.String to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);// 22.33

		// 3.String to boolean

		String executionEnv = "true";
		boolean flag = Boolean.parseBoolean(executionEnv);

		if (flag) {
			System.out.println("run on aws cloud");
		} else {
			System.out.println("run in local ");
		}

		// int to string

		int j = 100;
		System.out.println(100 + 20);// 120

		String s = String.valueOf(j);
		System.out.println(s + 20);// 10020

		// double to string

		double k = 10.21;
		String s1 = String.valueOf(k);
		System.out.println(s1.length());// 5

		String x1 = "100A";
		//int i1 = Integer.parseInt(x1);// NumberFormatException
		//System.out.println(i1 + 20);
		
		System.out.println(Byte.MAX_VALUE);// 127

		System.out.println(Byte.MIN_VALUE);// -128

		System.out.println(Short.MAX_VALUE);// 3277

		System.out.println(Short.MIN_VALUE);// -3278

		System.out.println(Integer.MAX_VALUE);// 2147483647

		System.out.println(Integer.MIN_VALUE);// -2147483648

		System.out.println(Long.MAX_VALUE);// 9223372036854775807

		System.out.println(Long.MIN_VALUE);// -9223372036854775808

		System.out.println(Float.MAX_VALUE);// 3.4028235E38

		System.out.println(Float.MIN_VALUE);// 1.4E-45

		System.out.println(Character.MAX_VALUE);// ?

		System.out.println(Character.MIN_VALUE);// blank space

		System.out.println(Double.MIN_VALUE);// 4.9E-324   System.out.println(Double.MAX_VALUE);//1.7976931348623157E308


	}

}
