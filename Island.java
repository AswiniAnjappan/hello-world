import java.util.Scanner;

public class Island {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two limits of a two dimensional array: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int[][] map = new int[x][y];
		int count = 0;
		System.out.println("Enter the elements:");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int z = s.nextInt();
				if ((z == 0) || (z == 1))
					map[i][j] = z;
				else {
					System.out.println("Enter only 0 and 1");
					System.exit(0);
				}
			}
		}
		for (int i = 0; i < x - 1; i++) {
			for (int j = 0; j < y - 1; j++) {
				if ((i == 0) && (j == 0)) {
					if (((map[i][j])*(map[i + 1][j]))==1)
						count++;
					if (((map[i][j])*(map[i][j + 1]))==1)
						count++;
				}
				else if((i==0)&&(j!=0)){
					if (((map[i][j])*(map[i + 1][j]))==1)
						count++;
					if (((map[i][j])*(map[i][j + 1]))==1)
						count++;
					if (((map[i][j])*(map[i][j - 1]))==1)
						count++;
				}
				else if((i!=0)&&(j==0)){
					if (((map[i][j])*(map[i + 1][j]))==1)
						count++;
					if (((map[i][j])*(map[i][j + 1]))==1)
						count++;
					if (((map[i][j])*(map[i - 1][j]))==1)
						count++;
				}
				else {
					if (((map[i][j])*(map[i + 1][j]))==1)
						count++;
					if (((map[i][j])*(map[i][j + 1]))==1)
						count++;
				}
			}
		}
		System.out.println("The number of islands in the given map is: "
				+ count);
	}

}
