package com.example.day7.collectionexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		///ARRAY LIST
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(5);
		arrayList.add(88);
		arrayList.add(95);
		arrayList.add(5);
		arrayList.add(-600);
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(3));
		//System.out.println(arrayList.get(200)); //leads to an exception
		//System.out.println(myList.get(9));
		
		
		////LINKED LIST
		List<Integer> linkedList = new LinkedList<>();
		//it's used the same way as arrayList
		
		// Iterators
		
		  ListIterator<Integer> listIterator = arrayList.listIterator();
		  
		  while (listIterator.hasNext()) { System.out.println(listIterator.next() + " ");
		  }
		  
		  System.out.println();
		  
		  ListIterator<Integer> listIteratorTwo = arrayList.listIterator(arrayList.size());
		  
		  while (listIteratorTwo.hasPrevious()) {
		  System.out.print(listIteratorTwo.previous() + " "); }
		
	}

}