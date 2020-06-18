package package2;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n;
		int i=0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		long F[]=new long[n+1];
		F[0]=0;
		F[1]=1;
		
		for(i=2;i<=n;i++){
			F[i]=F[i-1]+F[i-2];
		}
		--i;
		System.out.println(i+"th Fibonacci Number is "+F[i]);
	}
}
