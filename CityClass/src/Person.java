import java.util.*;


public abstract class Person {
	private String name; 
	private int phoneNumber; 
	private int age;
	
	//Random PhoneNumber Generator
	Random rnd = new Random(); 
	static int lastNum = 1111111; 
	
	public Person(String name, int phoneNumber, int age) {
		this.age = age; 
		this.name = name; 
		this.phoneNumber = lastNum++; 
	}
	
	public String getName() { 
		return name; 
	}
	public int getPhoneNumber() { 
		return phoneNumber; 
	}
	public int getAge(){
		return age; 
	}

	public String toString() {
		return String.format("%d-%d", phoneNumber/10000, phoneNumber%10000);
	}
}
