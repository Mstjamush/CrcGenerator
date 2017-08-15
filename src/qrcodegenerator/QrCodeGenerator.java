/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrcodegenerator;

import java.util.Scanner;

/**
 *
 * @author josphatmuindi@gmail.com 
 */
public class QrCodeGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            String input;
            
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a String : "); //User enters string
            input = reader.nextLine();
            
           String CRC = Utilities.computeCRCCheck(input);
            
           //String CRC = computeCRCCheck(input);
            
            String qrCode = (input + CRC).toUpperCase();
            
            System.out.println("Your QR Code is " + qrCode );
            
}

}
