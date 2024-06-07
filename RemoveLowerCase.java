package String;

import java.util.Iterator;

public class RemoveLowerCase {
  public static void main(String[] args) {
	String str="I am Lakhan And Right Now I aM working IN RailWorldIndia";
	String str1=" ";
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		
		if(Character.isUpperCase(c))
		{
			str1=str1+c;
		}
	}
	System.out.println(str1);
}
}
