import java.util.Scanner;

public class NoOftwos {

	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int x=s.nextInt();
	int count=0;
	while(x>=2){
		x=x-2;
		count++;
	}
System.out.println("The no of two's are: "+count);
	}

}
