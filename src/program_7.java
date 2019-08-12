import java.util.Scanner;

//Assignment 5

/*7)Input1=”cowboy”; Output1=”cowcow”;
Input1=”so”;output1=”sososo”; 
HINT: if they give 3 letter word u have to display 2 time;
*/

public class program_7 {

	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter here :- ");
		String str = sc.nextLine();
		for (int i = 0; i <= str.length(); i++) {
			if (str.length() >= 3) {
				String substr = str.substring(0, 3);
				System.out.println("SubString is " + substr + substr);
				break;
			}
			if (str.length() == 2) {
				System.out.println(str + str + str);
				break;
			}

		}

	}

	public static void main(String[] args) {

		program_7 p = new program_7();

		p.check();

	}

}
