package animals;

import data.ColorData;

public class Dog extends Animals{
    public Dog(String name, int age, int weight, ColorData colorData) {
        super(name, age, weight, colorData);
    }
    @Override
    public void say() {
        System.out.println("Гав");

    }
}
