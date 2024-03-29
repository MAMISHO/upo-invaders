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
public class PokemonFuego  extends Pokemon implements IPokemon {

    public PokemonFuego(String nombre, Integer power) {
        super(nombre, power, PokemonType.FUEGO);
    }

    @Override
    public void atack() {
        System.out.println("Lanzallamas");
    }

    @Override
    public void eat() {
        System.out.println("Come carbón");
    }

    @Override
    public void move() {
        System.out.println("Camina");
    }
    
}
