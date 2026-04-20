package Day_9_interface_2;

import Day_9_interface_2.Duck;
import Day_9_interface_2.Fish;
import Day_9_interface_2.Swimmable;

public class test2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();

        System.out.println("===Duck===");
        duck.fly();
        duck.swim();

        System.out.println("===Fish===");
        fish.swim();

        Swimmable s1 = new Duck();    //tính đa hình
        Swimmable s2 = new Fish();
        s1.swim();
        s2.swim();
    }
}
