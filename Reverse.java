import java.util.Scanner;

public class Reverse {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string: ");
		String str=s.next();
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		System.out.println(str1);
		

	}

}
