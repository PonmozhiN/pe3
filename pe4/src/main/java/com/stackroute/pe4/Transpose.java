 package com.stackroute.pe4;

public class Transpose {



public void transpose( String s )
  {
      String t = ""; 
      int end = s.length() - 1;


        for ( int i = 0; i < s.length()  / 2; i++ )
        {
            t += Character.toString( s.charAt( i ) ) + Character.toString( s.charAt( end ) );
            end--;
        }
        // Lenth of String is odd
        if ( s.length() % 2 == 1 )
        {
            // add character in middle of String to the end of the new String
            t+= Character.toString( s.charAt( s.length() / 2 ) );
        }
  }
        public static void main (String args[]) {

        System.out.println( "t" );
  }
}
