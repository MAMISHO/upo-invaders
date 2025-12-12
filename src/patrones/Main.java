package patrones;

import game.NaveFactory;
import game.objetos.Lienzo;
import game.objetos.Nave;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author mamisho
 */
public class Main {

    private static final int WITH = 600;
    private static final int HEIGHT = 400;
    private static final int GAME_SPEED = 100; // milisegundos entre updates

    public static void main(String[] args) {
        Lienzo lienzo = new Lienzo(WITH, HEIGHT);
        lienzo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                NaveFactory naveFactory = new NaveFactory(lienzo, WITH, HEIGHT);
                List<Nave> naves = new ArrayList<>();

                // Crear las naves iniciales
                while (naves.size() < 10) {
                    Nave nave = naveFactory.crearNaveAleatoria(naves);
                    if (nave != null) {
                        nave.drawn();
                        naves.add(nave);
                        System.out.println("** nave " + naves.size() + " " + nave.getDimension().toString());
                    }
                }

                // Game loop usando Timer de Swing (no bloquea el hilo de eventos)
                Timer gameTimer = new Timer(GAME_SPEED, evt -> {
                    int i = 0;
                    for (Nave n : naves) {
                        i++;
                        n.autoMove();
                        System.out.println("nave " + i + " " + n.getDimension().getPosX() + "-" + n.getDimension().getPosY());
                    }
                });
                gameTimer.start();
            }
        });
    }
}
