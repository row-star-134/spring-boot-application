package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1") //create object by spring boot as a new name like lap1 instead of laptop
public class laptop {
 private int lid;
 private String lname;
 private String component;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getComponent() {
	return component;
}
public void setComponent(String component) {
	this.component = component;
}
public laptop() {
	super();
	System.out.println("This is laptop class");
}
public void laptopFunction() {
	System.out.println("I AM IN LAPTOP CLASS");
}


}
