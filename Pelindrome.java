package String;

public class Pelindrome {
public static void main(String[] args) {
    int r=0;
	int n=121;
	int t=n;
	int v=0;
	while(n>0)
	{
		r=n%10;
		v=(v*10)+r;
		n=n/10;
	}
	n=t;
	if(v==t)
	{
		System.out.println("Pelindrom "+n);
	}else
	{
		System.out.println("Not Pelindrome");
	}
}
}
