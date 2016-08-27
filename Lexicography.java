import java.util.Scanner;

public class Lexicogarphy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=s.next();
		String output="";
		for(int i=0;i<input.length()-1;i++){
			int y=input.charAt(i+1)-input.charAt(i);
			if(y>0){
				output=input.substring(i+1);
				break;
			}
		}
		if(output.length()==0){
			System.out.println("There is no lexicographical substring");
		}
		else
		{
			System.out.println("the lexicographical substring is: "+output);
		}
	}

}
