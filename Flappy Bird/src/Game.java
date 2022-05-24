import processing.core.*;

public class Game extends PApplet {
	public static final int WIDTH = 960, HEIGHT = 540;
	
	private PImage background;

	public static void run() {
		String[] appletArgs = new String[] { "Game" };
		PApplet.main(appletArgs);
	}

	public void settings() {
		size(WIDTH, HEIGHT);
	}

	public void setup() {
		surface.setTitle("Flappy Bird");

		background = loadImage("background.jpg");
	}

	public void draw() {
		background(255);

		Tube t = new Tube(this);
		
		if (t.xpos > 0) {
			t.xpos-=10;
			print("p");
		}
		t.render();
		

		//image(background, 0, 0, WIDTH, HEIGHT);

	}

}
