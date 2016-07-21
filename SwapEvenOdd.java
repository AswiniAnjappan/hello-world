import java.util.Scanner;

public class a {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=s.next();
		StringBuffer str1=new StringBuffer(str);
		for(int i=0;i<str1.length()-1;i++){
			if((i%2)==0){
				char c=str1.charAt(i+1);
				str1.setCharAt(i+1, str1.charAt(i));
				str1.setCharAt(i, c);
			}
		}
		System.out.println(str1);
		}
	}
