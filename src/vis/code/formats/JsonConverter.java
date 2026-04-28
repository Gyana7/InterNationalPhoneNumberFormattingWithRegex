/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vis.code.formats;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

import vis.code.enums.PhoneNumberFormats;



/**
 *
 * @author Gyana-VIS
 * @since 28 Apr 2026
 */
public class JsonConverter {
    
    public static String convertEnumToJson(){
        try{
        
        ObjectMapper mapper = new ObjectMapper();
        List<AdressFormat>list = new ArrayList<>();
        
        PhoneNumberFormats[] values = PhoneNumberFormats.values();
        
        for(PhoneNumberFormats phonenumber :values){
            
            list.add(new AdressFormat(
                    phonenumber.name(),
                    phonenumber.getPattern(),
                    phonenumber.getCountryCode()));
        }
        String writeValueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
        
        return writeValueAsString;
        
        }catch(JacksonException e){
            return e.getLocalizedMessage();
        }
        
    }
}
