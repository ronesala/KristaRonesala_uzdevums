// Izveido anglu alfabeeta burtu frekvences vaardniicu 

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

    // FileNotFound, ja nevar atrast failu
    public static void main(String[] args) throws IOException{

        // Darbiibas ar failu
        FileReader file = new FileReader("./test2.txt");
        BufferedReader reader = new BufferedReader(file);

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

        // Izvade
        for (Map.Entry<Character, Integer> entry : LetterFrequency.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());

        }

        file.close();

    }    
}
