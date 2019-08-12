import java.util.Scanner;

/// *** not properly run***/////
/*18) i/p: Honesty is my best policy
    o/p: Honesty
    Return the maximum word length from the given string.
    If there are two words of same length then,
    return the word which comes first based on alphabetical order.
*/
public class program18 {

	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String here  ");
		String str = sc.nextLine();
		int len = 0;
		String[] split = str.split(" ");
		String[] temp = new String[str.length()];
		String max = "";
		String s1 = "";
		for (int i = 0; i < split.length; i++) {
			if (max.length() < split[i].length()) {
				max = split[i];
				// len = max.length();
				

			}

		}
	
	

		for (int j = 0; j < split.length; j++) {
			if (max.length() <= split.length) {
				temp[j] = split[j];
				s1 = temp[j];

			}

		}
		System.out.println(s1);
		
	}
	
		
	

	public static void main(String[] args) {

		program18 p = new program18();
		p.check();

	}

}
