**1. Classes and Objects**

In OOP, you model real-world entities as "classes." A class is a blueprint for creating objects. An object is an
instance of a class.

```java
public class Dog {
    // Class attributes (fields/variables)
    String name;
    String breed;
    int age;

    // Class methods (behavior)
}
```

*   **Explanation:**
    *   `public class Dog`:  Defines a public class named `Dog`.  The `public` keyword means it can be accessed from
anywhere.
    *   `String name; String breed; int age;`: These are *attributes* or *fields* of the `Dog` class. They represent
the characteristics of a dog (name, breed, age).  These are declared with their respective data types.
    *   `// Class methods (behavior)`:  This comment indicates that we’ll add methods (functions) that define what a
`Dog` can *do*.

**2. Instance Variables (Attributes)**

Now let's add some instance variables to the `Dog` class.  Instance variables hold data specific to each individual
`Dog` object.

```java
public class Dog {
    String name;
    String breed;
    int age;

    // Constructor (used to initialize object attributes)
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Class methods
}
```

*   **Explanation:**
    *   `public Dog(String name, String breed, int age)`: This is a *constructor*. It's a special method that is
called when you create a new `Dog` object. It takes arguments (parameters) that are used to initialize the object’s
attributes.
    *   `this.name = name;`:  The `this` keyword refers to the current object.  This line assigns the value passed to
the `name` parameter to the `name` attribute of the object. The same applies to `breed` and `age`.

**3. Methods (Behavior)**

Let's add a method to the `Dog` class that prints the dog’s information.

```java
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
```

*   **Explanation:**
    *   `public void bark()`:  This is a method named `bark`.
        *   `public`:  Accessible from anywhere.
        *   `void`:  The method doesn't return any value.
    *   `System.out.println("Woof! ...")`: This line prints a message to the console.  The `this` keyword is used
again to access the object’s `name` and `breed` attributes.

**4. Creating Objects (Instances)**

Now, let’s create some `Dog` objects:

```java
public class Main { // A separate class to create and use the Dog objects
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever", 3);
        Dog anotherDog = new Dog("Lucy", "Poodle", 5);

        myDog.bark(); // Calling the bark() method on myDog
        anotherDog.bark(); // Calling the bark() method on anotherDog
    }
}
```

*   **Explanation:**
    *   `Dog myDog = new Dog("Buddy", "Golden Retriever", 3);`: This creates a new `Dog` object and assigns it to a
variable named `myDog`.  The `new` keyword allocates memory for the object, and the constructor is called to
initialize its attributes.
    *   `Dog anotherDog = new Dog("Lucy", "Poodle", 5);`: Creates another `Dog` object and assigns it to the variable
`anotherDog`.
    *   `myDog.bark();`:  This calls the `bark()` method on the `myDog` object. This is how you access and use the
methods of an object.

**5. Inheritance (Conceptual Introduction)**

Inheritance allows you to create new classes based on existing ones, inheriting their properties and behaviors.  Let’s
imagine a `ServiceDog` class that *inherits* from `Dog`.

```java
public class ServiceDog extends Dog {  // Extends the Dog class

    String task;

    public ServiceDog(String name, String breed, int age, String task) {
        super(name, breed, age); // Call the Dog constructor
        this.task = task;
    }

    public void performTask() {
        System.out.println("I'm a " + this.name + ", a " + this.breed + ", and I perform the task: " + this.task);
    }
}
```

*   **Explanation:**
    *   `public class ServiceDog extends Dog`: Defines the `ServiceDog` class and indicates that it *extends* the
`Dog` class. This means it inherits all the attributes and methods of the `Dog` class.
    *   `super(name, breed, age);`:  This calls the constructor of the `Dog` class to initialize the inherited
attributes. `super` refers to the parent class (Dog).
    *   `this.task = task;`:  This adds a new attribute specific to the `ServiceDog` class.

**Key OOP Concepts Demonstrated:**

*   **Encapsulation:** Bundling data (attributes) and methods that operate on that data into a single unit (the
class).
*   **Abstraction:** Hiding complex implementation details and exposing only the essential information to the
user.
*   **Inheritance:**  Creating new classes based on existing ones, promoting code reuse and reducing redundancy.

This detailed example should give you a solid understanding of the basic OOP concepts in Java.  Try modifying the
code, adding new attributes and methods, and experimenting with different scenarios.