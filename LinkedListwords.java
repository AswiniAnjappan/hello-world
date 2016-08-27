import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListwords{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input=s.next();
		List<Character> li=new LinkedList<Character>();
		for(int i=0;i<input.length();i++){
			li.add(input.charAt(i));
		}
		Iterator ir=li.iterator();
		String word="";
		while(ir.hasNext()){
			word+=ir.next();
		}
		StringBuffer word1=new StringBuffer(word);
		word1.reverse();
		String reverse=word1.toString();
		if(word.equalsIgnoreCase(reverse)){
			System.out.println("The given string is palindrome");
		}
		else{
			System.out.println("The given string is not a palindrome");
		}
	}
}
