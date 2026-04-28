/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.test;

import java.util.Scanner;
import vis.code.util.ContactInfo;
import vis.code.util.PhoneNumberUtil;

/**
 *
 * @author Gyana-VIS
 */
public class ContactTest {
    
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
                 ContactInfo contactInfo = PhoneNumberUtil.getContactInfo(inputNumber);
                 
                 if(contactInfo !=null){
                  String phonenumber = contactInfo.getPhonenumber();
                 System.out.println("formated Number:"+phonenumber);
                         
                 }else{
                     System.out.println("Invalid PhoneNumber");
                 }
                
                 
                
            }catch(Exception ex){
                 System.out.println(ex.getMessage());
            }
        }
    }
    
}
