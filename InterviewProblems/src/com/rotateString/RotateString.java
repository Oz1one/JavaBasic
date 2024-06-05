package com.rotateString;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "Today is java day";
        String rotatedString = rotateString(originalString);
        System.out.println("Rotated String: "+rotatedString);
	}
	public static String rotateString(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        
        System.out.println("Current String elements");
        for(String element: words) {
        	System.out.println(element+", ");
        }
        // Create a new string to store the rotated string
        String rotated = "";
        
        // Iterate through the words array in reverse order and append each word to the rotated string
        for (int i = words.length - 1; i >= 0; i--) {
            rotated += words[i] + " ";
        }
        
        // Trim any trailing spaces
        return rotated.trim();
    }

}
