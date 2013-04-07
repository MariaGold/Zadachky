package ru.sergey.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrays {
	public static void sort(IDynamicArray dArray){
		Object[] array = dArray.toArray();
		Arrays.sort(array);
		for(int i=0; i<dArray.size(); i++){
			dArray.set(i,array[i]);
		}
	}
	public static void print(IDynamicArray dArray){
		int size = dArray.size();
		for (int i=0; i<size; i++){
			System.out.println(dArray.get(i).toString());
		}
	}
	public static IDynamicArray readArrayFromConsole() throws IllegalStateException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите тип элементов массива:\n" +
				"1 - Animal\n" +
				"2 - Human\n");
		int type = sc.nextInt();
		if((type!=1)&(type!=2)) throw new IllegalStateException("Bad type");
		System.out.println("Выберите тип массива:\n" +
				"1 - Simple\n" +
				"2 - Linked\n");
		int type2 = sc.nextInt();
		if((type2!=1)&(type2!=2)) throw new IllegalStateException("Bad type");
		System.out.println("Введите количество элементов:");
		int number = sc.nextInt();
		if (type==1){
			if (type2==1){
				SimpleDynamicArray array = new SimpleDynamicArray();
				for (int i=0; i<number; i++){
					Animal element=new Animal();
					element.scan();
					array.add(element);
				}
				return array;
			}else{
				if (type2==2){
					LinkedDynamicArray array = new LinkedDynamicArray();
					for (int i=0; i<number; i++){
						Animal element=new Animal();
						element.scan();
						array.add(element);
					}
					return array;
				}else
					return null;
			}
		}else{
			if (type==2){
				if (type2==1){
					SimpleDynamicArray array = new SimpleDynamicArray();
					for (int i=0; i<number; i++){
						Human element=new Human();
						element.scan();
						array.add(element);
					}
					return array;
				}else{
					if (type2==2){
						LinkedDynamicArray array = new LinkedDynamicArray();
						for (int i=0; i<number; i++){
							Human element = new Human();
							element.scan();
							array.add(element);
						}
						return array;
					}else
						return null;
				}
			}else
				return null;
		}
	}
}
