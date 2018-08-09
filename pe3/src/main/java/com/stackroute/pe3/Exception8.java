package com.stackroute.pe3;

public class Exception8 {
	public String nullpointer(int size) 
	{
		return null;
	}
	public String negativearr(int size) {
		
		try {
			int[] h=new int[size];
			
		}
		catch(NegativeArraySizeException e){
			
			return "null";
			
		}
		return null;
	}
	public String arrindex(int[] g, int index) {
		try {
			
			g[11]=22;
			
		}catch(IndexOutOfBoundsException e)
		{
		 return "11";	
		}
	
		return null;
	}
	public String nullpoint() {
		String str=null;
		try {
			if(str.equals("anu"))
				return "same";
			else
				return "not same";
			
		}catch(NullPointerException e)
		{
			return "null";
		}
	}
}
	
	
	


