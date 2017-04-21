package DataStructures.JavaGenerics;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Solution {

    static class Printer
    {
        public <T> void printArray(T[] arr) {

            for(T element : arr ) {
                System.out.println(element);
            }
        }

    }


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        ArrayList<Integer> sad = new ArrayList();
       // sad.sort();

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
