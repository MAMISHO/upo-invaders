package patrones.factory;

/**
 *
 * @author mamisho
 */
public class PokemonAgua extends Pokemon implements IPokemon {

    public PokemonAgua(String nombre, Integer power) {
        super(nombre, power, PokemonType.AGUA);
    }

    @Override
    public void atack() {
        System.out.println("Chorro de agua");
    }

    @Override
    public void eat() {
        System.out.println("Come algas");
    }

    @Override
    public void move() {
        System.out.println("Nadan");
    }
    
}
