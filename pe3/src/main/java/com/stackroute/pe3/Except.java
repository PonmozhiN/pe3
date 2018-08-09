package com.stackroute.pe3;

public class Except {
	public static void main(String args[]) {
		
	//public static void testException() {
		try {
			throw new Exception("any message");
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		finally {
			System.out.println("no message");
		}
	}

}

