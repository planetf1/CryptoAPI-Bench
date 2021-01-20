package org.cryptoapi.bench.brokenmac;

import javax.crypto.Mac;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

public class BrokenMacCorrected{
   public static void main(String args[]) throws Exception {
      KeyGenerator keyGen = KeyGenerator.getInstance("AES");
      SecureRandom secRandom = new SecureRandom();
      keyGen.init(secRandom);
      Key key = keyGen.generateKey();	 
      

      Mac mac = Mac.getInstance("HmacSHA256");
      mac.init(key)

      String msg = new String("TSE2021");
      byte[] bytes = msg.getBytes();      
      byte[] macResult = mac.doFinal(bytes);
  }
}
