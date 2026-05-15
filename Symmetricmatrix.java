import java.util.Scanner;

class Symmetricmatrix{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);

		int rows,columns;
		boolean isSymmetric = true;

		System.out.println("enter row: ");
		rows = sc.nextInt();

		System.out.println("enter column: ");
		columns = sc.nextInt();

		if(rows != columns){
			System.out.println("not a symmetric matrix!!!");
			return;
		}

		int arr[][] =new int[rows][columns];
                int t[][] =new int[rows][columns];


		System.out.println("enter matrix elememnts: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				arr[i][j] = sc.nextInt();
			}
		}

		//transpose

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				t[j][i] = arr[i][j];
			}
		}



		//comparison

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if(arr[i][j]!=t[i][j]){
					isSymmetric = false;
					break;
				}
			}
		}

		
		if(isSymmetric)
			System.out.println("matrix is symmetric.");
		else
			System.out.println("matrix is not symmetric.");
	}
}
