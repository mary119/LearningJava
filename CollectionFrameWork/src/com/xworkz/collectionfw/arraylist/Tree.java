package com.xworkz.collectionfw.arraylist;

public class Tree implements Comparable<Tree>{
	
	private int age;
	private String name;
	private double height;
	
	public Tree(int age, String name, double height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}

	//    
	//@Override
	//public String toString() {
	//	return "Tree[age=" + age + ", name= "+ name+ ",height="+height+"]";
	//}

	@Override
	public int compareTo(Tree obj) {
		return (int) (this.height-obj.height);//name.compareTo(o.getName());//age - o.age;
	}
	

		
	
}


