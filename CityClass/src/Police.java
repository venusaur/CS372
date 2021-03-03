public class Police extends Person implements Employee{
	static int uniqueID = 000;
	private int id;
	private int wage;
	private final int pay = 4000;

	public Police(String name, int phoneNumber, int age, int id) {
		super(name, phoneNumber, age);
		uniqueID = id;
	}

	public enum Status {
		Patrol, Sargent, Captain, Chief 
	}

	public int getId() {
		return id++;
	}
	
	public void getPay() {
		wage += pay;
	}
}
