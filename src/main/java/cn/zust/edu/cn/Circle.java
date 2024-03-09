package cn.zust.edu.cn;

public class Circle implements IShape{
    private Point ptCenter;
    private Integer radius;
    public Circle(Point center,int radius) {
        this.ptCenter = center;
        this.radius = radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(){
        System.out.println("圆");
        System.out.println("中心: " + ptCenter.x + ", " + ptCenter.y );
        System.out.println("半径: " + radius);
        System.out.println("周长：" + perimeter() );
        System.out.println("面积：" + area() );
    }
}