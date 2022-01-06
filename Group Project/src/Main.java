import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
	JFrame frame = new JFrame("Flappy Bird");


	FlappyBird f = new FlappyBird();

	//frame.setSize(FlappyBird.WIDTH, FlappyBird.HEIGHT);
	frame.setSize(1000, 1000);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);

	frame.add(f);
	
	frame.setVisible(true);

    }

}
