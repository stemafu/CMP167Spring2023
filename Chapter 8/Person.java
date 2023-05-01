
public class Person {
	/* characteristics
	 * 
	 * member variables, member fields, instance
	 * variables
	 * An instance variable is a variable that is
	 * defined inside a class but outside of any
	 * methods and does not the keyword static.
	 * 
	 * Instance variables belong to individual objects
	 * They are characteristics of individual objects.
	 */
	private String name;
	private int age;
	private String eyeColor;
	private double height;
	private double weight;
	private String [] courses;
	
	
	/* A default constructor
	 * 
	 * Constructors are called(invoked) when you 
	 * are creating objects. Objects are created
	 * using the keyword new.
	 */
	
	public Person() {
		/* We can assign initial values that
		 * should be assigned to our instance
		 * variables for objects that get created using this
		 * constructor
		 */
		name = "no name";
		weight = 0.0;
		height = 0.0;
		eyeColor = "no eye color at the moment";
		age = 0;
		courses = new String[10];
	}
	
	/* Instance methods
	 * They belong to individual objects.
	 * Instance methods can be used to access instance
	 * variables. This means I can be able to manipulate
	 * instance variables inside instance methods.
	 * 
	 * To manipulate, means I can changes the values of the
	 * instance variables. I can also be able to display 
	 * the contents of the instance variables.
	 * 
	 * Instance methods do not have the keyword static
	 * in them.
	 */
	
	/* Encapsulation
	 * This is the concept of making your instance
	 * variables private and creating public methods
	 * for accessing and manipulating the instance
	 * variables
	 * These methods for encapsulation are called
	 * getters and setters
	 */
	
	/*
	 * The setters are used to change a value of a variable
	 * Setters are usually void method but they take a
	 * a parameter. Usually the names of setter start
	 * with the work set followed by the name of the instance
	 * variable to be set.
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		/*parameter error checking
		 * 
		 */
		if(newAge <0) {
			age = 0;
		}else {
			age = newAge;
		}
	}
	
	public void setWeight(double newWeight) {
		/*parameter error checking for negative
		 * weight
		 */
		if(newWeight < 0.0) {
			weight = 0.0;
		}else {
			weight = newWeight;
		}
	}
	
	public void setHeight(double newHeight) {
		/*parameter error checking for negative height
		 * 
		 */
		if(newHeight < 0.0) {
			height = 0.0;
		}else {
			height = newHeight;
		}
	}
	
	public void setEyeColor(String newEyeColor) {
		eyeColor = newEyeColor;
	}
	
	/* Getters are used to get a values from instance
	 * methods
	 * 
	 * Getters return a value. This means if  a method returns
	 * a values, it is not void.
	 * 
	 * Usually getters have no parameters.
	 * 
	 * The name of getter methods start with get followed by 
	 * the name of the instance variable.
	 */
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getEyeColor() {
		return eyeColor;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Name: " + getName());
		
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Height: " + height);
		System.out.println("Eye Color: " + eyeColor);
		System.out.println();
		
	}
	
	/*
	public static void main(String [] args) {
		 Objects
		 * An object is an instance of a class.
		 * An object is created using the keyword new.
		 * 
		 * Syntax for creating objects
		 * ClassName objectname = new ClassName();
		 * 
		 * ClassName objectname;
		 * objectname = new ClassName();
		 
		
		Person person1 = new Person();
		person1.name  = "Isaac";
		System.out.println(person1.name);
		
		Person person2 = new Person();
	}*/
}
