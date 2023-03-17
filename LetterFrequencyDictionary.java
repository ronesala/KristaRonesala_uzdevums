// Izveido anglu alfabeeta burtu frekvences vaardniicu nemot veeraa burtu izmeeru

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Klase, kas ielasa failu
public class LetterFrequencyDictionary {

    public HashMap<Character, Integer> countLettersInFile(String fileName) throws IOException {

        // Darbiibas ar failu
        FileReader file = null;
        BufferedReader reader = null;
        try {

            file = new FileReader(fileName);
            reader = new BufferedReader(file);

        } catch (IOException e) {

            System.err.println("Error: File not found");
            System.exit(1);
            
        }

        // Map, kur tiks glabaati simboli un to skaits
        HashMap<Character, Integer> LetterFrequency = new HashMap<Character, Integer>();

        int charAsAnInteger = 0;

        // Ielase pa simboliem
        while ((charAsAnInteger = reader.read()) != -1) {

            if (charAsAnInteger > 64 && charAsAnInteger < 91 || charAsAnInteger > 96 && charAsAnInteger < 123) {

                // Paarveido no int uz char
                char character = (char) charAsAnInteger;

                // Ja jau eksistee sarakstaa, tad palielina skaitu
                if (LetterFrequency.containsKey(character)) {

                    LetterFrequency.put(character, LetterFrequency.get(character) + 1);

                // Ja pirmo reizi, tad skaits ir 1
                } else {

                    LetterFrequency.put(character, 1);

                }
            }
        }

        reader.close();
        file.close();
        return LetterFrequency;
    }

    // FileNotFound, ja nevar atrast failu
    public static void main(String[] args) throws IOException{

        String fileName = "./tests/loremIpsumTest.txt";
        LetterFrequencyDictionary lfd = new LetterFrequencyDictionary();
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
            
            boolean result = LetterFrequencyDictionary.testTheAnswer("./tests/simpleTest.txt", expectedFrequency);
            System.out.println("Test result: " + result);
        }

        else if (fileName == "./tests/emptyTest.txt"){

            Map<Character, Integer> expectedFrequency = new HashMap<>();
            
            boolean result = LetterFrequencyDictionary.testTheAnswer("./tests/emptyTest.txt", expectedFrequency);
            System.out.println("Test result: " + result);

        }

        else if (fileName == "./tests/loremIpsumTest.txt"){

            Map<Character, Integer> expectedFrequency = new HashMap<>();
            expectedFrequency.put('A', 11);
            expectedFrequency.put('C', 8);
            expectedFrequency.put('D', 15);
            expectedFrequency.put('E', 4);
            expectedFrequency.put('I', 11);
            expectedFrequency.put('L', 1);
            expectedFrequency.put('M', 13);
            expectedFrequency.put('N', 11);
            expectedFrequency.put('P', 13);
            expectedFrequency.put('Q', 8);
            expectedFrequency.put('S', 16);
            expectedFrequency.put('T', 1);
            expectedFrequency.put('U', 8);
            expectedFrequency.put('V', 11);
            expectedFrequency.put('a', 460);
            expectedFrequency.put('b', 64);
            expectedFrequency.put('c', 213);
            expectedFrequency.put('d', 160);
            expectedFrequency.put('e', 657);
            expectedFrequency.put('f', 55);
            expectedFrequency.put('g', 78);
            expectedFrequency.put('h', 32);
            expectedFrequency.put('i', 593);
            expectedFrequency.put('j', 8);
            expectedFrequency.put('l', 335);
            expectedFrequency.put('m', 253);
            expectedFrequency.put('n', 322);
            expectedFrequency.put('o', 262);
            expectedFrequency.put('p', 132);
            expectedFrequency.put('q', 74);
            expectedFrequency.put('r', 308);
            expectedFrequency.put('s', 482);
            expectedFrequency.put('t', 472);
            expectedFrequency.put('u', 474);
            expectedFrequency.put('v', 94);
            expectedFrequency.put('w', 2);
            expectedFrequency.put('x', 11);
            expectedFrequency.put('y', 1);
            
            boolean result = LetterFrequencyDictionary.testTheAnswer("./tests/loremIpsumTest.txt", expectedFrequency);
            System.out.println("Test result: " + result);

        }

    }   
    
    public static boolean testTheAnswer(String fileName, Map<Character, Integer> expectedFrequency) throws IOException {
        
        LetterFrequencyDictionary lfd = new LetterFrequencyDictionary();
        Map<Character, Integer> actualFrequency = lfd.countLettersInFile(fileName);

        return actualFrequency.equals(expectedFrequency);
    }
    
}