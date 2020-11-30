/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phebel
 */
public class assessment_5 {
    
    
    public static void main(String[] args) {
        
        String givenString = "the quick brown fox";
       
        
        int result = 0;
        
       while(result < givenString.length()){
       
           if( givenString.charAt(result) !=' '&& givenString.charAt(result) !='q'&&givenString.charAt(result) != 'u'
                   
                   && givenString.charAt(result) != 'e'&& givenString.charAt(result) !='e'&&
                   
                   givenString.charAt(result) != 'n'){
               
               System.out.print(givenString.charAt(result));
           
           }
       result++;
       }
            
    }
}
