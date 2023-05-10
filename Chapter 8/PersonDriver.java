
public class PersonDriver {

	public static void main(String[] args) {
		/* We are going to create objects for the
		 * the person class.
		 */
		
		Person person1 = new Person();
		
		Person person2 = new Person();
		System.out.println(person1);
		System.out.println(person2);
		
		if(person1 == person2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		Person person7 = null;
		
		System.out.println(person1.equals(person2));
		
		System.out.println(person1.equals(person7));
		
		//if(person1 == person2) {
			// they are equal...
		//}
		
		person1.populateCourses();
		
		System.out.println(person1.getSomeRandomCourse() );
		System.out.println(person1);
		//System.out.println(person1.name);
		
		/* I want to call an instance method
		 * objectName.methodName(arguments);
		 */
		String someName = "Isaac";
		person1.setName(someName);
		person1.setAge(23);
		
		person1.setWeight(150.0);
		person1.setHeight(5.0);
		
		//person1.name = "Isaac";
		//person1.age = 10;
		person1.display();
		
		//person2.age = -20;
		person2.display();
		
		
		
		
		Person person6 = new Person("Ryan");
		person6.display();
	}

}
