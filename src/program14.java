import java.util.Scanner;

/*14)Validate Password
validation based on following criteria:
-> minimum length is 8
-> should contain any of these @/_/#
-> should not start with number/special chars(@/#/_)
-> should not end with special chars
-> can contain numbers,letters,special chars
*/
public class program14 {

	public boolean check() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password here ");
		String Password = sc.nextLine();
		try {
			

			if ((Password.length() >= 8) 
			 && (Password.matches(".*[@/#/_].*")) 
		     &&(!Password.startsWith("@"))
		     &&(!Password.startsWith("#"))
		     &&(!Password.startsWith("_"))
			 && (!Password.endsWith("@"))
			 && (!Password.endsWith("#"))
			 && (!Password.endsWith("_"))
			 &&(Password.matches(".*[0-9].*"))
			 && (Password.matches(".*[a-z].*"))
			 &&(Password.matches(".*[A-Z].*")))
			{
				return true;
			}
			

		} catch (Exception e) {
			
		}
		return false;
		
		
	}

	public static void main(String[] args) {

		program14 p = new program14();
		System.out.println(p.check());

	}

}
