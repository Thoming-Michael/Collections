/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author mthoming
 */
public class PrimeRun implements Runnable {

    long minPrime;
         PrimeRun(long minPrime) {
             this.minPrime = minPrime;
         }

    @Override
         public void run() {
             // compute primes larger than minPrime
             for(int i = 0; i >= 10; i++ )
                 System.out.println("Value of i : " + i);
         } 
}
