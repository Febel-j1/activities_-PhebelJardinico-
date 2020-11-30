/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phebel
 */
public class assessment_4 {
    
    
     public static void main(String[] args) {
        
        String given = "String";
        String mask = "ng";
        
        boolean result = true;
        
        if(given.contains(mask)){
        
            System.out.print("The given String is: "+given.toUpperCase() +"\n"+ 
                     
                    "The string containing "+ mask.toUpperCase()+ " at last:"+result + "\n");
        }else {
            System.out.print("The given String is: "+given.toUpperCase() +"\n"+
                     
                    "The string containing "+ mask.toUpperCase()+ " at last: "+!result + "\n");
        
        }
        
    }
    
}
