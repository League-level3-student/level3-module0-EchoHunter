package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] r = new String[10];
		r[0] = "1 ";
		r[1] = "2 ";
		r[2] = "3 ";
		r[3] = "4 ";
		r[4] = "5 ";
		r[5] = "6 ";
		r[6] = "7 ";
		r[7] = "8 ";
		r[8] = "9 ";
		r[9] = "10 ";
		arrayPrinter(r);
		reverseArrayPrinter(r);
		everyOtherPrinter(r);
		randomPrinter(r);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void arrayPrinter(String[] r) {
		for (String prints : r) {
			System.out.print(prints);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void reverseArrayPrinter(String[] r) {
		System.out.println("");
		for (int i = r.length - 1; i >= 0; i--) {
			System.out.print(r[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void everyOtherPrinter(String[] r) {
		System.out.println("");
		for (int i = 0; i < r.length; i++) {
			if (i % 2 == 0) {
				System.out.print(r[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static void randomPrinter(String[] r) {
		System.out.println("");
		boolean matchingValues = true;
		Random m = new Random();
		ArrayList<String> v = new ArrayList<String>();

		for (int i = 0; i < r.length; i++) {
			int c = m.nextInt(r.length);
			while (v.contains(r[c])) {
				c = m.nextInt(r.length);
			}
			v.add(r[c]);
			System.out.print(r[c]);
		}

	}
}
