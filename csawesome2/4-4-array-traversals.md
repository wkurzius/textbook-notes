---
title: 4.4 Array Traversals
layout: page
course: AP CSA
prev-link: ./4-3-array-creation-and-access.html
next-link: ./4-5-implementing-array-algorithms.html
---

- Develop code used to traverse the elements in a 1D array and determine the result of these traversals

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.4 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-4-array-traversal.html){: target="_blank"}
- [4.20 Arrays Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayPractice.html){: target="_blank"}

---

## Traversal with `for` Loops

Loops are good for repeating things. Traversing an array is an example of a repeated action. Loops are good for traversing arrays.

```java
String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};

for (int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
}
```

The text has a slew of example and exercises that show different ways to mess with this basic structure, but the basic idea doesn't change much.

## The Enhanced `for` Loop

If you want to type even less, you can use an enhanced `for` loop.