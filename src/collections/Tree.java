/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author mthoming
 */
public class Tree {
    public static void mainOld(String[] args) throws Exception{

        TreeSet ts1 = new TreeSet();
        
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter some text or numbers to be added to the TreeSet: ");
    	String firstElement = systemInScanner.next();
    	System.out.printf("enter something else to add to the TreeSet (duplicate "
                            + "values will only be saved once): ");
    	String secondElement = systemInScanner.next();
    	System.out.printf("enter one last thing to add to the TreeSet: ");
    	String thirdElement = systemInScanner.next();        
       
        ts1.add(firstElement);
        ts1.add(secondElement);
        ts1.add(thirdElement);
        
        System.out.printf("\n Your new TreeSet looks like this: \n"); 
        
        Iterator iterator = ts1.iterator();
        
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.printf( element, iterator);
            System.out.println("\n");   
        }
         
        Integer[] nums = {2,4,1,6,3,7,9,5};
        
        SortedSet tree = new TreeSet<>(Arrays.asList(nums));

        System.out.println("Your TreeSet is being replaced with the following: 2,4,1,6,3,7,9,5");
        
        System.out.println("print first and last elements only: ");
        System.out.println(tree.first());
        System.out.println(tree.last());
        
        System.out.println("Try to add a duplicate value (1). Result: ");
        System.out.println(tree.add(1));
        
        System.out.println("However, adding a non-duplicate value is allowed (11): ");
        System.out.println(tree.add(11));
        
        //list all elements of the tree
        System.out.println("The final treeSet looks like this: \n(notice 11 has "
                          + "been added and there is only a \n single instance of "
                          + "the value '1'. \n Also, since it is a Tree, the "
                          + "numers are sorted sequentially, not \n in the random order "
                          + "they were originally entered" + tree); 
        
    }

}
