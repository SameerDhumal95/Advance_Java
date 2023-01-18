package Arrays;

import java.util.Scanner;

public class InsertArray {

	public static void main (String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println ("enter the length");
		int length= sc.nextInt ();
		int arr [] =new int [length];
		System.out.println ("enter the "+length+" elements");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println ("length of array before inserting"+"‐‐‐>"+arr.length);
		for (int i=0; i<arr.length; i++)
		{
			System.out.println (i+"‐‐‐‐‐‐‐>"+arr[i]);
		}
		////////////////////////////////////////////////////////////////////////////
		System.out.println ("enter the index of specified position or index");
		int in=sc.nextInt ();
		System.out.println ("enter the element to replace to specified index");
		int ele=sc.nextInt ();
		arr=insert (arr ,in ,ele);
		for (int i=0; i<arr.length; i++)
		{
			System.out.println (i+"‐‐‐‐‐‐‐>"+arr[i]);
		}
	}
	static int [] insert (int a[],int in, int ele)
	{
		if (in>a.length||in<0)
		{
			System.out.println ("invalid index");
			return a;
		}
		else
		{
			int na [] = new int [a.length+1];
			for (int i= 0 ; i<in ;i++ )
			{
				na[i] = a[i];
			}
			na [in] =ele;
			for (int i= in; i<a.length; i++)
			{
				na [i+1] = a[i];
			}
			System.out.println ("length of array after inserting"+"‐‐‐>"+na.length);
			return na;
		}
	}

}
