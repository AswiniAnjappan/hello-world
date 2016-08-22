import java.util.Scanner;

public class Tallest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the height of 50 students: ");
		int[] a = new int[50];
		for (int i = 0; i < 50; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Enter the kth position of the student to find thier height: ");
		int x=s.nextInt();
		System.out.println("The kth position of the student and their corresponding height is: "+(a[x-1]));
		
		
	}

}
