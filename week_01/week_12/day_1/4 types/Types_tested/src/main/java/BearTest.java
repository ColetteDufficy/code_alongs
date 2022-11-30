import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {
    // add this to void having to type out the instance constantly
    Bear bear;
    // add this to the start of the test to avoid repeating members below
    @Before public void before(){
        bear = new Bear("Baloo", 25, 95.62, 'm'); //note the use of single quote marks on the char member
    }


    //@Test annotation that tells java that this is a test
    @Test // roll over the keyword and the red light bulb lets you import the correct testing
    public void hasName() {
        //Bear bear = new Bear("Baloo", 25);
        // see line 8 - it has given the instance at the begnining bear = new Bear("Baloo", 25);
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
//        bear = new Bear("Baloo", 25);
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight(){
//        bear = new Bear("Baloo", 25, 95.62);
        assertEquals(95.62, bear.getWeight(), 0.0); //delta allows for float discrepancies but are still within acceptable range
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear ("Baloo", 25,65.44, 'm'); //new instance of a bear being created, cos its thinnner
        assertEquals(false, thinBear.readyToHibernate());
    }
}
