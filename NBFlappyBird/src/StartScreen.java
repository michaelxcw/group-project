/*
* @author: Jonathan Su
 */

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class StartScreen extends JFrame {
    public static Font flappy24 = new Font("FlappyBirdy", Font.PLAIN, 24);

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    public StartScreen() {
        initComponents();

        InputStream fontFile = getClass().getResourceAsStream("/fonts/FlappyBirdy.ttf");
        ImageIcon appIcon = new ImageIcon(getClass().getResource("/resources/flappy_icon.png"));

        try {
            Font f = Font.createFont(Font.TRUETYPE_FONT, fontFile);

            GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
            g.registerFont(f);

            setIconImage(appIcon.getImage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startScreen = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        leaderboardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flappy Bird");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        startScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/start_screen.jpg"))); // NOI18N
        startScreen.setText("startScreen");
        startScreen.setPreferredSize(new java.awt.Dimension(700, 393));
        getContentPane().add(startScreen, java.awt.BorderLayout.CENTER);

        buttonPanel.setBackground(new java.awt.Color(223, 215, 150));
        buttonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonPanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        buttonPanel.setPreferredSize(new java.awt.Dimension(700, 80));
        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 20));

        startButton.setBackground(new java.awt.Color(223, 215, 150));
        startButton.setFont(flappy24);
        startButton.setText("Start");
        startButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        startButton.setContentAreaFilled(false);
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.setPreferredSize(new java.awt.Dimension(50, 25));
        startButton.setSelected(true);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(startButton);

        leaderboardButton.setBackground(new java.awt.Color(223, 215, 150));
        leaderboardButton.setFont(flappy24);
        leaderboardButton.setText("Leaderboard");
        leaderboardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        leaderboardButton.setContentAreaFilled(false);
        leaderboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaderboardButton.setPreferredSize(new java.awt.Dimension(80, 25));
        leaderboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(leaderboardButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_END);
        buttonPanel.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 716, 432);
    }// </editor-fold>//GEN-END:initComponents

    private void leaderboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardButtonActionPerformed
        setVisible(false);
        Main.e.setVisible(true);
    }//GEN-LAST:event_leaderboardButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        setVisible(false);
        Main.g.setVisible(true);
    }//GEN-LAST:event_startButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton leaderboardButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel startScreen;
    // End of variables declaration//GEN-END:variables
}