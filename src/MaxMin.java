//find max and mini number from an array

import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter length of an array:");
		
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements:");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
         int max=a[0];
		for(int i=0;i<n;i++)
		{
			
		if(max<a[i])
		{
			max=a[i];
		}
		}
		System.out.println("maximum number:");
		System.out.println(max);
		
		 int min=a[0]; 
			for(int i=0;i<n;i++)
			{
				
			if(min>a[i])
			{
				min=a[i];
			}
			}
			System.out.println("minimum number:");
			System.out.println(min);

	}

}
