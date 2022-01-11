/*
* Written by: Jonathan Su
* 
* Purpose:
*/

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class StartScreen extends JFrame implements ActionListener {
	public static final int WIDTH = 700, HEIGHT = 393;

	public StartScreen() {
		super();
		Container contentPane = getContentPane();
		ImageIcon appIcon = new ImageIcon("src/resources/flappy_icon.png");
		JLabel startScreen = new JLabel(new ImageIcon("src/resources/start_screen.jpg"));
		Color customColor = new Color(223, 215, 150);
		Font font = new Font("Copperplate", Font.PLAIN, 12);
		Font f = new Font("VT323", Font.PLAIN, 15);
		
		contentPane.setLayout(new BorderLayout());
		setSize(WIDTH, HEIGHT);
		setIconImage(appIcon.getImage());
		setTitle("Flappy Bird");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (int i = 0; i < fonts.length; i++) {
		    System.out.println(fonts[i]);
		}
		
//		try {
//		     GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//		     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/VT323-Regular.ttf")));
//		} catch (Exception e) {
//		     //Handle exception
//		}
		
		
		contentPane.add(startScreen, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(customColor);
		buttonPanel.setLayout(new FlowLayout());

		JButton startButton = new JButton("Start");
		startButton.setFont(f);
		startButton.setBackground(customColor);
		startButton.addActionListener(this);
		buttonPanel.add(startButton);

		JButton empty = new JButton("Leaderboard");
		empty.setFont(f);
		empty.setBackground(customColor);
		empty.addActionListener(this);
		buttonPanel.add(empty);

		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start")) {
			setVisible(false);
			Main.g.setVisible(true);
		} else if (e.getActionCommand().equals("Leaderboard")) {
			setVisible(false);
			Main.l.setVisible(true);
		}
	}
}