import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=s.nextInt();
		String str=String.valueOf(x);
		StringBuffer st=new StringBuffer(str);
		st.reverse();
		String str2=st.toString();
		if(str.equals(str2))
			System.out.println("The give number is a palindrome");
		else
			System.out.println("The given number is not a palindrome");

	}

}
