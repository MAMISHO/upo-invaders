package game;

import game.objetos.Nave;
import game.objetos.NaveDimension;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import javax.swing.JFrame;

public class NaveFactory {

    private final Random random = new Random();
    private Graphics g;
    private int maxWith;
    private int maxHeight;
    private Queue<Color> colores = new LinkedList<>();
    
    private NaveFactory(){
        
    }
    
    public NaveFactory(JFrame frame, int maxWith, int maxHeight) {
        this.g = frame.getGraphics();
        this.maxWith = maxWith;
        this.maxHeight = maxHeight;
        colores.add(Color.red);
        colores.add(Color.yellow);
        colores.add(Color.pink);
        colores.add(Color.BLACK);
        colores.add(Color.BLUE);
        colores.add(Color.CYAN);
        colores.add(Color.GREEN);
        colores.add(Color.ORANGE);
        colores.add(Color.MAGENTA);
        colores.add(Color.GRAY);
    }

    public  Nave crearNaveAleatoria(List<Nave> navesExistentes) {
        NaveDimension dimension;
        // do {
            // Generar posición X aleatoria múltiplo de 35
            int posX = random.nextInt(maxWith / 35) * 35;
            dimension = new NaveDimension(posX, 0, this.maxWith, maxHeight); // Y siempre en 0
        // } while (colisionaConNavesExistentes(dimension, navesExistentes));
        if(!colisionaConNavesExistentes(dimension, navesExistentes)) {
            g.setColor(colores.poll());
            Nave n = new Nave(dimension, g);
            // n.setGraphics(g);
            return n;
        }
        return null;
    }

    private  boolean colisionaConNavesExistentes(NaveDimension dimension, List<Nave> navesExistentes) {
        for (Nave nave : navesExistentes) {
            NaveDimension dimensionNaveExistente = nave.getDimension();
            if (dimension.getPosX() == dimensionNaveExistente.getPosX()) {
                return true; // Colisiona en X
            }
        }
        return false; // No colisiona
    }
}
