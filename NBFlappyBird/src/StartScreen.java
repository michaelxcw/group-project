import java.awt.*;
import javax.swing.*;
import java.io.*;

public class StartScreen extends JFrame {
    public static File fontFile = new File("src/fonts/FlappyBirdy.ttf");
    public static Font flappy = new Font("FlappyBirdy", Font.PLAIN, 24);
    public static ImageIcon appIcon = new ImageIcon("src/resources/flappy_icon.png");

    public StartScreen() {
        initComponents();

        setIconImage(appIcon.getImage());

        try {
            Font f = Font.createFont(Font.TRUETYPE_FONT, fontFile);

            GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
            g.registerFont(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        startScreen = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flappy Bird");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        startScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/start_screen.jpg"))); // NOI18N
        startScreen.setText("startScreen");
        startScreen.setPreferredSize(new java.awt.Dimension(700, 393));
        getContentPane().add(startScreen, java.awt.BorderLayout.CENTER);

        buttonPanel.setBackground(new java.awt.Color(223, 215, 150));
        buttonPanel.setPreferredSize(new java.awt.Dimension(700, 50));

        startButton.setBackground(new java.awt.Color(223, 215, 150));
        startButton.setFont(StartScreen.flappy);
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(startButton);

        jButton2.setBackground(new java.awt.Color(223, 215, 150));
        jButton2.setFont(flappy);
        jButton2.setText("Leaderboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton2);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 716, 432);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        setVisible(false);
        Main.g.setVisible(true);
    }//GEN-LAST:event_startButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel startScreen;
    // End of variables declaration//GEN-END:variables
}