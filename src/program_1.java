import java.util.Scanner;
/*2)input="hello"
output="hlo"; Alternative positions...
*/


// take output veriable store all data in veriable

public class program_1 {

	public static void main(String[] args) {
		
	
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter the string ");
				String input = sc.next();
				char ch[] = input.toCharArray();

				for (int i = 0; i < ch.length; i++) {
					if (i % 2 == 0) {
						System.out.print(ch[i] + "");
					}
				}
	}
}
				
			
