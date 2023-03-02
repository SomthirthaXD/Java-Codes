/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*Write a program that inputs the names of people into different array list, A and B. Array A has N
number of names while array B has M number of names, with no duplicates in either of them. Merge
arrays A and B into a single array list C, such that the resulting array list is sorted alphabetically.
Display all the three arrays list, A, B and C, stored alphabetically.*/

package Assg_10;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class Prog_3 {
	static Scanner sc=new Scanner(System.in); //Scanner object.
	static ArrayList<String> set(int n) {
		sc.nextLine(); //Skips blank token.
		//Input section for items.
		ArrayList<String> list=new ArrayList<String>();
		while(n-->0) {
			System.out.println("Enter a name!");
			list.add(sc.nextLine()); //Adding input to ArrayList.
		}
		System.out.println("Done with taking inputs! Thank You!");
		return list; //Returns created ArrayList.
	}
	
	static void get(ArrayList<String> list) {
		int c=1; //Name number.
		for(String x: list)
			System.out.println(c+++". "+x); //Output.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of names for the first ArrayList!");
		ArrayList<String> A=new ArrayList<String>(new TreeSet<String>(set(sc.nextInt()))); //TreeSet passsage removes duplicate elements.
		System.out.println("Enter number of names for the second ArrayList!");
		ArrayList<String> B=new ArrayList<String>(new TreeSet<String>(set(sc.nextInt()))); //TreeSet passsage removes duplicate elements.
		System.out.println("Sorted names of A are:");
		get(A); //Displaying ArrayList A.
		System.out.println("Sorted names of B are:");
		get(B); //Displaying ArrayList B.
		A.addAll(B);
		ArrayList<String> C=new ArrayList<String>(new TreeSet<String>(A)); //TreeSet passsage removes duplicate elements.
		System.out.println("Enter 1 to sort in ascending order by name! Enter any other number to sort in descending order by name!");
		if(sc.nextInt()==1)
			Collections.sort(C); //Ascending sort.
		else
			Collections.sort(C, Collections.reverseOrder()); //Descending sort.
		System.out.println("Sorted and merged names of C are:");
		get(C); //Displaying ArrayList C.
		sc.close(); //Scanner object closed.
	}
}
/*Output:
Enter number of names for the first ArrayList!
2
Enter a name!
Somthirtha
Enter a name!
Rishav
Done with taking inputs! Thank You!
Enter number of names for the second ArrayList!
4
Enter a name!
Atrayee
Enter a name!
Niladri
Enter a name!
Niladri
Enter a name!
Indrani
Done with taking inputs! Thank You!
Sorted names of A are:
1. Rishav
2. Somthirtha
Sorted names of B are:
1. Atrayee
2. Indrani
3. Niladri
Enter 1 to sort in ascending order by name! Enter any other number to sort in descending order by name!
1
Sorted and merged names of C are:
1. Atrayee
2. Indrani
3. Niladri
4. Rishav
5. Somthirtha
*/