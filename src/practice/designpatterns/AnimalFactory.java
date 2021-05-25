package practice.designpatterns;

public class AnimalFactory {
    public Animal getAnimalType(String animalType) {
        Animal animal = null;
        if ("duck".equals(animalType)) {
            animal = new Duck();
        } else if ("tiger".equals(animalType)) {
            animal = new Tiger();
        }
        return animal;
    }
}

