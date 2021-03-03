
public abstract class Building {
	private String name; 
	private String address;
	
	public Building(String name, String address) {
		this.address = address; 
		this.name = name; 
	}
	public String getName() { 
		return name; 
	}
	public String getAddress() { 
		return address; 
	}
}
