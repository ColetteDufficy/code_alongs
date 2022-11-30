import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");
        System.out.println(favouriteFruits.get("Bob"));

      favouriteFruits.put(); //allows a new K:V pair to be inserted into the HashMap
      favouriteFruits.get(); //allows u to pass in a key and it will return the value, or else return 'null'
      favouriteFruits.size(); //how many entries there are
      favouriteFruits.clear(); //how to empty the entire HashMap and u wanted to reset it. ***Will keep the same types***
        favouriteFruits.remove(); // remove just the key or remove key AND value. This is the key option. if you remove the key, it removes the value too.
        System.out.println(favouriteFruits.containsKey("Jon")); //useful if ur not sure if something is held in the HashMap. There is also 'contains.value' to do the same thing. Boolean response.

        //see the notes for other optionsk.
    }
}
