/*Name: Somthirtha Bhowmik.
 * Semester: 1.
 * Roll: 003.*/

/*Create an interface Department containing attributes deptName and deptHead. It also
has abstract methods for getting data and printing the attributes. Create a class hostel
containing hostelName, hostelLocation and numberofRooms. The class contains methods
for getting and printing the attributes. Then write Student class extending the Hostel
class and implementing the Department interface. This class contains attributes
studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
printData methods for this class. Also implement the abstract methods of the Department
interface. Write a driver class to test the Student class. The program should be menu
driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration number.*/

package Assg_5;

public interface Department {
	public String deptName="Masters in Computer Applications.";
	public String deptHead="Prof. Dr. ABC XYZ.";
	public abstract void set();
	public abstract void get();
}
