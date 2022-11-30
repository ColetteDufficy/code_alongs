import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    //DECLARED but not being initialised - being brought ito existance but has no value/null
    Bear bearObject; //Class followed by instance or property or object name
    Bear bearObject2; //Class followed by instance or property or object name
    Bear bearObject3; //Class followed by instance or property or object name

    @Before //annotation to define what we want JUnit to do.
    public void before(){
        //objects being instaiated (given a value)
        bearObject = new Bear("Baloo", 25, 95.62);
        bearObject2 = new Bear(32, 25.77);
        bearObject3 = new Bear("Yogi", 45);
    }


    @Test //annotation to define what we want JUnit to do.
    public void hasName(){
//        Bear bearObject = new Bear("Baloo", 25);
        bearObject2.setName("Baloo");
        assertEquals("Baloo", bearObject2.getName());
    }

    @Test
    public void hasAge() {
//        Bear bear = new Bear("Baloo", 25);
        assertEquals(25, bearObject2.getAge());
    }

    @Test
    public void hasWeight() {
//        Bear bear = new Bear("Baloo", 25, 95.62);
        assertEquals(95.62, bearObject3.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80() {
        assertEquals(true, bearObject.readyToHibernate());
    }

    @Test
    public void readyToHibernateIfLessThan80() {
        Bear thinBear = new Bear("Moguli", 25, 65.44);
        assertEquals(false, thinBear.readyToHibernate());
    }
}
