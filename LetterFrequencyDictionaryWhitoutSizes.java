// Izveido anglu alfabeeta burtu frekvences vaardniicu nenemot veeraa burtu izmeeru

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LetterFrequencyDictionaryWhitoutSizes {

    // Metode - saskaita simbolu skaitu
    public static void countCharacter(HashMap<Character, Integer> LetterFrequency, char character) {

        // Ja jau eksistee sarakstaa, tad palielina skaitu
        if(LetterFrequency.containsKey(character)) {
            LetterFrequency.put(character, LetterFrequency.get(character) + 1);
        }

        // Ja pirmo reizi, tad skaits ir 1
        else {
            LetterFrequency.put(character, 1);
        }
    }  

    // Klase, kas ielasa failu
    public class LetterFrequencyDictionary {

        public HashMap<Character, Integer> countLettersInFile(String fileName) throws IOException {

            // Darbiibas ar failu
            FileReader file = null;
            BufferedReader reader = null;
            try {

                file = new FileReader(fileName);
                reader = new BufferedReader(file);
            } 
            // Kludas zinojums, ja nevar atrast failu
            catch (IOException e) {
                System.err.println("Error: File not found");
                System.exit(1);
            }

            // Map, kur tiks glabaati simboli un to skaits
            HashMap<Character, Integer> LetterFrequency = new HashMap<Character, Integer>();

            int charAsAnInteger = 0;

            // Ielase pa simboliem
            while((charAsAnInteger = reader.read()) != -1)
            {
                // Ja ir lielais burts, tad peec ascii tabulas, paaarveido uz mazo burtu
                if ( charAsAnInteger > 64 && charAsAnInteger < 91){

                    charAsAnInteger =  charAsAnInteger + 32;

                    countCharacter(LetterFrequency, (char) charAsAnInteger);

                }
                // Ja mazais burts
                else if (charAsAnInteger > 96 && charAsAnInteger < 123){

                    countCharacter(LetterFrequency, (char) charAsAnInteger);

                }

            }

            reader.close();
            file.close();
            return LetterFrequency;
        }
    }

    // FileNotFound, ja nevar atrast failu
    public static void main(String[] args) throws IOException{

        // Darbiibas ar failiem
        String fileName = "./tests/loremIpsumTest.txt";
        LetterFrequencyDictionaryWhitoutSizes lfdws = new LetterFrequencyDictionaryWhitoutSizes();
        LetterFrequencyDictionary lfd = lfdws.new LetterFrequencyDictionary();
        HashMap<Character, Integer> LetterFrequency = lfd.countLettersInFile(fileName);
    
        // Izvade
        for (Map.Entry<Character, Integer> entry : LetterFrequency.entrySet()) {
    
            System.out.println(entry.getKey() + " - " + entry.getValue());
    
        }

        // Ieguto rezultatu testesana atkaribaa no ievades faila nosaukuma
        if (fileName == "./tests/simpleTest.txt"){

            Map<Character, Integer> expectedFrequency = new HashMap<>();
            expectedFrequency.put('a', 2);
            expectedFrequency.put('b', 1);
            expectedFrequency.put('c', 1);
            
            boolean result = LetterFrequencyDictionaryWhitoutSizes.testTheAnswer("./tests/simpleTest.txt", expectedFrequency);
            System.out.println("Test result: " + result);
        }

        else if (fileName == "./tests/emptyTest.txt"){

            Map<Character, Integer> expectedFrequency = new HashMap<>();
            
            boolean result = LetterFrequencyDictionaryWhitoutSizes.testTheAnswer("./tests/emptyTest.txt", expectedFrequency);
            System.out.println("Test result: " + result);

        }

        else if (fileName == "./tests/loremIpsumTest.txt"){

            Map<Character, Integer> expectedFrequency = new HashMap<>();
            expectedFrequency.put('a', 471);
            expectedFrequency.put('b', 64);
            expectedFrequency.put('c', 221);
            expectedFrequency.put('d', 175);
            expectedFrequency.put('e', 661);
            expectedFrequency.put('f', 55);
            expectedFrequency.put('g', 78);
            expectedFrequency.put('h', 32);
            expectedFrequency.put('i', 604);
            expectedFrequency.put('j', 8);
            expectedFrequency.put('l', 336);
            expectedFrequency.put('m', 266);
            expectedFrequency.put('n', 333);
            expectedFrequency.put('o', 262);
            expectedFrequency.put('p', 145);
            expectedFrequency.put('q', 82);
            expectedFrequency.put('r', 308);
            expectedFrequency.put('s', 498);
            expectedFrequency.put('t', 473);
            expectedFrequency.put('u', 482);
            expectedFrequency.put('v', 105);
            expectedFrequency.put('w', 2);
            expectedFrequency.put('x', 11);
            expectedFrequency.put('y', 1);
            
            boolean result = LetterFrequencyDictionaryWhitoutSizes.testTheAnswer("./tests/loremIpsumTest.txt", expectedFrequency);
            System.out.println("Test result: " + result);

        }

    }
    
    // Testa metode - salidzinam vai sakriit ar ieguuto
    public static boolean testTheAnswer(String fileName, Map<Character, Integer> expectedFrequency) throws IOException {
        
        LetterFrequencyDictionaryWhitoutSizes lfdws = new LetterFrequencyDictionaryWhitoutSizes();
        LetterFrequencyDictionary lfd = lfdws.new LetterFrequencyDictionary();
        HashMap<Character, Integer> actualFrequency = lfd.countLettersInFile(fileName);

        return actualFrequency.equals(expectedFrequency);
    }


}
