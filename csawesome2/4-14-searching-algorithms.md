---
title: 4.14 Searching Algorithms
layout: page
course: AP CSA
prev-link: ./4-13-implementing-2d-array-algorithms.html
next-link: ./4-15-sorting-algorithms.html
---

- Develop code used for linear search algorithms to search for specific information in a collection and determine the results of executing a search

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.14 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-14-searching.html){: target="_blank"}
- [4.58 Code Practice for Recursion](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/recursionCodePractice.html){: target="_blank"}

---

There are two types of searches you need to worry about: **linear** and **binary**. The former you've done already, although maybe not by name. Start at the beginning of the collection and check each element to see if it matches, and keep doing that until the end of the collection. It's a basic traversal.

Binary searches are much different, but they have a catch: the data must be sorted. The algorithm then works by looking at the middle of the data set and seeing if the target is above or below that point. It then only looks at the relevant half of the data, and repeats the process, each time halving the amount of data until it finds the target, or finds that it doesn't exist.

The halving portion is critical, because it ends up saving a lot a time (again, assuming the data is sorted). For an array of 1000 items you only need 10 loops[^1], which you can predict using $\log_2 n$. If you haven't yet, spend some time getting familiar with the powers of $2$.

[^1]: Depending on implementation, it might be 10 or 11 loops/calls/comparisons. I bring this up because of one AP problem I saw asked how many times the search ran, and the answer was one more than predicted. In this particular problem, it was searching for something not in the array and the way the code was written meant it ran one extra time. And of course, both options were present.
