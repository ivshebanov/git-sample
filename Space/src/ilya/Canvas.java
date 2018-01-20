package ilya;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.matrix = new char[height + 2][width + 2];
    }

    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }

    public void setPoint(double x, double y, char c) {
        int iX = (int) Math.round(x);
        int iY = (int) Math.round(y);
        if (!(iX < 0 || iY < 0 || y > matrix.length || x > matrix[0].length)) {
            matrix[iY][iX] = c;
        }
    }

    public void drowMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    setPoint(x + j, y + j, c);
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
