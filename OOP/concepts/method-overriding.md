# Method Overriding

## 📌 Definition

**Method Overriding** occurs when a child class provides its own implementation of a method that is already defined in its parent class.

It is used to achieve **runtime polymorphism**, allowing child classes to modify or extend inherited behavior.

---

## ⚙️ Key Characteristics

* Same method name
* Same parameter list
* Exists between parent and child classes
* Supports runtime polymorphism
* Uses inheritance
* Allows specialized behavior
* Determined during runtime

---

## 🧱 Basic Syntax

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 🔍 Example

```java
Animal a = new Dog();

a.sound();
```

Output:

```text
Dog barks
```

Even though the reference is of type `Animal`, the overridden method in `Dog` executes.

---

## 🔄 Rules for Method Overriding

### 1. Method Name Must Be Same

```java
void display()
```

Parent and child methods must have identical names.

---

### 2. Parameters Must Be Same

```java
void display(int n)
```

Parameter list cannot change.

---

### 3. Return Type Must Be Compatible

```java
String getName()
```

Child method must return the same or compatible type.

---

### 4. Access Modifier Cannot Be More Restrictive

Valid:

```java
protected → public
```

Invalid:

```java
public → private
```

---

## 🔧 @Override Annotation

```java
@Override
void sound() {
    System.out.println("Dog barks");
}
```

Benefits:

* Improves readability
* Helps compiler detect mistakes
* Recommended practice

---

## 🔄 Method Overloading vs Method Overriding

| Feature | Method Overloading | Method Overriding |
|----------|-------------------|-------------------|
| Class Relationship | Same Class | Parent & Child |
| Parameters | Different | Same |
| Runtime Decision | Compile Time | Runtime |
| Polymorphism Type | Compile-Time | Runtime |
| Inheritance Required | No | Yes |

---

## 🧠 Why Method Overriding Matters

* Enables runtime polymorphism
* Allows behavior customization
* Improves flexibility
* Supports extensibility
* Promotes reusable designs

---

## ⚠️ Common Mistakes

### 1. Changing Parameters

```java
void display(int a)
```

This becomes overloading, not overriding.

---

### 2. Forgetting Inheritance

```java
class Dog {

}
```

No parent-child relationship means no overriding.

---

### 3. Missing @Override

Code works but compiler cannot help detect mistakes.

---

### 4. Using Private Methods

Private methods cannot be overridden.

```java
private void display() {

}
```

---

## 🧩 Real-World Usage

Method overriding is commonly used in:

* Framework development
* Game development
* Payment systems
* Notification services
* API implementations

---

## ⏱️ Performance Considerations

* Method selection occurs at runtime
* Slight overhead compared to overloading
* Negligible impact in most applications

---

## 📍 When Method Overriding Can Be Problematic

* Deep inheritance hierarchies
* Unexpected behavior changes
* Difficult debugging in large systems

---

## 🧠 Memory Representation

* Parent and child class definitions stored in method area
* Objects stored in heap memory
* JVM performs dynamic method dispatch during runtime

---

## 🎯 Advantages

* Supports runtime polymorphism
* Enables behavior customization
* Improves flexibility
* Encourages reusable code
* Enhances maintainability

---

## ⚠️ Limitations

* Requires inheritance
* Can increase complexity
* Excessive overriding may reduce readability

---

## 📖 Summary

Method overriding allows a child class to provide its own implementation of an inherited method while preserving the same method signature, making it a fundamental mechanism for achieving runtime polymorphism in Java. By enabling objects to exhibit different behaviors through a common interface or parent reference, method overriding increases flexibility, extensibility, and code reuse, making it one of the most important concepts in object-oriented programming.

---