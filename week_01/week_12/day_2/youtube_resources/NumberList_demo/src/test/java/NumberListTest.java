import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {
    private NumberList numberList; // create a private instance variable to test with, called numberList

    @Before
    public void before() {
        numberList = new NumberList(); // we instaniate it as numberList, in the @Before
    }

    @Test
    public void hasNumberOfEntries() {
        assertEquals(0, numberList.getNumberCount());
    }

    @Test //adding a number to the ArrayList, using .add method
    public void canAddNumberToLIst() {
        numberList.addNumber(27);
        assertEquals(1, numberList.getNumberCount());
    }

    @Test // find out the first number in the ArrayList
    public void canGetFirstNumber() {
        numberList.addNumber(27);
        assertEquals(27, numberList.getNumberAtIndex(0)); //index position zero, to see the first number in the ArrayList
    }

    @Test
    public void canGetTotal() {
        numberList.addNumber(1);
        numberList.addNumber(2);
        numberList.addNumber(3);
        numberList.addNumber(4);
        numberList.addNumber(5);
        assertEquals(15, numberList.getTotal());
    }

}


//
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//
//
//
//
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
//public class NumberListTest {
//    private NumberList numberList; // create a private instance variable to test with, called numberList
//
//    @Before
//    public void before() {
//        ArrayList<Interger> testNumbers = new ArrayList<Interger>();
//        testNumbers.add(1);
//        testNumbers.add(2);
//        testNumbers.add(3);
//        testNumbers.add(4);
//        testNumbers.add(5);
//
//        numberList = new NumberList(testNumbers); // we instaniate it as numberList, in the @Before
//    }
//
//    @Test
//    public void hasNumberOfEntries() {
//        assertEquals(5, numberList.getNumberCount());
//    }
//
//    @Test //adding a number to the ArrayList, using .add method
//    public void canAddNumberToLIst() {
//        numberList.addNumber(27);
//        assertEquals(6, numberList.getNumberCount());
//    }
//
//    @Test // find out the first number in the ArrayList
//    public void canGetFirstNumber() {
//        assertEquals(1, numberList.getNumberAtIndex(0)); //index position zero, to see the first number in the ArrayList
//    }
//
//    @Test
//    public void canGetTotal() {
//        assertEquals(15, numberList.getTotal());
//    }
//
//}
