import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Klase, kas ielasa failu
public class FileReader {

    // FileNotFound, ja nevar atrast failu
    public static void main(String[] args) throws FileNotFoundException{
        
        // Atver failu 
        File file = new File("./test1.txt");
        
        // Ielasa faila pirmo rindu
        Scanner scan = new Scanner(file);

        // Izvada pirmo rindu
        System.out.println(scan.nextLine());

    }    
    
}
