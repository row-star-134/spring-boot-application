package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //this can help to create automatic object for class
//@Scope(value="prototype") //when create the class instance at that time create object when used
public class Alien {
 private int aid;
 private String anama;
 private String tech;
 @Autowired   //search the object by type
 @Qualifier("lap1") //search object by name
 private laptop l1;
 public laptop getL1() {
	return l1;
}
public void setL1(laptop l1) {
	this.l1 = l1;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAnama() {
	return anama;
}
public void setAnama(String anama) {
	this.anama = anama;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}

public void Maker() {
	System.out.println("Here");
	l1.laptopFunction();
}
public Alien() {
	super();
	System.out.println("Automatic Generate Function For Me");
	
}

}
