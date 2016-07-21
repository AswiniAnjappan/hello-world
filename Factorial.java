import java.util.Scanner;

public class Activity4 {
	public int fact(int n){
		if(n>=0)

			return n*fact(n-1);
		
		else
		
			return 1;
		
			
		
	}
	
	public static void main(String[] args) {
		Activity4 act=new Activity4();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number: ");
		int x=s1.nextInt();
		System.out.println("the factorial of the number is :"+act.fact(x));

	}
