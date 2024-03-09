package cn.zust.edu.cn;

public class Point {
    public int x;
    public int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
