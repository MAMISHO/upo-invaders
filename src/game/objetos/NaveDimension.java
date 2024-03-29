/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.objetos;

public class NaveDimension {

    private int posX;
    private int posY;
    private int maxX;
    private int maxY;

public NaveDimension(int posX, int posY, int maxX, int maxY) {
        this.posX = posX;
        this.posY = posY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    @Override
    public String toString() {
        return "NaveDimension{" + "posX=" + posX + ", posY=" + posY + ", maxX=" + maxX + ", maxY=" + maxY + '}';
    }

    
}

