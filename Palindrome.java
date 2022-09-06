package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String test1 ="madam";
		String rev= "";
		char[] charArray = test1.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			rev =rev+test1.charAt(i);
		}
		if(test1.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			
			System.out.println("Not a Palindrome");
		}
	}

}
