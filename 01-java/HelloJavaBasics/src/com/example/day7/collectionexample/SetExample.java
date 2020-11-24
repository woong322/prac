package com.example.day7.collectionexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//HASH SET
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(5);
		hashSet.add(10);
		hashSet.add(5);
		hashSet.add(88);
		hashSet.add(95);
		hashSet.add(5);
		hashSet.add(-600);
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		//System.out.println(hashSet.get()); //cannot use index
		System.out.println(hashSet.contains(88));
		
		///TREE SET
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.addAll(hashSet);
		System.out.println(treeSet);
		
		//what happens if we add a value to hashSet?
		hashSet.add(25);
		System.out.println(treeSet);
	}

}