package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {

		// Make A Program that uses Threads and robots to draw the Olympic rings. One
		// robot should draw one ring simultaneously with the other 4 robots.
		Robot Blue = new Robot(200, 400);
		Robot Yellow = new Robot(350, 550);
		Robot Black = new Robot(500, 400);
		Robot Green = new Robot(650, 550);
		Robot Red = new Robot(800, 400);

		Blue.setSpeed(100);
		Yellow.setSpeed(100);
		Black.setSpeed(100);
		Green.setSpeed(100);
		Red.setSpeed(100);

		Blue.penDown();
		Blue.setPenWidth(5);
		Blue.setPenColor(Color.BLUE);

		Yellow.penDown();
		Yellow.setPenWidth(5);
		Yellow.setPenColor(Color.YELLOW);

		Black.penDown();
		Black.setPenWidth(5);
		Black.setPenColor(Color.BLACK);

		Green.penDown();
		Green.setPenWidth(5);
		Green.setPenColor(Color.GREEN);

		Red.penDown();
		Red.setPenWidth(5);
		Red.setPenColor(Color.RED);

		/*
		 * for (int i = 0; i < 35; i++) { Blue.turn(10); Blue.move(20); } for (int i =
		 * 0; i < 35; i++) { Yellow.turn(10); Yellow.move(20); } for (int i = 0; i < 35;
		 * i++) { Black.turn(10); Black.move(20); } for (int i = 0; i < 35; i++) {
		 * Red.turn(10); Red.move(20); } for (int i = 0; i < 35; i++) { Green.turn(10);
		 * Green.move(20); }
		 */
		new Thread(() -> {
			for (int i = 0; i < 35; i++) {
				Blue.turn(10);
				Blue.move(20);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 35; i++) {
				Yellow.turn(10);
				Yellow.move(20);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 35; i++) {
				Black.turn(10);
				Black.move(20);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 35; i++) {
				Green.turn(10);
				Green.move(20);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 35; i++) {
				Red.turn(10);
				Red.move(20);
			}
		}).start();

	}
}