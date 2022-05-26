import processing.core.*;

public class Button {
    private PApplet sketch;

    private String text;
    private float x, y, width, height;
    private boolean visible;

    public Button(PApplet sketch, String text, float x, float y) {
	this.sketch = sketch;
	this.text = text;
	this.x = x;
	this.y = y;

	
	//sketch.textFont(sketch.flappy);

//	this.width = sketch.textWidth(text);
//	this.height = sketch.textAscent() + sketch.textAscent();
//	visible = true;

    }

    public void render() {
	if (visible) {
	    if (inBounds()) {
		sketch.fill(255);
	    } else {
		sketch.fill(223, 215, 150);
	    }
	    sketch.rect(x, y, width, height, 15);

	    sketch.fill(255);
	    sketch.textAlign(PApplet.LEFT, PApplet.TOP);
	    sketch.text("Start", x, y);
	}

    }

    public boolean inBounds() {
	return (sketch.mouseX > x) && (sketch.mouseY > y) && (sketch.mouseX < x + width)
		&& (sketch.mouseY < y + height);
    }

    public void setVisible(boolean visible) {
	this.visible = visible;
    }

}
