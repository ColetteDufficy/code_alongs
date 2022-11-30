import java.util.ArrayList;

public class Bear {

    private String name; //instance variable called 'name'
    private ArrayList<Salmon> belly; //instance variable called 'belly', that gonna be an array list of Salmon. Currently null.

    public Bear(String name){
        this.name = name;
        this.belly = new ArrayList<Salmon>(); //an empty array list thats ready to have tings pushed into it. PLacing it in the constructor means we don't need to create it everytime. A bear is born with an empty belly :)
    }
    public int foodCount(){
        return this.belly.size();
    }

    public void eat(Salmon salmon){
        this.belly.add(salmon);
    }



}
