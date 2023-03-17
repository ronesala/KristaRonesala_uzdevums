//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
import java.io.IOException;
import java.util.HashMap;
import org.junit.Test;

public class LetterFrequencyDictionaryWhitoutSizesTest {

  @Test
  public void testCountLettersInFile() throws IOException {

    //LetterFrequencyDictionaryWhitoutSizes lfdws = new LetterFrequencyDictionaryWhitoutSizes();
    //LetterFrequencyDictionary lfd = lfdws.new LetterFrequencyDictionary();

    //HashMap<Character, Integer> actualLetterFrequency = lfd.countLettersInFile("./tests/test4.txt");
    HashMap<Character, Integer> expectedLetterFrequency = new HashMap<Character, Integer>();

    expectedLetterFrequency.put('a', 4);
    expectedLetterFrequency.put('b', 1);
    expectedLetterFrequency.put('c', 1);
    expectedLetterFrequency.put('d', 4);
    expectedLetterFrequency.put('e', 9);
    expectedLetterFrequency.put('g', 1);
    expectedLetterFrequency.put('h', 5);
    expectedLetterFrequency.put('i', 4);
    expectedLetterFrequency.put('l', 5);
    expectedLetterFrequency.put('m', 3);
    expectedLetterFrequency.put('n', 5);
    expectedLetterFrequency.put('o', 9);
    expectedLetterFrequency.put('p', 1);
    expectedLetterFrequency.put('r', 3);
    expectedLetterFrequency.put('s', 5);
    expectedLetterFrequency.put('t', 7);
    expectedLetterFrequency.put('w', 1);
    expectedLetterFrequency.put('x', 1);
    expectedLetterFrequency.put('y', 1);
    expectedLetterFrequency.put('z', 1);
    //assertEquals(expectedLetterFrequency, actualLetterFrequency);

  }

  // @Test
  // public void testFileNotFound() {
  //   LetterFrequencyDictionaryWhitoutSizes lfdws = new LetterFrequencyDictionaryWhitoutSizes();
  //   LetterFrequencyDictionary lfd = lfdws.new LetterFrequencyDictionary();
  //   try {

  //       HashMap<Character, Integer> letterFrequency = lfd.countLettersInFile("./tests/nonexistentfile.txt");
  //       fail("Expected an IOException to be thrown");

  //   } 
  //   catch (IOException e) {

  //       assertEquals("File not found", e.getMessage());
        
  //   }
  //}

}
