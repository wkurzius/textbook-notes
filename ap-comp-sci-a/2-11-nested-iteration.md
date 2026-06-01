---
title: 2.11 Nested Iteration
layout: page
course: AP CSA
prev-link: ./2-10-implementing-string-algorithms.html
next-link: ./2-12-informal-runtime-analysis-of-loops.html
---

- Develop code to represent nested iterative processes and determine the result of these processes

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.11 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-11-nested-loops.html){: target="_blank"}
- [Loops Coding Practice (2.7-2.12)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/loops-practice-coding.html){: target="_blank"}

---

Loops are good working in one dimension, but what about second dimension? Putting a loop inside another loop will get that done. Before doing anything in the book, I suggest running the loop below and make sure you understand how it works.

```java
for (int i = 0; i <= 7; i++) {
    for (int j = 0; j <= 5; j++) {
        System.out.print("(" + i + ", " + j + ")\t");
    }
    System.out.println();
}
```

The outer loop increments after the inner completely finishes, so the pattern of what happens is

1. Inner loop begins with `i = 0` and `j = 0`
2. Inner loop finishes with `i = 0` and `j = 5`
3. Outer loop updates with `i++`
4. Inner loop begins with `i = 1` and `j` is redeclared and reset to `0`

Variables are local to block where they are declared. Since `j` is declared in the inner loop, it cannot be used outside of it. It's redeclared and reset to zero every time that loop restarts.
