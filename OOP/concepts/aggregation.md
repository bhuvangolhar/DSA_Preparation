# Aggregation

## 📌 Definition

**Aggregation** is a specialized form of association that represents a **has-a relationship** where one class contains a reference to another class, but both objects can exist independently.

In aggregation, the contained object is not owned by the container object and can continue to exist even if the container object is destroyed.

---

## ⚙️ Key Characteristics

* Represents a has-a relationship
* Specialized form of association
* Objects have independent lifecycles
* Weak ownership relationship
* Promotes code reusability
* Supports modular design
* Used to model real-world relationships

---

## 🧱 Basic Structure

```java
class Department {

}

class Employee {

}
```

Aggregation exists when one object contains a reference to another.

---

## 🔍 Example

```java
class Department {

    String name;

    Department(String name) {
        this.name = name;
    }
}

class Employee {

    String name;
    Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }
}
```

---

### Usage

```java
Department d1 = new Department("IT");

Employee e1 = new Employee("Rahul", d1);
```

The department exists independently of the employee.

---

## 🔄 Aggregation Relationship

```text
Department
      ▲
      │
Employee
```

Employee has a Department.

---

## 🔧 Object Independence

```java
Department d1 = new Department("IT");
```

Even if an Employee object is removed:

```java
e1 = null;
```

The Department object still exists.

---

## 🔄 Aggregation vs Association

| Feature | Association | Aggregation |
|----------|------------|-------------|
| Relationship | Uses-A | Has-A |
| Ownership | No | Weak |
| Lifecycle Dependency | Independent | Independent |
| Object Reference | Optional | Required |

---

## 🔄 Aggregation vs Composition

| Feature | Aggregation | Composition |
|----------|-------------|-------------|
| Ownership | Weak | Strong |
| Lifecycle Dependency | Independent | Dependent |
| Object Survival | Yes | No |

---

## 🧠 Why Aggregation Matters

* Models real-world ownership
* Encourages modular design
* Supports object reuse
* Reduces duplication
* Improves maintainability

---

## ⚠️ Common Mistakes

### 1. Confusing Aggregation with Composition

```text
Aggregation → Weak Ownership

Composition → Strong Ownership
```

---

### 2. Using Inheritance Instead

Aggregation models has-a relationships, not is-a relationships.

---

### 3. Assuming Lifecycle Dependency

Contained objects continue to exist independently.

---

### 4. Excessive Nesting

Too many aggregated objects may increase complexity.

---

## 🧩 Real-World Usage

Aggregation is commonly used in:

* Employee and Department
* Student and College
* Customer and Bank
* Teacher and School
* Player and Team

---

## ⏱️ Performance Considerations

* Minimal memory overhead
* Efficient object reuse
* Supports independent object management

---

## 📍 When Aggregation Can Be Problematic

* Excessive object dependencies
* Poor object ownership design
* Deep object hierarchies

---

## 🧠 Memory Representation

* Objects stored separately in heap memory
* References connect related objects
* Each object manages its own lifecycle

---

## 🎯 Advantages

* Encourages reusability
* Improves modularity
* Supports loose coupling
* Models real-world relationships
* Easy to maintain

---

## ⚠️ Limitations

* Can increase dependency management
* Relationship tracking may become complex
* Incorrect design may reduce clarity

---

## 📖 Summary

Aggregation is a specialized form of association that establishes a has-a relationship between objects while preserving their independent lifecycles. By allowing one object to reference another without owning it completely, aggregation promotes modularity, reusability, and flexible object-oriented design, making it a widely used relationship in real-world software systems.

---