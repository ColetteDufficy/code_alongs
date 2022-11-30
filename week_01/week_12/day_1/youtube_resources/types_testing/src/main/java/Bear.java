public class Bear {
    private String name;
    private int age;
    private double weight;

    public Bear(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Bear(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Bear(int age, double weight){
        this.age = age;
        this.weight = weight;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean readyToHibernate() {
        if (this.weight >= 80.00) {
            return true;
        }
            return false;
    }
}