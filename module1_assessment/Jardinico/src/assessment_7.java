
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phebel
 */
public class assessment_7 {
    
    
    public static void main(String[] args) {
        
        File phebelFiles = new File ("C:\\Users\\Phebel\\Desktop\\movies");
        
        String[] list = phebelFiles.list();
        
        for (String directory : list) {
            
            System.out.println(directory);
        }
    }
}
