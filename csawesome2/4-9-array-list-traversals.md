---
title: 4.9 ArrayList Traversals
layout: page
course: AP CSA
prev-link: ./4-8-array-list-and-its-methods.html
next-link: ./4-10-implementing-array-list-algorithms.html
---

- Develop code used to traverse the elements of an `ArrayList` and determine the results of these traversals

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.9 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-9-arraylist-traversal.html){: target="_blank"}
- [4.33 Code Practice with ArrayLists](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayListPractice.html){: target="_blank"}

---

Save for one caveat, this is a practice section. You've used loops and traversed arrays before, so little here is new.

The one catch is that you have to be careful when adding or removing items while looping through an `ArrayList`. Doing either will both change the size of the array and move items around, which you need to account for to avoid any errors.

Also, enhanced `for` loops can't used in situations where the `ArrayList` changes size.
