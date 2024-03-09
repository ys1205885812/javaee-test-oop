package cn.zust.edu.cn;

public class Rectangle implements IShape {
    private Point ptTopLeft;
    private Point ptTopRight;
    private int width;
    private int height;


    public Rectangle(){
        this.ptTopLeft=new Point();
        this.ptTopRight=new Point();
        this.width=0;
        this.height=0;
    }
    public Rectangle(Point topLeft, int height, int width){
        this.ptTopLeft = topLeft;
        this.width = width;
        this.height = height;
        this.ptTopRight = new Point(topLeft.getX() + width, topLeft.getY());
    }
    @Override
    public double perimeter() {

        return 2 * (width + height);
    }
    @Override
    public double area() {

        return width * height;
    }
    @Override
    public void draw() {

        System.out.println("矩形");
        System.out.println("周长:"+perimeter());
        System.out.println("面积:"+area());

    }


}