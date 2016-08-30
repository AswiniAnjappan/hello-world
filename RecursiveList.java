import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RecursiveList {
	static List<Integer> li=new ArrayList<Integer>();
	static Stack<Integer> st=new Stack<Integer>();
	static int count=0;
	public static void reverse(int x){
		if(count<=li.size()){
			st.push(li.remove(x));
			count++;
			reverse(0);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int x=s.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<x;i++){
			li.add(s.nextInt());
		}
		reverse(0);
		System.out.println("The reverse element is: ");
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}

}
