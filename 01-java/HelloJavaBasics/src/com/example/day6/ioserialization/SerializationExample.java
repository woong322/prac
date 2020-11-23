package com.example.day6.ioserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		

	}
	
	static Object readObject(String filename) {
		Object obj=null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			obj = ois.readObject(); //de-serialization
			//System.out.println(obj);
			return obj;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			//this will still fire in the case of a return triggering in the try block
			System.out.println(obj);
			System.out.println("in finally");
			((Person)obj).setName("Changed");
			obj=null;
		}
		return null;
	}

	static void writeObject(String filename, Object obj) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(obj); //serialization

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
