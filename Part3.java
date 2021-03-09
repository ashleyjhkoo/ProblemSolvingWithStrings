
/**
 * Part3: Problem Solving with Strings
 * 
 * @author (Junghee Koo) 
 * @version (V01_01242001)
 */

import edu.duke.*;
import java.io.File;

public class Part3 {
   public boolean twoOccurrences (String stringa, String stringb) {
       int numberOfOccurence = 0;
       boolean result = false;
       
       int firstIndex = stringb.indexOf(stringa);
       if (firstIndex != -1) // first occerence of stringa in string b
       {
            numberOfOccurence = numberOfOccurence + 1;
       }

       int stringaLength = stringa.length();
       int secondIndex = stringb.indexOf(stringa, firstIndex + stringaLength);
       if (secondIndex != -1) // second occerence of stringa in string b
       {
            numberOfOccurence = numberOfOccurence + 1;
       }  
       
       if (numberOfOccurence >= 2) {
            result = true;    
       }
       
       return result;
   }
   
   public String lastPart (String stringa, String stringb) {
       int firstIndex = stringb.indexOf(stringa);
       int stringaLength = stringa.length();
       int stringbLength = stringb.length();
       int lastIndex = stringbLength - 1;
       String resultString = "";
       String followString = "";
       if (firstIndex == -1) // first occerence of stringa in string b
       {
            resultString = stringb;
       }
       else {
            followString = stringb.substring(firstIndex+stringaLength, lastIndex + 1);  
            resultString = followString;
       }
       
       return resultString;
   }
   
   public void testing() {
        String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println("stringa is " + stringa);
        System.out.println("stringb is " + stringb);        
        boolean occurenceResult = twoOccurrences(stringa,stringb);
        System.out.println("More than 2 occurences is " + occurenceResult);
        System.out.println("\n"); 
        
        stringa = "a";
        stringb = "banana";
        System.out.println("stringa is " + stringa);
        System.out.println("stringb is " + stringb);        
        occurenceResult = twoOccurrences(stringa,stringb);
        System.out.println("More than 2 occurences is " + occurenceResult);          
        System.out.println("\n");   
        
        stringa = "atg";
        stringb = "ctgtatgta";
        System.out.println("stringa is " + stringa);
        System.out.println("stringb is " + stringb);        
        occurenceResult = twoOccurrences(stringa,stringb);
        System.out.println("More than 2 occurences is " + occurenceResult);          
        System.out.println("\n");        
        
        System.out.println("--------------------"); 
        
        stringa = "an";
        stringb = "banana";
        System.out.println("stringa is " + stringa);
        System.out.println("stringb is " + stringb);        
        String followString = lastPart(stringa,stringb);
        System.out.println("Following string is " + followString);          
        System.out.println("\n");    
        
        stringa = "zoo";
        stringb = "forest";
        System.out.println("stringa is " + stringa);
        System.out.println("stringb is " + stringb);        
        followString = lastPart(stringa,stringb);
        System.out.println("Following string is " + followString);          
        System.out.println("\n"); 
        
        stringa = "heaven";
        stringb = "heavenisgood";
        System.out.println("stringa is " + stringa);
        System.out.println("stringb is " + stringb);        
        followString = lastPart(stringa,stringb);
        System.out.println("Following string is " + followString);          
        System.out.println("\n");
        
        stringa = "loo";
        stringb = "lololala";
        System.out.println("stringa is " + stringa);
        System.out.println("stringb is " + stringb);        
        followString = lastPart(stringa,stringb);
        System.out.println("Following string is " + followString);          
        System.out.println("\n");
        
        System.out.println("--------------------");        
        

   }
}
