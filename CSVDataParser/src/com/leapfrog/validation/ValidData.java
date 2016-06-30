/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author BkoNod
 */
public class ValidData extends DataValidation {

    @Override
    public boolean check(String[] param) {
          System.out.println("DataValidation");
       String[] data=param;
      
        // Check tokens
      
        if(data.length<5)
          return false;  
        
        // Valid Data
       int valid=0;
       if(data.length==5)
       {
        for(int i=0;i<=4;i++)
         {
             if(data[i].equals(" ") )
             {
                 valid=valid+1;
             }
             else if(data[i].equals(""))
             {
                valid=valid+1;
             }
                 
         }
         if(valid!=0)
         return false;       
       }
       
      // Email validation
      String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      Pattern pattern = Pattern.compile(EMAIL_REGEX);
      Matcher matcher = pattern.matcher(data[3]);
      if(!(matcher.find()))
           return false;
      
      //
       
       
       
     return true;
    }
    
    
    
    
    
}
