
public class Tester {

	public static void main(String[] args) {
		Student student = new Student("Micheal", 4.0);
		System.out.println(student.getName());
		student.setName("Mike");
		System.out.println("The new name is " + student.getName());
		System.out.println(student.getGpa());
		student.changeGpa(3.9);
		System.out.println("The new GPA is " + student.getGpa());
		System.out.println(student.getGpa());
	}

}
