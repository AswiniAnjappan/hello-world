import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Gift {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit for the two dimensional array: ");
		int x=s.nextInt();
		int y=s.nextInt();
		int[][] matrix=new int[x][y];
		char c = 0;
		TreeMap<Character,List<Integer>> map=new TreeMap<Character, List<Integer>>();
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.println("Enter whether it is a gift(y/n): ");
				c=s.next().charAt(0);
				System.out.println("Enter the element: ");
				int value=s.nextInt();
				matrix[i][j]=value;
				if((c=='y')&&!(map.containsKey(c))){
					map.put(c,new ArrayList<Integer>() );
				}
				if((c=='y'))
				map.get(c).add(value);
				
			}
		}
		ArrayList<Integer> aa=new ArrayList<Integer>();
		aa.addAll(map.get(map.firstKey()));
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		Iterator<Integer> ir=aa.iterator();
		int result=0;
		while(ir.hasNext()){
			result+=ir.next();
		}
		System.out.println("The maximum gift value is: "+result);
	}

}
