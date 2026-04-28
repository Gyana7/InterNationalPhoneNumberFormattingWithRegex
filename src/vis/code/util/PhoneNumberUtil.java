/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vis.code.formats.AdressFormat;
import vis.code.formats.JsonConverter;

/**
 *
 * @author Gyana-VIS
 */
public class PhoneNumberUtil
{
    public static ObjectMapper mapper = new ObjectMapper();
    
    public static ContactInfo getContactInfo(String number)throws Exception
    {

        String Contactnumber = number.replaceAll("[^0-9+]", "");

        if (Contactnumber.length() > 15)
        {
            System.out.println("PhoneNumber length should Not Be GreaterThan 15 digits");
        }

    
        String convertEnumToJson = JsonConverter.convertEnumToJson();
      
        
        AdressFormat[] readValue = mapper.readValue(convertEnumToJson, AdressFormat[].class);
        
        for(AdressFormat obj :readValue){
            System.out.println(obj);
        }
       
        List<AdressFormat> numberformats = Arrays.asList(readValue);
             
        String temp;
        // prefixed based matched
        for (AdressFormat enumvalues : numberformats)
        {
            String countryCode = enumvalues.getCC();
            String numericcode = countryCode.substring(1);

            temp = Contactnumber;

            
            String localnumber = null;

            if (temp.startsWith(countryCode))
            {
                localnumber = temp.substring(countryCode.length());
            }
             else if (temp.startsWith("^00"))
            {
                localnumber = temp.substring(2);
            }
            else if (temp.startsWith("0"))
            {
                localnumber = temp.substring(1);
            }
            else if (temp.startsWith(numericcode) && temp.length() > 10)
            {
                localnumber = temp.substring(numericcode.length());
            }
            else
            {
                localnumber = temp;
            }

            if (Pattern.matches(enumvalues.getPatteren(), localnumber))
            {
                return SplitNumber(enumvalues, localnumber);
            }

        }

        return null;
    }

    private static ContactInfo SplitNumber(AdressFormat numberformat, String phonenumber)
    {

        Pattern compile = Pattern.compile(numberformat.getPatteren());
        Matcher matcher = compile.matcher(phonenumber);

        if (matcher.matches())
        {
            String ndc = matcher.group(2);

            String sn = matcher.group(3);

            if (ndc != null && ndc.isEmpty())
            {
                ndc = "";
            }

            ContactInfo cinfo = new ContactInfo();
            cinfo.setCountryCode(numberformat.getCC());
            cinfo.setNationalDistCode(ndc);
            cinfo.setSubscriberNumber(sn);
            return cinfo;
        }

        return null;

    }

}
