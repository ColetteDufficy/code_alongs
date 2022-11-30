import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BearTest {

    private Bear bear; //an instance variable of the class Bear
    private Salmon salmon; //have a salmon to put in the belly. Make an instance variable of type Salmon

    @Before
    public void before() { //*********SET UP***********
        this.bear = new Bear("Baloo");
        this.salmon = new Salmon();
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon); //**********ACT*********
        assertEquals(1, bear.foodCount()); //*****ASSERTION*******
    }



}
