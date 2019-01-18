/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class Collections {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void mainEventually(String[] args) throws Exception{
        // TODO code application logic here

        System.out.println("\n"
            + "\n  Learning about Collections!    "
            + "\n  Choose from the following:     "
            + "\n                                 "
            + "\n  L - Explore Lists              "
            + "\n  S - Explore Sets               "
            + "\n  M - Explore Maps               "
            + "\n  U - Explore Queues             "
            + "\n  T - Explore Trees              "             
            + "\n  Q - Quit                       "
            + "\n                                 "
            + "\n  Please enter your selection    "
            + "\n=================================");
        

            Scanner systemInScanner = new Scanner(System.in);
            System.out.printf("enter your selection: ");
            String userChoice = systemInScanner.next();
/*                   
            if (userChoice = "L"){
                    List.listExamples();
            }
*/    
        
    }
}
        
    