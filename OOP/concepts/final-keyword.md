# Final Keyword

## 📌 Definition

The **final** keyword in Java is used to restrict modification. It can be applied to variables, methods, and classes to prevent reassignment, overriding, or inheritance.

It helps enforce immutability, improve code safety, and protect critical functionality.

---

## ⚙️ Key Characteristics

* Prevents reassignment of variables
* Prevents method overriding
* Prevents class inheritance
* Improves code safety
* Supports immutability
* Enforces design constraints
* Commonly used for constants

---

## 🧱 Final Variable

A final variable can be assigned only once.

```java
final int AGE = 21;
```

---

### Example

```java
final int AGE = 21;

// AGE = 25; ❌ Compilation Error
```

Once assigned, its value cannot change.

---

## 🧱 Final Method

A final method cannot be overridden by child classes.

```java
class Animal {

    final void sound() {
        System.out.println("Animal Sound");
    }
}
```

---

### Example

```java
class Dog extends Animal {

    // void sound() { } ❌ Not Allowed
}
```

---

## 🧱 Final Class

A final class cannot be inherited.

```java
final class Animal {

}
```

---

### Example

```java
class Dog extends Animal {

}
```

❌ Compilation Error

---

## 🔄 Uses of Final Keyword

### 1. Constants

```java
final double PI = 3.14159;
```

---

### 2. Preventing Method Modification

```java
final void display() {

}
```

---

### 3. Restricting Inheritance

```java
final class Utility {

}
```

---

## 🔍 Final Reference Variables

```java
final Student s1 = new Student();
```

The reference cannot change:

```java
s1 = new Student(); // ❌
```

But object data can still change:

```java
s1.name = "Rahul"; // ✅
```

---

## 🔄 final vs finally vs finalize()

| Feature | Purpose |
|----------|----------|
| final | Restricts modification |
| finally | Exception handling block |
| finalize() | Garbage collection method |

---

## 🧠 Why Final Matters

* Protects important code
* Prevents accidental modification
* Supports immutable design
* Improves reliability
* Enforces business rules

---

## ⚠️ Common Mistakes

### 1. Assuming Final Objects Are Immutable

```java
final Student s1 = new Student();
```

Object state can still change.

---

### 2. Overusing Final Classes

Too many restrictions may reduce flexibility.

---

### 3. Confusing final and finally

They serve completely different purposes.

---

### 4. Trying to Override Final Methods

```java
@Override
void display() {

}
```

Not allowed if parent method is final.

---

## 🧩 Real-World Usage

Final keyword is commonly used in:

* Constants
* Utility classes
* Security-sensitive methods
* Immutable objects
* Framework development

---

## ⏱️ Performance Considerations

* May allow compiler optimizations
* Minimal runtime overhead
* Improves code predictability

---

## 📍 When Final Can Be Problematic

* Excessive restrictions reduce extensibility
* Difficult to modify behavior later
* Poor design decisions become harder to change

---

## 🧠 Memory Representation

* Final variables stored normally
* Compiler enforces assignment restrictions
* Runtime prevents overriding and inheritance violations

---

## 🎯 Advantages

* Improves code safety
* Supports immutability
* Prevents unwanted changes
* Enforces design rules
* Enhances maintainability

---

## ⚠️ Limitations

* Reduces flexibility
* Restricts inheritance
* Can complicate future extensions

---

## 📖 Summary

The final keyword in Java is used to restrict modification of variables, methods, and classes, helping developers create safer, more predictable, and maintainable applications. By preventing reassignment, method overriding, and class inheritance where appropriate, final plays an important role in enforcing design constraints, supporting immutability, and protecting critical application behavior.

---