package Assg_2;

/*Author: Somthirtha Bhowmik.
 * Roll: 003.
 * Semester 1.
 */

/*Write a program to find the elements, a [i, j] in a two-dimensional array which are
maximum element to the ith row and jth column.*/
import java.util.Scanner;
public class Prog_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner object.
		System.out.println("Enter number of rows!");
		int m=sc.nextInt(); //Inputs number of rows.
		System.out.println("Enter number of columns!");
		int n=sc.nextInt(); //Inputs number of columns.
		int a[][]=new int[m][n];
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.println("Enter an element!");
				a[i][j]=sc.nextInt(); //Input each element.
			}
		}
		for(int i=0; i<m; i++)
		{
			int max=-99999; //Accumulator variable.
			for(int j=0; j<n; j++)
			{
				if(a[i][j]>max) //Condition for row max check.
					max=a[i][j];
			}
			//Printing greatest element in each row.
			System.out.println("Greatest element in row "+(i+1)+":"+max);
		}
		for(int i=0; i<n; i++)
		{
			int max=-99999;
			for(int j=0; j<m; j++)
			{
				if(a[j][i]>max) //Condition for column max check.
					max=a[j][i];
			}
			//Printing greatest element in each column.
			System.out.println("Greatest element in column"+(i+1)+":"+max);
		}
		sc.close(); //Closing Scanner object.
	}

}
/*Output:
Enter number of rows!
5
Enter number of columns!
4
Enter an element!
1
Enter an element!
2
Enter an element!
3
Enter an element!
4
Enter an element!
1
Enter an element!
2
Enter an element!
3
Enter an element!
4
Enter an element!
1
Enter an element!
2
Enter an element!
3
Enter an element!
4
Enter an element!
1
Enter an element!
2
Enter an element!
3
Enter an element!
4
Enter an element!
1
Enter an element!
2
Enter an element!
3
Enter an element!
4
Greatest element in row 1:4
Greatest element in row 2:4
Greatest element in row 3:4
Greatest element in row 4:4
Greatest element in row 5:4
Greatest element in column1:1
Greatest element in column2:2
Greatest element in column3:3
Greatest element in column4:4
*/