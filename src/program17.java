import java.util.Scanner;

/*17)concat two string if length of two string is equal.
    if length of one string is greater, then remove the character from 
    largest string and then add. The number of characters removed from 
    largest string is equal to smallest string's length
    for example: input 1="hello";
                 input 2="helloworld";
                 output="worldhello";
*/
public class program17 {
	
	public void check()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String ");
		String First=sc.nextLine();
		System.out.println("Enter Second String ");
		String Second=sc.nextLine();
		
		if(First.length()==Second.length())
		{
			System.out.println(First+Second);
			
		}
		else {
			if (First.length() > Second.length()) {
				String sub1 = First.substring(Second.length(), First.length());
				String output2 = sub1 + Second;
				System.out.println("output 2 is: " + output2);
			} else {
				String sub2 = Second.substring(First.length(), Second.length());
				String output3 = sub2 + First;
				System.out.println("output 3 is: " + output3);
			}
		}

	}

		
	
	
	

	public static void main(String[] args) {
		
		program17 p = new program17();
		p.check();
	}

}
