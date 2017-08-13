package ilya;

public class FigureFactory {
    private static final int[][][] BRICKS = {{
            {1, 1, 0},
            {0, 1, 1},
            {0, 0, 0}}, {

            {1, 0, 0},
            {1, 1, 0},
            {0, 1, 0}}, {

            {0, 1, 0},
            {0, 1, 0},
            {0, 1, 0}}, {

            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 0}}, {

            {1, 1, 1},
            {0, 1, 0},
            {0, 0, 0}}, {

            {1, 1, 1},
            {1, 1, 1},
            {0, 0, 0}}
    };

    public static Figure createRandomFigure(int x, int y) {
        int number = (int) (Math.random() * 6);
        return new Figure(x, y, BRICKS[number]);
    }
}

