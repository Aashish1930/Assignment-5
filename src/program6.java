import java.util.Scanner;

import javax.sound.midi.Sequence;
//Assignment 5
/*6)int[] input={2,1,4,1,2,3,6};
    check whether the input has the sequence of "1,2,3". if so-
    output=true;
    int[] input={1,2,1,3,4,5,8};
    output=false
*/

// not done..
public class program6 {

	public boolean check() {

		int array[] = { 2, 1, 9, 3, 5, 3, 1, 2, 9 ,1,4,1,2,3,};

		int count = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j <= 3; j++) {

				try {
					if (array[i] == j) {

						count++;
						i++;
					} else {
						count = 0;
						j = 0;
						i++;

					}

					if (count == 3) {
						return true;
					}

				} catch (IndexOutOfBoundsException e) {
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		program6 p = new program6();
		System.out.println(p.check());

	}
}