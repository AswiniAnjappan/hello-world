import java.util.Scanner;

public class Binary {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int x=s.nextInt();
		System.out.println("Enter the elements: ");
		int[] y=new int[x];
		int[] z=new int[x];
		int count=0;
		for(int i=0;i<x;i++){
			y[i]=s.nextInt();
		}
		for(int i=0;i<y.length;i++){
			count=0;
			String str=Integer.toString(y[i], 2);
			for(int j=0;j<str.length();j++){
				if('1'==str.charAt(j))
					count++;
			}
			z[i]=count;
		}
		for(int i=0;i<z.length-1;i++){
			for(int j=i+1;j<z.length;j++){
				if(z[i]<z[j]){
					int temp=z[i];
					z[i]=z[j];
					z[j]=temp;
					int temp1=y[i];
					y[i]=y[j];
					y[j]=temp1;
				}
			}
		}
		for(int i=0;i<y.length;i++){
			System.out.println(y[i]);
		}
	}

}
