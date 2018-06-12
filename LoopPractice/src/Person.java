
public class Person implements Comparable, Speakable{
	
	private String name;
	private double GPA;
	public int age;

	@Override
	//create a compareTo method that compares people by age
	public int compareTo(Object o) {
		Person otherPerson = (Person) o;
		if (age > otherPerson.age) {
			return 1;
		}
		else if (age == otherPerson.age) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public void speak() {
		System.out.println("Hello my name is Amy");
	}
}
