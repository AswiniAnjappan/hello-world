import java.util.Scanner;

public class UniqueInteger1 {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of array elements: ");
		int x=s.nextInt();
		int count=0;
		int[] a=new int[x];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<x;i++){
			a[i]=s.nextInt();
		}
		int[] m=new int[x];
		int[] b=new int[x];
		for(int i=0;i<x;i++){
			m[i]=a[i];
		}
		for(int i=0;i<a.length;i++){
			count=0;
			for(int j=0;j<m.length;j++){
			if(a[i]==m[j]){
				count++;
			}
			}
			b[i]=count;
			
		}
		for(int i=0;i<b.length;i++){
			if(b[i]==1){
				System.out.println(a[i]);
			}
		}
	}

}
