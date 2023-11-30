package animals;

import data.ColorData;

public class Cat extends Animals {
    public Cat(String name, int age, int weight, ColorData colorData) {
        super(name, age, weight, colorData);
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }

}
