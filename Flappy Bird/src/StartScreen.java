import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class StartScreen extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 700, HEIGHT = 393;

	private Container contentPane = getContentPane();
	private File fontFile = new File("src/fonts/FlappyBirdy.ttf");
	private ImageIcon appIcon = new ImageIcon("src/data/flappy_icon.png");
	private JLabel startScreen = new JLabel(new ImageIcon("src/data/start_screen.jpg"));
	private Color customColor = new Color(223, 215, 150);
	private Font flappy = new Font("FlappyBirdy", Font.PLAIN, 24);
	private JPanel buttonPanel = new JPanel();

	public StartScreen() {
		super();

		contentPane.setLayout(new BorderLayout());
		setSize(WIDTH, HEIGHT);
		setIconImage(appIcon.getImage());
		setTitle("Flappy Bird");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		createButtons();

		try {
			Font f = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
			g.registerFont(f);
		} catch (Exception e) {
			e.printStackTrace();
		}

		contentPane.add(startScreen, BorderLayout.CENTER);

		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start")) {
			System.out.println("Start button clicked");
			
			Main.s.setVisible(false);
			Main.g.run();
		}
	}

	private void createButtons() {
		buttonPanel.setBackground(customColor);
		buttonPanel.setLayout(new FlowLayout());

		JButton startButton = new JButton("Start");
		startButton.setFont(flappy);
		startButton.setBackground(customColor);
		startButton.addActionListener(this);
		buttonPanel.add(startButton);

		JButton empty = new JButton("Leaderboard");
		empty.setFont(flappy);
		empty.setBackground(customColor);
		empty.addActionListener(this);

		buttonPanel.add(empty);
	}
}