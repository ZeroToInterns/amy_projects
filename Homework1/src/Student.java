
public class Student {
	
	private String name;
	private double gpa;
	
	//constructor
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	//gets the name of the Student
	public String getName() {
		return name;
	}
	
	//sets a new name for the Student
	public void setName(String newName) {
		this.name = newName;
	}
	
	//gets the gpa of the Student
	public double getGpa() {
		return gpa;
	}

	//sets a new gpa for the Student
	public void changeGpa(double newGpa) {
		this.gpa = newGpa;
	}
}
