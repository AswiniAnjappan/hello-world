import java.util.Scanner;

public class Largest {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int[] a=new int[3];
		for(int i=0;i<3;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
			if(a[i]<a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println("The maximum number: "+a[0]);
	}

}
