import java.util.Scanner;

public class AlphabetOrNot {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c=s.next().charAt(0);
		int x=(int)c;
		if((x>=65)&&(x<=90)||(x>=97)&&(x<=122))
			System.out.println("It is a character");
		else
			System.out.println("It is not a character");

	}

}
