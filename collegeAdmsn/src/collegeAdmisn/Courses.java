package collegeAdmisn;

public class Courses {
	private String dept;
    private int DeptID;
	private int seat;
	
	Courses(String dept,int DeptID,int seat) {
		this.dept=dept;
		this.DeptID=DeptID;
		this.seat=seat;
	}
	
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getDeptID() {
		return DeptID;
	}

	public void setDeptID(int deptID) {
		DeptID = deptID;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	public void display() {
		System.out.println("Course : " + dept +" | ID : "+DeptID+" | Available Seats : "+seat);
		}
}
