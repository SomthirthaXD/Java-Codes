/*
 * Author: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 03.
 * Program: 1.*/

/*Create three interfaces, each with two methods. Inherit a new interface from the three,
adding a new method. Create a class by implementing the new interface and also
inheriting from a concrete class. Now write four methods, each of which takes one of the
four interfaces as an argument. In main( ), create an object of your class and pass it to
each of the methods.*/

package Assg_5;

public interface D extends A, B, C /*Extends interfaces A, B and C*/{
	public static void d() {}
}
