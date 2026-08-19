package OOP_Basic;
public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof! My name is " + this.name + " and I'm a " + this.breed + "!");
    }
}

public class oop {
public static void main(String[] args) {
    Dog myDog = new Dog("Buddy", "Golden Retriever", 3);
        Dog anotherDog = new Dog("Lucy", "Poodle", 5);

        myDog.bark(); // Calling the bark() method on myDog
        anotherDog.bark(); // Calling the bark() method on anotherDog
}
}
