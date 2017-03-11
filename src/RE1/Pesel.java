package RE1;

import java.util.Scanner;

public class Pesel {

	String pesel;
	String regex = "[0-9]{11}";

	Scanner sc = new Scanner(System.in);

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {

		if (pesel.matches(regex)) {
			this.pesel = pesel;
		}
	}

	public Pesel(String pesel) {
		super();
		setPesel(pesel);
	}

	public Pesel() {

		do {
			System.out.print("Insert PESEL: ");
			pesel = sc.nextLine();

		} while (!pesel.matches(regex));

		sc.close();
	}

	@Override
	public String toString() {
		return "Pesel [pesel=" + pesel + "]";
	}

}
