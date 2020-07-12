//wap to sum all elements of an array and calculate average

import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];

		   System.out.println("enter numbers into an array:");
		for(int i=0;i<a.length;i++)
		{
		   
		    a[i]=sc.nextInt();
		}
		int sum = 0; float average;
		System.out.println("sum of array elements");
		for(int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];
			
		}
			System.out.println(sum);
			System.out.println("average is:");
			
			average=(float)sum/a.length;
			System.out.println( average); 

	}

}
  