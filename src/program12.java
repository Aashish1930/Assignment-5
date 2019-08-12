/*12)input string="hello", n=2
    output: lolo 
*/


import java.util.Scanner;

public class program12 {
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String here :- ");
		String str = sc.nextLine();
		System.out.println("enter number :- ");
		int num = sc.nextInt();
		str = str.substring(str.length() - 2);
		for (int i = 0; i < num; i++) {
			String s = "";
			s += str;
			System.out.print(s);

		}

	}

	public static void main(String[] args) {
		program12 p = new program12();
		p.check();

	}

}
