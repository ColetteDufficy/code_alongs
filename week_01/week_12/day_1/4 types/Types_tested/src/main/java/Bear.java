public class Bear {
    private String name; //String is a Refernce type, hence the capitalized
    private int age; //int, double (aka float), boolean, and char are all called Primitive
    private double weight;
    private char sex;

    public Bear (String name, int age, double weight, char sex){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    //the following are getters
    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean readyToHibernate(){
        if (this.weight >= 80.00){
            return true;
        }
            return false;
    }
//
//    public boolean readyToHibernate(){
//        if (this.weight >= 80.00){
//            return true;
//        } else {
//            return false;
//        }
//    }
}
