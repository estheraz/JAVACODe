package jumpingstatements;

public class Jumpingstatementdemo {

	public static void main(String[] args) {
// jumping statement is part of for and do loop but you have the ability to jump between data statements
		// a++ is your expression
		// you put seperate brackets for BREAK

		for (int a = 1; a <= 10; a++) {
			if (a == 7) {
				break;
			}

			System.out.println(a);
		}
	}

} 