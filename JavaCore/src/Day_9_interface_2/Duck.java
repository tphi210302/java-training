package Day_9_interface_2;

public class Duck implements Flyable,Swimmable{
    public Duck() {
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");

    }

    @Override
    public void swim() {
        System.out.println("Duck is Swimming");

    }
}
