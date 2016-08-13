import java.util.Scanner;

public class PrimeInterval {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two intervals: ");
		int x=s.nextInt();
		int y=s.nextInt();
		int count=0;
		if(x==1)
			System.out.println(x);
		x++;
		for(int i=x;i<=y;i++){
			count=0;
			for(int j=2;j<i;j++){
				if((i%j)==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		}
	}
}
