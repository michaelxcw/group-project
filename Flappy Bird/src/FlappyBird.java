import java.awt.*;
import javax.swing.*;

public class FlappyBird extends JPanel {
	public static final int WIDTH = 700, HEIGHT = 393;
	public boolean running = false;
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		JLabel label = new JLabel("Press any key to start");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image startScreen = toolkit.getImage("start_screen.jpg");
		g2.drawImage(startScreen, 0, 0, this);
		//g2.draw(label);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Flappy Bird");
		FlappyBird f = new FlappyBird();
		
		Image icon = Toolkit.getDefaultToolkit().getImage("download.jpeg");
		frame.setIconImage(icon);
		

		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		frame.add(f);
		frame.setVisible(true);
		
				
		

	}
}
