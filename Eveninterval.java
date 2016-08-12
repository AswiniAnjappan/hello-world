import java.util.Scanner;

public class Eveninterval {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two intervals: ");
		int x=s.nextInt();
		int y=s.nextInt();
		for(int i=x;i<=y;i++){
			if((i%2)==0)
				System.out.println(i);
		}


	}

}
