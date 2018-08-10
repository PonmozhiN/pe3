package com.stackroute.pe4;

import static org.junit.Assert.assertArrayEquals;
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

//ex1
    @Test
    public void LongString() {
    assertEquals("abababaaaabababa",p.Longstring("aabbccabababaaaabababacbabccbcbcb"));
    assertNotEquals("abafdsasdfr",p.Longstring("abadadaaba"));
    }
   //ex2
    @Test
    public void occur()
    {
    	assertEquals(5,p.Occur("sunshinesunsunset", "s"));
    	assertNotEquals(8,p.Occur("sunshinesunsetsunn","n"));
    }
    
    @Test
    public void replace()
    {
    	assertEquals("faityfry",p.Replace("daiIydry"));
    	assertNotEquals("fairygirl",p.Replace("daiIygo"));
    }
    
    @Test
    public void test4() {
    	assertEquals(new String("aaghhiikmnrsssu"), p.Setstring(new String("Sashi Kumar Singh")));
    	assertNotNull( p.Setstring(new String("Sashi Kumar Singh")));
    	assertNotEquals(new String("Sashi Kumar Singh"),  p.Setstring(new String("Sashi Kumar Singh")));
    }
    @Test
    public void test5() {
    	assertArrayEquals(new String[] {"a", "kciuq", "nworb", "xof", "spmuj", "revo", "eht", "yzal", "god"},
    			p.Transpose(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}));
    	assertNotNull(p.Transpose(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}));
    	assertNotEquals(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"},
    			p.Transpose(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}));
    }
    @Test
    public void test6() {
		assertEquals(new String("true"), p.Regexp(new String("This is Harry")));
		assertEquals(new String("false"), p.Regexp(new String("This is Henry")));
		assertNotNull(p.Regexp(new String("This is Henry")));
	}
    @Test
	public void test7() {
		assertEquals(new String("4-6 10-12 27-29"), p.pattern(new String("She sells seashells by the seashore"),
					new String("se")));
		assertNotNull(p.pattern(new String("She sells seashells by the seashore"),new String("se")));
		assertNotEquals(new String("4-6 10-12 27-28"), p.pattern(new String("She sells seashells by the seashore"),
				new String("se")));
	}
    
}
    