package InterviewQuestions;

import java.util.Scanner;

public class StrCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		int count = 0; char ch;
		for(int i=0;i<str.length()-1;i++)
		{
			ch = str.charAt(i);
			if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
			{
				count++;
			}
		}
		System.out.println("No. of Charactors = "+count);
		System.out.println("String length : "+str.length());
	}
}
