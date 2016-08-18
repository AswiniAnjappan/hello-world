import java.util.Scanner;

public class Addition1 {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=s.nextInt();
		System.out.println("Enter the elements: ");
		int[] elements=new int[x];
		for(int i=0;i<x;i++){
			elements[i]=s.nextInt();
		}
		for(int i=0;i<elements.length-1;i++){
			for(int j=i+1;j<elements.length;j++){
				if(((elements[i]+elements[j])==0)||((elements[i]+elements[j])==1)||((elements[i]+elements[j])==(-1)))
					System.out.println(elements[i]+","+elements[j]);
				}
			
		}

	}

}
