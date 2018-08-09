package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;


import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;


public class AppTest{
    private static App p;

    @BeforeClass
    public static void setup() {
    	 p=new App();
    }
        

    

    @AfterClass
    public static void teardown() {
       p=null;
    }

/*//ex1
    @Test
    
public void Student()
{
	int[] nostu= {20};
	int[] studentgrade= {45,89,78,65};
	int[] studentgrade1={123,243,167};
	
		assertEquals("invalid grade",p.student(studentgrade1));
		assertNotEquals("grade is between 0 and 100",p.student(studentgrade));	
}
//ex2
    @Test
public void matrixadd()
{
    int r=2;
    int c=2;
int[][] m1= {{3,2},{4,5}};
int[][] m2= {{6,7},{4,3}}; 
int[][] m3= {{9,9},{8,8}};
int[][] m5= {{5,7},{6,9}};
  assertEquals(m3,p.Matrixadd(m1,m2)); 
  assertNotEquals(m5,p.Matrixadd(m1,m2));   	
}
//ex3
    @Test
    public void date()
    {
  
    	assertEquals("Mon 06/08/2018 Sun 12/08/2018",p.date());
    	assertNotEquals("Mon 04/08/2018 Sun 14/08/2018",p.date());
    	
    }
//ex4
    @Test
    public void Vowels()
    {
    String[] s1= {"India","United states","Germany","Czechoslovakia"};	
    String[] s2= {"nda","ntd stts","grmny","czchslvk"};
    assertEquals(s2,p.Vowels(s1));
    assertNotEquals("grmy",p.Vowels(s2));
    
    }
*/    //ex6
    @Test
	public void testFailure() 
	{
		String output = "10, 11, 12, 13, 14, 15, 16";
		assertNotEquals("true", p.method3(output));
	}
    //ex5
	@Test
    public void testPass()
    {
        String[][] str= {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                                              {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
      
        assertNotEquals(str, p.method1());
    }
	
}
