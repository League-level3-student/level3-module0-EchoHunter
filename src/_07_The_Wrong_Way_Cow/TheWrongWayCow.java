/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		int facingNorth = 0;
		int facingSouth = 0;
		int facingWest = 0;
		int facingEast = 0;
		int yLocation = 0;
		int xLocation = 0;
		int[] returned = new int[2];
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == 'o') {
					if ((j != 0)&&(j<field[i].length+1)) {
						if ((field[i][j - 1] == 'c')&&(field[i][j+1] =='w')) {
							facingNorth++;
							if (((facingSouth == 0) || (facingNorth < facingSouth))
									&& ((facingWest == 0) || (facingNorth < facingWest))
									&& ((facingEast == 0) || (facingNorth < facingEast))) {
								yLocation = i;
								xLocation = j - 1;
							}
						}
					}
					if ((i != 0)&&(i<field.length-1)) {
						if (field[i + 1][j] == 'c') {
							facingSouth++;
							if (((facingWest == 0) || (facingSouth < facingWest))
									&& ((facingNorth == 0) || (facingSouth < facingNorth))
									&& ((facingEast == 0) || (facingSouth < facingEast))) {
								yLocation = i + 1;
								xLocation = j;
							}
						}
					}

					if ((j != 0)&&(j<field[i].length-1)) {
						if (field[i][j + 1] == 'c') {
							facingWest++;
							if (((facingSouth == 0) || (facingWest < facingSouth))
									&& ((facingNorth == 0) || (facingWest < facingNorth))
									&& ((facingEast == 0) || (facingWest < facingEast))) {
								yLocation = i;
								xLocation = j + 1;
							}
						}
					}
					if ((i != 0)&&(i<field.length+1)) {
						if (field[i - 1][j] == 'c') {
							facingEast++;
							if (((facingSouth ==0)||(facingEast < facingSouth)) 
									&& ((facingNorth ==0)||(facingEast < facingNorth)) 
									&& ((facingWest==0)||(facingEast < facingWest))) {
								yLocation = i - 1;
								xLocation = j;
							}
						}

					}
				}
			}
		}
		returned[0] = xLocation;
		returned[1] = yLocation;
		System.out.println(returned[0]);
		System.out.println(returned[1]);
		return returned;

	}
}