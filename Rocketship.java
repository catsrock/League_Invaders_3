
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean left;
	boolean right;
	boolean up;
	boolean down;

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}

	public void update() {
		super.update();
		if (left == true) {
			x -= speed;
		} else if (right == true) {
			x += speed;
		} else if (down == true) {
			y += speed;
		} else if (up == true) {
			y -= speed;
		}
	}

	public void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}
}