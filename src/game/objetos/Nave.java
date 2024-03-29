package game.objetos;

import game.objetos.enums.Direction;
import java.awt.*;
import javax.swing.JFrame;

public class Nave implements INaveBase{

    private int posX = 0;
    private int posY = 0;

    private final int LIMIT_MIN_X = 2;
    private final int LIMIT_MIN_Y = 28;

    private final int EDGE_MAX_X = 35;
    private final int EDGE_MAX_Y = 20;

    private NaveDimension dimension;
    private Graphics g;
    private Direction currentDirection = Direction.RIGTH;

    public Nave(NaveDimension dimension, Graphics g) {
        this.dimension = dimension;
        this.g = g;
        posX = dimension.getPosX();// + LIMIT_MIN_X;
        posY = dimension.getPosY() + LIMIT_MIN_Y;
        // this.drawn();
    }

    public void drawn() {
        // Fila 1
        g.fillRect(posX, posY, 5, 5);
        g.fillRect(posX + 5, posY, 5, 5);
        g.fillRect(posX + 10, posY, 5, 5);
        g.fillRect(posX + 20, posY, 5, 5);
        g.fillRect(posX + 25, posY, 5, 5);
        g.fillRect(posX + 30, posY, 5, 5);

        // Fila 2
        g.fillRect(posX, posY + 5, 5, 5);
        g.fillRect(posX + 10, posY + 5, 5, 5);
        g.fillRect(posX + 15, posY + 5, 5, 5);
        g.fillRect(posX + 20, posY + 5, 5, 5);
        g.fillRect(posX + 30, posY + 5, 5, 5);

        // Fila 3
        g.fillRect(posX + 10, posY + 10, 5, 5);
        g.fillRect(posX + 15, posY + 10, 5, 5);
        g.fillRect(posX + 20, posY + 10, 5, 5);

        // Fila 4
        g.fillRect(posX + 15, posY + 15, 5, 5);
        // g.dispose();
    }

    public void clearDrawing() {
        g.clearRect(posX, posY, EDGE_MAX_X, EDGE_MAX_Y);
        // g.dispose();
    }

    private NaveDimension moveRigth() {
        return move(Direction.RIGTH);
    }

    private NaveDimension moveLeft() {
        return move(Direction.LEFT);
    }

    private NaveDimension moveUp() {
        return move(Direction.UP);
    }

    private NaveDimension moveDown() {
        return move(Direction.DOWN);
    }

    private NaveDimension move(Direction direction) {
        try {
            
            this.clearDrawing();
            updatePosition(direction);
            this.drawn();
            // frame.repaint();
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return this.dimension;
    }

    private void updatePosition(Direction direction) {
        switch (direction) {
            case LEFT:
                this.posX -= 35;
                this.dimension.setPosX(posX);
                break;
            case RIGTH:
                this.posX += 35;
                this.dimension.setPosX(posX);
                break;
            case DOWN:
                this.posY += 20;
                this.dimension.setPosY(posY);
                break;
            case UP:
                this.posY -= 20;
                this.dimension.setPosY(posY);
                break;
        }
    }

    public NaveDimension getDimension() {
        return dimension;
    }


    @Override
    public void autoMove() {
        if(currentDirection.equals(Direction.RIGTH) && canMoveToRigth()) {
            this.moveRigth();
        } else if(currentDirection.equals(Direction.LEFT) && canMoveToLeft()) {
            this.moveLeft();
        } else {
            moveDown();
            changeDirection();
        }
        /*
                if (posX + this.EDGE_MAX_X < dimension.getMaxX() - this.EDGE_MAX_X) {
                    
                }
                // Mover la nave hacia abajo
                
                // Mover la nave hacia la izquierda
                if (posX > this.LIMIT_MIN_X) {
                    
                }
                // Mover la nave hacia abajo
                moveDown();*/
    }

    public void setFrame(JFrame frame) {
        // this.frame = frame;
        this.g = frame.getGraphics();
    }
    
    public void setGraphics(Graphics g) {
        // this.frame = frame;
        this.g = g;
    }
    
    private Boolean canMoveToRigth() {
        return (posX + this.EDGE_MAX_X < dimension.getMaxX() - this.EDGE_MAX_X);
    }
    
    private Boolean canMoveToLeft() {
        return (posX > this.LIMIT_MIN_X);
    }
    
    /**
     * El cambio de sentido solo se da de izquierda a derecha o viceversa
     */
    private void changeDirection(){
        switch(currentDirection) {
            case RIGTH:
                currentDirection = Direction.LEFT;
                break;
            default:
                currentDirection = Direction.RIGTH;
        }
    }
}
