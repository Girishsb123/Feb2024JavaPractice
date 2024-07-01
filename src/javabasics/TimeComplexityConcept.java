package javabasics;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		// D-T
		// 10-2s
		// 100-5s
		// 1000-10s
		// 10k-20s

		// Big-Oh
		// 1 - O(1)
		int i = 10;
		System.out.println(i);

		for (int p = 0; p <= 10; p++) {
			System.out.println(p);
		}
		// 1+n+n+n->1+3n->linear equation
		// 3n
		// 4n
		// 5n - O(n)

		int num[][] = {

				{ 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[0].length; col++) {
				System.out.print(num[row][col] + " ");
			}
			System.out.println();
		}

		// (1+n+n+n)(1+n+n+n)-> (1+3n)(1+3n)
		// (1+3n+3n+9n^2)-> (1+6n+9n^2)->Quadratic equation
		// 3(1+2n+3n^2)-> O(n^2)

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				for (int dim = 0; dim < 5; dim++) {
					System.out.print(num[row][col] + " ");
				}
			}

		}
		
		//(1+n)(1+n)(1+n) - > O(n^3) -Cubic equation
		//space complexity
		//Auxiliary complexity
		//Olog(n)

	}

}
