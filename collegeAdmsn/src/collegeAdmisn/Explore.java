package collegeAdmisn;

import java.util.Scanner;

public class Explore {
	int did;
	
	Explore(){
		
	System.out.println("Welcome To FRANCIS XAVIER ENGINEERING COLLEGE");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the department ID  to Explore: ");
	did=scan.nextInt();
	
	switch(did) {
	case 780:
		System.out.println("Welcome to Dept of EEE");
	    break;
	case 760:    
		System.out.println("Welcome to Dept of CSE");
		break;
    default:
    	System.out.println("For More Enquiry ,Contact:0462 667895");
		System.out.println("FXEC,A SCAD  GROUP");
		break;
    	
	}
}

}