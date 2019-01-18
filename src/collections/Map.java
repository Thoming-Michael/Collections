/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author mthoming
 */
public class Map {
    public static void mainOld(String[] args) throws Exception{
        
       System.out.println("\n Adding Apple, Orange, Banana and Grapes to the map...");
       HashMap fruit =  new HashMap(); 
       fruit.put(10, "Apples"); 
       fruit.put(12, "Oranges"); 
       fruit.put(3, "Bananas"); 
       fruit.put(27, "Grapes"); 
       
       System.out.println("Total items in Map: \n" + fruit.size());
       System.out.println("Key Contents: \n" + fruit.keySet());
       
       System.out.println("\n Items in Map listed with their keys: \n");
       for(Object key: fruit.keySet())
           System.out.println(key + " - " + fruit.get(key));
       System.out.println();
       

    }
}
