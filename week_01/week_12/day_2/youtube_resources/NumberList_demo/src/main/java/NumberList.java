import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;


    public NumberList() { // constructor for the instance 'numbers' using the Class NumberLIst
        this.numbers = new ArrayList<>();
    }

    public int getNumberCount() {
        return this.numbers.size(); //the method 'size' is used here to establish the length or SIZE the ArrayList. ArrayList dont have a method called "length", its called 'size'
    }


    public void addNumber(int number) {
        this.numbers.add(number); //add method used to add number to the ArrayList
    }

    public int getNumberAtIndex(int index) {
        return this.numbers.get(index); //use a '.' to see all the methods open to use
    }

    public int getTotal() {
        int total = 0;
//        for (initialisation; boolean; update)
//        for ( int i = 0; i < getNumberCount(); i++){
//            total += getNumber(i);
        for ( int number : this.numbers) {
            total += number;
        }
        return total;
    }
}
