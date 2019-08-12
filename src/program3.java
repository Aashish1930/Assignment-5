import java.util.Scanner;

/*Input1=”Hello World”;  output-------à  “dello WorlH”.
*/
// use StringBuffer method in that program
public class program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here ");
		String input = sc.nextLine();
		String First = input.substring(0, 1);
		String Last = input.substring(input.length() -1);
		String output = Last + input.substring(1, input.length() - 1) + First;
		System.out.println(output);

	}

}
