package ru.sergey.arrays;

public class LinkedDynamicArray implements IDynamicArray {
	Node element;
	public LinkedDynamicArray(){
		element=null;
	}
	public int size(){
		int i=0;
		Node p=element;
		while(p!=null){
			i++;
			p=p.next;
		}
		return i;
	}
	public boolean isEmpty(){
		if (element==null)
			return true;
		return false;
	}
	public boolean contains(Object o){
		Node p=element;
		while(p!=null){
			if(p.item==o)
				return true;
			p=p.next;
		}
		return false;
	}
	public Object[] toArray(){
		Object[] objects = new Object[this.size()];
		int i;
		Node p=element;
		for(i=0; i<this.size(); i++){
			objects[i]=p.item;
			p=p.next;
		}
		return objects;
	}
	public boolean add(Object o){
		Node newElement = new Node(null, o, null);
		Node p=element;
		if(element==null){
			element=newElement;
			return true;
		}
		while(p.next!=null)
			p=p.next;
		p.next=newElement;
		newElement.prev=p;
		if (this.contains(o))
			return true;
		return false;
	}
	public boolean remove(Object o){
		Node p, prev, next;
		p=element;
		while(p!=null){
			if(p.item==o){
				prev=p.prev;
				next=p.next;
				if(prev==null)
					element=next;
				else
					prev.next=next;
				if(next!=null)
					next.prev=prev;
				return true;
			}
			p=p.next;
		}
		return false;
	}
	public Object remove(int index){
		Node p, prev, next;
		p=element;
		if(index>=this.size())
			return null;
		for(int i=0; i<index; i++)		
				p=p.next;
		prev=p.prev;
		next=p.next;
		if(prev==null)
			element=next;
		else
			prev.next=next;
		if(next!=null)
			next.prev=prev;
		return p.item;
	}
	public void clear(){
		length=0;
		element =null;
	}
	public Object get(int index){
		int i=0;
		Node p = element;
		Object obj;
		if(index>=this.size()){
			return null;
		}else{
			while(i<index){
				p=p.next;
				i++;
			}
			obj=p.item;
		}
		return obj;
	}
	public Object set(int index, Object o){
		Node p=element;
		Object obj;
		int i=0;
		if(index>=this.size())
			return null;
		while(i<index){
			p=p.next;
			i++;
		}
		obj=p.item;
		p.item=o;
		return obj;
	}
	public int indexOf(Object o){
		Node p=element;
		int index=0;
		while(p!=null){
			if(p.item==o)
				return index;
			p=p.next;
			index++;
		}
		return -1;
	}
	private static class Node {
        Object item;
        Node next;
        Node prev;

        Node(Node prev, Object element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
	}
}
