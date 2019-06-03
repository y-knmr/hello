package com.hello.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("index")
@RequestScoped
// @ViewScoped
// @SuppressWarnings("serial")
//public class IndexBean implements Serializable {
public class IndexBean {

	private String firstName;

	private String lastName;

	@PostConstruct
	public void init() {
		System.out.println("called init");
	}

	public String showGreeting() {
		System.out.println("called showGreeting");
		System.out.println("fn: " + firstName + ":  ln:  " + lastName);
		;
		return "Hello " + getFirstName() + " " + getLastName() + "!!";
	}

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

}
