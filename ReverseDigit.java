import java.util.Scanner;

public class ReverseDigit {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=s.nextInt();
		int y=0;
		String str=" ";
		while(x!=0){
			y=x%10;
			str=str+y;
			x=x/10;
		}
		System.out.println(str);
	}

}
