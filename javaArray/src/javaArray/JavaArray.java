package javaArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaArray {

	public JavaArray() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String argv[]) {
		JavaArray obj = new JavaArray();
		obj.AddElementAtSpecifiedIndex();
		
		obj.AppendAllElementOfCollection();
		
		obj.CreateArrayFromArrayList();
		
		obj.IterateElementsUsingIterator();
	}
	
	public void AddElementAtSpecifiedIndex() {
		List<Integer> list = new ArrayList<Integer>();
		
		/*
		 * add() method appends the specified element to the end of given list.
		 */
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("Elements in Arraylist");
		/*
		 * As ArrayList implements Iterable ArrayList can be used in extended
		 * For Loop
		 */
		for (int i : list) {
			System.out.println(i);
		}
		
		/*
		 * ArrayList has an Overloaded method of add(). This overloaded
		 * method(add(index, element)) inserts the specified element at the
		 * specified position in given list. It shifts the element currently at
		 * that position and any subsequent elements to the right (If it exist).
		 * 
		 * Note: Index of ArrayList starts with 0.
		 */
		list.add(2, 6); // This will add element 6 at index 2 or 3rd position
		
		System.out.println("After adding element in ArrayList");
		for (int i : list)
			System.out.println(i);
	}
	
	/*
	 * Here we will learn how to append elements from a Collection to ArrayList.
	 */
	public void AppendAllElementOfCollection() {
		List<Integer> list = new ArrayList<Integer>();
		
		/*
		 * add() method appends the specified element to the end of given list.
		 */
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(10);
		
		List<Integer> listToAppend = new ArrayList<Integer>();
		
		/*
		 * This is the second collection whose elements needs to be added in
		 * first collection.
		 */
		listToAppend.add(5);
		listToAppend.add(6);
		listToAppend.add(7);
		listToAppend.add(8);
		
		System.out.println("Elements in ArrayList");
		/*
		 * As ArrayList implements Iterable, ArrayList can be used in extended
		 * For Loop
		 */
		for (int i : list)
			System.out.println(i);
		
		/*
		 * ArrayList have a Overloaded method (addAll(Collection<? extends E> c))
		 * which appends all of the elements in the specified collection to the
		 * end of given list, int the order elements are returned by the
		 * specified collection's iterator. The behavior of this operation is
		 * undefined if the specified collection is modified while the operation
		 * is in progress.
		 */
		list.addAll(listToAppend);
		
		System.out.println("ELements in ArrayList after appending all elements from Collection");
		
		for (int i : list)
			System.out.println(i);
	}
	
	/*
	 * Here we will learn to create Array from ArrayList
	 */
	public void CreateArrayFromArrayList() {
		List list = new ArrayList();
		list.add("Hi");
		list.add("8");
		list.add("How");
		list.add("You");
		
		/*
		 * toArray() method returns an array containing all of the elements in given list in proper
		 * sequence (from first to last element)
		 */
		Object[] objArr = list.toArray();
		
		System.out.println("Elements in Array");
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}
	}
	
	public void IterateElementsUsingIterator() {
		List<Integer> list = new ArrayList<Integer>();
		
		/*
		 * add() method appends the specified element to the end of given list.
		 */
		list.add(1);
		list.add(21);
		list.add(3);
		list.add(4);
		
		/*
		 * iterator() method in list would returns an iterator over the elements
		 * in given list in proper sequence.
		 */
		Iterator<Integer> iter = list.iterator();
		
		System.out.println("Elements in list");
		
		/*
		 * hasNext() method returns true if the iterator has more elements, and
		 * would return an element rather than throwing an exception.
		 */
		while(iter.hasNext()) {
			/*
			 * next() method returns the next element in the iteration.
			 */
			System.out.println(iter.next());
		}
	}

}
