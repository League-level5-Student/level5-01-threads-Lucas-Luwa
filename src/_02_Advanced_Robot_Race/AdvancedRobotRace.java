package _02_Advanced_Robot_Race;

import java.lang.reflect.Array;
import java.util.Random;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
		int holder = 0;
		int botnum = 0;

		Random r = new Random();
		Robot[] bots = new Robot[5];
		for (int i = 0; i < bots.length; i++) {
			bots[i] = new Robot(290 + 292 * i, 953);
			bots[i].setSpeed(10);
		}
		while (bots[1].getY() > 0 && bots[2].getY() > 0 && bots[3].getY() > 0 && bots[4].getY() > 0
				&& bots[0].getY() > 0) {
			int x = r.nextInt(50) + 1;
			Thread r1 = new Thread(() -> bots[0].move(x));
			int x1 = r.nextInt(50) + 1;
			Thread r2 = new Thread(() -> bots[1].move(x1));
			int x2 = r.nextInt(50) + 1;
			Thread r3 = new Thread(() -> bots[2].move(x2));
			int x3 = r.nextInt(50) + 1;
			Thread r4 = new Thread(() -> bots[3].move(x3));
			int x4 = r.nextInt(50) + 1;
			Thread r5 = new Thread(() -> bots[4].move(x4));
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();
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