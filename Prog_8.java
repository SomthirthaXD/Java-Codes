/*Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 */
/*Write a program to create a thread using a lambda expression.*/

package Assg_9;

interface Threadable {
	abstract void threader(); //Abstract method to be later implemented for lambda.
}

class ThreadMaker extends Thread {
	public void run() {
		//Try for exceptions.
		try {
			//Pattern printer.
			for(int i=1; i<=10; i++) {
				for(int j=1; j<=10; j++) {
					if(i==1 || i==10)
						System.out.print("* ");
					else {
						if(j==1 || j==10 || i==j || j==11-i)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					Thread.sleep(200); //Making thread sleep for 0.2 secs.
				}
				System.out.println();
			}
		}
		catch (InterruptedException e) {} ///Catches InterruptedException.
	}
}

//Driver class.
public class Prog_8 {
	public static void lambdacaller() {
		//Lambda function.
		Threadable ob=()-> {
			ThreadMaker t=new ThreadMaker(); //Object of ThreadMaker class that extends Thread.
			t.start(); //Starting the implemented Thread.
		};
		ob.threader(); //Calling abstract method implementing lambda.
	}
	
	public static void main(String[] args) {
		lambdacaller(); //Calling the lambda caller function.
	}
}
/*Output:
* * * * * * * * * * 
* *             * * 
*   *         *   * 
*     *     *     * 
*       * *       * 
*       * *       * 
*     *     *     * 
*   *         *   * 
* *             * * 
* * * * * * * * * * 
*/