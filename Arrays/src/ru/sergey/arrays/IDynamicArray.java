package ru.sergey.arrays;

public interface IDynamicArray {
	int size();// Ц возвращает размер массива;
	boolean isEmpty();// Ц пустой ли массив или нет?;
	boolean contains(Object o);// Ц содержитс€ ли в массиве объект o;
	Object[] toArray();// Ц приведение к обычному массиву;
	boolean add(Object e);// Ц добавление объекта в конец, возвращает, успешно ли прошла операци€;
	boolean remove(Object o);// Ц удаление объекта, возвращает, был ли такой объект или нет в массиве;
	Object remove(int index);// Ц удаление по индексу, возвращает удаленный объект;
	void clear();// Ц очищает весь массив (удал€ет все элементы);
	Object get(int index);// Ц возвращает элемент по индексу;
	Object set(int index, Object element);// Ц устанавливает объект на место с индексом index, возвращает элемент, который раньше был на этом месте;
	int indexOf(Object o);// Ц индекс объекта o в данном массиве, если он в нем содержитс€, иначе возвращать -1.
}
