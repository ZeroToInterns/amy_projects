
public class Tester {

	public static void main(String[] args) {
		StringLoop looper = new StringLoop();
//		looper.printHundred();
//		looper.printEvens();
//		looper.printPattern("Hello World");
		
//		looper.printString("Hello World");
		
		Person person1 = new Person();
		person1.age = 10;
		
		Person person2 = new Person();
		person2.age = 15;
		
		System.out.println(person1.compareTo(person2));
		
		person1.speak();
	}

}
