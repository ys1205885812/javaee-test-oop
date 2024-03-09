package cn.zust.edu.cn;
public class Triangle implements IShape{
    private Point ptA;
    private Point ptB;
    private Point ptC;
    private Double edgeA;
    private Double edgeB;
    private Double edgeC;
    public Triangle(Point ptA,Point ptB,Point ptC) {
        this.ptA = ptA;
        this.ptB = ptB;
        this.ptC = ptC;
        this.edgeA = Math.sqrt(Math.pow(ptB.getX() - ptC.getX(),2) + Math.pow(ptB.getY() - ptC.getY(),2));
        this.edgeB = Math.sqrt(Math.pow(ptA.getX() - ptC.getX(),2) + Math.pow(ptA.getY() - ptC.getY(),2));
        this.edgeC = Math.sqrt(Math.pow(ptA.getX() - ptB.getX(),2) + Math.pow(ptA.getY() - ptB.getY(),2));
    }

    public double perimeter() {
        return edgeA + edgeB + edgeC;
    }


    public double area() {
        double m = perimeter() / 2;
        return Math.sqrt(m * (m - edgeA) * (m - edgeB) * (m - edgeC));
    }


    public void draw(){
        System.out.println("三角形");
        System.out.println("边长1："+edgeA);
        System.out.println("边长2："+edgeB);;
        System.out.println("边长3："+edgeC);
        System.out.println("面积: " + area());
    }
}