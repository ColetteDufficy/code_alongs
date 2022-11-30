import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCollectionTest {
    private WordCollection myWords; //whats this? instance variable called myWords?
    private WordCollection letters; //whats this? instance variable called Letters?

    @Before // set up to avoid having to insert repeatedly.
    public void before() {
        myWords = new WordCollection();
        letters = new WordCollection();
    }

//    @Test
//    public void canAddWords() {
//        WordCollection.add("Banana");
//        WordCollection.add("Pear");
//        assertEquals("Banana", wordCollection.get(0));
//        assertEquals("Pear", wordCollection.get(1));
//    }

    @Test //testing to count the number of words. Its hard coded to 5 at the moment so the test should pass.
    public void canGetWordCount() {
        assertEquals(5, myWords.getWordCount());
    }

    @Test
    public void canGetLetterCount() {
        assertEquals(0, letters.getLettersCount());
    }

}