
/**
 * Part1: Finding a Gene - Using the Simplified Algorithm
 * 
 * @author (Junghee Koo) 
 * @version (V01_01232001)
 */

import edu.duke.*;
import java.io.File;

public class Part1 {
    public String findSimpleGene (String dna) {
        // start codon is "ATG"
        // stop codon is "TAA"
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) // no ATG
        {
            return "";
        }
        
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (stopIndex == -1) // no TAA
        {
            return "";    
        }
        
        if ((stopIndex-startIndex)%3 == 0){
           result = dna.substring(startIndex, stopIndex + 3);
        }
        else {
           result = "";
        }
        return result;
    }
    
    public void testSimpleGene() {
        String dna = "AATGCGAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AATGCTAGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene); 
        
        dna = "TTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AATGTTT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }


}
