public class Runner {
    public static void main(String[] args) { //snippet psvm and tab
        Bear myBear = new Bear("Balu"); //insert "" in the argument, and it will insert the parameter name of 'name:'
        System.out.println(myBear.getName()); //Public class, but a private member. Now that we've made the name member 'private' we now need to make getters and setters on Bear Class
        myBear.setName("Babo");
        System.out.println(myBear.getName());

    }
}
