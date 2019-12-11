import java.util.Scanner;

/*
	 * 20)swap the every 2 chrecters in the given string If size is odd number
	 * then keep the last letter as it is. Ex:- input: forget output: ofgrte
	 * Ex:- input : NewYork output : eNYwrok
	 * 
	 */
public class program20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter here ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length() - 1; i = i + 2) {
			for (int j = i + 1; j < str.length(); j = j + 2) {
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(j);
				System.out.print(Character.toString(ch2) + Character.toString(ch1));
				break;
			}
		}

		if (str.length() % 2 != 0) {
			System.out.println(str.substring(str.length() - 1));

// git testing
		}
	}
}
