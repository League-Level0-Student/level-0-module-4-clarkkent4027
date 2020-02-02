import javax.swing.JOptionPane;

public class testScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog(null, "What is your test score?");
		double score2 = Double.parseDouble(score);
		if (score2 >= 90) {
			JOptionPane.showMessageDialog(null, "You could've done better");
		} else {
			if (score2 >= 80) {
				JOptionPane.showMessageDialog(null, "I'm not mad, just disappointed");
			} else {
				if (score2 >= 70) {
					JOptionPane.showMessageDialog(null, "NO DINNER FOR YOU YOUNG MAN!!");
				} else {
					if (score2 >= 60) {
						JOptionPane.showMessageDialog(null, "Have fun sleeping with the rats outside!");
					} else {
						if (score2 >= 50) {
							JOptionPane.showMessageDialog(null, "I am ashamed to even have you in this family");
						} else {
							if (score2 < 50) {
								JOptionPane.showMessageDialog(null, "Wanna take a fun trip to the adoption center?!");
							}
						}
					}
				}
			}
		}
	}
}