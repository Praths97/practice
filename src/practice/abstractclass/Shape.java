package practice.abstractclass;
public abstract class Shape {
    String color;

    abstract double calculateArea();

    public void setColor(String color) {
        this.color = color;
    }
}