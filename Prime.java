import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = s.nextInt();
		int count = 0;
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0)
				count++;
		}
		if(count>=1)
			System.out.println("The given number is not prime");
		else
			System.out.println("The given number is a prime");

	}

}
