import java.util.Date;
import java.util.Calendar;

public class People {
	
	// Getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	// instance variables
	String firstName;
	String lastName;
	Date dateOfBirth;
	
	//Age as an integer
	public int getAge() {
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - dateOfBirth.getYear() - 1900;
		
		if (today.get(Calendar.MONTH) < dateOfBirth.getMonth() || 
			(today.get(Calendar.MONDAY) == dateOfBirth.getMonth() && today.get(Calendar.DATE) < dateOfBirth.getDate())) {age--;}
		return age;
	}
	
	// how many people created
	static int peopleCounter;

	public People(String firstName, String lastName, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		peopleCounter++;
	}
	
	// Output all variables
	public static void allInformation(People person) {
		System.out.println("First Name: " + person.firstName + "\n" + "Last Name: " + person.lastName + "\n" + "Date of Birth: " + person.dateOfBirth.toString());
		
	}
	
	// Adding people
	public static void main(String[] args) {
		People person1 = new People("Bethany", "Ross", new Date(1993-1900, 9-1, 13));
		People person2 = new People("Ruichen", "Gao", new Date(1999-1900,11-1,17));
		allInformation(person1);
		allInformation(person2);
		System.out.println("Person 1\'s age: " + person1.getAge());
		System.out.println("Person 2\'s age" + person2.getAge());
		
		System.out.println("Number of people in the people class: " + peopleCounter);
	}
			

}
