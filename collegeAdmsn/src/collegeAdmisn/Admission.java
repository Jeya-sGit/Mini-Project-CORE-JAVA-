package collegeAdmisn;

import java.util.ArrayList;
import java.util.Scanner;

public class Admission {
	
    String Name;
	int Percentage;
    int deptID;
    int occupied=0;
    
    
	
    Admission()
    {
	Scanner scan=new Scanner(System.in);
	System.out.println("Name : ");
	Name=scan.next();
	System.out.println("HSE percentage : ");
    Percentage=scan.nextInt();
    System.out.println("Enter your Preferred Course(DeptID) ID  : ");
	deptID=scan.nextInt();
	
	}

	public boolean isavailable(ArrayList<Admission> ad, ArrayList<Courses> cose) {
		int vaccant=0;
	   
        
        for(Courses c:cose) {
        	if(c.getDeptID()==this.deptID) {
        		vaccant=c.getSeat();
        		}
        }
        
        for(Admission a:ad) {
        	if(a.deptID==this.deptID) {
        		occupied=occupied+1;
        		
        }  	
        }
        return occupied<vaccant?true:false;
	}
        }
