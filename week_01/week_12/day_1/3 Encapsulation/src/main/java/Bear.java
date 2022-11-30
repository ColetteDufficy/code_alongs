public class Bear {
    // public and private are called access modifier
    //members: members of the class are the properties and the methods of the class
    private String name; //private is used in encapsulation, if we want to make things accessible later
//    //constructor:
//    Public Bear(String _name){
//        this.name = _name;
//        //'name' cud be a 'banana', as long as it's a String in its type
//        //anything with an underscore is being passed in as an argument, see line 4
//        //don't need a "void" keyword, cos it's a constructor

    public Bear(String name) {
        this.name = name;
        //hit command N and it's a shortcut for a constructor
    }

    public void setName(String name) {
        this.name = name; //this is a setter.
    }

    public String getName() { //this is a getter. Command N and insert a getter. Note the method name needs to be updated on Runner file
        return name;
    }
}


//constructors are delared as Public in Java