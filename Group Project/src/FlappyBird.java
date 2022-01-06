import java.awt.*;
import javax.swing.*;

public class FlappyBird extends JPanel {
    public static final int WIDTH = 700, HEIGHT = 393;

    public FlappyBird() {
//	Toolkit toolkit = Toolkit.getDefaultToolkit();
//	JLabel label = new JLabel("Press any key to start");
//	//ImageIcon startScreen = toolkit.getImage("start_screen.jpg");
	//JLabel startScreen = new JLabel(new ImageIcon("start_screen.jpg"));
	//startScreen.setBounds(500, 500, WIDTH, HEIGHT);
	
	JButton startButton = new JButton("Click to start");
	startButton.setBounds(0, 0, 10, 50);

	

	//add(startScreen);
	
	add(startButton);

    }

}
