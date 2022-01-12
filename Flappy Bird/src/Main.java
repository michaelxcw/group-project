public class Main {
    public static StartScreen s = new StartScreen();
    public static Game g = new Game();
    public static EndScreen e = new EndScreen();
    public static Leaderboard l = new Leaderboard();

    public static void main(String[] args) {

	s.setVisible(true);
	g.setVisible(false);
	e.setVisible(false);
	l.setVisible(false);
    }
}