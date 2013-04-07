package ru.sergey.arrays;

public class DynamicArraysTest {
	public static void main(String args[]){
		IDynamicArray array=null;
		Animal animal = new Animal();
		Human human = new Human();
		boolean b= true;
		while (b){
			try{
				array=DynamicArrays.readArrayFromConsole();
				b=false;
			}catch (IllegalStateException e){
				b=true;
			}
		}	
		if(array.isEmpty())
			System.out.println("empty");
		else
			System.out.println("not empty");
		DynamicArrays.print(array);
		DynamicArrays.sort(array);
		DynamicArrays.print(array);
		if(array.get(0) instanceof Animal){
			animal.scan();
			array.add(animal);	
		}else{
			human.scan();
			array.add(human);
		}
		DynamicArrays.print(array);
		Object obj = array.get(array.size()-1);
		System.out.println(array.indexOf(obj));
		array.remove(obj);
		if(array.contains(obj))
			System.out.println("bad remove");
		else 
			System.out.println("good remove");
		array.add(obj);
		if(array.contains(obj))
			System.out.println("nice");
	}
}
