
public class Car {
	
	//These are the instance variables
	//When the object is created these variables are also created.
	private String make;//Car company
	private String type; // Type of Vehicle
	private int year; // year of car
	private String color; // color of car
	
	//This is the Constructor
	//When this object is created the constructor is called.
	public Car(String m, String t,int y, String c){
		make=m;
		type=t;
		year=y;
		color=c;
	}
	//This is a constructor which takes 0 parameters
	// It instantiates 
	public Car(){
		make=new String();
		type=new String();
		year=new integer();
		color=new String();
	}
	
	
	
	
	//This Set method allows you to change the instance variable.
	public void setYear(int y){
		year = y;
	}
	
	
	
	//These Get methods allow you to access the instance variables
	
	public int getYear(){
		return year;
	}
	public String getMake(){
		return make;
	}
	public String getType(){
		return type;
	}
	public String getColor(){
		return color;
	}
	
	
}
