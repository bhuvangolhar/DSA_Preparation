# Interface

## 📌 Definition

An **interface** is a blueprint that defines a set of methods which implementing classes must provide. It is used to achieve **abstraction** and supports **multiple inheritance** in Java.

An interface specifies **what a class should do**, but not **how it should do it**.

---

## ⚙️ Key Characteristics

* Supports abstraction
* Defines a contract for classes
* Achieves multiple inheritance
* Contains abstract methods by default
* Can contain default and static methods
* Cannot be instantiated directly
* Promotes loose coupling
* Improves flexibility and scalability

---

## 🧱 Interface Declaration

```java
interface Animal {
    void sound();
}
```

---

## 🔍 Implementing an Interface

```java
interface Animal {
    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 🔁 Creating Objects

```java
Animal a = new Dog();

a.sound();
```

* Interface reference can hold object of implementing class
* Supports runtime polymorphism

---

## 🔄 Multiple Inheritance Using Interfaces

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {

    public void fly() {
        System.out.println("Flying");
    }

    public void swim() {
        System.out.println("Swimming");
    }
}
```

---

## 🔧 Types of Methods in Interface

### 1. Abstract Method

```java
void display();
```

---

### 2. Default Method

```java
default void show() {
    System.out.println("Default Method");
}
```

---

### 3. Static Method

```java
static void print() {
    System.out.println("Static Method");
}
```

---

## 🔄 Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|----------|-----------|---------------|
| Multiple Inheritance | Yes | No |
| Constructors | No | Yes |
| Instance Variables | No | Yes |
| Abstraction | Full | Partial |
| Usage | Contract | Base Class |

---

## 🧠 Why Interfaces Matter

* Promote loose coupling
* Allow flexible designs
* Support multiple inheritance
* Enable interchangeable implementations
* Improve maintainability

---

## ⚠️ Common Mistakes

### 1. Creating Object of Interface

```java
Animal a = new Animal(); // ❌
```

---

### 2. Forgetting Method Implementation

```java
class Dog implements Animal {
    // ❌ compilation error if sound() not implemented
}
```

---

### 3. Confusing Interface with Class

* Interface defines behavior
* Class provides implementation

---

### 4. Using Interface for Unrelated Objects

* Interface should represent common behavior

---

## 🧩 Real-World Usage

Interfaces are commonly used in:

* Payment Systems
* Notification Services
* Database Drivers
* Framework Development
* API Design

---

## ⏱️ Performance Considerations

* Small runtime overhead due to dynamic dispatch
* Improves maintainability and extensibility
* Negligible performance impact in most applications

---

## 📍 When Interfaces Can Be Problematic

* Too many interfaces can complicate design
* Poorly designed interfaces reduce readability
* Over-abstraction may increase complexity

---

## 🧠 Memory Representation

* Interface definitions stored in method area
* Implementing objects stored in heap memory
* Interface references stored in stack memory

---

## 🎯 Advantages

* Supports abstraction
* Enables multiple inheritance
* Promotes loose coupling
* Improves flexibility
* Enhances code reusability

---

## ⚠️ Limitations

* Cannot be instantiated
* No instance variables
* Excessive use may increase complexity

---

## 📖 Summary

Interfaces in Java define a contract that implementing classes must follow, allowing developers to achieve abstraction and multiple inheritance while promoting loose coupling and flexible software design. By separating what an object can do from how it performs that behavior, interfaces make applications easier to maintain, extend, and scale, making them one of the most important tools in modern object-oriented programming.

---