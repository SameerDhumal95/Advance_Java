package InterviewQuestions;

public class parsing {
public static void main(String[] args) {
	String num = "158";
	int n = 0;
	for(int i=0;i<num.length();i++)
	{
		n = 10 * n + ((int)num.charAt(i)-48);
	}
	System.out.println(n);
}
}
