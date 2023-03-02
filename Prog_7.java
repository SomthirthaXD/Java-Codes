/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with
his generals. Each letter is replaced by another letter N position down the English alphabet. For
example, for a rotation of 5, the letter &#39;c&#39; would be replaced by an &#39;h&#39;. In case of a &#39;z&#39;, the alphabet rotates
and it is transformed into a &#39;d&#39;.Write a methods that return a lambda expression implement a decoder for
the Ceasar cipher where N = 5.*/

package Assg_9;
import java.util.Scanner;

interface Cipherable {
	abstract void cipher(char c); //Abstract method to be later implemented for lambda.
}

//Driver class.
public class Prog_7 {
	
	static Scanner sc=new Scanner(System.in); //Scanner object.
	public static void lambdacaller() {
		//Inputting the String to be passed as inputs to lambda.
		System.out.println("Enter the string to be deciphered!");
		String s=sc.nextLine();
		System.out.println(s);
		//Implemented lambda.
		Cipherable ob=(ch)-> {
			int ascii=(int)ch-5;
			if(ascii<65)
				ascii=91-(65-ascii);
			else if(ascii>90 && ascii<97)
				ascii=123-(97-ascii);
			System.out.print((char)ascii);
		};
		System.out.print("The deciphered string is: ");
		for(int i=0; i<s.length(); i++) {
			//Output generator.
			char c=s.charAt(i);
			if(!Character.isAlphabetic(c))
				System.out.print(c); //Printing non alphabetic characters.
			else
				ob.cipher(c); //Calling abstract method implementing lambda.
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\nPress 1 to enter a string to be deciphered!\nPress any other number to stop!\n");
			int ch=sc.nextInt(); //Entering choice.
			sc.nextLine();
			if(ch!=1) {
				System.out.println("\nProcess Exited! Thank You!");
				break; //Loop terminator.
			}
			lambdacaller(); //Calling the lambda caller function.
		}
		sc.close(); //Scanner object closed.
	}
}
/*Output:

Press 1 to enter a string to be deciphered!
Press any other number to stop!

1
Enter the string to be deciphered!
Hello hi.
Hello hi.
The deciphered string is: Czggj cd.
Press 1 to enter a string to be deciphered!
Press any other number to stop!

0

Process Exited! Thank You!*/
