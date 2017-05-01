package main.java.com.brwa.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -726958146259925017L;
	private String firstName = "John";
	    private String lastName = "Doe";

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

	    public String showGreeting() {
	        return "Hello" + " " + firstName + " " + lastName + "!";
	    }

}