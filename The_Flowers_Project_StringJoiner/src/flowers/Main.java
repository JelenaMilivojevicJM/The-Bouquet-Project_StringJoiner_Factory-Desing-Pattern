package flowers;

import java.util.StringJoiner;
/* Explanation of the code:
 * This code uses StringJoiner to concatenate arrays of strings with commas as delimiters.
 * It also uses a method, countDelimiters(), to calculate the total number of delimiters in a StringJoiner.
 * Finally, it prints all strings from StringJoiner, the total number of strings, the total number of delimiters, and the number of delimiters divided by 2. 
 * The code merges two StringJoiner objects, joinRoses and joinDaisy, into a new StringJoiner object named together using the merge() method. 
 * The merge() method adds the contents of the second StringJoiner (in this case, joinDaisy) to the first one (joinRoses) without prefix and suffix as the next element.
 * After merging, it prints out the contents of the 'together' object, which now contains all the strings from both joinRoses and joinDaisy.
 * Then, it converts the 'together' object to a string and splits it into an array of strings based on the delimiter (comma in this case). 
 * The length of this array gives the total number of flowers, which is then printed out. */

public class Main {
	// Here’s a line-by-line explanation:
	public static double countDelimiters(StringJoiner joiner, String delimiter) {
		// Method that counts how many times the delimiter appears in the StringJoiner
		// Converts the StringJoiner to a string
		String output = joiner.toString();
		// Counter for delimiters
		int counter = 0;
		// Loops through each character in the string
		for (int i = 0; i < output.length(); i++) {
			// Checks if the current character is a delimiter
			if (output.substring(i, i + delimiter.length()).equals(delimiter)) {
				// If it is, increments the counter
				counter++;
			}
		}
		// Returns the total number of delimiters
		return counter;

	}

	public static void main(String[] args) {
		// Creating a StringJoiner with a comma as the delimiter
		StringJoiner joinRoses = new StringJoiner(",");
		joinRoses.add("White Rose");
		joinRoses.add("Red Rose");
		joinRoses.add("Lila Rose");
		joinRoses.add("Yellow Rose");
		joinRoses.add("Blue Rose");
		joinRoses.add("Pink Rose");
		// Printing the strings from the StringJoiner and the number of strings
		System.out.println("****Roses****");
		System.out.println(joinRoses);
		String outputR = joinRoses.toString();
		String[] stringsR = outputR.split(",");
		int rosesNum = stringsR.length;
		System.out.println("Number of Roses:" + rosesNum);

		// Calculating and prints the total number of delimiters and the number of
		// delimiters divided by 2
		double totalDelimitersR = countDelimiters(joinRoses, ",");
		System.out.println("Total Rose Delimiters: " + totalDelimitersR);

		int devidedBy2R = (int) Math.ceil(totalDelimitersR / 2);
		System.out.println("Total Rose Delimiters devided by 2 (and rounded to high number): " + devidedBy2R);

		// Creating another StringJoiner - Another group of flowers
		StringJoiner joinDaisies = new StringJoiner(",");
		// Adding strings
		joinDaisies.add("White Daisy");
		joinDaisies.add("Red Daisy");
		joinDaisies.add("Lila Daisy");
		joinDaisies.add("Yellow Daisy");
		joinDaisies.add("Blue Daisy");

		// Printing the strings from the second StringJoiner and the number of strings
		System.out.println("****Daisy****");
		System.out.println(joinDaisies);

		String outputD = joinDaisies.toString();
		String[] stringsD = outputD.split(",");
		int daisyNum = stringsD.length;
		System.out.println("Number of Daisies:" + daisyNum);

		// Calculating and prints the total number of delimiters and the number of
		// delimiters divided by 2
		double totalDelimitersD = countDelimiters(joinDaisies, ",");
		System.out.println("Total Daisy Delimiters: " + totalDelimitersD);

		int devidedBy2D = (int) Math.ceil(totalDelimitersD / 2);
		System.out.println("Total Daisy Delimiters devided by 2 (and rounded to high number): " + devidedBy2D);

		// Merging two StringJoiners, prints the result and the total number of strings
		StringJoiner together = joinRoses.merge(joinDaisies);
		// Prints out all strings from both joinRoses and joinDaisy
		System.out.println("THE WHOLE FILED FULL OF FLOWERS:");
		System.out.println(together);

		// Converts together to a string
		String outputT = together.toString();
		// Splits the string into an array based on comma
		String[] stringsT = outputT.split(",");
		// Gets the length of the array (total number of flowers)
		int togetherNum = stringsT.length;
		System.out.println("Total Number of flowers: " + togetherNum);
	}

}

