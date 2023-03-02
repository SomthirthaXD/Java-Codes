/**
 * 
 */
package Assg_1;
/*Author: Somthirtha Bhowmik.
 * Roll: 003.
 * Semester 1.
 */

/*Write a program that reads three coordinate and calculate the side of triangle. Check whether
these numbers can be considered as the three sides of a triangle. If so, find the type
(isosceles, equilateral or right-angled) and area of the triangle.*/

import java.util.Scanner;
public class Prog1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner object.
		int c[][]=new int [3][2]; //Array to store co-ordinates.
		for(int i=0; i<3; i++)
		{
			//Input section.
			System.out.println("Enter co-ordinate x for vertex "+(i+1));
			c[i][0]=sc.nextInt();
			System.out.println("Enter co-ordinate y for vertex "+(i+1));
			c[i][1]=sc.nextInt();
		}
		double s[]=new double[3]; //Array to store sides.
		s[0]=Math.sqrt(Math.pow((c[1][0]-c[0][0]),2)+Math.pow((c[1][1]-c[0][1]),2));
		s[1]=Math.sqrt(Math.pow((c[2][0]-c[1][0]),2)+Math.pow((c[2][1]-c[1][1]),2));
		s[2]=Math.sqrt(Math.pow((c[0][0]-c[2][0]),2)+Math.pow((c[0][1]-c[2][1]),2));
		if(s[0]+s[1]>s[2] && s[1]+s[2]>s[0] && s[2]+s[0]>s[1]) //Triangle check.
		{
			System.out.println("Triangle is possible with these co-odinates!");
			//Checks kind of triangle and prints area.
			if(s[0]==s[1] && s[1]==s[2])
			{
				System.out.println("It is an equilateral triangle!");
				System.out.println("Area: "+Math.sqrt(3)/4.0*s[0]*s[0]);
			}
			else if(s[0]!=s[1] && s[1]!=s[2] && s[2]!=s[0])
			{
				System.out.println("It is a scalene triangle!");
				double S=(s[1]+s[0]+s[2])/2.0;
				System.out.println("Area: "+Math.sqrt(S*(S-s[0])*(S-s[1])*(S-s[2]))); //Heron's Formula.
			}
			else
			{
				System.out.println("It is an isoceles triangle!");
				double S=(s[1]+s[0]+s[2])/2.0;
				System.out.println("Area: "+Math.sqrt(S*(S-s[0])*(S-s[1])*(S-s[2])));
			}
		}
		else
			System.out.println("Triangle is not possible with these co-odinates!");
		sc.close(); //Scanner object closed.
	}
}
/*Output:
 Enter co-ordinate x for vertex 1

2
Enter co-ordinate y for vertex 1
4
Enter co-ordinate x for vertex 2
3
Enter co-ordinate y for vertex 2
1
Enter co-ordinate x for vertex 3
3
Enter co-ordinate y for vertex 3
2
Triangle is possible with these co-odinates!
It is a scalene triangle!
Area: 0.5000000000000013*/
