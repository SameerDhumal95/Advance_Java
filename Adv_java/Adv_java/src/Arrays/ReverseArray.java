package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length = sc.nextInt();
		
		int arr[]= new int[length];
		
		System.out.println("Enter the elements:");
		
		for(int j=0;j<=arr.length-1;j++)
		{
			arr[j]=sc.nextInt();
		}
		
		System.out.println("After reverse the array:");
		
		for(int i=arr.length-1 ; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
