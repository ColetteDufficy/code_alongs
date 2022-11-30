public class Cat {
    public String name;

    public Cat(String name){ //constructor syntax, so we dont need to return anything
        this.name = name;
    }

    public String getName(){ //this is a getter
        return this.name;
    }

    public void setName(String newName){ //This is a setter; void means im expecting nothing to be returned
        this.name = newName;
    }

    public String catTalks(){
        return "meeeoooow";
    }

    public String myCatTalks(){
        String speech = "weeeehoooo";
        return String.format("my cat say %s", speech);
    }


}
