/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.test;

import java.util.Scanner;
import vis.code.processors.PhoneNumberValidator;

/**
 *
 * @author Gyana-VIS
 */
public class PhoneNumberTest {
    
  
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String inputNumber;
        
        while(true){
             try{
                 System.out.println("Enter PhoneNumber (IF You Want to Exit Type Exit)"); 
                 inputNumber = sc.nextLine();
                 
                 if(inputNumber.equalsIgnoreCase("exit")){
                     System.out.println("Thank u For using this System");
                      return;
                 }
                 String validatePhoneNumber = PhoneNumberValidator.validatePhoneNumber(inputNumber);
                 
                 if(validatePhoneNumber !=null||!validatePhoneNumber.isEmpty()){
                     System.out.println("Format number:"+validatePhoneNumber);
                 }else{
                     System.out.println("Invalid PhoneNumber");
                 }
                 
                
            }catch(Exception ex){
                 System.out.println(ex.getMessage());
            }
        }
    }
}
