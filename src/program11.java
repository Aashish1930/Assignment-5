
/*11) String i/p1=2012;
    sTRING i/p2=5
    IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;
*/



import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the experience in 2012 this format");
		String input1 = sc.nextLine();
		System.out.println("Enter the input which is 5");
		int input2 = sc.nextInt();
		String[] ch = input1.split("");
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			sum += Integer.parseInt(ch[i]);
		}
		if (sum > input2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	

	}

}
