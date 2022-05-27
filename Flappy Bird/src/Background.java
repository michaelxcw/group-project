import processing.core.*;

public class Background {
    private PApplet sketch;
    private PImage image;
    private float x, y;

    public Background(PApplet sketch, float x, float y) {
	this.sketch = sketch;
	this.image = sketch.loadImage("background.png");
	this.x = x;
	this.y = y;

    }

    public void still() {
	sketch.image(image, x, y);
    }

    public void scroll() {
	sketch.image(image, x, y);
	sketch.image(image, x + image.width, y);
	x -= 2;

	if (x + image.width < 0) {
	    x = 0;
	}

    }

}
