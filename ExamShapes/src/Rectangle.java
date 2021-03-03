
public class Rectangle implements ShapeInterface{
	String color; 
	int id; 
	int area; 
	int perimeter; 
	String type;
	
	public String getKind() {
		return type;
	}
	
	public String getDetailString() {
		return null;
	}
	
	public int getId() {
		return id;
	} 
	
	
	public String toString() {
		return color;
		
	}
}
