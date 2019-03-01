/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mthoming
 */
public class ListTest {
    
    public ListTest() {
    }

    /**
     * Test of main method, of class List.
     */
    @Test
    public void testMain() throws Exception {
        java.util.List listA = new ArrayList();
        int[] listB = {10, 20, 30, 40, 50};
        int[] listC = {10, 20, 30, 40, 50};
        int[] listD = {20, 30, 40, 50, 60};
        
    	String firstElement = "Mike";
    	String secondElement = "Heather";
    	String thirdElement = "Hannah";
        String fourthElement = null;
        int    fifthElement = 5;
        
        listA.add(firstElement);
        listA.add(secondElement);
        listA.add(thirdElement);
        listA.add(fourthElement);
        listA.add(fifthElement);     
                
        //check string "Mike" was inserted in the ArrayList
        assertEquals(firstElement, listA.get(0));
        //Make sure string "Heather" matches the 2nd element in the ArrayList
        assertSame(secondElement, listA.get(1));
        //check that the first element in the ArrayList is not "Hannah"
        assertNotSame(thirdElement, listA.get(0));
        //Verify that the 3rd element in the ArrayList is not null
        assertNotNull(listA.get(2));
        //check that the 4th element in the ArrayList IS null
        assertNull(listA.get(3));
        //use relational operator to verify that the 5th element in the ArrayList is 5
        assertTrue(fifthElement == 5);
        //use relational operator to show that 5 < 5 is false
        assertFalse(fifthElement < 5); 
        //compare 2 int arrays and make sure all values match
        assertArrayEquals(listB, listC);
        //use operators is and isnot to compare int arrays
        assertThat(listB, is(listC));
        assertThat(listC, is(not(listD)));
        
        System.out.printf("Your new list looks like this: \n");        
        for(int i=0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        
        }            
    }
}
