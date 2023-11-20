package courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import student.Main;
public class EEE {
	String dept;
    String DeptID;
	int seat;
	
	private String Name;
	private int Percentage;
	private String deptID; 
	
	List<EEE> eeeCourses = new ArrayList<>();
	
	public EEE(String name,String id,int st)
	{
		this.dept=name;
		this.deptID=id;
		this.seat=st;
	}
	
	public void display(List<EEE> ele) {
		
		System.out.println("Course : " + dept +" | ID : "+deptID+" | Available Seats : "+seat);
	}
	
	public void explore(String ac) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Welcome to the Department of EEE");
	}
	Scanner scan=new Scanner(System.in);
	public void admin(String ac) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Welcome to the Department of EEE");
		System.out.println("We Congrats you for your first step to success");
		System.out.println("Enter Your Details for further Process");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Name : ");
		Name=scan.next();
//		System.out.println("HSE Status(Y/N) : ");
//		Status=scan.nextBoolean();
		System.out.println("12th% : ");
		Percentage=scan.nextInt();
		if(Percentage>50) {
			System.out.println("Enter the DeptID: ");
            deptID = scan.next();
            Admission ad = new Admission();
            String availabilityStatus = ad.avail(eeeCourses, deptID);
            System.out.println("Availability Status: " + availabilityStatus);

		}
		  
		}
	
	
	public void stdDisplay() {
		
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

}












