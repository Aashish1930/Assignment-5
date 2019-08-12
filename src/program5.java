import java.util.Scanner;

/*5)count the number of words in the string
    Input string="i work in cognizant.";
    output=4;
*/

public class program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here");
		String str = sc.nextLine();
		String split[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < split.length; i++) {
			count++;
		}

		System.out.println("Number of word in given String is :- "+count);

	}

}
