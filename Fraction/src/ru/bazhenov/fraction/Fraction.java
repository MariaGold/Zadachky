package ru.bazhenov.fraction;


import java.io.IOException;
import java.util.Scanner;

public class Fraction implements Comparable<Fraction>{
	private int numerator;
	private int denominator;
	//Вывод в консоль смешанного представления дроби
	public void Mixed (){
		int integer;
		Fraction resultFraction = new Fraction();
		resultFraction.denominator=this.denominator;
		resultFraction.numerator=this.numerator;
		integer = resultFraction.numerator/resultFraction.denominator;
		resultFraction.numerator=resultFraction.numerator-integer*resultFraction.denominator;
		this.NOD();
		System.out.print(integer + "+");
		resultFraction.Print();
		System.out.println();
	}
	//Реализация интерфейса
	public int compareTo (Fraction firstFraction){
		int result=firstFraction.numerator*this.denominator-firstFraction.denominator*this.numerator;
		if (result<0)
			return -1;
		if (result==0)
			return 0;
		if (result>0)
			return 1;
		return -2;
	}
	//Возвращает результат сложения двух дрробей
	public Fraction Add(Fraction fraction){
		Fraction result = new Fraction();
		result.numerator=this.numerator*fraction.denominator+fraction.numerator*this.denominator;
		result.denominator=this.denominator*fraction.denominator;
		result.NOD();
		return result;
	}
	//Вывод значения дроби в консоль
	public void Print(){
		System.out.print(this.numerator + "/" + this.denominator + "   ");
	}
	//Возвращает результат вычитания
	public Fraction Sub (Fraction fraction){
		Fraction result = new Fraction();
		result.numerator=this.numerator*fraction.denominator-fraction.numerator*this.denominator;
		result.denominator=this.denominator*fraction.denominator;
		result.NOD();
		return result;
	}
	//Возвращает резыльтат умножения
	public Fraction Mul(Fraction fraction){
		Fraction result = new Fraction();
		result.numerator=this.numerator*fraction.numerator;
		result.denominator=this.denominator*fraction.denominator;
		result.NOD();
		return result;
	}
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	public void setNumerator(int number){
		numerator=number;
	}
	public void setDenominator(int number){
		denominator=number;
	}
	//Деление
	public Fraction Div(Fraction fraction){
		Fraction result = new Fraction();
		result.numerator=this.numerator*fraction.denominator;
		result.denominator=this.denominator*fraction.numerator;
		result.NOD();
		return result;
	}
	//Упрощение дроби
	private void NOD(){
		int a; 
		int b;
		a=this.numerator; 
		b=this.denominator;
		while((a!=0) && (b!=0)){
				if(a>=b) a=a%b;
				else b=b%a;
		}
		a=a+b;
		this.numerator=this.numerator/a;
		this.denominator=this.denominator/a;
		if(this.denominator<0){
			this.denominator=-this.denominator;
			this.numerator=-this.numerator;
		}
	}
	public Fraction(){
	}
	//Считывание числителя и знаменателя с консоли
	public void ScanFraction() throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите числитель и знаменатель дроби");
		numerator=sc.nextInt();
		denominator=sc.nextInt();
	}
	
}