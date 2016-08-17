import java.util.Scanner;

public class List {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=s.nextInt();
		int y=0;
		int[] sum=new int[(int) (Math.log10(x)+1)];
		int l=0;
		while(x!=0){
			y=x%10;
			sum[l]=y;
			x=x/10;
			l++;
		}
		for(int i=0;i<sum.length;i++){
			for(int j=i+1;j<sum.length;j++){
				if(sum[i]>sum[j]){
					int temp=sum[i];
					sum[i]=sum[j];
					sum[j]=temp;
				}
			}
		}
		System.out.println("The least possible two digit after deleting is: "+sum[0]+sum[1]);
	}

}
