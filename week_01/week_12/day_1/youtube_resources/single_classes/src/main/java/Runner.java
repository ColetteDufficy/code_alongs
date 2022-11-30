public class Runner {
    public static void main(String[] args) {
        Bear firstBear = new Bear("Balu");
        String name = firstBear.getName(); // this is the variable DECLARED!
        System.out.println(firstBear.getName());
        //System.out.println(firstBear.name); when the property of the class was listed as Public, this line of code worked. Once the property was made private, then the Runner code could no longer see it. To access it, you must use methods like 'getName'. ~Same as line 15

//        int randNum = 9; DECLARED
//        randNum = 10; DON'T need to declare it again


        firstBear.setName("Baloo");
        name = firstBear.getName(); //the variable can be reassigned, but does not have to be declared again using String in front of name.
        //firstBear.name = ""; this has been made impossible by adding private in front of the property/constructor
        System.out.println(firstBear.getName());
    }
}
