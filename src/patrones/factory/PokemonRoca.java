/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.factory;

/**
 *
 * @author mamisho
 */
public class PokemonRoca extends Pokemon implements IPokemon{

    public PokemonRoca(String nombre, Integer power) {
        super(nombre, power, PokemonType.ROCA);
    }

    @Override
    public void atack() {
        System.out.println("Embestida");
    }

    @Override
    public void eat() {
        System.out.println("Come rocas");
    }

    @Override
    public void move() {
        System.out.println("Arrastra");
    }
    
}
