#面向对象程序设计回顾
## 一、类的定义与使用
###1. 声明Point类
1)  添加两个整型属性x,y
2)  提供构造函数Point()、Point(int x,int y)和Point(Point p)
###2. 声明Rectangle类
1) 添加四个属性：Point ptTopLeft, Point ptTopRight, int width,int height
2) 为Rectangle类提供构造函数Rectangle()、Rectangle(Point topleft,int hight,int width)
3) 为Rectangle类添加并实现double perimeter()、double area()、void draw()方法
###3. 测试Rectangle类
##二、	类与接口
###1. 声明IShape接口，添加三个接口方法double perimeter()、double area()、void draw()
###2. 声明Circle类实现IShape接口
1)	添加两个属性：Point ptCenter; int radius
2)	提供构造函数Circle(Point center,int r);
3)	实现IShape的三个接口方法double perimeter()、double area()、void draw()
###3. 声明Triangle类实现IShape接口
1)	添加三个属性：Point ptA,Point ptB,Point ptC
2)	添加三个只读属性：double edgeA,double edgeB,double edgeC
3)	提供构造函数Triangle(Point ptA,Point ptB,Point ptC);
4)	实现IShape的三个接口方法double perimeter()、double area()、void draw()
###4. 改造一中的Rectangle类，使之实现IShape接口
###5. 声明ShapeManager类
1)	添加只读属性List<IShape> shapes;
2)	添加addShape(IShape shape)方法，实现将参数shape对象添加到shapes列表中
3)  添加delShape(IShape shape)方法，实现将参数shape对象从shapes列表中删除
4)	添加drawShapes()方法，实现shapes列表中所有shape元素的绘制
###6、	测试代码
```
public static void Main(String [] args){
	ShapeManager shapeManager=new ShapeManager();
	Rectangle rect=new Rectangle(new Point(10,10),100,200);
	Triangle tri=new Triangle(new Point(0,10),new Point(50,50),new Point(150,0));
	Circle cir=new Circle(new Point(100,100),100);
	shapeManager.addShape(rect);
	shapeManager.addShape(tri);
	shapeManager.addShape(cir);
	shapeManager.drawShapes();
	shapeManager.delShape(rect);
	shapeManager.drawShapes();
}

```
