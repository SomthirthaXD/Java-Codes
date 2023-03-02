/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*Write a program to find elements which are present in first array and not in second array.*/

package Assg_10;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog_5 {
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
		System.out.println("Enter number of elements in the first array!");
		ArrayList<String> al1=set(sc.nextInt()); //First array.
		System.out.println("Enter number of elements in the second array!");
		ArrayList<String> al2=set(sc.nextInt()); //Second array.
		//Output section.
		System.out.println("Elements of first array that are not in second array are:");
		int c=1; //Element number counter.
		for(String x: al1) {
			if(!al2.contains(x))
				System.out.println(c+++". "+x);
		}
		sc.close(); //Scanner object closed.
	}
}
/*Output:
Enter number of elements in the first array!
4
Enter an element for the array!
Somthirtha
Enter an element for the array!
Rishav
Enter an element for the array!
Atrayee
Enter an element for the array!
Niladri
Enter number of elements in the second array!
4
Enter an element for the array!
Rishav
Enter an element for the array!
Indrani
Enter an element for the array!
Partha
Enter an element for the array!
Pranati
Elements of first array that are not in second array are:
1. Somthirtha
2. Atrayee
3. Niladri
*/