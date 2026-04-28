/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vis.code.formats;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonAutoDetect(
    fieldVisibility = JsonAutoDetect.Visibility.ANY,
    getterVisibility = JsonAutoDetect.Visibility.NONE
)

/**
 *
 * @author Gyana-VIS
 * @since 28 Apr 2026
 */
@JsonPropertyOrder({ "Code", "Patteren", "CC" })
public class AdressFormat {
    

   private String Code;
   private String Patteren;
   private String CC;

   
    public AdressFormat()
    {
    }

    public AdressFormat(String Code, String Patteren, String CC)
    {
        this.Code = Code;
        this.Patteren = Patteren;
        this.CC = CC;
    }

    
    public String getCode()
    {
        return Code;
    }

 
    public String getPatteren()
    {
        return Patteren;
    }
    
  
    public String getCC()
    {
        return CC;
    }

    @Override
    public String toString()
    {
        return "AdressFormat{" + "Code=" + Code + ", Patteren=" + Patteren + ", CC=" + CC + '}';
    }
    
    
   
   
    
}
