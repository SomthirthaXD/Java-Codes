package Assg_1;
/*Author: Somthirtha Bhowmik.
 * Roll: 003.
 * Semester 1.
 */

import java.util.Scanner;

/*Write a program to find all Armstrong numbers in the range 1 to M, where M is taken
as input.*/
public class prog_7 {

	static int countDigits(int n) //Counts total digits in number.
	{
		int c=0;
		while(n!=0)
		{
			n/=10;
			c++;
		}
		return c;
	}
	static void armstrong(int n) //Checks if number is Armstrong or not.
	{
		int c=countDigits(n); //Calling method countDigits(n).
		int p=n;
		int sum=0;
		while(p!=0)
		{
			int t=p%10;
			p/=10;
			sum+=Math.pow(t, c);
		}
		if(sum==n)
			System.out.println(n); //Output printing.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner object.
		System.out.println("Enter range!");
		int m=sc.nextInt(); //Inputs the number.
		System.out.println("Armstrong numbers between 1 and "+m+" are:");
		for(int i=1; i<=m; i++)
			armstrong(i); //Calling method armstrong().
		sc.close(); //Scanner object closed.
	}
}
/*Output:
 * Enter range!
10000
Armstrong numbers between 1 and 10000 are:
1
2
3
4
5
6
7
8
9
153
370
371
407
1634
8208
9474
*/
