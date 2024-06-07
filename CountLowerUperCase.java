package String;

public class CountLowerUperCase {
	public static void main(String[] args) {
		 String str = "Hello Pooja I am Lakhan Rathod From Indore ";
	      
	        int upperCount = 0;
	        int lowerCount = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (Character.isUpperCase(ch)) {
	                upperCount++;
	            } else if (Character.isLowerCase(ch)) {
	                lowerCount++;
	            }
	        
	          }
	        System.out.println("Uppercase  count: " + upperCount);
	        System.out.println("Lowercase  count: " + lowerCount);
}  
}