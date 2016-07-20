

import java.util.Scanner;

public class Positiveornegative {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int x=s.nextInt();
		if(x<0){
			System.out.println("negative");
		}
		else if(x>0){
			System.out.println("positive");
		}
		else if(x==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("invalid number");
		}

	}

}
