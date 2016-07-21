import java.util.Scanner;

public class StringtoInteger {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		char[] c=new char[str.length()];
		int[] x=new int[c.length];
		String str1=" ";
		for(int i=0;i<c.length;i++){
			c[i]=str.charAt(i);
		}
		for(int i=0;i<c.length;i++){
			x[i]=(int)c[i];
		}
		for(int i=0;i<x.length;i++){
			str1+=x[i];
			
		}
	
		
		System.out.println("The string is: "+str+" and the integer value is : "+str1);
		
	}

}
