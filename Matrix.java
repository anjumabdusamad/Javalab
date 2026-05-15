import java.util.Scanner;

public class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows,columns;

		System.out.println("enter row: ");
		rows = sc.nextInt();

		System.out.println("enter column: ");
		columns = sc.nextInt();

		int a[][] = new int[rows][columns];
		int b[][] = new int[rows][columns];
		int c[][] = new int[rows][columns];

		System.out.println("matrix elements of A: ");
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				a[i][j] = sc.nextInt();

		System.out.println("matrix elements of B: ");
                for(int i=0;i<rows;i++)
                        for(int j=0;j<columns;j++)
                                b[i][j] = sc.nextInt();

		//addition

		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				c[i][j] = a[i][j] + b[i][j];


		System.out.println("the matrix is: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
			
		}
	}
}
