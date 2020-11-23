package id.dondon.ctci.chapter3.shelter;

public class Dog extends Animal {
    public Dog(String n) {
        super(n);
    }

    public String name() {
        return "Dog: " + name;
    }
}
