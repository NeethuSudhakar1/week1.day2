package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			char ch= test.charAt(i);
			if(i%2==0) {
					
					ch= Character.toUpperCase(ch);
					System.out.print(ch);
				}
					
			else {
				
				ch= Character.toLowerCase(ch);
				System.out.print(ch);
			}
		}

	}

}