package ru.bazhenov.fraction;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Fractions {
	public static float ConvertToFloat(Fraction fraction){
		float result;
		result=((float)fraction.getNumerator())/((float)fraction.getDenominator());
		return result;
	}
	public static void ArraySort(Fraction[] a){
		Arrays.sort(a);
	}
	
	//Из стандартного ввода берет n число элементов массива и 2n чисел - числителей и знаменателей
	public static Fraction[] ScanMass() throws IOException{
		System.out.println("Введите число элементов в массиве дробей для сортировки");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Fraction[] arrayFraction = new Fraction[number];
		for (int i=0; i<number; i++){
			arrayFraction[i]= new Fraction();
			arrayFraction[i].ScanFraction();
		}
		return arrayFraction;
	}
	
	//Вывод в консоль элементов массива
	public static void PrintMass(Fraction[] array){
		for(int i=0; i<array.length; i++){
			array[i].Print();
		}
		System.out.println();
	}
}
