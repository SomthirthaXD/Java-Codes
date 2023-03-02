/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*Write a program to find whether an array is subset of another array or not.*/

package Assg_10;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog_4 {
	static Scanner sc=new Scanner(System.in); //Scanner object.
	static ArrayList<String> set(int n) {
		sc.nextLine();
		ArrayList<String> ar=new ArrayList<String>(); //Dynamic memory allocation of ArrayList.
		for(int i=0; i<n; i++) {
			System.out.println("Enter an element for the array!");
			ar.add(sc.nextLine());
		}
		return ar; //Returns created array.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements in the greater array!");
		ArrayList<String> al=set(sc.nextInt()); //Greater array.
		System.out.println("Enter number of elements in the subset checkable array!");
		ArrayList<String> subal=set(sc.nextInt()); //Subset checkable array.
		boolean flag=true;
		for(String x: subal) {
			//Turns flag to false if al does not contain x from subal.
			if(!al.contains(x)) {
				flag=false;
				break;
			}
		}
		//Output section.
		if(flag)
			System.out.println("Yes! Second array is a subarray of the first array!");
		else
			System.out.println("No! Second array is not a subarray of the first array!");
		sc.close(); //Scanner object closed.
	}
}
/*Output:
Enter number of elements in the greater array!
4
Enter an element for the array!
Somthirtha
Enter an element for the array!
Rishav
Enter an element for the array!
Niladri
Enter an element for the array!
Atrayee
Enter number of elements in the subset checkable array!
2
Enter an element for the array!
Rishav
Enter an element for the array!
Atrayee
Yes! Second array is a subarray of the first array!
*/