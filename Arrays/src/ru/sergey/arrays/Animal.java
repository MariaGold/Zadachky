package ru.sergey.arrays;

import java.util.Scanner;

public class Animal implements Comparable<Animal> {
	private int weigth;
	private String name;
	public void setWeigth(int vol){
		weigth=vol;
	}
	public void setName(String vol){
		name=vol;
	}
	public int getWeigth(){
		return weigth;
	}
	public String getName(){
		return name;
	}
	@Override
	public int compareTo(Animal animal) {
		int number=weigth-animal.getWeigth();
		return number;
	}
	public void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите вес:");
		this.setWeigth(sc.nextInt());
		System.out.println("¬ведите им€:");
		this.setName(sc.next());
	}
	@Override
	public String toString(){
		String str;
		str="Name of animal = ";
		str=str+name;
		str=str+"weigth = ";
		str=str+weigth;
		return str;
	}
	
}
