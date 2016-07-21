import java.util.Scanner;

public class CamelCase {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.nextLine();
		String[] str1=str.split(" ");
		String str2="";
		
		for(int i=0;i<str1.length;i++){
			String x=str1[i].substring(0, 1).toUpperCase();
			String y=str1[i].substring(1, str1[i].length()).toLowerCase();
			str1[i]=x+y;
			
		}
	
	for(int i=0;i<str1.length;i++){
		str2+=str1[i]+" ";
	}
	System.out.print(str2);
	}

}
