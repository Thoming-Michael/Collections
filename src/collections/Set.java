/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author mthoming
 */
public class Set {

    public static void mainOld(String[] args) throws Exception{
        
        HashSet setA = new HashSet();

        
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter some text or numbers to be added to the set: ");
    	String firstElement = systemInScanner.next();
    	System.out.printf("enter something else to add to the set (duplicate "
                            + "values will only be saved once): ");
    	String secondElement = systemInScanner.next();
    	System.out.printf("enter one last thing to add to the set: ");
    	String thirdElement = systemInScanner.next();        
       
        setA.add(firstElement);
        setA.add(secondElement);
        setA.add(thirdElement);
        
        System.out.printf("\n Your new set looks like this: \n" + setA); 
        
//        Iterator iterator = setA.iterator();
//        
//        while(iterator.hasNext()){
//            String element = (String) iterator.next();
//            System.out.printf( element, iterator);
//            System.out.println("\n");
//        }
        
        System.out.printf("\n Enter the text of an item you would like to search for in this set: \n");
        String searchForString = systemInScanner.next();
        
        boolean containsString = setA.contains(searchForString);
        System.out.println(containsString);
        
        if(containsString == true) {
            System.out.printf("Your text -%s- was found in the set\n", searchForString);
        }
        else {
            System.out.printf("your text was NOT found in the set\n");
        }
        
    }    
}
