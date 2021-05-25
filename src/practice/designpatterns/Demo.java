package practice.designpatterns;

public class Demo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal duck = animalFactory.getAnimalType("duck");
        duck.eat();
        Animal tiger = animalFactory.getAnimalType("tiger");
        tiger.eat();
    }
}
