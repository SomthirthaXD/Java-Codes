/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be
printed in ascending sorted order.]*/

package Assg_10;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Prog_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner object.
		System.out.println("Enter a string to be tokenized and inserted to TreeSet!");
		String s=sc.nextLine(); //Input String.
		System.out.println("Enter delimeter for token separation!");
		String delim=sc.nextLine(); //Delimeterr for token separation.
		StringTokenizer st=new StringTokenizer(s); //StringTokenizer object.
		TreeSet<String> set=new TreeSet<String>(); //TreeSet as it prevents duplicate elements.
		while(st.hasMoreTokens())
			set.add(st.nextToken(delim)); //Adding tokens to TreeSet.
		System.out.println("Tokens in the TreeSet are:");
		int c=1; //Token number.
		for(String x: set)
			System.out.println(c+++". "+x); //Output String.
		sc.close(); //Scanner object closed.
	}

}
/*Output:
Enter a string to be tokenized and inserted to TreeSet!
The quick brown fox jumped jumped over the the lazy dog!
Enter delimeter for token separation!
 
Tokens in the TreeSet are:
1. The
2. brown
3. dog!
4. fox
5. jumped
6. lazy
7. over
8. quick
9. the
*/