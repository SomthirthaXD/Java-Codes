/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*Write a python program to check the number where the difference between every adjacent digit should
be 1 using ArrayList.*/

package Assg_10;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner object.
		System.out.println("Enter a number!");
		int n=sc.nextInt(); //Input number.
		ArrayList<Integer> list=new ArrayList<Integer>(); //ArrayList object.
		//Inserting digits of number into ArrayList object.
		while(n!=0) {
			list.add(n%10);
			n/=10;
		}
		boolean flag=true;
		//Checking adjacent digits for criteria.
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i)!=list.get(i+1)+1) {
				flag=false;
				break;
			}
		}
		//Output section.
		if(!flag)
			System.out.println("No! The difference between every adjacent digit is not 1!");
		else
			System.out.println("Yes! The difference between every adjacent digit is 1!");
		sc.close(); //Scanner object closed.
	}
}
/*Output:
Enter a number!
1234
Yes! The difference between every adjacent digit is 1!

Enter a number!
1235
No! The difference between every adjacent digit is not 1!
*/