
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phebel
 * 
 */
public class tla_3 {
    
    
    public static void main(String[] args) {

        tla_4 methods = new tla_4();

        ArrayList<String> array = new ArrayList<>();

        String[] newString = new String[3];

        newString[0] = "Hi";
        newString[1] = "Hello";
        newString[2] = "Yes?";

        array = methods.arrsList(newString);

        for (int i = 0; i < array.size(); i++) {

            System.out.println(array.get(i));
        }

      }
}
