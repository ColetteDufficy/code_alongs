public class Runner {
    public static void main(String[] args) { //main method acting as entry point

        Cat myCat = new Cat("Juno"); //the cats name is Juno
        System.out.println(myCat.name); //console logging it

        myCat.setName("Kitty"); //setting or updating the name from Juno to Kitty
        System.out.println(myCat.name); //console logging it

        myCat.setName("Mouche"); //setting or updating the name from Kitty to Mouche
        System.out.println(myCat.name); //console logging it


        //*************   the following lines arent really needed, as ur able to sout the 'setName'. so why do we have a getName method?? *********
        // String name = myCat.getName();
        // System.out.println(name); //this is calling a instance variable called name on the object myCat. will print out Mouche now instead of Kitty

        System.out.println(myCat.catTalks()); //This is calling the method catTalks on the object myCat.

        System.out.println(myCat.myCatTalks());

        Cat petCat = new Cat("Bruno");
        System.out.println(petCat.name);
        petCat.setName("Bex");
        System.out.println(petCat.name);


        //GENERAL NOTES
        //the type of object im going to have is a Cat object. This matches the class name of the object
        // Cat is the class name or the object
        // myCat is the variable name
        // i made a cat object and stored in a variable called myCat

        // myCat = new Cat();
        // myCat = new Dog(); // this variable can only accept items from the Cat class, so it cannot accept this line of code. see lines below for correct code
        Dog myDog = new Dog();
        myDog = new Dog();




    }
}

// the class name has to be the same as file name
// Public means it CAN be called from anywhere
// static  - is a class method
// void - expected to return nothing

// String - 2nd word is the type that gonna be returned
// yellow or third word is the name of our method

