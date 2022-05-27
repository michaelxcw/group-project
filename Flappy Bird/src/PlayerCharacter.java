import processing.core.*;

public class PlayerCharacter {
    private PApplet sketch;
    private float x, y;

    private PImage bird1, bird2, bird3;
    private int counter = 1;
    private float vertSpeed, jumpSpeed, fallingConstant, deltaTime;

    public PlayerCharacter(PApplet sketch, float y) {
	bird1 = sketch.loadImage("bird1.png");
	bird2 = sketch.loadImage("bird2.png");
	bird3 = sketch.loadImage("bird3.png");
	
	this.sketch = sketch;
	this.x = (Game.WIDTH / 2) - bird1.width;
	this.y = y;
	

	vertSpeed = 5;
	jumpSpeed = 5;
	fallingConstant = 0.3f;
	deltaTime = 1;
    }
    
//    public void fly() {
//	y -= vertSpeed;
//	vertSpeed = vertSpeed + gravity;
//    }
//    
//    public void unfly() {
//	y += 1;
//    }
    
    public void update() {
	if (sketch.keyPressed) {
	    vertSpeed = jumpSpeed;
	}
	y += vertSpeed * deltaTime;
	vertSpeed -= fallingConstant * deltaTime;
    }

    public void render() {
	switch (counter) {
	case 1:
	    sketch.image(bird1, x, y, 48, 38);
	    counter++;
	    break;
	case 2:
	    sketch.image(bird2, x, y, 48, 38);
	    counter++;
	    break;
	case 3:
	    sketch.image(bird3, x, y, 48, 38);
	    counter++;
	    break;
	default:
	    sketch.image(bird2, x, y, 48, 38);
	    counter = 1;
	}

    }

}
