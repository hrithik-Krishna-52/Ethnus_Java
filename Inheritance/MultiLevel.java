class Animal {
    public void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking");
    }
}

class Pup extends Dog {
    public void woof() {
        System.out.println("Woof");
    }
}
class MultiLevel {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Pup pup = new Pup();
        dog.bark();
        pup.woof();
        pup.eat();

    }
}