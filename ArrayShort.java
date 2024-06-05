package array;

import java.util.Scanner;

public class ArrayShort {
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n ;
			Scanner sc = new Scanner(System.in);
			n= sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
			    a[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
		}

}