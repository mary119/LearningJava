package com.xworkz.collectionfw.queue;

import java.util.Comparator;

public class Bird implements Comparator<Bird> {
	
	String name;
	String color;
    int lifeSpan;
	public Bird(String name, String color, int lifeSpan) {
		super();
		this.name = name;
		this.color = color;
		this.lifeSpan = lifeSpan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + ", lifeSpan=" + lifeSpan + "]";
	}
	@Override
	public int compare(Bird o1, Bird o2) {
		return (int)this.lifeSpan-o1.lifeSpan;
		
	}
    
    


}
