package com.example.day4.moreprecedence;

public class MoreOnPrecedenceExample {

	public static void main(String[] args) {
		System.out.println("hello"+10+11); //there is an implicit conversion happening here
						//"hello10" + 11
						//"hello1011"
		System.out.println(25+10+"hello"+10+11);
						//35 + "hello" + 10 + 11
						//....
						//"35hello1011"

	}

}
