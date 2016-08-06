import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=s.nextInt();
		String str=String.valueOf(x);
		int count=0;
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println("The number of digits in the number: "+count);
	}

}
