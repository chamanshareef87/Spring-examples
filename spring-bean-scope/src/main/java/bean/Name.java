package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value="singleton")
@Component
public class Name {

	private String firstName="chaman";
	private String lastName="Shareef";
	
	public Name() {
		System.out.println("This will not be printed each time when you sent request");
		System.out.println("Create new Name: " + this.toString());
	}
 
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
 
	public String getLastName() {
		return lastName;
	}
 
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName();
	}
	
}
