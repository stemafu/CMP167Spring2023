import java.util.Random;

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
		this.name = "no name";
		this.weight = 0.0;
		height = 0.0;
		eyeColor = "no eye color at the moment";
		age = 0;
		courses = new String[10];
	}
	
	/* Parameterized constructors take arguments.
	 * 
	 */
	public Person(String name) {
		this.name = name;
		age = 0;
		weight = 0.0;
		height = 0.0;
		eyeColor = "NA";
		courses = new String[5];
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		weight = 0.0;
		height = 0.0;
		eyeColor = "NA";
		courses = new String[5];
	}	
	
	public Person(String newName, int newAge, double newWeight) {
		name = newName;
		age = newAge;
		weight = newWeight;
		height = 0.0;
		eyeColor = "NA";
		courses = new String[5];
	}
	
	public Person(String newName, int newAge, double newWeight,
			double newHeight) {
		name = newName;
		age = newAge;
		weight = newWeight;
		height = newHeight;
		eyeColor = "NA";
		courses = new String[5];
	}		
	
	public Person(String newName, int newAge, double newWeight,
			double newHeight, String newEyeColor) {
		name = newName;
		age = newAge;
		weight = newWeight;
		height = newHeight;
		eyeColor = newEyeColor;
		courses = new String[5];
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
	 * with the word set followed by the name of the instance
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
	
	public void setWeight(double weight) {
		/*parameter error checking for negative
		 * weight
		 */
		if(weight < 0.0) {
			this.weight = 0.0;
		}else {
			this.weight = weight;
		}
	}
	
	/* a parameter can have the same name as the instance
	 * variable. However, we need to have a way of differentiating
	 * the parameter and the instance variable. So, we can use
	 * the this keyword to refer to the instance variable.
	 * 
	 * this.instanceVariableName
	 */
	public void setHeight(double height) {
		/*parameter error checking for negative height
		 * 
		 */
		if(height < 0.0) {
			this.height = 0.0;
		}else {
			this.height = height;
		}
	}
	
	public void setEyeColor(String newEyeColor) {
		eyeColor = newEyeColor;
	}
	
	/* Getters are used to get values from instance
	 * methods. These values represent the values that
	 * are inside instance variables.
	 * 
	 * Getters return a value. This means if  a method returns
	 * a values, it is not void.
	 * 
	 * Usually getters have no parameters.
	 * 
	 * The name of getter methods start with get followed by 
	 * the name of the instance variable.
	 * 
	 * this
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
		//System.out.print("Name: " + name);
		
		/* We can also use this to call an instance method
		 * that has been defined within the class.
		 */
		
		System.out.print(" Name: " + this.getName());
		
		System.out.print(" Age: " + age);
		System.out.print(" Weight: " + weight);
		System.out.print(" Height: " + height);
		System.out.print(" Eye Color: " + eyeColor);
		System.out.println();
		
	}
	
	
	public void populateCourses() {
		courses[0] = "CMP 167 - Programming Methods I";
		courses[1] = "CMP 168 - Programming Methods II";
		courses[2] = "MAT 313 - Linear Algebra";
		courses[3] = "CMP 232 - Discrete Math";
		courses[4] = "CMP 342 - Internet Programming";
	}
	
	public String getSomeRandomCourse() {
		Random rand = new Random();
		
		return courses[rand.nextInt(5)];
	}
	
	
	public boolean haveSameCourses(Person otherPerson) {
		
		
		if(this.courses.length != otherPerson.courses.length) {
			return false;
		}
		
		for(int i = 0; i < this.courses.length; i++) {
			
			if(this.courses[i] != null) {
				if(!this.courses[i].equalsIgnoreCase(otherPerson.courses[i]) ) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	/* If we want to compare object (People) We
	 * need to create an equals methods.
	 * 
	 * The goal of this equals method would be to
	 * return true if the two objects being compared are the
	 * same. Two objects are the same if they have the same
	 * characteristics.
	 * 
	 * Otherwise, return false.
	 */
	
	public boolean equals(Object obj) {
		// null check on the parameter.
		if(obj == null) {
			return false;
		}
		
		if (!this.getClass().isInstance(obj)) {
			return false;
		}
		
		if(obj == this) {
			return true;
		}
		
		/* remember that the parameter is an Object not 
		 * a person. We need to convert this object to person.
		 * type conversion
		 */
		
		Person otherPerson;
		otherPerson = (Person)obj;
		
		/* Now we need to compare individual values
		 * for the two people that we are comparing.
		 */
		
		if(this.age != otherPerson.age) {
			return false;
		}
		
		if(this.weight != otherPerson.weight) {
			return false;
		}
		
		if(this.height != otherPerson.height) {
			return false;
		}
		
		if(!this.name.equalsIgnoreCase(otherPerson.name)) {
			return false;
		}
		
		if(!this.eyeColor.equalsIgnoreCase(otherPerson.eyeColor)) {
			return false;
		}
		
		if(this.haveSameCourses(otherPerson) == false) {
			return false;
		}
		return true;
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
