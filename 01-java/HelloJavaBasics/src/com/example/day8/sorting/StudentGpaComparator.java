package com.example.day8.sorting;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		/*
		 * compare() will return a negative number, 0, or a positive number.
		 * 
		 * Collections.sort() OR treeMap/Set will use this value to determine the order
		 * of the elements.
		 * 
		 * Negative nubmers mean THIS object is "less" than the other object.
		 * 0 means THIS object is equal to the other object
		 * Positive numbers mean THIS object is "more" than the other object.
		 */
		double o1Gpa = o1.getGpa();
		double o2Gpa = o2.getGpa();
		
		if(o1Gpa>o2Gpa)
			return 1;
		else if (o1Gpa<o2Gpa)
			return -1;
		else {
			/*
			 * if you wanted to, you could have further complex sorting rules for "ties"
			 * 
			 * if(o1.lastName() >o2.lastName())   <-----this is psuedo code, you don't compare strings this way
			 * 		blahblahblahblah.....
			 * else if(o1.lastName() <o2.lastName())
			 * 		bobloblaw.....
			 */
			return 0;
			
		}
	}

}
