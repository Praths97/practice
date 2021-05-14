package practice.abstractclass;

public
class Circle extends Shape {
    double radius = 5.0;

    @Override
    double calculateArea() {

        double area = 3.14 * radius * radius;
        System.out.println(area);

        return area;
    }

}

