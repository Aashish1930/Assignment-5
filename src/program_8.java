
//Assignment 5
/*8) input---input1=1;
            input2=4;
            input3=1;
    output1=4;
    operation--- print the element which is not repeated    
    if all the inputs r different sum all inputs
    input---input1=1;
            input2=2;
            input3=3;
    output1=6;
 */

// use in array
import java.util.Scanner;

public class program_8 {
	public void check() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter First Input:- ");
		int input1 = sc.nextInt();
		System.out.println("enter the secound input :- ");
		int input2 = sc.nextInt();
		System.out.println("enter third input:- ");
		int input3 = sc.nextInt();

		if ((input1 != input2) && (input1 != input3) && (input3 != input2)) 
		{
			int Sum = input1 + input2 + input3;
			System.out.println("Sum is :-" + Sum);
		}
		
		else if ((input1 == input2) && (input1 == input3) && (input3 == input2))
		{
			System.out.println("All are the Same Input ");
		}
		
		else if (input1 == input2)
		{
			System.out.println(+input3 + " is not repeated");
		}
		
		else if (input1 == input3)
		{
			System.out.println(+input2 + " is not repeated");
		} 
		
		else {
			System.out.println(+input1 + " is not reapeated");
		}

	}

	public static void main(String[] args) {
		program_8 p = new program_8();
		p.check();

	}

}
