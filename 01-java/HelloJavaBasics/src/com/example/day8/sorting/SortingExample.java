package com.example.day8.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("bye");
		list.add("tell me why");
		list.add("ain't nothing but a heaaart ache?");
		list.add("tell me whyyyy");
		
		//System.out.println(list);
		
		/*
		 * CollectionSSSSSSSSSSSSSSSSSSSSSSSS <------note the "s"
		 * 
		 * is a utility class filled with static methods that aid with objects that are of type
		 * "Collection"
		 * 
		 * Fun Fact there are other utility classes as well:
		 * Arrays
		 * Math
		 * 		etc....there are more
		 */
		Collections.sort(list);
		//System.out.println(list);
		
		
		////////LET'S SORT OUR OWN OBJECT
		
		List<Student> myStudentList = new ArrayList<>();
		myStudentList.add(new Student(4, "Albert", 3.7, LocalDate.of(1997, 2, 25)));
		myStudentList.add(new Student(71, "Gina", 4.0, LocalDate.of(1989, 6, 15)));
		myStudentList.add(new Student(52, "Mena", 3.8, LocalDate.of(1987, 11, 24)));
		myStudentList.add(new Student(5, "Trevin", 3.2, LocalDate.of(1776, 4, 1)));
		
		System.out.println(myStudentList);
		
		/*
		 * Using the comparable's sorting algorithm defines the NATURAL sorting of this entity/object
		 */
		Collections.sort(myStudentList);
		System.out.println(myStudentList);

		/*
		 * Using the comparator's sorting algorithm define the UNNATURAL sorting of this entity/object
		 */
		Collections.sort(myStudentList, new StudentGpaComparator());
		System.out.println(myStudentList);
		
		
		///let's try it with a lambda
		Collections.sort(myStudentList, (Student o1, Student o2)->{
			return o1.getStudentId()-o2.getStudentId();
		});
		System.out.println(myStudentList);
	}

}
