package collegeAdmisn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	public static void main(String args[]) {
//		char opt ;
//		char opt1;
		int opt=0;
		Scanner scan=new Scanner(System.in);		
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Francis Xavier Engineering College-Online Admission");
		System.out.println("---------------------------------------------------------------------------------------");
		
		ArrayList<Courses>cose=new ArrayList<Courses>();
		cose.add(new Courses("Electrical & Electronics Engineering",780,2));
		cose.add(new Courses("Computer Science Engineering",760,3));
		
		ArrayList<Admission>ad=new ArrayList<Admission>();
		
		
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Available Courses");
		System.out.println("---------------------------------------------------------------------------------------");
		
		for(Courses c:cose) {
			c.display();
		}
		//opt=scan.next().charAt(0);
		
		while(opt==0) {
			System.out.print("0 for Admission | " );
			System.out.print("1 for Explore | ");
			System.out.println("2 fro Exit ");
			opt=scan.nextInt();
			if(opt==0) {
				System.out.println("Welcome to admission");
			    Admission admission=new Admission();
			    if(admission.isavailable(ad, cose)) {
			    	ad.add(admission);
			    	System.out.println("Congratulations.You locked Your SEAT.Further Information will be shared with  you");
			    }
			    else {
			    	System.out.println("There is no vaccant in your preferred Course");
			    }
			}
			if(opt==1) {
				Explore exp=new Explore();
				
			}
			if(opt==2) {
				System.out.println("For More Enquiry ,Contact:0462 667895");
				System.out.println("FXEC,A SCAD  GROUP");
			}
			
		}

		
}
}
