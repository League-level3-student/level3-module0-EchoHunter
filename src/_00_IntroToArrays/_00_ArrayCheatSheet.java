package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random rand = new Random();
		//1. make an array of 5 Strings
String[] s = new String[5];

		//2. print the third element in the array
System.out.println(s[3]);
		//3. set the third element to a different value
s[3] = "new string";
		//4. print the third element again
		System.out.println(s[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		String i1 = "0";
		for (int i = 0; i < s.length; i++) {
			i1.valueOf(i);
			s[i] = i1;
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
	for (int g = 0; g < s.length; g++) {
		System.out.println(g);
	}
		//7. make an array of 50 integers
int[] l = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for (int h = 0; h < l.length; h++) {
	l[h]= rand.nextInt(51);
}
		//9. without printing the entire array, print only the smallest number on the array
int sizeFinder = 50;
for (int j = 0; j < l.length; j++) {
	if(l[j] < sizeFinder) {
	sizeFinder = l[j];
	}
}
System.out.println("the smallest is " + sizeFinder);
		//10 print the entire array to see if step 8 was correct
for(int c:l) {
	System.out.println(c);
}
		//11. print the largest number in the array.
int sizeFinder1 = 0;
for (int j = 0; j < l.length; j++) {
	if(l[j] > sizeFinder1) {
	sizeFinder1 = l[j];
	}
}	
System.out.println("the largest is " + sizeFinder1);
		//12. print only the last element in the array
		System.out.println(l[l.length-1]);
	}
}
