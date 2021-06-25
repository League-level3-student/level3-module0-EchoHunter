package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	static Robot[] r = new Robot[5];
	public static void main(String[] args) {
		Random rand = new Random();

		// 2. create an array of 5 robots.
		// 3. use a for loop to initialize the robots.
		int separation = 0;
		for (int x = 0; x < r.length; x++) {
		r[x] = new Robot();
		r[x].moveTo(200 + separation, 500);
		r[x].turn(-35);
		r[x].setSpeed(10);
		separation += 15;
		}  
			
		
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
Boolean notFinished = true;
int robotNumber = 0;
int moveAmount = 0;
			while(notFinished) {
		for (int i = 0; i < r.length; i++) {
			moveAmount = rand.nextInt(50);
			r[i].move(moveAmount * 3);
			r[i].turn(moveAmount );
			if((r[i].getY()>= 500)&&(r[i].getX()>=250)) {
				robotNumber = i+1;
				notFinished = false;
				break;
			}
		}
			}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
JOptionPane.showMessageDialog(null, "Robot number " + robotNumber + "is the winner!");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}

}
