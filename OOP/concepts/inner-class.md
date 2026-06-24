# Inner Class

## 📌 Definition

An **Inner Class** is a class defined inside another class. It helps logically group related classes together and allows the inner class to access members of the outer class.

Inner classes improve encapsulation and code organization.

---

## ⚙️ Key Characteristics

* Defined inside another class
* Can access outer class members
* Improves code organization
* Supports encapsulation
* Helps model closely related objects
* Can be static or non-static
* Commonly used in event handling and callbacks

---

## 🧱 Basic Structure

```java
class Outer {

    class Inner {

    }
}
```

---

## 🔍 Example

```java
class Car {

    String model = "BMW";

    class Engine {

        void display() {
            System.out.println(model);
        }
    }
}
```

---

### Usage

```java
Car car = new Car();

Car.Engine engine = car.new Engine();

engine.display();
```

Output:

```text
BMW
```

---

## 🔄 Types of Inner Classes

### 1. Member Inner Class

```java
class Outer {

    class Inner {

    }
}
```

Most common type.

---

### 2. Static Nested Class

```java
class Outer {

    static class Inner {

    }
}
```

Does not require outer object.

---

### 3. Local Inner Class

Defined inside a method.

```java
void display() {

    class Local {

    }
}
```

---

### 4. Anonymous Inner Class

Created without a class name.

```java
Runnable r = new Runnable() {

    @Override
    public void run() {

    }
};
```

---

## 🔧 Accessing Outer Class Members

```java
class Outer {

    private int value = 10;

    class Inner {

        void display() {
            System.out.println(value);
        }
    }
}
```

Inner class can access private members of outer class.

---

## 🧠 Why Inner Classes Matter

* Groups related code together
* Improves encapsulation
* Reduces namespace pollution
* Simplifies implementation details
* Useful for callbacks and event handling

---

## ⚠️ Common Mistakes

### 1. Creating Inner Class Directly

```java
Inner i = new Inner();
```

❌ Requires outer object first.

---

### 2. Confusing Inner and Static Nested Classes

Static nested classes do not require outer object references.

---

### 3. Excessive Nesting

Too many nested classes reduce readability.

---

### 4. Overusing Anonymous Classes

Can make code difficult to understand.

---

## 🧩 Real-World Usage

Inner classes are commonly used in:

* GUI applications
* Event listeners
* Callback implementations
* Collections framework
* Framework development

---

## ⏱️ Performance Considerations

* Slight memory overhead for outer references
* Usually negligible in real applications
* Static nested classes are more memory efficient

---

## 📍 When Inner Classes Can Be Problematic

* Deep nesting reduces readability
* Tight coupling with outer class
* Harder maintenance in large systems

---

## 🧠 Memory Representation

* Outer object stored in heap memory
* Inner object maintains reference to outer object
* Static nested classes do not maintain outer references

---

## 🎯 Advantages

* Better encapsulation
* Improved code organization
* Access to outer class members
* Reduced namespace clutter
* Useful for specialized behavior

---

## ⚠️ Limitations

* Can increase complexity
* Tight coupling with outer class
* Harder debugging with excessive nesting

---

## 📖 Summary

Inner classes in Java allow developers to define classes within other classes, providing a way to logically group related functionality while improving encapsulation and code organization. By enabling direct access to outer class members and supporting specialized implementations such as anonymous and local classes, inner classes become a powerful feature for building clean and maintainable object-oriented applications.

---