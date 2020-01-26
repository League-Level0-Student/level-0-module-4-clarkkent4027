import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog(null, "What is your test score?");
	int score2 = Integer.parseInt(score);
if (score2 >= 90) {
JOptionPane.showMessageDialog(null, "Wow! U R super smart!");
}
	}
		}