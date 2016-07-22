import java.util.Scanner;

public class Count {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=s.nextInt();
		int y=0,sum=0;
		int count=0;
		while(x!=0){
			y=x%10;
			sum=sum+y;
			count++;
			x=x/10;
		}
		System.out.println("The numbers are: "+count);
	}

}
