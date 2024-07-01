package ExceptionHandling;

public class Student {

	public int getStudentMarsk(String studentName) {

		if (studentName.equals("Sweety")) {
			// System.exit(0);//shutdown the JVM
			try {
				int i = 9 / 0;
				return i;// 3
			} catch (ArithmeticException e) {
				System.out.println("AE is coming...");
				return 50;
			} finally {
				System.out.println("FAILLLLLL");

				// return 75;
			}
		} else if (studentName.equals("Puppy")) {
			return 90;
		} else if (studentName.equals("Ashu")) {
			return 80;
		} else {
			System.out.println("Plz pass right student name..." + studentName);

			throw new AppException("Student not found");
		}

	}

	public static void main(String[] args) {

		Student obj = new Student();
		int mk = obj.getStudentMarsk("Sweety");
		System.out.println(mk);

	}

}
