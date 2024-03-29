package patrones.factory;

/**
 *
 * @author mamisho
 */
public class PokemonAve extends Pokemon implements IPokemon {

    public PokemonAve(String nombre, Integer power) {
        super(nombre, power, PokemonType.AVE);
    }

    @Override
    public void atack() {
        System.out.println("Embiste");
    }

    @Override
    public void eat() {
        System.out.println("Come insectos");
    }

    @Override
    public void move() {
        System.out.println("Vuela");
    }
    
}
