package _10_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinesslevel = 0;
	static String pet = "";

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showInputDialog(null, "What kind of pet you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 5; i++) {

		
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What will you do to make " + pet + " happy?",
				"Insert Title Here", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Food", "Walk", "Clean up Poop", "Cuddle" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
		if ((task) == 0) {
			Food();
		}
		if ((task) == 1) {
			Walk();
		}
		if ((task) == 2) {
			CleanupPoop();
		}
		if ((task) == 3) {
			Cuddle();
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that they loves their pet and use break; to exit for loop.
		if (happinesslevel >= 50) {
			JOptionPane.showMessageDialog(null,
					"Great news! You love " + pet + " , but i'm not sure if " + pet + " loves you.");
		break;
		}
		}
		}
		
	

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void Food() {
		happinesslevel -= 5;
		JOptionPane.showMessageDialog(null, "I think youre supposed to feed " + pet + " animal food ");

	}

	static void Walk() {
		happinesslevel -= 10;
		JOptionPane.showMessageDialog(null, "Maybe next time bring a leash");

	}

	static void CleanupPoop() {
		happinesslevel -= 15;
		JOptionPane.showMessageDialog(null, "Ewww! What did you feed " + pet);

	}

	static void Cuddle() {
		happinesslevel += 20;
		JOptionPane.showMessageDialog(null, "That's very sweet");

	}

}
