
/**
 * Part2: Finding a Gene - Using the Simplified Algorithm Reorganized
 * 
 * @author (Junghee Koo) 
 * @version (V01_01232001)
 */

import edu.duke.*;
import java.io.File;

public class Part2 {
    public String findSimpleGene (String dna, String startCodon, String stopCodon) {
        // start codon is "ATG"
        // stop codon is "TAA"
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) // no ATG
        {
            return "";
        }
        
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        if (stopIndex == -1) // no TAA
        {
            return "";    
        }
        
        if ((stopIndex-startIndex)%3 == 0){
           result = dna.substring(startIndex, stopIndex + 3);
           if (dna == dna.toUpperCase()){
              result = result.toUpperCase();
           }
           else if(dna == dna.toLowerCase()) {
              result = result.toLowerCase();
           }
        }
        else {
           result = "";
        }
        return result;
    }
    
    public void testSimpleGene() {
        String dna = "AATGCGAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        dna = "AATGCTAGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene); 
        
        dna = "TTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        dna = "AATGTTT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        dna = "ATGGGTTAAGTC";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        dna = "gatgctataat";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"atg","taa");
        System.out.println("Gene is " + gene); 
        
        System.out.println("--------------------");         
    }


}
