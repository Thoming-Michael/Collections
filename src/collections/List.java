/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author mthoming
 */
public class List {

        public static void main(String[] args) throws Exception{
        java.util.List listA = new ArrayList();
        
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter some text or numbers to be added to the list: ");
    	String firstElement = systemInScanner.next();
    	System.out.printf("enter something else to add to the list (duplicate values are acceptable): ");
    	String secondElement = systemInScanner.next();
    	System.out.printf("enter one last thing to add to the list: ");
    	String thirdElement = systemInScanner.next();
       
        listA.add(firstElement);
        listA.add(secondElement);
        listA.add(thirdElement);
        
        System.out.printf("Your new list looks like this: \n");        
        for(int i=0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
            
        }
        
        System.out.printf("\n Which of your previously entered items would you like to view (enter a number, 1-3: ");
        int requestedElement = systemInScanner.nextInt();
        
        //adjust for zero-base numbering
        requestedElement = requestedElement - 1;
        System.out.println(listA.get(requestedElement));
        
        System.out.printf("\n Which of your previously entered items would you like to change? (enter a number, 1-3: ");
        int elementToChange = systemInScanner.nextInt() - 1;
        System.out.printf("\n Enter the new value for this element: ");
        String newListElement = systemInScanner.next();
        listA.set(elementToChange, newListElement);
        
        System.out.printf("\n Your new list looks like this: \n");
        for(int i=0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
            
        }
        
        System.out.printf("\n Enter a value (valid or invalid) to find in the list"
                        + ".  If it exists, it will be displayed below : ");
        String elementToFind = systemInScanner.next();
        Boolean elementFound = listA.contains(elementToFind);
        if (elementFound == true){
        System.out.printf("\n Your string -%s- was found in the list", elementToFind);
        }
        else{
        System.out.printf("\n Your string -%s- was NOT found in the list", elementToFind);
        }
        
        Iterator iterator = listA.iterator();

        while(iterator.hasNext()) {
            Object nextObject = iterator.next();

        }

        iterator = listA.iterator();
        
        System.out.printf("\n Using the List.Iterator method, Your list currently looks like this: \n");
        while(iterator.hasNext()){
            Object nextObject = iterator.next();
            System.out.println(nextObject);
        }
                
    }
}
