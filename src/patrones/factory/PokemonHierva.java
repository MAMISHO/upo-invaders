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
public class PokemonHierva extends Pokemon implements IPokemon {

    public PokemonHierva(String nombre, Integer power) {
        super(nombre, power, PokemonType.HIERVA);
    }

    @Override
    public void atack() {
        System.out.println("Latigo");
    }

    @Override
    public void eat() {
        System.out.println("Comen hierva");
    }

    @Override
    public void move() {
        System.out.println("Camina");
    }
}
