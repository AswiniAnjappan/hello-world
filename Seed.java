import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = s.nextInt();
		int p=1,sum=0,count=0;
		String str=x+"";
		String y = "1";
		if (str.length() == 1) {
			System.out.println("The given number length is one cannot find the seed");
		} else {
			for (int i = 0; i < str.length()-1 ; i++) {
				y += 0;
			}
			int z = Integer.parseInt(y);
			for(int i=z;i<x/2;i++){
				p=i;sum=i;
				while(i!=0){
					p*=i%10;
					i=i/10;
				}i=sum;
				if(p==x){
					count++;
					System.out.println("The seed is: "+i);
					break;
				}
			}
			if(count==0){
				System.out.println("No seed for the given element");
			}
		}
		

	}

}
