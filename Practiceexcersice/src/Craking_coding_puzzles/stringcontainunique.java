package Craking_coding_puzzles;

public class stringcontainunique {

	public static void main(String[] args) 
	{
		stringcontainunique.isUniqueChars("bhawna");
	}	
		
		 static boolean isUniqueChars(String str) { 
			//if (str.length() > 128) 
			//more than 256 chars means at least one is not unique
			   //please see first comment by @Domagoj as to why 256 length  refrence : http://www.ascii-code.com/
			//Basically, we use only 128 total character which is used mostly during program. But total number of Character in ASCII table is 256 (0 to 255). 0 to 31(total 32 character ) is called as ASCII control characters (character code 0-31). 32 to 127 character is called as ASCII printable characters (character code 32-127). 128 to 255 is called as The extended ASCII codes (character code 128-255).

//check reference: http://www.ascii-code.com/

//Most of the extended ASCII character isn't present in the QWERTY (ENGLISH) keyboard, so this is the reason, author took 128 total character in that example in "Cracking the coding interview" book.
			    if(str.length()>256) return false;  

			        //keeping an array to see which chars have been used
			        boolean[] char_set = new boolean[256];

			        //iterating over the string
			        for(int i=0; i<str.length();i++){

			            //not sure what language this is, but let's say it returns an
			            //int representation of the char
			            int val=str.charAt(i);
			            System.out.println(val);

			            //meaning this has been set to true before, so this char is not unique
			            if(char_set[val]) 
			                //nope, not unique
			                return false;

			            //remember this char for next time
			            char_set[val]=true;
			        } 

			    //if we reached here, then string is unique
			    return true;
			
		// TODO Auto-generated method stub

	}

}
