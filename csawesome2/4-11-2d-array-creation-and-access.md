---
title: 4.11 2D Array Creation and Access
layout: page
course: AP CSA
prev-link: ./4-10-implementing-array-list-algorithms.html
next-link: ./4-12-2d-array-traversals-nested-loops.html
---

- Develop code used to represent collections of related data using two-dimensional (2D) array objects

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.11 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-11-2Darrays.html){: target="_blank"}
- [4.48 Code Practice with 2D Arrays](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/Array2dCodePractice.html){: target="_blank"}

---

## Array of Arrays

Arrays can hold primitives, objects, and even other arrays.

```java
int[][] arrays = { {1,2,3}, {10,20,30} };
```

This leads to a tabular structure made up of rows and columns. The example above can be looked at as having two rows and three columns where the first row contains `{1, 2, 3}` and the second row has `{10, 20, 30}`.[^1] The usual indexing rules still apply, so both the first row and column have an index of `0`.

If you want to create an empty 2D array (i.e., full of default values), it looks like this.

```java
int[][] ints = new int[2][3];           // 2 rows, 3 columns
String[][] strings = new String[4][2];  // 4 rows, 2 columns
```

Despite the row by column distinction (also known as row-major, but we'll get into that more next section), it's important to keep in mind that a 2D array is just an array of arrays, with an outer array holding multiple inner arrays. So if you want to know the length of the outer array (which can also be though of as the number of inner arrays, or the number or rows), then it's

```java
System.out.println(ints.length);
```

And if want the length of an inner array (or the length of a row, or the number of columns), then it's

```java
System.out.println(ints[0].length);
```

That last one technically only tells you the length of the first array (or row), and completely ignores the other ones. For the AP exam, assume that all 2D arrays are rectangular, meaning each inner array (row) is the same length. Non-rectangular arrays are possible, but beyond the scope of the course.

[^1]: The row by column distinction is more for human visualization than anything. How a 2D array is displayed is completely arbitrary, but row by column is is the accepted way of visualizing them in Java, and AP follows this as well.
