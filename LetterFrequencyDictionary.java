import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Klase, kas ielasa failu
public class LetterFrequencyDictionary {

    // FileNotFound, ja nevar atrast failu
    public static void main(String[] args) throws IOException{
        
        // Atver failu 
        //File file = new File("./test1.txt");
        FileReader file = new FileReader("./test1.txt");
        
        // Ielasa failu
        //Scanner scan = new Scanner(file);
        BufferedReader br = new BufferedReader(file);

        // Ielase pa simboliem
        int c = 0;             
        while((c = br.read()) != -1)
        {
            char character = (char) c;          //no int uz char
            System.out.println(character);      //izvade
        }

        file.close();

    }    
    
}