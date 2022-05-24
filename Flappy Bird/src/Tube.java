import processing.core.*;

public class Tube {
	private PApplet sketch;
	public float xpos, ypos;

	public Tube(PApplet sketch) {
		this.sketch = sketch;

		xpos = 300;
		ypos = 500;
	}

	public void render() {
		sketch.fill(0);
		sketch.rect(xpos, 0, 30, Game.HEIGHT);
	
	}

	public boolean collision() {
		return false;
	}

}
