package RE2;

public class Main {

	public static void main(String[] args) {

		// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
		// http://km-programs.pl/

		Car s1 = new Car("BMW_", "1.6", "12000", "50001");
		Car s2 = new Car("BMW", "1.6", "12000", "501");
		Car s3 = new Car("bmw_", "16", "12000", "50001");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
