package InterviewQuestions;

public class RevSentense {

	public static void main(String[] args) {
		
		/*Reverse the Sentence*/
		 String s = "ram and laxman"; 
		 String str[]=s.split(" ");
	     
		 String ans = ""; 
	      for (int i = str.length-1; i >=0 ; i--) { 
	        ans = ans + str[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 

	}
}
