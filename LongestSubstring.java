import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=s.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			StringBuffer input=new StringBuffer(str);
			String str1=input.deleteCharAt(i).toString();
			StringBuffer input2=new StringBuffer(str1);
			input2.reverse();
			if(str1.equalsIgnoreCase(input2.toString())){
				System.out.println(str1);
				count++;
			}
		}
		if(count==0){
			System.out.println("There is no any substring as palindrome.");
		}
	}

}
