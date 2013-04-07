package ru.sergey.arrays;



public class SimpleDynamicArray implements IDynamicArray {
	private Object[] array;
	private int length;
	public SimpleDynamicArray(){
		array=null;
		length=0;
	}
	public int size(){
		return length;
	}
	private void resize(int newSize){
		Object[] newArray= new Object[newSize];
		int number;
		if (newSize>length)
			number=length;
		else
			number=newSize;
		for (int i=0; i<number; i++)
			newArray[i]=array[i];
		array=newArray;
		length=newSize;
	}
	private void create (int size){
		array= new Object[size];
	}
	public boolean isEmpty(){
		if (length>0)
			return false;
		return true;
	}
	public boolean contains(Object o){
		for(int i=0; i<length; i++){
			if(array[i]==o)
				return true;
		}
		return false;
	}
	public Object[] toArray(){
		return array;
	}
	public boolean add(Object o){
		if (this.isEmpty())
			create(1);
		resize(length+1);
		array[length-1]=o;
		if(this.contains(o))
			return true;
		return false;
	}
	public boolean remove(Object o){
		if(this.contains(o)){
			int index=this.indexOf(o);
			if(this.remove(index)!=null)
				return true;
		}
		return false;
	}
	public Object remove(int index){
		if(index<0)
			return null;
		if(index<length){
			Object obj;
			obj=array[index];
			for(int i=index; i<(length-2); i++)
				array[i]=array[i+1];
			resize(length-1);
			return obj;
		}
		return null;
	}
	public void clear(){
		array=null;
	}
	public Object get(int index){
		if(index<0)
			return null;
		if(index<length)
			return(array[index]);
		return null;
	}
	public Object set(int index, Object o){
		Object obj;
		if(index<0){
			System.out.println("Bad index");
			return null;
		}
		if (index<length)
			obj=array[index];
		else{
			resize(index+1);
			obj=null;
		}
		array[index]=o;
		return obj;
	}
	public int indexOf(Object o){
		for(int i=0; i<array.length; i++){
			if(array[i]==o)
				return i;
		}
		return -1;
	}
}
