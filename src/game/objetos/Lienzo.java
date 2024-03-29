/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.objetos;

import javax.swing.JFrame;

/**
 *
 * @author mamisho
 */
public class Lienzo extends JFrame {
    
    public Lienzo(int width, int height) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GAmE");
        setSize(width, height);
        setVisible(true);
    }
    
}
