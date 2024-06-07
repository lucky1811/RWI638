package String;

public class FirstNonReapeted {
	 public static void main(String[] args) {
	        String str = "iamlakhanrathod";
	        char firstNonRepeatedChar = '\u0000'; 
	        
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            boolean repeated = false;
	           
	            for (int j = i + 1; j < str.length(); j++) {
	                char cl = str.charAt(j);
	                if (c == cl) {
	                    repeated = true;
	                    break;
	                }
	            }
	            
	            if (!repeated) {
	                firstNonRepeatedChar = c;
	                break;
	            }
	        }
	        
	        if (firstNonRepeatedChar != '\u0000') {
	            System.out.println("The first non-repeated character in the string \"" + str + "\" is: " + firstNonRepeatedChar);
	        } else {
	            System.out.println("No non-repeated character found in the string \"" + str + "\".");
	        }
	    }
}
