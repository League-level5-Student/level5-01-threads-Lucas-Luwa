package _02_Advanced_Robot_Race;

import java.lang.reflect.Array;
import java.util.Random;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotRace {
	public static void main(String[] args) {
		int holder = 0;
		int botnum = 0;
		Random r = new Random();
		Robot[] bots = new Robot[5];
		for (int i = 0; i < bots.length; i++) {
			bots[i] = new Robot(290 + 292 * i, 953);
			bots[i].setSpeed(100);
		}
		while (bots[1].getY() > 0 && bots[2].getY() > 0 && bots[3].getY() > 0 && bots[4].getY() > 0
				&& bots[0].getY() > 0) {
			for (int i = 0; i < bots.length; i++) {
				int x = r.nextInt(50) + 1;
				bots[i].move(x);
			}
		}
		for (int i = 0; i < bots.length; i++) {
			if (bots[i].getY() < holder) {
				botnum = i;
				holder = bots[i].getY();
			}
		}
		JOptionPane.showMessageDialog(null, "Robot " + (botnum + 1) + " is the winner!");
	}
}
