package student;

public class Students {
	String Stname;
	String Stid;
	String course;
	char gde;
	
	Students(String name,String id,String course,char gde){
		this.Stname=name;
		this.Stid=id;
		this.course=course;
		this.gde=gde;
	}
	public void dis() {
		System.out.println("Name : "+Stname+" | StudentID : "+Stid+" | Department : "+course+" | Grade : "+gde);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public char getGde() {
		return gde;
	}

	public void setGde(char gde) {
		this.gde = gde;
	}

	public String getStname() {
		return Stname;
	}

	public void setStname(String stname) {
		Stname = stname;
	}

	public String getStid() {
		return Stid;
	}

	public void setStid(String stid) {
		Stid = stid;
	}

}
