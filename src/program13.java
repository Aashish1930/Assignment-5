/*13)prove whether a number is ISBN number or not
    input="0201103311" 0201103311"
    ISBN number:  sum=0*10 +2*9+ 0*8 +1*7+ 1*6 
    +0*5+ 3*4 +3*3+ 1*2 +1*1
    sum%11==0 then it is ISBN number
*/
public class program13 {

	public void check() {
		String str = "0201103311";
		int l = str.length();
		int sum = 0;
		int a = 0, k = 10;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int num = Character.getNumericValue(ch);
			sum = sum + num * k;
			k--;

		}
		System.out.println(sum);

		if (sum % 11 == 0)
			System.out.println("Leaves No Remainder - Valid ISBN Code");
		else
			System.out.println("Leaves Remainder - Invalid ISBN Code");

	}

	public static void main(String[] args) {
		program13 p = new program13();
		p.check();

	}

}

// input="0201103311" 0201103311
