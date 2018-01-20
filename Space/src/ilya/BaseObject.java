package ilya;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;
    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public void draw(Canvas canvas) {

    }

    public void move() {

    }

    public void die() {
        this.isAlive = false;
    }

    public boolean isInsert(BaseObject o) {
        double dist = Math.sqrt((this.x - o.x) * (this.x - o.x) + (this.y - o.y) * (this.y - o.y));
        return dist <= Math.max(this.radius, o.radius);
    }

    public void checkBorders(double minx, double maxx, double miny, double maxy) {
        if (x < minx) x = minx;
        if (x > maxx) x = maxx;
        if (y < minx) x = miny;
        if (y > maxx) y = maxy;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
