import java.util.Scanner;

public class program9 {

	//not done
	
	/*	9)input1-- Hello*world
output-- boolean(true or false)
operation-- if the character before and after * are same return true else false
            if there in no star in the string return false(Ignore case)
*/
	
	
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input string");
			String input = sc.nextLine();

			boolean contain = input.contains("*");
			if (contain == true) {
				char before = input.charAt(input.indexOf("*") - 1);
				char after = input.charAt(input.indexOf("*") + 1);
				if (before == after) {
					System.out.println("True");
				} else {
					System.out.println("false");
				}
			} else {
				System.out.println("False");
			}
	


	}

}
