// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Arrays;

public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		// Generate three random numbers between 1 and 100 (inclusive)
		int A = (int) (Math.random() * 100) + 1;
		int B = (int) (Math.random() * 100) + 1;
		int C = (int) (Math.random() * 100) + 1;

		int[] MyArray = { A, B, C };

		while (MyArray[0] < MyArray[1] && MyArray[0] < MyArray[2]) {
			MyArray[0] = MyArray[0];
			if (MyArray[1] < MyArray[2]) {
				MyArray[1] = MyArray[1];
			}
			else{
				MyArray[2] = MyArray[2];
			}
			if (MyArray[0]<MyArray[1] && MyArray[0]<MyArray[2] && MyArray[1]<MyArray[2]) {
				return;
			}
		}
		System.out.println(Arrays.toString(MyArray));
	}
}
