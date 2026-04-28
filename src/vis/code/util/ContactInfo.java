/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.util;

/**
 *
 * @author Gyana-VIS
 */
public class ContactInfo {
    
    private String CountryCode;
    private String NationalDistCode;
    private String SubscriberNumber;
    private String phonenumber;


    public ContactInfo() {
    }
    
    
    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getNationalDistCode() {
        return NationalDistCode;
    }

    public void setNationalDistCode(String NationalDistCode) {
        this.NationalDistCode = NationalDistCode;
    }

    public String getSubscriberNumber() {
        return SubscriberNumber;
    }

    public void setSubscriberNumber(String SubscriberNumber) {
        this.SubscriberNumber = SubscriberNumber;
    }

    @Override
    public String toString()
    {
        return "ContactInfo{" + "CountryCode=" + CountryCode + ", NationalDistCode=" + NationalDistCode + ", SubscriberNumber=" + SubscriberNumber + ", phonenumber=" + phonenumber + '}';
    }

  
     public String getPhonenumber()
    {
        StringBuilder sb = new StringBuilder();
        
        if(CountryCode!=null){
            sb.append(CountryCode);
        }
        if(NationalDistCode!=null && !NationalDistCode.isEmpty()){
            sb.append("-").append(NationalDistCode);
        }
        if(SubscriberNumber!=null){
            sb.append("-").append(SubscriberNumber);
        }
        String formatedNumber = sb.toString();
        
        return formatedNumber;
    }
    
    
}
