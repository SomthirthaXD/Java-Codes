package Assg_2;

/*A company has four salespeople (1 to 4) who sell five different products (1 to 5). Once a
day, each salesperson passes in a slip for each different type of product sold. Each slip
contains:
* The salesperson number
* The product number
* The total dollar value of that product sold that day

Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the
information from all of the slips for last month is available. Write a program that will
read all this information for last month’s sales and summarize the total sales by
salesperson by product. All totals should be stored in the double-subscripted array sales.
After processing all the information for last month, print the results in tabular format with
each of the columns represent a particular salesperson and each of the rows representing a
particular product. Cross total each row to get the total sales of each product for last
month, and cross total each column to get the total sales by salesperson for last month.
Your tabular printout should include these cross totals to the right of the totaled rows and
to the bottom of the totaled columns.*/

/*Author: Somthirtha Bhowmik.
Roll: 003.
Semester: 1.*/

import java.util.Scanner;
public class Prog_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner object.
		System.out.println("Enter number of days in the concerned month!");
		int n=sc.nextInt(); // Number of days taken as input.
		int arr[][][]=new int[4][5][n]; //Triple scripted array allocated.
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<5; j++)
			{
				for(int k=0; k<n; k++)
				{
					System.out.println("Enter sale of product "+(j+1)+" by salesman "+(i+1)+" on day "+(k+1));
					arr[i][j][k]=sc.nextInt(); //Sales per day for each salesperson being taken as input.
				}
			}
		}
		for(int i=0; i<4; i++)
		{
			int sumr=0, sumc=0;
			System.out.println("Performance of Salesman "+(i+1));
			for(int j=0; j<5; j++)
			{
				for(int k=0; k<n; k++)
				{
					sumr+=arr[i][j][k];
					System.out.print(arr[i][j][k]+" "); //Row-wise total sale being calculated.
				}
				System.out.print(sumr);
				System.out.println(); //Line break.
			}
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<5; k++)
					sumc+=arr[i][k][j]; //Column-wise total sale being calculated.
				System.out.print(sumc+" ");
				sumc=0;
			}
			System.out.println(); //Line break.
		}
		sc.close(); //Closing the Scanner object.
	}
}
/*Output:
Enter number of days in the concerned month!
5
Enter sale of product 1 by salesman 1 on day 1
1
Enter sale of product 1 by salesman 1 on day 2
2
Enter sale of product 1 by salesman 1 on day 3
3
Enter sale of product 1 by salesman 1 on day 4
4
Enter sale of product 1 by salesman 1 on day 5
5
Enter sale of product 2 by salesman 1 on day 1
1
Enter sale of product 2 by salesman 1 on day 2
2
Enter sale of product 2 by salesman 1 on day 3
3
Enter sale of product 2 by salesman 1 on day 4
4
Enter sale of product 2 by salesman 1 on day 5
5
Enter sale of product 3 by salesman 1 on day 1
1
Enter sale of product 3 by salesman 1 on day 2
2
Enter sale of product 3 by salesman 1 on day 3
3
Enter sale of product 3 by salesman 1 on day 4
4
Enter sale of product 3 by salesman 1 on day 5
5
Enter sale of product 4 by salesman 1 on day 1
1
Enter sale of product 4 by salesman 1 on day 2
2
Enter sale of product 4 by salesman 1 on day 3
3
Enter sale of product 4 by salesman 1 on day 4
4
Enter sale of product 4 by salesman 1 on day 5
5
Enter sale of product 5 by salesman 1 on day 1
1
Enter sale of product 5 by salesman 1 on day 2
2
Enter sale of product 5 by salesman 1 on day 3
3
Enter sale of product 5 by salesman 1 on day 4
4
Enter sale of product 5 by salesman 1 on day 5
5
Enter sale of product 1 by salesman 2 on day 1

1
Enter sale of product 1 by salesman 2 on day 2
2
Enter sale of product 1 by salesman 2 on day 3
3
Enter sale of product 1 by salesman 2 on day 4
4
Enter sale of product 1 by salesman 2 on day 5
5
Enter sale of product 2 by salesman 2 on day 1
1
Enter sale of product 2 by salesman 2 on day 2
2
Enter sale of product 2 by salesman 2 on day 3
3
Enter sale of product 2 by salesman 2 on day 4
4
Enter sale of product 2 by salesman 2 on day 5
51
Enter sale of product 3 by salesman 2 on day 1
2
Enter sale of product 3 by salesman 2 on day 2
3
Enter sale of product 3 by salesman 2 on day 3
4
Enter sale of product 3 by salesman 2 on day 4
5
Enter sale of product 3 by salesman 2 on day 5
1
Enter sale of product 4 by salesman 2 on day 1
2
Enter sale of product 4 by salesman 2 on day 2
3
Enter sale of product 4 by salesman 2 on day 3
4
Enter sale of product 4 by salesman 2 on day 4
5
Enter sale of product 4 by salesman 2 on day 5
1
Enter sale of product 5 by salesman 2 on day 1
2
Enter sale of product 5 by salesman 2 on day 2
3
Enter sale of product 5 by salesman 2 on day 3
4
Enter sale of product 5 by salesman 2 on day 4
51
Enter sale of product 5 by salesman 2 on day 5
2
Enter sale of product 1 by salesman 3 on day 1
3
Enter sale of product 1 by salesman 3 on day 2
4
Enter sale of product 1 by salesman 3 on day 3
5
Enter sale of product 1 by salesman 3 on day 4
1
Enter sale of product 1 by salesman 3 on day 5
2
Enter sale of product 2 by salesman 3 on day 1
3
Enter sale of product 2 by salesman 3 on day 2
4
Enter sale of product 2 by salesman 3 on day 3
5
Enter sale of product 2 by salesman 3 on day 4
1
Enter sale of product 2 by salesman 3 on day 5
2
Enter sale of product 3 by salesman 3 on day 1
3
Enter sale of product 3 by salesman 3 on day 2
4
Enter sale of product 3 by salesman 3 on day 3
51
Enter sale of product 3 by salesman 3 on day 4
2
Enter sale of product 3 by salesman 3 on day 5
3
Enter sale of product 4 by salesman 3 on day 1
4
Enter sale of product 4 by salesman 3 on day 2
5
Enter sale of product 4 by salesman 3 on day 3
1
Enter sale of product 4 by salesman 3 on day 4
2
Enter sale of product 4 by salesman 3 on day 5
3
Enter sale of product 5 by salesman 3 on day 1
4
Enter sale of product 5 by salesman 3 on day 2
5
Enter sale of product 5 by salesman 3 on day 3
1
Enter sale of product 5 by salesman 3 on day 4
2
Enter sale of product 5 by salesman 3 on day 5
3
Enter sale of product 1 by salesman 4 on day 1
4
Enter sale of product 1 by salesman 4 on day 2
5
Enter sale of product 1 by salesman 4 on day 3
1
Enter sale of product 1 by salesman 4 on day 4
2
Enter sale of product 1 by salesman 4 on day 5
3
Enter sale of product 2 by salesman 4 on day 1
4
Enter sale of product 2 by salesman 4 on day 2
5
Enter sale of product 2 by salesman 4 on day 3
1
Enter sale of product 2 by salesman 4 on day 4
2
Enter sale of product 2 by salesman 4 on day 5
3
Enter sale of product 3 by salesman 4 on day 1
4
Enter sale of product 3 by salesman 4 on day 2
5
Enter sale of product 3 by salesman 4 on day 3
1
Enter sale of product 3 by salesman 4 on day 4
2
Enter sale of product 3 by salesman 4 on day 5
3
Enter sale of product 4 by salesman 4 on day 1
4
Enter sale of product 4 by salesman 4 on day 2
5
Enter sale of product 4 by salesman 4 on day 3
1
Enter sale of product 4 by salesman 4 on day 4
2
Enter sale of product 4 by salesman 4 on day 5
3
Enter sale of product 5 by salesman 4 on day 1
4
Enter sale of product 5 by salesman 4 on day 2
5
Enter sale of product 5 by salesman 4 on day 3
1
Enter sale of product 5 by salesman 4 on day 4
2
Enter sale of product 5 by salesman 4 on day 5
3
Performance of Salesman 1
1 2 3 4 5 15
1 2 3 4 5 30
1 2 3 4 5 45
1 2 3 4 5 60
1 2 3 4 5 75
5 10 15 20 25 
Performance of Salesman 2
1 2 3 4 5 15
1 2 3 4 51 76
2 3 4 5 1 91
2 3 4 5 1 106
2 3 4 51 2 168
8 13 18 69 60 
Performance of Salesman 3
3 4 5 1 2 15
3 4 5 1 2 30
3 4 51 2 3 93
4 5 1 2 3 108
4 5 1 2 3 123
17 22 63 8 13 
Performance of Salesman 4
4 5 1 2 3 15
4 5 1 2 3 30
4 5 1 2 3 45
4 5 1 2 3 60
4 5 1 2 3 75
20 25 5 10 15 
*/
