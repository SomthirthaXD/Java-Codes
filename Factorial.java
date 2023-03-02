/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Program: 1.
 * Roll: 03.
 */

/*Write a program called Factorial.java that computes factorials and catches the result in an
array of type long for reuse. The long type of variable has its own range. For example 20!
Is as high as the range of long type. So check the argument passes and “throw an
exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgument
Exception with a message “Value of x must be positive”.If x is above the length of the
array throw an IllegalArgumentException with a message “Result will overflow”.
Here x is the value for which we want to find the factorial.*/

package Assg_6;

public class Factorial {
	
	//Static variables of the class.
	static long arr[];
	static int index;
	static int size;
	
	//Parameterized constructor.
	Factorial(int s) {
		arr=new long[s];
		size=s;
		index=0;
	}
	
	//Function to get factorial of an argument passed.
	public static void getFact(int x) {
		try { //Checks for exceptions.
			if (x<0)
				throw new IllegalArgumentException("Value of x must be positive!");
			else if(x>=20)
				throw new IllegalArgumentException("Result will overflow!");
			else {
				//Factorial calculation.
				long fact=1;
				for(int i=2; i<=x; i++)
					fact*=i;
				arr[index++]=fact;
			}
		}
		catch (IllegalArgumentException e) { //Catches the exceptions in try block.
			arr[index++]=-1;
			e.printStackTrace(); //Prints exception e and its message.
			System.out.println("Exception has occured!");
		}
	}
}

//Driver code in Prog_1.java.
