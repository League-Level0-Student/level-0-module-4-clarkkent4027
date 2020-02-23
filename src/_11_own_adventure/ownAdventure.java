package _11_own_adventure;

import javax.swing.JOptionPane;

public class ownAdventure {
	public static void main(String[] args) {
		int task = JOptionPane.showOptionDialog(null,
				"The Joker and Riddler have escaped Arkham Asylum! What do you do?", "Batman and the Joker", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Send Robin", "Go Yourself", "Send Batgirl" },
				null);

		if ((task) == 0) {
			Robin();
		}
		if ((task) == 1) {
			Batman();
		}
		if ((task) == 2) {
			Batgirl();
		}

	}

	static void Robin() {
		int saving = JOptionPane.showOptionDialog(null,
				"Robin gets trapped by the Riddler and he is giving Batman one hour to come rescue him. Meanwhile, the Joker has rigged the Gotham City Bank to explode in one hour. Who do you go after?",
				"Robin or Bank", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Go to Save Robin", "Go to Stop The Joker" }, null);
		
		if((saving)==0)

		{
			Saving();
		}if((saving)==1)
		{
			Joker();
		}
	}
static void Saving() {
JOptionPane.showMessageDialog(null, "You take down the Riddler, free Robin, and call for backup. Then, you all rush over to the Bank, take out The Joker, and disarm the explosives with seconds to spare. The Bat-Family wins once again!  ");
}
static void Joker() {
JOptionPane.showMessageDialog(null, "You choose to go after The Joker. You take him down and disarm the bombs with ten minutes to spare. But, the Riddler escapes once again after freeing Robin. You lost.");
}
	
	
	static void Batman() {
		int hideout = JOptionPane.showOptionDialog(null,
				"You manage to catch The Riddler and put him back in jail, but The Joker has run away! Where do you go to catch him?",
				"Missing Joker", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Joker's Funhouse", "The Riddler's Hideout" }, null);
		if((hideout)==0)

		{
			Funhouse();
		}if((hideout)==1)
		{
			Hideout();
		}
	}
	static void Funhouse() {
		JOptionPane.showMessageDialog(null, "Your instinct tells you that Joker has fleed to his Funhouse. You make a surprise entrance into the Funhouse and find Joker making more explosives. You put him back into jail before he can run away. Batman has won once again!  ");
		}
		static void Hideout() {
		JOptionPane.showMessageDialog(null, "Your instinct tells you that Joker has fleed to the Riddler's hideout to carry out their plan. After you make a surprise entrance, you are greeted with hundreds of explosives about to go off. You've been outsmarted this time. You lost.");
		}
static void Batgirl() {
int backup = JOptionPane.showOptionDialog(null, "Batgirl catches The Joker and puts him in Arkham, but The Riddler frees The Penguin and they split up! Who does Batgirl call for backup?",
			"Backup needed", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Nightwing and Robin",  "Batman" }, null);
if((backup)==0)

{
	NightwingandRobin();
}if((backup)==1)
{
	Batman2();
}

}
static void NightwingandRobin() {
	JOptionPane.showMessageDialog(null, "Nightwing and Robin arrive as soon as you call. The two villians don't make it very far and the three of you split up and take them down before they can cause trouble. Bat-Family for the win!");
	}
	static void Batman2() {
	JOptionPane.showMessageDialog(null, "Batman gets your call for help and goes to get the Batmobile. He is greeted with a surprise, The Penguin has stoled the Batmobile and frees everyone else at Arkham. You lost this time.");
	}

}