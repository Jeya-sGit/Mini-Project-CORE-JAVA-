package courses;

import java.util.List;

public class CSE {
	String dept;
	String deptID;
	int seat;
	
	public CSE(String name,String id,int st)
	{
		this.dept=name;
		this.deptID=id;
		this.seat=st;
	}
	
	public void display(List<CSE> cs) {
		System.out.println("Course : " + dept +" | ID : "+deptID+" | Available Seats : "+seat);
	}

	public void explore(String ac) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Welcome to the Department of CSE");
	}
	
	public void admin(String ac) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Welcome to the Department of CSE");
		System.out.println("We Congrats you for your first step to sucess");
		System.out.println("Enter Your Details for further Process");
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

