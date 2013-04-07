package ru.sergey.arrays;

import java.util.Scanner;

public class Human implements Comparable<Human>{
	private int age;
	private String name;
	public void setAge(int vol){
		age=vol;
	}
	public void setName(String vol){
		name=vol;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	@Override
	public int compareTo(Human human) {
		return(age-human.getAge());
	}
	public void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите возраст:\n");
		this.setAge(sc.nextInt());
		System.out.println("¬ведите им€:\n");
		this.setName(sc.next());
	}
	@Override
	public String toString(){
		String str;
		str="Age=";
		str=str+age;
		str=str+" Name = ";
		str=str+name;
		return str;
	}
	
}
