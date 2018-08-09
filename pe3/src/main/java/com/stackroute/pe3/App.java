package com.stackroute.pe3;




public class App
{
	public String student(int[] num) 
	
	{
		return null;
	}
	
	public String  Matrixadd(int[][] m1,int[][] m2 )
	{
		return null;
		
	}
	public String date()
	{
		return null;
	}
	public String Vowels(String[] s1)
	{
		return null;
	}
	//ex5

	public String[][] method1()
	{
		String[][] str=new String[8][8];
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((i+j)%2==0) {
					str[i][j]="WW|";
			}
			else 
				str[i][j]="BB|";
			}
		}
		return str;
	}

//ex6
public String method3(String output)
{
	//String s;
	String[] a=output.split(",");
	int l=a.length;
	//String s1,s2;
	int[] p=new int[l];
	for(int m=0;m<l;m++)
	{
		p[m]=Integer.parseInt(a[m]);
	
			if(l==7)
			{
			if((p[0]==p[1]+1) && (p[1]==p[2]+1) && (p[2]==p[3]+1) && (p[3]==p[4]+1) && (p[4]==p[5]+1) && (p[5]==p[6]-1))
			{
	            return "true";
			}
		}	
	//s2=output+"not consecutive";
			return "false";
	}
		return null;
	}
}
	 




	
	
	
	
	