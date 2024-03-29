package patrones.factory;

/**
 *
 * @author mamisho
 */
public abstract class Pokemon {
    
    private String nombre;
    private Integer power;
    private PokemonType tipo;
    
    private Pokemon(){}
    
    public Pokemon(String nombre, Integer power, PokemonType tipo) {
        this.nombre = nombre;
        this.power = power;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public PokemonType getTipo() {
        return tipo;
    }

    public void setTipo(PokemonType tipo) {
        this.tipo = tipo;
    }
    
    public String info() {
        return this.getNombre() + " " + this.getPower().toString();
    }
}
