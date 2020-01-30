package jumpingstatements;

public class Jumpingstatementdemo2 {
	// if you put "Break" you will get no respond after you run the statement. when
	// you put continue that means the machine can go ahead with the statement
	// || this means or

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {
			if (a == 3 || a == 5 || a == 7) {
				continue;
			}

			System.out.println(a);

		}

	}

}
