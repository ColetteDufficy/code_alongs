public class Planets {

    private String name;
    private int size;

    public Planets(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public String explode(){
        String message = String.format("Boom %s has exploded", this.name);
        return message;
    }
}


//class Planet:
//
//        def __init__(self, name, size):
//        self.name = name
//        self.size = size
//
//        def get_name(self):
//        return self.name
//
//
//        def get_size(self):
//        return self.size
//
//        def explode(self):
//        print(f"Boom! {self.name} has exploded.")
//
//
//        def __main__():
//        mars = Planet("Mars", 908973)
//        print(f"{mars.get_name()} is {mars.get_size()}")
//        mars.explode()
//
//        __main__()
