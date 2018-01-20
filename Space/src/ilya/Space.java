package ilya;

import java.awt.event.KeyEvent;
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

    private ArrayList<BaseObject> getAllItems() {
        ArrayList<BaseObject> allObjects = new ArrayList<BaseObject>(ufos);
        allObjects.addAll(rockets);
        allObjects.addAll(bombs);
        allObjects.add(ship);
        return allObjects;
    }

    private void moveAllItems() {
        for (BaseObject bo : getAllItems()) {
            bo.move();
        }
    }

    private void createUfo() {
        if (ufos.size() != 0) return;
        int probability10 = (int) (Math.random() * 10);
        if (probability10 == 0) {
            double xRand = Math.random() * width;
            double yRand = Math.random() * height / 2;
            ufos.add(new Ufo(xRand, yRand));
        }
    }

    private void checkBombs() {
        for (Bomb bomb : bombs) {
            if (ship.isInsert(bomb)) {
                ship.die();
                bomb.die();
            }

            if (bomb.getY() >= height) {
                bomb.die();
            }
        }
    }

    private void checkRockets() {
        for (Rocket rocket : rockets) {
            for (Ufo ufo : ufos) {
                if (ufo.isInsert(rocket)) {
                    ufo.die();
                    rocket.die();
                }
            }

            if (rocket.getY() <= 0)
                rocket.die();
        }
    }

    private void removeDead() {
        for (BaseObject object : new ArrayList<BaseObject>(ufos)) {
            if (!object.isAlive()) {
                ufos.remove(object);
            }
        }

        for (BaseObject object : new ArrayList<BaseObject>(rockets)) {
            if (!object.isAlive()) {
                rockets.remove(object);
            }
        }

        for (BaseObject object : new ArrayList<BaseObject>(bombs)) {
            if (!object.isAlive()) {
                rockets.remove(bombs);
            }
        }
    }

    public SpaceShip getShip() {
        return ship;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    private void run() {
        Canvas canvas = new Canvas(width, height);

        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //Игра работает, пока корабль жив
        while (ship.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если "стрелка влево" - сдвинуть фигурку влево
                System.out.print(event.getKeyCode());
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    ship.moveLeft();
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    ship.moveRight();
                    //Если "пробел" - запускаем шарик
                else if (event.getKeyCode() == KeyEvent.VK_SPACE)
                    ship.fire();
            }

            //двигаем все объекты игры
            moveAllItems();

            //проверяем столкновения
            checkBombs();
            checkRockets();
            //удаляем умершие объекты из списков
            removeDead();

            //Создаем НЛО (1 раз в 10 ходов)
            createUfo();

            //Отрисовываем все объекты на холст, а холст выводим на экран
            canvas.clear();
            draw(canvas);
            canvas.print();

            //Пауза 300 миллисекунд
            Space.sleep(300);
        }
    }

    public void draw(Canvas canvas) {
        for (int i = 0; i < width + 2; i++) {
            for (int j = 0; j < height + 2; j++) {
                canvas.setPoint(i, j, '.');
            }
        }

        for (int i = 0; i < width + 2; i++) {
            canvas.setPoint(i, 0, '-');
            canvas.setPoint(i, height + 1, '-');
        }

        for (int i = 0; i < height + 2; i++) {
            canvas.setPoint(0, i, '|');
            canvas.setPoint(width + 1, i, '|');
        }

        for (BaseObject object : getAllItems()) {
            object.draw(canvas);
        }
    }


    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        game = new Space(20, 20);
        game.setShip(new SpaceShip(10, 18));
        game.run();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public static Space getGame() {
        return game;
    }
}
