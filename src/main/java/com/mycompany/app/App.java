package com.mycompany.app;

/**
 * Hello world!
 *
 */
 import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        int a,b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b= in.nextInt();
		int sum = a + b;
		System.out.println( "Sum: " + sum );
    }
}