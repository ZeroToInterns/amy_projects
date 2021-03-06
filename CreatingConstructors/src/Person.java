
public class Person {

	private static final int MY_CONSTANT = 123456789;
	//instance variables
	private static String name = "Micheal";
	private static int age = 22;
	private static String hairColor = "Black";
	private static String eyeColor = "Black";
	private static double weight = 160;
	private static String height = "5'4";
	private static char gender = 'M';
	
	//constructor
	public Person(String name, int age, String hairColor) {
		this.name = name;
		this.age = age;
		this.hairColor = hairColor;
	}
	
	//main method
	public static void main(String[] args) {
		Person myPerson = new Person("Max", 26, "Brown");
		System.out.println(myPerson.name);
		System.out.println(myPerson.age);
		System.out.println(myPerson.hairColor);

		Person secondPerson = new Person("Harvey", 22, "Yellow");
		System.out.println(secondPerson.name);
		System.out.println(secondPerson.age);
		System.out.println(secondPerson.hairColor);
	}
}
