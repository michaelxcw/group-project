import processing.core.*;
import processing.event.*;

public class Game extends PApplet {
    private static final int WIDTH = 700, HEIGHT = 393;

    private PImage appIconImage, startScreen, buttons;
    public PFont flappy;
    private boolean start;


    public static void main(String[] args) {
	String[] appletArgs = new String[] { "Game" };
	PApplet.main(appletArgs);
    }

    public void settings() {
	size(WIDTH, HEIGHT);
    }

    public void setup() {
	appIconImage = loadImage("flappy_icon.jpeg");
	startScreen = loadImage("start_screen.jpg");
	flappy = createFont("FlappyBirdy.ttf", 30);
	buttons = loadImage("xyab.jpeg");

	start = true;

	surface.setTitle("Flappy Bird");
	surface.setResizable(false);
	surface.setIcon(appIconImage);
    }

    public void draw() {
	if (start) {
	    image(startScreen, 0, 0);
	    image(buttons, 0, 300, 50, 50);
	} else {
	    background(255);
	}

    }

    public void keyPressed(KeyEvent e) {
	if (e.getKey() == 'x') {
	    start = false;
	}
	
    }

}
