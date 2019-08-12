import java.util.Scanner;

/// **************************************INcomplete******************//////////////////
/*19) In a string check whether all the vowels are present
    if yes return 1 else 2.
    ex: String 1="education"
        output=1.
*/
public class program19 {

	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here ");
		String str = sc.nextLine();
		String s1 = "";
		// char[] ch=str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if( (ch == 'a' || ch == 'e' ||ch  == 'i' || ch == 'o' || ch == 'u') )
				
			
				{

				System.out.println(ch);

			}
			

		}

	}

	public static void main(String[] args) {
		program19 p = new program19();
		p.check();

	}

}
