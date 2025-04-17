// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();
}

// Concrete class
class Dog extends Animal {
    // Implementing abstract method
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstrctExmpl {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();  // Outputs: Bark
    }
}
