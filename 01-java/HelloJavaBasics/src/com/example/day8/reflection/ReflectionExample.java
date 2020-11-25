package com.example.day8.reflection;

/*
 * Reflection allows one to view an object or primitive during runtiem of the application. YOu may
 * also modify the object's structure/stat during runtime. It's VERY powerful.
 */
public class ReflectionExample {

	public static void main(String[] args) {
		

		OatmealCookie oat = new OatmealCookie();
		
		//the "Class" object is used with reflection
		Class reflect = oat.getClass();
		
		System.out.println(reflect.getName());
		System.out.println(reflect.isPrimitive());
		System.out.println(reflect.getSuperclass());
		System.out.println(reflect.getModifiers());
		System.out.println(reflect.getConstructors()[0]);
		System.out.println(reflect.getFields()[0]);
		System.out.println(reflect.getMethods());
	}

}
