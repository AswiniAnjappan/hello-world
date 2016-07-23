import java.util.Scanner;

public class OrderString {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=s.nextLine();
		String str2=" ";
		String[] str1=str.split(" ");
		
		for(int i=0;i<str1.length;i++){
			if((i%2)==0){
				StringBuffer buff=new StringBuffer(str1[i]);
				buff.reverse();
				str2+=buff+" ";
			}else{
				str2+=str1[i]+" ";
			}
			
		}
		System.out.println("The reversed String is: "+str2);

	}

}
