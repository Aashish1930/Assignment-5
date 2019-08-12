//Assignment_5
/*10)input --String input1 ="xaXafxsd"
    output--String output1="aXafsdxx"
    operation-- remove the character "x"(only lower case) from string and place at the end
*/


// not done
public class program10 {

	public void check(char str) {
		String input = "xaXafxsd";
 int count=0;
		for (int i = 0; i <= input.length(); i++) {
			
			if(input.charAt(i)==str){
				count++;
			}
			
		}
		
	String output=input.replace(str, ' ');
		String str1 = "x";
		System.out.println(str + str1 + str1);

	}

	public static void main(String[] args) {

		program10 p = new program10();
		p.check('x');

		// *******following logic also work*****/////

		/*
		 * String input = "xaXafxsd"; char[] input1 = input.toCharArray() //
		 * enter char you want to remove char c = 'x'; String input2 = "";
		 * String input3 = "";
		 * 
		 * for (int i = 0; i < input.length(); i++) { if (input1[i] == (c)) {
		 * input2 += input1[i]; } else { input3 += input1[i]; } }
		 * System.out.println("After performing the operation :" + input3 +
		 * input2);
		 */ }

}
