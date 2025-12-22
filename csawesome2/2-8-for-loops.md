---
title: 2.8 For Loops
layout: page
course: AP CSA
prev-link: ./2-7-while-loops.html
next-link: ./2-9-implementing-selection-and-iteration-algorithms.html
---

- Develop code to represent iterative processes using `for` loops and determine the result of these processes

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.8 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-8-for-loops.html){: target="_blank"}
- [Loops Coding Practice (2.7-2.12)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/loops-practice-coding.html){: target="_blank"}

---

Any `while` loop that utilizes a counter typically has three things: the counter initializer, a condition that tests the counter, and the counter update (increment/decrement). A `for` loop takes all that and combines it into one line. Whether or not this saves you any time is debatable, but it does condense it to a single line.

```java
// while version
int x = 3;
while (x > 0) {
    System.out.println(x);
    x--;
}

// for version
for(int x = 3; x > 0; x--) {
    System.out.println(x);
}
```

If you got `while` loops, this isn't going to be much of a change, but there are a few things to keep in mind.

1. The initializer only runs once, before anything else in the loop.
2. The test/condition is checked before each iteration, including the very first one.
3. The update runs at the end of every iteration.
