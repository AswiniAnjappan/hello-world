import java.util.Scanner;

public class StringreverseinPlace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String input="";
		input=s.nextLine();
		s.close();
		String[] inputs=input.split(" ");
		String output="";
		for(int i=0;i<inputs.length;i++){
			 StringBuffer str=new StringBuffer(inputs[i]);
			 str.reverse();
			 output+=str.toString()+" ";
			 
		}
		System.out.println(output);
	}

}
