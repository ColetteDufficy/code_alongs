public class Runner {

    public static void main(String[] args) {
        //the square brackets is an empty array. It's a throwback and not used much anymore.

        Cat myCat = new Cat();
       // syntax class name (Cat in this case) and variable name is equal to new instance of the clas of Cat
        // is of type Cat, and we cant tunr into a Dog shape etc. So we cant reassign. This variable is the shape of cat
        // myCat = new Dog(); cannot reassign
        System.out.println(myCat.meow());
        System.out.println(myCat.eat());
        System.out.println(myCat.legs());
    }
}

//pom is like package.json
//.java is the source code file extension
//maven handles the build
//this Runner.java file is just for running the code
//snippet: type pvsm and tab, and it will auto complete the "public static void main" etc
//click the green arrow to 'run the code'
//sout and tab - snippet for "System.out.println" - which is the same as Console.log
//line9 - call the instance and . and it will show all methods assioctaed with
