---
title: 4.13 Implementing 2D Array Algorithms
layout: page
course: AP CSA
prev-link: ./4-12-2d-array-traversals-nested-loops.html
next-link: ./4-14-searching-algorithms.html
---

- Develop code for standard and original algorithms for a particular context or specification that involves 2D arrays and determine the result of these algorithms

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.13 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-13-2Darray-algorithms.html){: target="_blank"}
- [4.48 Code Practice with 2D Arrays](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/Array2dCodePractice.html){: target="_blank"}

---

Just like with arrays and ArrayLists, here is a list of things you need to be able to do with 2D arrays.

- determine a minimum or maximum value of all the elements or for a designated row, column, or other subsection
- compute a sum or average of all the elements or for a designated row, column, or other subsection
- determine if at least one element has a particular property in the entire 2D array or for a designated row, column, or other subsection
- determine if all elements of the 2D array or a designated row, column, or other subsection have a particular property
- determine the number of elements in the 2D array or in a designated row, column, or other subsection having a particular property
- access all consecutive pairs of elements
- determine the presence or absence of duplicate elements in the 2D array or in a designated row, column, or other subsection
- shift or rotate elements in a row left or right or in a column up or down
- reverse the order of the elements in a row or column

If you've gotten the hang of traversal, most of these won't be a problem as you've done them all before. The only other wrinkle is restricting to a specific row, column, or other subsection. This usually just requires an additional `if` statement to ensure you're looking at the correct row/column combination.
