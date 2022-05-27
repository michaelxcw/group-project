import processing.core.*;

public class Button {
    private PApplet sketch;
    private PImage image;
    private float x, y;

    private boolean visible;

    public Button(PApplet sketch, String imageFile, float x, float y) {
	this.sketch = sketch;
	this.image = sketch.loadImage(imageFile);
	this.x = x;
	this.y = y;

	this.visible = true;
    }

    public void render() {
	if (visible) {
	    if (inBounds()) {
		sketch.tint(150);
	    } else {
		sketch.tint(255);
	    }

	    sketch.image(image, x, y);
	}
    }

    public boolean inBounds() {
	return (sketch.mouseX > x) && (sketch.mouseX < x + image.width) && (sketch.mouseY > y)
		&& (sketch.mouseY < y + image.height);
    }

    public void setVisible(boolean b) {
	visible = b;
    }
    
    public boolean visible() {
	return visible;
    }
}