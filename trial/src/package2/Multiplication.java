//Taking a product of 2 maximum numbers taken from an array .....

package package2;

import java.util.ArrayList;
import java.util.Scanner;


public class Multiplication {
	 
	public static int index1;
	
	public static int maximumNumber1(ArrayList<Integer> numbers,int count) {
		
		int maxNumber1=0;
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				if(numbers.get(j)>maxNumber1) {
					index1 = j;
					maxNumber1=numbers.get(j);
				}
			}
		}
		
		return maxNumber1;
	}
	
	public static int maximumNumber2(ArrayList<Integer> numbers,int count) {
		
		int maxNumber2=0;
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				if((numbers.get(j)>maxNumber2) && j!=index1 ) {
					maxNumber2=numbers.get(j);
				}
			}
		}
		
		return maxNumber2;
	} 
	
	
	public static void main(String[] args) {
		int n,num;
		System.out.print("Enter the count : ");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter the number : ");
		for(int i=0;i<n;i++) {
			num=input.nextInt();
			numbers.add(num);
		}
		
		System.out.println("Array of numbers : "+numbers);
		
		int maxNumberInt1 = maximumNumber1(numbers,n);
		long maxNumberLong1 = maxNumberInt1;	//Promoted to type "long"
		System.out.println("Max Number1 : "+maxNumberLong1);
		
		int maxNumberInt2 = maximumNumber2(numbers,n);
		long maxNumberLong2 = maxNumberInt2;	//Promoted to type "long"
		System.out.println("Max Number1 : "+maxNumberLong2);
		
		long product = maxNumberLong1*maxNumberLong2;
		System.out.println("Product of Maximum Number pair : "+product);
	}
}
