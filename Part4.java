
/**
 * Part 4: Finding Web Links
 * 
 * @author (Junghee Koo) 
 * @version (V01_01252001)
 */

import edu.duke.*;
import java.io.File;

public class Part4 {    
    public void printYouTubeLinks() {
        String urlResource = "https://www.dukelearntoprogram.com/course2/data/manylinks.html";
        URLResource ur = new URLResource(urlResource);
        for (String s : ur.words()) {
            String lowerCaseYouTubeLink = s.toLowerCase();
            if(lowerCaseYouTubeLink.indexOf("youtube.com") != -1) {
               int youTubeIndex = lowerCaseYouTubeLink.indexOf("youtube.com"); 
               int firstDoubleQuoteIndex = s.lastIndexOf("\"", youTubeIndex);
               int lastDoubleQuoteIndex = s.indexOf("\"", youTubeIndex + 11);
               String youTubeURL = s.substring(firstDoubleQuoteIndex,lastDoubleQuoteIndex + 1);
               System.out.println(s);
               System.out.println(youTubeURL);
               System.out.println("--------------------");
            }
        }
    }
    
    public static void main (String[] args) {
        Part4 pr = new Part4();
        pr.printYouTubeLinks();
    }

}
