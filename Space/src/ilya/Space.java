package ilya;

import java.util.ArrayList;

public class Space {
    private int width;
    private int height;
    private ArrayList<Ufo> ufos;
    private ArrayList<Rocket> rockets;
    private ArrayList<Bomb> bombs;
    private SpaceShip ship;
    public static Space game;

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
        this.ufos = new ArrayList<Ufo>();
        this.rockets = new ArrayList<Rocket>();
        this.bombs = new ArrayList<Bomb>();
    }

    public SpaceShip getShip() {
        return ship;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    private void run() {

    }

    private void drow() {

    }

    private void sleep(int ms) {

    }

    public static void main(String[] args) {

    }
}
