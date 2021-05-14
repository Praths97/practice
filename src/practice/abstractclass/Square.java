package practice.abstractclass;

public  class Square extends Shape {
    int length = 4;
    int breadth = 4;

    @Override
    public double calculateArea() {
        double area = length * breadth;
        return area;
    }
}
