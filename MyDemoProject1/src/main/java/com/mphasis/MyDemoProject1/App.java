package com.mphasis.MyDemoProject1;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void method(String data) {
		System.out.println("data is "+data);
		if(data.equals(data)) {
			System.out.println("welcome");
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        method("poojitha");
    }
}
