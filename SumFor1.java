import java.util.Scanner;

public class SumFor1 {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int x=s.nextInt();
		int sum=0;
		for(int i=0;i<=x;i++){
			sum+=i;
		}
		System.out.println("The sum : "+sum);
	}

}
