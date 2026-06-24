# Composition

## 📌 Definition

**Composition** is a specialized form of association that represents a strong **has-a relationship** where one object owns another object completely.

In composition, the contained object's lifecycle depends on the container object. If the container object is destroyed, the contained object is also destroyed.

---

## ⚙️ Key Characteristics

* Represents a strong has-a relationship
* Specialized form of association
* Strong ownership
* Lifecycle dependency exists
* Contained object cannot exist independently
* Promotes encapsulation
* Models whole-part relationships

---

## 🧱 Basic Structure

```java
class Engine {

}

class Car {

}
```

Composition exists when one object completely owns another.

---

## 🔍 Example

```java
class Engine {

    void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
    }
}
```

---

### Usage

```java
Car car = new Car();

car.startCar();
```

The Engine object is created inside Car and belongs exclusively to it.

---

## 🔄 Composition Relationship

```text
Car
 ▲
 │
Engine
```

Car has an Engine.

---

## 🔧 Lifecycle Dependency

```java
Car car = new Car();
```

When the Car object is removed:

```java
car = null;
```

The Engine object also becomes unavailable because it is owned by Car.

---

## 🔄 Composition vs Aggregation

| Feature | Composition | Aggregation |
|----------|-------------|-------------|
| Ownership | Strong | Weak |
| Lifecycle Dependency | Yes | No |
| Object Survival | No | Yes |
| Relationship | Part-Of | Has-A |

---

## 🔄 Composition vs Association

| Feature | Association | Composition |
|----------|-------------|-------------|
| Relationship | Uses-A | Strong Has-A |
| Ownership | None | Strong |
| Lifecycle Dependency | No | Yes |
| Coupling | Loose | Strong |

---

## 🧠 Why Composition Matters

* Models real-world ownership
* Improves encapsulation
* Promotes modular design
* Simplifies object management
* Encourages code reuse

---

## ⚠️ Common Mistakes

### 1. Confusing Composition with Aggregation

```text
Composition → Strong Ownership

Aggregation → Weak Ownership
```

---

### 2. Creating Shared Objects

A composed object should generally belong to one owner.

---

### 3. Using Inheritance Instead

Composition is often preferred over inheritance.

---

### 4. Excessive Nesting

Too many composition layers may reduce readability.

---

## 🧩 Real-World Usage

Composition is commonly used in:

* Car and Engine
* House and Room
* Computer and CPU
* Book and Pages
* Company and Departments

---

## ⏱️ Performance Considerations

* Efficient object organization
* Slight memory overhead due to contained objects
* Improves maintainability

---

## 📍 When Composition Can Be Problematic

* Deep object hierarchies
* Excessive ownership chains
* Difficult debugging in large systems

---

## 🧠 Memory Representation

* Container object stored in heap memory
* Contained object stored within object graph
* Lifecycle managed by owner object

---

## 🎯 Advantages

* Strong encapsulation
* Clear ownership
* Improved maintainability
* Better modularity
* Promotes code reuse

---

## ⚠️ Limitations

* Strong coupling between objects
* Less flexibility than aggregation
* Complex ownership structures may arise

---

## 📖 Summary

Composition is a strong form of association that establishes ownership between objects, where the contained object's lifecycle depends entirely on the container object. By modeling whole-part relationships and enforcing strong encapsulation, composition helps create modular, maintainable, and well-structured object-oriented systems, making it one of the most important design relationships in Java and software architecture.

---