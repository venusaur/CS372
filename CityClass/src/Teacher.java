public class Teacher extends Person implements Employee{
 	static int uniqueID = 000;
	private int id;
	private int wage;
	private final int pay = 5753;

	public Teacher(String name, int phoneNumber, int age, int id) {
		super(name, phoneNumber, age);
		uniqueID = id;
	}

	public int getId() {
		uniqueID++;
		return id;
	}

	public void getPay() {
		wage += pay;
	}
}
