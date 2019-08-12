
/*16)Return 1 if the last & first characters of 
 * a string are equal else 
    return -1. Consider case.
    Eg: Input = "this was great"
        Output= 1
*/

import java.util.Scanner;

public class program16 {

	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Here ");
		String str = sc.nextLine();

		String Start = str.substring(0, 1);
		String End = str.substring(str.length() - 1);
		if (Start.equals(End)) {
			System.out.println("Equal Character = 1 ");
		} else {
			System.out.println(" Not Equal Character = -1 ");
		}

	}

	public static void main(String[] args) {

		program16 p = new program16();
		p.check();

	}

}
