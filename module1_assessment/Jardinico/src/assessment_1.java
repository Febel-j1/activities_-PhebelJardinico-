/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phebel
 */
public class assessment_1 {
    
    
     public static void arraycopy(int[] from,int fromstart, int[] to, int tostart, int count) { 
        
         
        for (int i = 0; i < count; i++) {
            
           
 to[tostart + i] = from[fromstart + i];
 
 
        }
    }
    public static void main(String[] args) {
        
        int num1 [] = new int [6];
        
        int num2 [] = new int [6];
        
        num1 [0] = 90;
        num1 [1] = 22;
        num1 [2] = 75;
        num1 [3] = 12;
        num1 [4] = 16;
        num1 [5] = 78;
     
        arraycopy(num1, 0, num2, 0,  5 ); 
        
        
        for (int i = 0; i < num2.length; i++) {
            
            
            System.out.println(num2[i]);
        }
       
    }
      
}
