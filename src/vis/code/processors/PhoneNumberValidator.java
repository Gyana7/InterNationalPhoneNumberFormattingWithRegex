/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.processors;

import java.util.regex.Pattern;
import vis.code.enums.PhoneNumberFormats;

/**
 *
 * @author Gyana-VIS
 */
public class PhoneNumberValidator {
    
    public static String validatePhoneNumber(String inputNumber){
        
        String number = inputNumber.replaceAll("[^0-9+]", "");
        
        System.out.println("number is:-"+ number);
        
        if(number.length()> 15){
            return "PhoneNumber length should Not Be GreaterThan 15 digits";
        }
        
//        if(number.startsWith("0")){
//            number = number.substring(1);
//            System.out.println("if 0 then after number:"+ number);
//        }
        
        PhoneNumberFormats[] enumvalues = PhoneNumberFormats.values();
        System.out.println(enumvalues.toString());
        
        
      
        
        for(PhoneNumberFormats value :enumvalues){
            // pattern Matches
//            if(Pattern.matches(value.getPattern(), number)){
//                
//               String countryCode = value.getCountryCode();
//               
//                if(!number.startsWith("+")){
//                    
//                    if(number.startsWith(countryCode.substring(1))){
//                        
//                        return "+" + number;
//                     }else{
//                            String validnumber = value.getCountryCode() +number;
//                            System.out.println(validnumber);
//                             //return value.getCountryCode() + number;
//                                return validnumber;
//                    }
//                  
//                    
//                }else{
//                    return number;
//                }
//            }

        String countrycode = value.getCountryCode(); //+91 ,+41 etc
        System.out.println("countrycode is"+countrycode);
        String numericcode = countrycode.substring(1);
        System.out.println("numericcode is:"+numericcode);
        
        String temp = number;
            System.out.println("temp number is :"+temp);
        
        // id number start with "+" 
        if(temp.startsWith("+")){
            temp = temp.substring(1);
        }
        
        if(temp.startsWith("0")){
            temp= temp.substring(1);
            System.out.println("temp if 0 :" + temp);
        }
        
        // include countrycode 
        
        if(temp.startsWith(numericcode)){
            String local_number = temp.substring(numericcode.length());
            System.out.println(local_number);
            
            if(Pattern.matches(value.getPattern(), local_number)){
                return countrycode + local_number;
            }
        }
        
        if(Pattern.matches(value.getPattern(), temp)){
            return countrycode + temp;
        }

            
        }
        
        return "invalid Phonenumber format";
        
    }
    
}
