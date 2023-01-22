package qf05_openclosed;

/**
 * @author IsQf02
 * @date 2023/1/22-21:07
 */
public class Ocp2 {
    public static void main(String[] args) {
        new GraphicEditor2().drawShape(new Circle2());
        new GraphicEditor2().drawShape(new Rectangle2());
        new GraphicEditor2().drawShape(new Triangle2());
        new GraphicEditor2().drawShape(new Others());
    }
}

//用于绘图的类[使用方]
class GraphicEditor2 {
    public void drawShape(Shape2 s) {
        s.draw();
       /* if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3)
            drawTriangle(s);*/
    }
/*
    //绘制矩形
    public void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    //绘制圆形
    public void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    //绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形 ");
    }*/
}


abstract class Shape2 {
    int m_type;
    abstract void draw();
}

class Rectangle2 extends Shape2 {
    Rectangle2() {
        super.m_type = 1;
    }
   void draw(){
       System.out.println("绘制矩形");
    }
}

class Circle2 extends Shape2 {
    Circle2() {
        super.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle2 extends Shape2 {
    Triangle2() {
        super.m_type = 3;
    }
    @Override
    void draw() {
        System.out.println("绘制三角形 ");
    }
}

class Others extends Shape2{
    void draw() {
        System.out.println("绘制其他图形 ");
    }
}
