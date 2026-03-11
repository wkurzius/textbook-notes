---
title: 4.10 Implementing ArrayList Algorithms
layout: page
course: AP CSA
prev-link: ./4-9-array-list-traversals.html
next-link: ./4-11-2d-array-creation-and-access.html
---

- Develop code for standard and original algorithms for a particular context or specification that involve `ArrayList` objects and determine the result of these algorithms

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.10 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-10-arraylist-algorithms.html){: target="_blank"}
- [4.33 Code Practice with ArrayLists](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayListPractice.html){: target="_blank"}

---

Like last section, this is a practice section. This is also similar to [4.5 Implementing Array Algorithms](./4-5-implementing-array-algorithms.md), except now the list of algorithms you need to know is for an `ArrayList`. And here is that list, straight from the course description:

- determine a minimum or maximum value
- compute a sum or average
- determine if at least one element has a particular property
- determine if all elements have a particular property
- determine the number of elements having a particular property
- access all consecutive pairs of elements
- determine the presence or absence of duplicate elements
- shift or rotate elements left or right
- reverse the order of the elements
- insert elements
- delete elements

There are some quirks with a few of the exercises (like 4.10.3 being broken), but nothing major as far coding strategies goes.

## However ...

If you want to challenge yourself a bit, you can utilize the [ternary operator](https://www.baeldung.com/java-ternary-operator){: target="_blank"} to short hand some `if` statements.

```java
if (Expression1) {
    variable = Expression2;
} else {
    variable = Expression3;
}

// becomes

variable = Expression1 ? Expression 2 : Expression 3;
```

Aside from readability and a small smugness factor, there is zero benefit to using this. It's not even on the AP exam.

If you do want to give it a shot, I recommend trying it in 4.10.6 which has you finding the largest number in an `ArrayList`.
