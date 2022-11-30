public class Runner {
    public static void main(String[] args) {

        Planets planet = new Planets("Mars", 908973);
        System.out.println(planet.getName());
        System.out.println(planet.getSize());
        System.out.println(planet.explode());

    }

}
