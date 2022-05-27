import processing.core.*;
import processing.event.KeyEvent;
import processing.sound.*;

import java.util.*;

public class Game extends PApplet {
    public static final int WIDTH = 700, HEIGHT = 393;

    private PImage appIconImage, flappyLogo, startScreen, getReady;

    private ArrayList<Button> buttons = new ArrayList<>();
    private Button play, leaderboard;
    private Background b;

    private boolean start, playing, scrollingBackground;

    private SoundFile music, mouseClick, whoosh;
    
    float mysteryNumber;

    public static void main(String[] args) {
	String[] appletArgs = new String[] { "Game" };
	PApplet.main(appletArgs);
    }

    public void settings() {
	size(WIDTH, HEIGHT);
    }

    public void setup() {
	background(0);
	appIconImage = loadImage("flappy_icon.jpeg");
	flappyLogo = loadImage("flappy_logo.png");
	startScreen = loadImage("start_screen.jpg");
	getReady = loadImage("get_ready.png");
	b = new Background(this, 0, 0);

	createButtons();

	// flappy = createFont("FlappyBirdy.ttf", 30);

	start = true;

	music = new SoundFile(this, "music.wav");
	mouseClick = new SoundFile(this, "mouse_click.wav");
	whoosh = new SoundFile(this, "whoosh.mp3");
	music.loop();

	surface.setTitle("Flappy Bird");
	surface.setResizable(false);
	surface.setIcon(appIconImage);
    }

    public void draw() {
	tint(255);
	
	if (start) {
	    image(startScreen, 0, 0);
	    play.render();
	    leaderboard.render();
	}
	
	if (playing) {
	    b.still();
	    mysteryNumber = sin(radians(millis())) * 5;
	    image(getReady, (WIDTH / 2) - (getReady.width / 2), 35 + mysteryNumber);

	    if (scrollingBackground) {
		b.scroll();
	    }

	}

    }

    public void mousePressed() {
	if ((play.inBounds() && play.visible()) || (leaderboard.inBounds() && leaderboard.visible())) {
	    music.stop();
	    mouseClick.play();

	    start = false;

	    play.setVisible(false);
	    leaderboard.setVisible(false);

	    if (play.inBounds()) {
		playing = true;

	    } else {
		println("leaderboard");
	    }
	}
    }

    public void keyPressed(KeyEvent e) {
	if (e.getKey() == ' ' && playing) {
	    scrollingBackground = true;
	    whoosh.play();
	}
    }

    public void createButtons() {
	play = new Button(this, "play_button.png", 270, 275);
	leaderboard = new Button(this, "leaderboard.png", 370, 275);

	buttons.add(play);
	buttons.add(leaderboard);
    }
}

// https://freesound.org/people/Mrthenoronha/sounds/520937/
// https://freesound.org/people/deleted_user_4772965/sounds/256455/
// https://freesound.org/people/combine2005/sounds/488275/