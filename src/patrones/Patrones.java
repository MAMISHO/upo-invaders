package patrones;

import patrones.factory.IPokemon;
import patrones.factory.PokemonFactory;
import patrones.factory.PokemonType;

/**
 *
 * @author mamisho
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PokemonFactory pokemonFactory = new PokemonFactory();
        
        
        IPokemon pAgua = pokemonFactory.create("Squertel", PokemonType.AGUA);
        IPokemon pFuego = pokemonFactory.create("Cahrmander", PokemonType.FUEGO);
        IPokemon pHierva = pokemonFactory.create("Vulvasur", PokemonType.HIERVA);
        IPokemon pRoca = pokemonFactory.create("Onix", PokemonType.ROCA);
        IPokemon pAve = pokemonFactory.create("pidgi", PokemonType.AVE);
        
        System.out.println(pAgua.info());
        pAgua.move();
        System.out.println(pFuego.info());
        pFuego.move();
        System.out.println(pHierva.info());
        pHierva.move();
        System.out.println(pRoca.info());
        pRoca.move();
        
        System.out.println(pAve.info());
        pAve.move();
        
    }
    
}
