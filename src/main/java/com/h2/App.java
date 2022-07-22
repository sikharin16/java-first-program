package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number*2;
    }
    public static int add(int[] number){
        int sum = 0;
        for(int item : number) {
            sum+=item;
        }
        return  sum;
    }
}
