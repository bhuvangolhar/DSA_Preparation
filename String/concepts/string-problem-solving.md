# String Problem Solving

## 📌 Introduction

Understanding string concepts and techniques is important, but solving string problems efficiently requires a structured approach. Most string-based questions can be solved by identifying the pattern involved, choosing the appropriate technique, and gradually optimizing the solution.

This document focuses on the problem-solving mindset for string-related DSA questions.

---

## 🧠 Step 1: Understand the Problem

Before writing code:

* Identify the input and expected output
* Determine whether the problem involves characters, words, or substrings
* Check constraints
* Consider edge cases

### Example

```text
Check whether a string is a palindrome.
```

Input:

```java
"madam"
```

Output:

```java
true
```

---

## 🔍 Step 2: Identify the Problem Category

Most string problems belong to one of the following categories:

| Category | Examples |
|-----------|----------|
| Traversal | Count Vowels, Count Digits |
| Comparison | Anagram Check |
| Reversal | Reverse String, Reverse Words |
| Frequency Based | Character Count |
| Pattern Matching | Substring Search |
| Sliding Window | Longest Unique Substring |
| Two Pointer | Palindrome Check |
| String Construction | Compression |

---

## ⚙️ Step 3: Start With Brute Force

Always think of the simplest working solution first.

### Example

Checking palindrome using reversal:

```java
String reversed = "";

for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str.charAt(i);
}

return str.equals(reversed);
```

### Why Start Here?

* Easier to understand
* Helps verify correctness
* Creates a baseline for optimization

---

## 🚀 Step 4: Optimize

After obtaining a working solution, ask:

* Can I avoid creating extra strings?
* Can I reduce nested loops?
* Can I use a known pattern?

Common optimizations:

```text
Brute Force
↓
Two Pointers

Nested Loops
↓
Frequency Count

Substring Generation
↓
Sliding Window

Repeated Comparisons
↓
Hashing
```

---

## 🔄 Step 5: Check Edge Cases

Always test:

### Empty String

```java
""
```

---

### Single Character

```java
"a"
```

---

### Repeated Characters

```java
"aaaaaa"
```

---

### Mixed Case

```java
"Hello"
```

---

### Special Characters

```java
"a@b#c"
```

---

## 🎯 Common Optimization Patterns

### Traversal

```java
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
}
```

---

### Two Pointers

```java
int left = 0;
int right = str.length() - 1;
```

Used for:

* Palindrome checks
* Reversals

---

### Frequency Count

```java
int[] freq = new int[26];
```

Used for:

* Anagrams
* Character statistics

---

### Sliding Window

```java
int start = 0;
```

Used for:

* Longest unique substring
* Window-based substring problems

---

## ⚠️ Common Mistakes

### Using `==` Instead of `.equals()`

```java
str1 == str2
```

❌ Incorrect for content comparison

---

### Frequent Concatenation

```java
str = str + ch;
```

❌ Inefficient in loops

Use:

```java
StringBuilder sb = new StringBuilder();
```

---

### Ignoring Case Sensitivity

```java
"A" != "a"
```

---

### Not Handling Empty Strings

```java
str.charAt(0)
```

❌ Can throw exception

---

## 📚 Recommended Problem Progression

### Easy

```text
Find Length
Reverse String
Count Vowels
Count Consonants
Count Words
Count Digits
```

---

### Medium

```text
Palindrome Check
Anagram Check
String Compression
Reverse Words
String Rotation
Longest Common Prefix
```

---

### Hard

```text
Longest Palindromic Substring
Minimum Window Substring
Group Anagrams
Find Permutations
String to Integer
```

---

## 📖 Summary

String problem solving is not about memorizing solutions but about recognizing patterns and selecting the right technique. By starting with a correct brute-force approach, identifying applicable patterns such as traversal, two pointers, frequency counting, and sliding window, and then optimizing step by step, developers can efficiently solve a wide range of string-based DSA problems while improving both coding and analytical skills.

---