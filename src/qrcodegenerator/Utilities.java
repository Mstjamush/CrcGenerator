/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrcodegenerator;

/**
 *
 * @author josphatmuindi@gmail.com
 */
public class Utilities {
    
    public String pointOfInitiation(String initiation, String staticDynamic){
        /*
        first character
            1 = QR
            2 = BLE
            3 = NFC
        2nd Character
            1 = static
            2 = dynamic
        */
        String poi = "01";
        String poiLength = "01";
        
        String pointOfIntiation = poi + poiLength + initiation + staticDynamic;
        
        return pointOfIntiation;
    
    }
    
    public String merchantIdentifier(String identifier, String MI){
        
        int MILength = identifier.length();
        String MILength1;
        
        if(MILength < 10){
            MILength1 = "0" + Integer.toString(MILength);
        }
        else 
            MILength1 = Integer.toString(MILength);
               
        String merchantIdentifier = MI + MILength1 + identifier;
        
        return merchantIdentifier;

    }
    
    public String merchantCategoryCode(String categoryCode){
        
        String categoryCodeTag = "52";
        String categoryLength = "04";
        
        String merchantCategoryCode = categoryCodeTag + categoryLength + 
                categoryCode;
        
        return merchantCategoryCode;
    }
    
    public String transactionCurrencyCode(String currencyCode){
        
        
        String currencyCodeTag = "53";
        String currencyLength = "03";
        
        String merchantcurrencyCode = currencyCodeTag + currencyLength + 
                currencyCode;
        
        return merchantcurrencyCode;
    
    }
    
    public String transactionAmount(String amount){
        
        String amountTag = "54";
        int amountLength = amount.length();
        String amountLength1 = Integer.toString(amountLength);
        
        String merchantAmount = amountTag + amountLength1 + amount;
        
        return merchantAmount;
    
    }
    
    public String tipOrConvinienceFee(String tipConvinienceIndicator){
        /*
        This should be the available options given to a user;
            01 : Indicates Consumer should be prompted to enter tip
            02 : Indicates that merchant would mandatorily charge a flat 
                    convenience fee
            03 : Indicates that merchant would charge a percentage convenience fee
        */
    
        String tipConvinienceTag = "55";
        String amountLength = "02";
        
        String merchantTipConvinienceIndicator = tipConvinienceTag + 
                amountLength + tipConvinienceIndicator;
        
        return merchantTipConvinienceIndicator;
    }
    
    public String fixedConvinienceTip(String fixedTip){
        
        String fixedConvinienceTag = "56";
        int fixedConvinienceLength = fixedTip.length();
        String fixedConvinienceLength1 = Integer.toString(fixedConvinienceLength);
        
        String fixedConvinienceTipFee = fixedConvinienceTag + fixedConvinienceLength1 + 
                fixedTip;
        
        return fixedConvinienceTipFee;
       
    }
    
    public String percentageConvinienceTip(String percentageTip){
        
        String percentageConvinienceTag = "57";
        int percentageConvinienceLength = percentageTip.length();
        String percentageConvinienceLength1 = Integer.toString(percentageConvinienceLength);
        
        String percentageConvinienceTipFee = percentageConvinienceTag + 
                percentageConvinienceLength1 + percentageTip;
        
        return percentageConvinienceTipFee;
       
    }
    
    public String countryCode(String country){
        
        
        String countryCodeTag = "58";
        String countryLength = "02";
        
        String merchantCountryCode = countryCodeTag + countryLength + country;
        
        return merchantCountryCode;
    
    }
    
    public String merchantName(String name){
        
        String merchantNameTag = "59";
        int merchantNameLength = name.length();
        String merchantNameLength1;
        if(merchantNameLength < 10){
            merchantNameLength1 = "0" + Integer.toString(merchantNameLength);
        }
        else 
            merchantNameLength1 = Integer.toString(merchantNameLength);
          
        String merchantName = merchantNameTag + merchantNameLength1 + name;
        
        return merchantName;
       
    }
    
    public String merchantCity(String city){
        
        String merchantCityTag = "60";
        int merchantCityLength = city.length();
        String merchantCityLength1;
        
        if(merchantCityLength < 10){
            merchantCityLength1 = "0" + Integer.toString(merchantCityLength);
        }
        else 
            merchantCityLength1 = Integer.toString(merchantCityLength);
        
        String merchantCity = merchantCityTag + merchantCityLength1 + 
                city;
        
        return merchantCity;
       
    }
    
    // Method to compute the Zip code or Pin code or Postal code of merchant
    
     public String postalCode(String merchantPostalCode){
        
        String postalCodeTag = "61";
        int postalCodeLength = merchantPostalCode.length();
        String postalCodeLength1 = Integer.toString(postalCodeLength);
        
        String postalCode = postalCodeTag + postalCodeLength1 + 
                merchantPostalCode;
        
        return postalCode;
       
    }
     
     public String merchantAdditionalInfo(String additionalInfo){
        
        String additionalInfoTag = "61";
        int additionalInfoLength = additionalInfo.length();
        String additionalInfoLength1 = Integer.toString(additionalInfoLength);
        
        String additionalInfoCompute = additionalInfoTag + additionalInfoLength1
                + additionalInfo;
        
        return additionalInfoCompute;
       
    }     
    
     public static String computeCRCCheck(String input) {
        String result ="";
         int crc = 0xFFFF;          // initial value
        int polynomial = 0x1021;   // 0001 0000 0010 0001  (0, 5, 12) 

        // byte[] testBytes = "123456789".getBytes("ASCII");

        byte[] bytes = input.getBytes();//args[0].getBytes();

        for (byte b : bytes) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b   >> (7-i) & 1) == 1);
                boolean c15 = ((crc >> 15    & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit) crc ^= polynomial;
            }
        }

        crc &= 0xffff;
        System.out.println("CRC16-CCITT = " + Integer.toHexString(crc));

       //byte[] bytes = input.getBytes();
       //int crc = 0x0000;
       //for (byte b : bytes) {
           //crc = (crc >>> 8) ^ table[(crc ^ b) & 0xff];
       //}

      result = Integer.toHexString(crc);

 return result;
 
}
        public String merchantAdditionalInfoTag(String userAdditionalInfo, 
                String userAdditionalInfoTag){
        
        String additionalInfoCompute = userAdditionalInfo + userAdditionalInfoTag;
        
        return additionalInfoCompute;
       
    }
        
    
}
