package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import courses.Admission;
import courses.CSE;
import courses.EEE;

public class Main {
	
	public static void main(String args[]) {
		char opt ;
		String opt1;
		
		Scanner scan=new Scanner(System.in);
		
		ArrayList<EEE> ele=new ArrayList<EEE>();
		ArrayList<CSE> cs=new ArrayList<CSE>();
		ArrayList<Admission>add=new ArrayList<Admission>();
		//ele.add(new EEE("Electrical & Electronics Engineering","EE780",2));
		//cs.add(new CSE("Computer Science Engineering","CS760",3));
		
		
		
		
		
		//--------------------------------------------------------------------------------------------------		
		System.out.println("Available Courses");
		System.out.println("Electrical & Electronics Engineering(EEE) | Computer Science Engineering (CSE)");
		System.out.print("'E' for Electrical & Electronics Engineering | " );
		System.out.println("'C' for Computer Science Engineering");
		System.out.println("Enter any one option to continue : ");
		opt=scan.next().charAt(0);
//----------------------------------------------------------------------------------------------------------------------		
		if(opt=='E'){
			EEE ee=new EEE("Electrical & Electronics Engineering","EE780",2);
			ele.add(ee);
			ee.display(ele);
			System.out.print("(Explore | Admission )" + "'E' to Explore | 'A' to Admission");
			opt1=scan.next();
			switch(opt1){
			case "Ex":
				ee.explore(opt1);
				break;
			case "A":
				ee.admin(opt1);
				break;
			}
		}
	    if(opt=='C') {
			CSE cse=new CSE("Computer Science Engineering","CS760",3);
			cs.add(cse);
			cse.display(cs);
			System.out.print("(Explore | Admission )" + "'Ex' to Explore | 'A' to Admission");
			opt1=scan.next();
			switch(opt1){
			case "Ex":
				cse.explore(opt1);
				break;
			case "A":
				cse.admin(opt1);
				break;
		}
	}
	}
	
	
	
	
}

//			EEE =new EEE
//			((EEE)).display();
//			//Object[] arr1 = ele.toArray();
         	//break;	
//		case 'C':
//			Object[] = ele.toArray();
//			break;
//		}
//		
	/*for(Course h:crs) {
h.display();

}*/
//new ArrayList (Arrays.asList(ele.display()));