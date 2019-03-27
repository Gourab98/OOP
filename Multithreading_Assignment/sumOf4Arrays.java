/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading_Assignment;

import static java.awt.AWTEventMulticaster.add;

/**
 *
 * @author gourab
 * Reg No:2017831004
 */
public class sumOf4Arrays {
    
    public static void main(String[] args) throws InterruptedException {
        int[] arr1={1,5,9,13,17};
        int[] arr2={2,6,10,14,18};
        int[] sum1=new int[5];
        int[] finalsum=new int [5];
        SecondSum s2=new SecondSum();
        Thread a=new Thread(s2);
        a.start();
        for(int i=0;i<5;i++)
        {
            sum1[i]=arr1[i]+arr2[i];
       
        try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

            }
        }
        try {
            a.join();
        } catch (InterruptedException e) {
           
        }
        System.out.println("Summation of 4 Arrays:");
        
            for(int i=0;i<5;i++)
            {
                finalsum[i]=sum1[i]+s2.sum2[i];
                System.out.print(finalsum[i]+" ");
            }
            System.out.println("");
        
    }
    
}
 
class SecondSum extends add implements Runnable{
public void run()
{
    for(int i=0;i<5;i++)
    {
     sum2[i]=arr3[i]+arr4[i];
      try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

            }
     
}
}
}
class add{
    int[] arr3 = {3,7,11,15,19};
    int[] arr4 = {4,8,12,16,20};
    int[] sum2=new int[5];
}