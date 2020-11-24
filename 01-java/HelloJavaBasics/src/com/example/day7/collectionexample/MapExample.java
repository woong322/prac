package com.example.day7.collectionexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		///HASHMAP
		//  (key)  , (value)
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(5, "ScreenSlaver");
		hashMap.put(8, "Joker");
		hashMap.put(2, "Venom");
		hashMap.put(-88, "Maleficient");
		hashMap.put(0, "TaskMaster");
		hashMap.put(0, "Squirrel Girl");
		
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get(-88));
//		System.out.println(hashMap.get(200)); //null
		
		
//		//TREEMAP
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.putAll(hashMap);
		System.out.println(treeMap);
		
		
		//Loop
		//You can iterate over...the key set (SET COLLECTION), the value list (LIST COLLECTION)
		// or the entry set(both)
		for(Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+ "\t"+entry.getValue());
			//this is an example of iterating over the entry set
			//   later, try to iterate over one or the other
		}
	}
}