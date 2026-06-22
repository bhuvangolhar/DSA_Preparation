# Arrays Interview Guide

## 📌 Introduction

Arrays are one of the most frequently tested topics in Data Structures and Algorithms interviews. They are often used to evaluate problem-solving ability, optimization skills, and understanding of common algorithmic patterns.

Mastering arrays is essential because many advanced topics such as strings, matrices, sliding window, hashing, dynamic programming, and graph representations are built upon array concepts.

---

## 🎯 Why Interviewers Ask Array Questions

Array problems help interviewers assess:

* Logical thinking
* Time complexity awareness
* Space optimization skills
* Pattern recognition ability
* Coding implementation skills

Arrays are simple to understand but can become challenging when combined with optimization requirements.

---

## 📚 Common Array Problem Categories

### 1. Traversal Problems

Examples:

* Find Sum
* Find Maximum
* Find Minimum
* Find Average

Common Pattern:

```java
for (int num : arr) {
    // process element
}
```

---

### 2. Searching Problems

Examples:

* Linear Search
* Binary Search

Questions Focus On:

* Search efficiency
* Sorted vs unsorted arrays

---

### 3. Rearrangement Problems

Examples:

* Reverse Array
* Move Zeroes
* Rotate Array

Questions Focus On:

* In-place modification
* Pointer manipulation

---

### 4. Pair Problems

Examples:

* Two Sum
* Pair with Given Difference

Questions Focus On:

* Hashing
* Two Pointer Technique

---

### 5. Subarray Problems

Examples:

* Maximum Subarray Sum
* Longest Subarray
* Subarray Sum Equals K

Questions Focus On:

* Sliding Window
* Prefix Sum

---

### 6. Matrix Problems

Examples:

* Matrix Traversal
* Spiral Matrix
* Rotate Matrix

Questions Focus On:

* Nested loops
* Multi-dimensional arrays

---

## 🔍 How to Identify the Correct Pattern

### If Problem Involves

Finding maximum/minimum:

```text
→ Traversal
```

---

Finding a pair:

```text
→ Two Pointers / Hashing
```

---

Finding continuous segments:

```text
→ Sliding Window
```

---

Multiple range sum calculations:

```text
→ Prefix Sum
```

---

Sorted data:

```text
→ Binary Search
```

---

## 🚀 Optimization Mindset

Always follow:

```text
Understand Problem
        ↓
Brute Force
        ↓
Analyze Complexity
        ↓
Find Pattern
        ↓
Optimize
```

Avoid jumping directly to advanced solutions.

---

## ⚠️ Common Interview Mistakes

### 1. Ignoring Constraints

A solution that works for:

```text
n = 100
```

may fail for:

```text
n = 100000
```

---

### 2. Off-by-One Errors

Incorrect:

```java
for (int i = 0; i <= arr.length; i++)
```

Correct:

```java
for (int i = 0; i < arr.length; i++)
```

---

### 3. Forgetting Edge Cases

Examples:

```java
[]
```

```java
[5]
```

```java
[0, 0, 0]
```

```java
[-1, -5, -10]
```

---

### 4. Unnecessary Extra Space

Sometimes an in-place solution exists.

Interviewers often ask:

```text
Can you solve it using O(1) extra space?
```

---

## 🧠 Complexity Cheat Sheet

| Operation | Complexity |
|------------|------------|
| Access | O(1) |
| Update | O(1) |
| Traversal | O(n) |
| Search | O(n) |
| Binary Search | O(log n) |
| Insertion | O(n) |
| Deletion | O(n) |

---

## 📋 Array Interview Checklist

Before submitting a solution:

✅ Is the logic correct?

✅ Have edge cases been handled?

✅ Is time complexity acceptable?

✅ Can space usage be reduced?

✅ Is there a better pattern available?

✅ Have variable names been kept meaningful?

---

## 🏆 Recommended Learning Roadmap

### Easy

```text
Sum
Maximum
Minimum
Average
First Element
Last Element
```

---

### Medium

```text
Reverse Array
Move Zeroes
Second Largest
Find Duplicate
Check Sorted Array
```

---

### Hard

```text
Two Sum
Maximum Subarray Sum
Product Except Self
Container With Most Water
Trapping Rain Water
```

---

## 📖 Summary

Array questions form the foundation of technical interviews and competitive programming. Success in array problems comes from recognizing patterns, starting with a brute-force solution, handling edge cases carefully, and progressively optimizing the approach. A strong understanding of traversal, searching, two pointers, sliding window, hashing, and prefix sums enables efficient solutions to a wide variety of real-world and interview-focused problems.