/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

/**
 *
 * @author mthoming
 */
public class QueueExample {
    public static void mainOld(String[] args) throws Exception{
        
        Queue queueA = new LinkedList();

        
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter some text or numbers to be added to the queue: ");
    	String firstElement = systemInScanner.next();
    	System.out.printf("enter something else to add to the queue: ");
    	String secondElement = systemInScanner.next();
    	System.out.printf("enter one last thing to add to the queue: ");
    	String thirdElement = systemInScanner.next();        
       
        queueA.add(firstElement);
        queueA.add(secondElement);
        queueA.add(thirdElement);
        
        System.out.printf("\n Your new queue looks like this: \n" + queueA); 
        

        String head = (String) queueA.element();
        System.out.println("Head element:: " + head);

        String element1 = (String) queueA.poll();
        System.out.println("Removed Element:: " + element1);

        System.out.println("Queue Print after poll:: " + queueA);
        String element2 = (String) queueA.remove();
        System.out.println("Removed Element:: " + element2);

        System.out.println("Queue Print after remove:: " + queueA);          
    }
}
