/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertingtestquestion;
import java.util.Scanner;
/**
 *
 * @author sasmith
 */
public class Insertingtestquestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        //Declare variables
        int x;
        
        //Prompt the user to input an integer that is a multiple of 10
        System.out.println("Please input a number that is a multiple of 10: ");
        x = input.nextInt();
        
        switch(x){
            case 10: 
                System.out.println("I like apples.");
                break;
                
            case 20:
                System.out.println("I like peaches.");
                
            case 30:
                System.out.println("I like pineapples.");
                
            case 40:
                System.out.println("I like oranges.");
                break;
                
            case 50:
                System.out.println("I like pears.");
                break;
                
            default:
                System.out.println("I don't like any fruit.");
        }
    }
    
}


