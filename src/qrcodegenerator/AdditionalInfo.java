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
public class AdditionalInfo {
    
    public String billNumber(String billNumberInput){
        String billNumberTag = "01";
        int merchantNameLength = billNumberInput.length();
        String merchantNameLength1 = Integer.toString(merchantNameLength);
        String billNumberCode = billNumberTag + merchantNameLength1 + billNumberInput;
        
        return billNumberCode;
    }
    
    public String mobileNumber(String mobileNumberInput){
        String mobileNumberTag = "02";
        int mobileNumberLength = mobileNumberInput.length();
        String mobileNumberLength1 = Integer.toString(mobileNumberLength);
        String mobileNumberCode = mobileNumberTag + mobileNumberLength1 + mobileNumberInput;
        
        return mobileNumberCode;
    }
    
    public String storeID(String storeIDInput){
        String storeIDTag = "03";
        int storeIDLength = storeIDInput.length();
        String storeIDLength1 = Integer.toString(storeIDLength);
        String storeIDCode = storeIDTag + storeIDLength1 + storeIDInput;
        
        return storeIDCode;
    }
    
    public String loyaltyNumber(String loyaltyNumberInput){
        String loyaltyNumberTag = "04";
        int loyaltyNumberLength = loyaltyNumberInput.length();
        String loyaltyNumberLength1 = Integer.toString(loyaltyNumberLength);
        String loyaltyNumberCode = loyaltyNumberTag + loyaltyNumberLength1 + loyaltyNumberInput;
        
        return loyaltyNumberCode;
    }
    
    public String referenceID(String referenceIDInput){
        String referenceIDTag = "05";
        int referenceIDLength = referenceIDInput.length();
        String referenceIDLength1 = Integer.toString(referenceIDLength);
        String referenceIDCode = referenceIDTag + referenceIDLength1 + referenceIDInput;
        
        return referenceIDCode;
    }
    
    public String consumerID(String consumerIDInput){
        String consumerIDTag = "06";
        int consumerIDLength = consumerIDInput.length();
        String consumerIDLength1 = Integer.toString(consumerIDLength);
        String consumerIDCode = consumerIDTag + consumerIDLength1 + consumerIDInput;
        
        return consumerIDCode;
    }
    public String terminalID(String terminalIDInput){
        String terminalIDTag = "07";
        int terminalIDLength = terminalIDInput.length();
        String terminalIDLength1 = Integer.toString(terminalIDLength);
        String terminalIDCode = terminalIDTag + terminalIDLength1 + terminalIDInput;
        
        return terminalIDCode;
    }
    
    public String purpose(String purposeInput){
        String purposeTag = "08";
        int purposeLength = purposeInput.length();
        String purposeLength1 = Integer.toString(purposeLength);
        String purposeCode = purposeTag + purposeLength1 + purposeInput;
        
        return purposeCode;
    }
     
}
