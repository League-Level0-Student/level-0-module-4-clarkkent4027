package _99_extra;

import java.util.Random;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
String variable = "WhaTevErYouWAnT";
		// 2. Print your String to the console in upper case.
System.out.println("WHATEVERYOUWANT");
		// 3. Print your String to the console in lower case.
System.out.println("whateveryouwant");
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
System.out.println(variable.substring(0, 3));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
System.out.println(variable.charAt(6));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
System.out.println(variable.subSequence(12, 15));
	}
}
