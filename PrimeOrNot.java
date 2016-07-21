import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to find a prime number: ");
		int x=s.nextInt();
		for(int i=1;i<=x;i++){
			if((x%i)==0)
				count++;
		}
		if(count==2)
			System.out.println("the given number is a prime number");
		else
			System.out.println("the given number is not a prime number");

	}

}
