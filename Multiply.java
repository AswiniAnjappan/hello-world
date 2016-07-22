import java.util.Scanner;

public class Multiply {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		String str=s.next();
		String str1=s.next();
		String str2=" ";
		long x=Integer.parseInt(str);
		long y=Integer.parseInt(str1);
		long z=x*y;
		str2=Long.toString(z);
		System.out.println(str2);

	}

}
