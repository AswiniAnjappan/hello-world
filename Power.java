import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int x=s.nextInt();
		System.out.println("Enter the power of the number: ");
		int y=s.nextInt();
		int z=1;
		for(int i=1;i<=y;i++){
			z*=x;
		}
		System.out.println(z);
	}

}
