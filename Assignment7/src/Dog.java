
public class Dog {
	private String name;
	private static String breed;
	private int age;

	public Dog(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Dog(String n, String b, int a) {
		name = n;
		breed = b;
		age = a;

	}

	public String getBreed() {
		return breed;
	}
}
