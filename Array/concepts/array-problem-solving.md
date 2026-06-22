# Array Problem Solving

## 📌 Introduction

Knowing array concepts and patterns is important, but solving problems efficiently requires a structured approach. Most array questions can be solved by identifying the type of problem, selecting an appropriate technique, and gradually optimizing the solution.

This document focuses on the thought process behind solving array-based DSA problems.

---

## 🧠 Step 1: Understand the Problem

Before writing code:

* Read the problem carefully.
* Identify the input and output.
* Determine constraints.
* Look for edge cases.

### Example

Find the largest element in an array.

Input:

```java
[4, 8, 2, 10, 6]
```

Output:

```java
10
```

---

## 🔍 Step 2: Identify the Problem Category

Most array problems belong to one of the following categories:

| Category | Examples |
|----------|----------|
| Traversal | Sum, Max, Min |
| Searching | Linear Search, Binary Search |
| Rearrangement | Move Zeroes, Reverse Array |
| Subarray | Maximum Sum Subarray |
| Pair Problems | Two Sum |
| Range Queries | Prefix Sum |
| Window Problems | Sliding Window |
| Matrix Problems | 2D Arrays |

---

## ⚙️ Step 3: Start With Brute Force

Always think of the simplest solution first.

### Example

Finding duplicate elements:

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] == arr[j]) {
            return arr[i];
        }
    }
}
```

### Why Start Here?

* Easy to understand.
* Helps verify logic.
* Provides a baseline for optimization.

---

## 🚀 Step 4: Optimize

After obtaining a working solution, ask:

* Can I reduce nested loops?
* Can I avoid repeated calculations?
* Can I use a known pattern?

Common optimizations:

```text
Nested Loop
↓
Hashing

Traversal
↓
Prefix Sum

Brute Force
↓
Two Pointers

Repeated Range Calculation
↓
Sliding Window
```

---

## 🔄 Step 5: Check Edge Cases

Always test:

### Empty Array

```java
[]
```

### Single Element

```java
[5]
```

### Duplicate Elements

```java
[2, 2, 2, 2]
```

### Negative Values

```java
[-5, -2, -10]
```

### Sorted Array

```java
[1, 2, 3, 4]
```

---

## 🎯 Common Optimization Patterns

### Traversal

```java
for (int num : arr) {
    // process
}
```

---

### Two Pointers

```java
int left = 0;
int right = arr.length - 1;
```

---

### Sliding Window

```java
int start = 0;
```

Used for:

* Maximum subarray
* Longest segment
* Fixed-size window problems

---

### Prefix Sum

```java
prefix[i] = prefix[i - 1] + arr[i];
```

Used for:

* Range sum queries
* Subarray calculations

---

## ⚠️ Common Mistakes

### Off-by-One Errors

```java
for (int i = 0; i <= arr.length; i++)
```

❌ Incorrect

---

### Ignoring Constraints

A solution that works for:

```text
n = 100
```

may fail for:

```text
n = 100000
```

---

### Unnecessary Extra Space

Sometimes an in-place solution is possible.

---

### Forgetting Edge Cases

Many bugs come from:

```java
[]
```

or

```java
[1]
```

---

## 📚 Recommended Problem Progression

### Easy

```text
Find Sum
Find Maximum
Find Minimum
First Element
Last Element
Average
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

Solving array problems effectively is not about memorizing solutions but about recognizing problem categories, starting with a correct brute-force approach, and then applying suitable optimization techniques such as traversal, two pointers, sliding window, hashing, and prefix sums. Developing a structured problem-solving process improves accuracy, efficiency, and overall DSA skills while making complex array questions easier to approach and solve.