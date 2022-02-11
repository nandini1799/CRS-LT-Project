package com.srs.lt.application;
package com.srs.lt.business;

public class ApplicationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("THIS IS THE MENU CLASS FOR CRS APPLCATION");

		Scanner scan = new Scanner(System.in);
		int option = 0;
		do{
		System.out.println("**********************************************");
		System.out.println("Welcome to CRSApplicationMenu");
		System.out.println("Enter 1 for CRSStudentMenu");
		System.out.println("Enter 2 for CRSProfessorMenu");
		System.out.println("Enter 3 for CRSAdminMenu");
		System.out.println("Enter 4 for Exit");
		option = scan.nextInt();
		switch(option){
		case 1:
		System.out.println("**********************************************");
		System.out.println("Student Dashboard");
		break;
		case 2:
		System.out.println("**********************************************");
		System.out.println("Welcome to CRSProfessorMenu");
		ProfessorInterface interface = new ProfessorServiceImplementation();
		do{
		System.out.println("Enter 1 to see All the Enrolled Students: ");
		System.out.println("Enter 2 to see All the Courses Available: ");
		System.out.println("Enter 3 to see Grade Cards: ");
		System.out.println("Enter 4 to see Add Grades: ");
		int select = scan.nextInt();
		switch(select){
		case 1:
		interface.getEnrolledStudents();
		break;
		case 2:
		interface.getCourses();
		break;
		case 3:
		interface.viewGrade();
		break;
		case 4:
		interface.addGrade();
		break;
		case 5:
		System.exit(0);
		}
		}while(select!=5)
		break;
		case 3:
		System.out.println("**********************************************");
		System.out.println("Admin Dashboard");
		break;
		case 4:
		System.exit(0);

		default:
		System.out.printf("This option is not available)");
		return;
		}
		}while(option !=4);

		
	}

}
