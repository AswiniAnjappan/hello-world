import java.util.Scanner;

public class SumupTarget {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int x=s.nextInt();
		int[] y=new int[x];
		System.out.println("Enter the elements: ");
		for(int i=0;i<x;i++){
			y[i]=s.nextInt();
		}
		System.out.println("Enter the target value: ");
		int z=s.nextInt();
		for(int i=0;i<y.length-1;i++){
			if((y[i]+y[i+1])==z){
				System.out.println("The first number is: "+y[i]);
				System.out.println("The second number is: "+y[i+1]);
			}
				
		}
	}

}
