package InterviewQuestions;



public class ReverseString {

	public static void main(String[] args) {
		

		String name = "Happy Diwali"; //length is 12
		
		String nstr="";
		char ch;
		
		for(int i=0;i<name.length()-1;i++) //index starts from 0
		{
			ch = name.charAt(i);
			nstr = ch + nstr;
		}
		System.out.print("After Reverse the String: "+nstr);	
		
		
	}
}
