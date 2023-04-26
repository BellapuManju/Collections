 package com.ciq.comparable;

public class Student implements Comparable<Student> {
// step:1	copmarable :implement
//	step:2  mention the property for sorting
	
	
	
public String name;
public int age;
@Override
public int compareTo(Student o) {
//	return this.age;
 	return this.name.compareTo(name);

}

}
