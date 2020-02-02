package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int days = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (days == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "get up lazybones!");
		} else {
			if (days == JOptionPane.YES_OPTION) {
				int vacay = JOptionPane.showConfirmDialog(null, "Are we on vacation?", "Sleepy Head",
						JOptionPane.YES_NO_OPTION);
				if (vacay == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "sleep in");
				} else {
					if (vacay == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null, "get up lazybones!");

					}
					/*
					 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
					 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
					 * in�?.
					 */
				}
			}
		}
	}
}