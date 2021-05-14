package practice.abstractclass;
public class AbstractDemo {
    public static void main(String[] args){
        Circle c=new Circle();
        c.calculateArea();
        c.setColor("Green");
        Square s = new Square();
        s.calculateArea();
       s.setColor("red");
    }
}