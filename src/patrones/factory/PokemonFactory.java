package patrones.factory;

/**
 *
 * @author mamisho
 */
public class PokemonFactory {
    
    public IPokemon create(String name, PokemonType tipo) {
        return createrInternal(name, null, tipo);
    }
    
    public IPokemon create(String name, Integer power, PokemonType tipo) {
        return createrInternal(name, power, tipo);
    }
    
    private IPokemon createrInternal(String name, Integer power, PokemonType tipo) {
        
        IPokemon pokemon = null;
        if(power == null || power > 100 || power < 0) {
            power = 100;
        }
        
        switch(tipo) {
            case AGUA:
                pokemon = new PokemonAgua(name, power);
                break;
            case FUEGO:
                pokemon = new PokemonFuego(name, power);
                    break;
            case HIERVA:
                pokemon = new PokemonHierva(name, power);
                break;
            case ROCA:
                pokemon = new PokemonRoca(name, power);
                break;
            case AVE:
                pokemon = new PokemonAve(name, power);
        }
        return pokemon;
    }
}
