/*
* Written by: Jonathan Su
* 
* Purpose:
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class StartScreen extends JFrame implements ActionListener {
    public static final int WIDTH = 700, HEIGHT = 393;

    public StartScreen() {
	super();
	Container contentPane = getContentPane();
	File fontFile = new File("src/fonts/FlappyBirdy.ttf");
	ImageIcon appIcon = new ImageIcon("src/resources/flappy_icon.png");
	JLabel startScreen = new JLabel(new ImageIcon("src/resources/start_screen.jpg"));
	Color customColor = new Color(223, 215, 150);
	Font flappy = new Font("FlappyBirdy", Font.PLAIN, 24);
	
	contentPane.setLayout(new BorderLayout());
	setSize(WIDTH, HEIGHT);
	setIconImage(appIcon.getImage());
	setTitle("Flappy Bird");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	
	try {
	    Font f = Font.createFont(Font.TRUETYPE_FONT, fontFile);

	    GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    g.registerFont(f);
	} catch (Exception e) {
	    e.printStackTrace();
	}

	contentPane.add(startScreen, BorderLayout.CENTER);

	JPanel buttonPanel = new JPanel();
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

	contentPane.add(buttonPanel, BorderLayout.SOUTH);
	
//	while(isVisible()) {
//	    double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
//	    double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
//	        
//	    System.out.println(mouseX + ", " + mouseY);
//	}
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