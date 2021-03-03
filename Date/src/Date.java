import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

public class Date {
	int year;
	int month;
	int day; 

	
	static void getDate(){
		System.out.println("Todays Date: " + java.time.LocalDate.now());  
	}
	
	public int getYear(){
		return year; 
	}
	
	public int getMonth() {
		return month; 
	}
	
	public int getDay() {
		return day;
	}
}
