/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vis.code.enums;

/**
 *
 * @author Gyana-VIS
 */
public enum PhoneNumberFormats {
    
    INDIA("+91","^(0|\\+91|91)?[6-9][0-9]{9}$"),
    
    AWSINDIA("+91","^(0|\\+91|91)?[6-9][0-9]{9}$"),
    
    AWSMALAYSIA("+60","^(\\+60|60)?[0-9]{9,10}$"),
    
    UAE("+971", "^(\\+971|971)?[0-9]{8,9}$"),
    
    OMAN("+968", "^(\\+968|968)?[0-9]{8}$"),
    
    ZAMBIA("+260", "^(\\+260|260)?[0-9]{9}$"),
    
    ; 
    
    
    private final String  _countryCode;
    private  final String _pattern;

    private PhoneNumberFormats(String _countryCode, String _pattern) {
        this._countryCode = _countryCode;
        this._pattern = _pattern;
    }

    public String getCountryCode() {
        return _countryCode;
    }

    public String getPattern() {
        return _pattern;
    }
    
    
}
