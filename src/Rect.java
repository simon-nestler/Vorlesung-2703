public class Rect {
    private Point p1, p2;

    public Rect(int width, int height) {
        p1 = new Point(0, 0);
        p2 = new Point(width, height);
    }

    public void move(int x, int y) {
        p1 = new Point(p1.getX() + x, p1.getY() + y);
        p2 = new Point(p2.getX() + x, p2.getY() + y);
    }

    public int getWidth() {
        return p2.getX() - p1.getX();
    }

    public int getHeight() {
        return p2.getY() - p1.getY();
    }

    public Point getCenter() {
        return new Point((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
    }

    public boolean isInside(Point p) {
        return p.getX() >= p1.getX() && p.getX() <= p2.getX() && p.getY() >= p1.getY() && p.getY() <= p2.getY();
    }

}
