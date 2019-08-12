
/*15) pan card number validation:
    all letters shud be in caps,shud be of 8 chars.
    first three letters must be alphabets.
    next 4 letters shud be digits and last letter shud be an alphabet
*/

import java.util.Scanner;

public class program15 {

	public void check() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PAN number here ");
		String PAN = sc.nextLine();
		if (PAN.matches("[A-Z]{5,6}[0-9]{4}[A-Z]{1}")) {

			System.out.println("Valied PAN Number ");

		} else
			System.out.println("Please Enter Valied PAN Number ");
	}

	public static void main(String[] args) {
		program15 p = new program15();
		p.check();

	}

}
