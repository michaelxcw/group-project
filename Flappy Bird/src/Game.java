import processing.core.*;
import processing.event.KeyEvent;
import processing.sound.*;

import java.util.*;

public class Game extends PApplet {
    public static final int WIDTH = 700, HEIGHT = 393;

    private PImage appIconImage, flappyLogo, startScreen, getReady, tap;
    private PFont flappy;
    private SoundFile music, mouseClick, whoosh;

    private ArrayList<Button> buttons = new ArrayList<>();
    private Button play, leaderboard;
    private Background b;
    private PlayerCharacter character;

    private boolean startDisplay, playing, leaderboardDisplay, scrollingBackground;
    
    float verticalOscillation;

    public static void main(String[] args) {
	String[] appletArgs = new String[] { "Game" };
	PApplet.main(appletArgs);
    }

    public void settings() {
	size(WIDTH, HEIGHT);
    }

    public void setup() {
	appIconImage = loadImage("flappy_icon.jpeg");
	flappyLogo = loadImage("flappy_logo.png");
	startScreen = loadImage("start_screen.jpg");
	getReady = loadImage("get_ready.png");
	tap = loadImage("tap.png");
	flappy = createFont("FlappyBirdy.ttf", 40);
	
	b = new Background(this, 0, 0);
	character = new PlayerCharacter(this, HEIGHT / 2);

	createButtons();

	startDisplay = true;

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
	
	if (startDisplay) {
	    image(startScreen, 0, 0);
	    play.render();
	    leaderboard.render();
	}
	
	if (playing) {
	    b.still();
	    verticalOscillation = sin(radians(millis() / 2)) * 4;
	    image(getReady, (WIDTH / 2) - (getReady.width / 2), 35 + verticalOscillation);
	    image(tap, (WIDTH / 2) - (tap.width / 2), 60 + verticalOscillation);
	    
	    character.render();
	    
	    if (scrollingBackground) {
		b.scroll();
		character.render();
//		character.unfly();
		character.update();
	    }

	}
	
	if (leaderboardDisplay) {
	    background(255);
	}

    }

    public void mousePressed() {
	if ((play.inBounds() && play.visible()) || (leaderboard.inBounds() && leaderboard.visible())) {
	    music.stop();
	    mouseClick.play();

	    startDisplay = false;

	    play.setVisible(false);
	    leaderboard.setVisible(false);

	    if (play.inBounds()) {
		playing = true;
	    }
	    
	    if (leaderboard.inBounds()){
		leaderboardDisplay = true;
	    }
	}
    }

    public void keyPressed(KeyEvent e) {
	if (e.getKey() == ' ' && playing) {
	    scrollingBackground = true;
	    
//	    character.fly();
	    whoosh.play();
	}
    }

    private void createButtons() {
	play = new Button(this, "play_button.png", 270, 275);
	leaderboard = new Button(this, "leaderboard.png", 370, 275);

	buttons.add(play);
	buttons.add(leaderboard);
    }
}

// https://freesound.org/people/Mrthenoronha/sounds/520937/
// https://freesound.org/people/deleted_user_4772965/sounds/256455/
// https://freesound.org/people/combine2005/sounds/488275/