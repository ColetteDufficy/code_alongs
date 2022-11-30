import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WordCollectionTest {
    private WordCollection myWords;

    @Before
    public void before(){
    myWords = new WordCollection();
    }

    @Test
    public void canGetWordCount(){
//        System.out.println(Arrays.toString(myWords.getWords()));
//        assertEquals(0, myWords.getWordCount());
        assertEquals(5, myWords.getWordCount());
    }
}
