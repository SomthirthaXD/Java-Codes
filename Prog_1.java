/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*Write a program that reads in a series of first names and stores them in a LinkedList. Do not store
duplicate names. Allow the user to search for a first name.*/

package Assg_10;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

public class Prog_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner object.
		TreeSet<String> settemp=new TreeSet<String>(); //TreeSet as it prevents duplicate elements.
		//Input section for items.
		while(true) {
			System.out.println("Do you want to insert a first name? (1/0)");
			int ch=sc.nextInt();
			sc.nextLine();
			if(ch==0) {
				System.out.println("Done with taking inputs! Thank You!");
				break;
			}
			System.out.println("Enter a first name!");
			settemp.add(sc.nextLine()); //Adding input to TreeSet.
		}
		ArrayList<String> set=new ArrayList<String>(settemp); //Copying TreeSet object to an ArrayList object.
		System.out.println("Listed first names:");
		//Outputting contens of the ArrayList.
		for(String x:set)
			System.out.println(x);
		//Input for searchable names.
		while(true) {
			System.out.println("Do you want to search for a first name? (1/0)");
			int ch=sc.nextInt();
			sc.nextLine();
			if(ch==0) {
				System.out.println("Process Exited! Thank You!");
				break;
			}
			System.out.println("Enter a first name to be searched!");
			String s=sc.nextLine();
			boolean flag=false;
			//Output results of search.
			for(String x:set) {
				if(x.equalsIgnoreCase(s)) {
					System.out.println("First name found!");
					flag=true;
				}
			}
			if(!flag)
				System.out.println("First name not found!");
		}
		sc.close(); //Scanner object closed.
	}
}
/*Outputs:
Do you want to insert a first name? (1/0)
1
Enter a first name!
Somthirtha
Do you want to insert a first name? (1/0)
1
Enter a first name!
Rishav
Do you want to insert a first name? (1/0)
1
Enter a first name!
Niladri
Do you want to insert a first name? (1/0)
1
Enter a first name!
Atrayee
Do you want to insert a first name? (1/0)
1
Enter a first name!
Indrani
Do you want to insert a first name? (1/0)
0
Done with taking inputs! Thank You!
Listed first names:
Atrayee
Indrani
Niladri
Rishav
Somthirtha
Do you want to search for a first name? (1/0)
1
Enter a first name to be searched!
rishav
First name found!
Do you want to search for a first name? (1/0)
1
Enter a first name to be searched!
Somthirtha
First name found!
Do you want to search for a first name? (1/0)
1
Enter a first name to be searched!
Atrayee
First name found!
Do you want to search for a first name? (1/0)
1
Enter a first name to be searched!
Niledri
First name not found!
Do you want to search for a first name? (1/0)
0
Process Exited! Thank You!
*/