package String;

import java.util.Iterator;

public class ReverseString {
   public static void main(String[] args) {
	
	   String str="hello Piyu";
	   String s1=" ";
	   
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   char c=str.charAt(i);
		   s1=s1+c;
	   }
	   System.out.println(s1);
}
}
