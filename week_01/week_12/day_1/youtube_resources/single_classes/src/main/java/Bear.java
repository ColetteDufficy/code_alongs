public class Bear {

    private String name; // A variable called name, which is expected to be a type of String. After this point, any other method written within this class will have access to a variable called "name". Private also ensures that only methods within the class of Bear have access to the property of name. This is called encapsulation!!! hurrah!!

    //*****the following is the constructor syntax. public Class Name and then the parameters brackets... if u give me a string, i will do the method that follows to it.
    public Bear(String name){    //constructor method is required to build the bear, public and Class Name. In the argument, we've added the type of String and name
        this.name = name;       // "this.name" is referring to the instance variable for this class. constructor property of the class. the "name" after the = sign, is referring to the property "String name"
    }

    public String getName() { // this is called a getter
        return this.name;
    }

    //the following is a setter. It doesn't expect anything to be returned.
    public void setName(String newName){
        this.name = newName;
    }



}
