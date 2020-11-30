/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phebel
 */
public class assessment_3 {
    
    
      public static void main(String[] args) {
        
        int arrays [] = new int [5];
        
        arrays [0]= 14;
        arrays [1]= 13;
        arrays [2]= 12;
        arrays [4]= 11;
        arrays [5]= 10;
        
      
      
       int total = 0;
       int average = 0;
     
        for (int i = 0; i < arrays.length; i++) {
            
            total = total + arrays[i];
            
            average = total / arrays.length;
            
            System.out.println(arrays[i]);
            
      
        }
        System.out.println(average);
       
    }
}
