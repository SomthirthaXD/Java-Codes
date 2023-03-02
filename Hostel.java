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

class Hostel {
	//Class variables.
	public static String hostelName="Super Hostel", hostelLocation="Campus";
	public static int numberofRooms=2;
	
	//Methods of class Hostel.
	void getValue(int h) {
		if(h==1) {
			if(numberofRooms>0) {
				numberofRooms--;
				show();
			}
			else
				System.out.println("No hostel rooms present!");
		}
	}
	void show() {
		System.out.println("Hostel name: "+hostelName);
		System.out.println("Hostel location: "+hostelLocation);
		System.out.println("Hostel room allotted!");
	}
}

class Student extends Hostel implements Department {
	//Class variables.
	String studentName, electiveSubject;
	long regdNo;
	double avgMarks;
	
	//Implementing interface abstract methods.
	public void set() {
		//Cannot set values of interface final variables.
	}
	public void get() {
		System.out.println("Welcome to the department of "+Department.deptName);
		System.out.println("Head of the department: "+Department.deptHead);
	}
	
	//Methods of class Student.
	void getData(String studentName, String electiveSubject, long regdNo, double avgMarks) {
		this.studentName=studentName;
		this.electiveSubject=electiveSubject;
		this.regdNo=regdNo;
		this.avgMarks=avgMarks;
		printData();
	}
	void printData() {
		get();
		System.out.println("Student's name: "+this.studentName);
		System.out.println("Elective subject: "+this.electiveSubject);
		System.out.println("Registration number: "+this.regdNo);
		System.out.println("Average marks obtained: "+this.avgMarks);
	}
}