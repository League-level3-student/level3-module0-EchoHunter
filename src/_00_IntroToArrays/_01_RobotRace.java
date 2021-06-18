package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
	
		//2. create an array of 5 robots.
Robot[] r = new Robot[5];
		//3. use a for loop to initialize the robots.
int separation = 0;
for(Robot v: r) {
	v = new Robot();
	v.moveTo(50 + separation,500);
	separation +=200;
}
			//4. make each robot start at the bottom of the screen, side by side, facing up

		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
//Boolean notFinished = true;
for (int i = 0; i < r.length; i++) {
r[i].move(rand.nextInt(50));	
}

		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
