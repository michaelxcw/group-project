import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartScreen extends JFrame implements ActionListener {
	public static final int WIDTH = 700, HEIGHT = 393;

	public StartScreen() {
		super();
		Container contentPane = getContentPane();
		ImageIcon appIcon = new ImageIcon("flappy_icon.png");
		Color customColor = new Color(223, 215, 150);
		
		contentPane.setLayout(new BorderLayout());
		setTitle("Flappy Bird");
		setIconImage(appIcon.getImage());
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JLabel startScreen = new JLabel(new ImageIcon("start_screen.jpg"));
		contentPane.add(startScreen, BorderLayout.CENTER);
			
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(customColor);
		buttonPanel.setLayout(new FlowLayout());
		
		JButton start = new JButton("Start");
		start.setBackground(customColor);
		start.addActionListener(this);
		buttonPanel.add(start);
		
		JButton empty = new JButton("Stop");
		empty.setBackground(customColor);
		empty.addActionListener(this);
		buttonPanel.add(empty);
		
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start")) {
			setVisible(false);
			Main.g.setVisible(true);
		} else if (e.getActionCommand().equals("Stop")) {
			System.out.println("empty button clicked");

		}
	}
}