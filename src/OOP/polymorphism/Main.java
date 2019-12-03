package OOP.polymorphism;

class Movie{

    private String name;

    Movie(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}

 class Jaws extends Movie {

    Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of peaople";
    }
}

 class StarWars extends Movie{

    StarWars() {
        super("Star Wars");
    }

    public String plot(){
        return "Imperial Forces try to take over the universe";
    }
}

 class Forgetable extends Movie{

    Forgetable(){
        super("Forgetable");
    }

    // No plot here
}

public class Main {

    public static Movie randomMovie(){

        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new StarWars();
            case 3:
                return new Forgetable();
        }
        return null;
    }

    public static void main(String[] args) {

        for(int i=1; i < 5; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }

    }
}
