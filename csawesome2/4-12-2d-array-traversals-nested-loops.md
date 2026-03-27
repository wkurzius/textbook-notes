---
title: "4.12 2D Array Traversals"
layout: page
course: AP CSA
prev-link: ./4-11-2d-array-creation-and-access.html
next-link: ./4-13-implementing-2d-array-algorithms.html
---

- Develop code used to traverse the elements in a 2D array and determine the result of these traversals

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.12 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-12-2Darray-traversal.html){: target="_blank"}
- [4.48 Code Practice with 2D Arrays](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/Array2dCodePractice.html){: target="_blank"}

---

The basic idea behind traversing a 2D array is to have an outer loop that will go target each array, and then a second, inner loop that goes though each element in the current array.[^1]

```java
int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };

for (int row = 0; row < array.length; row++) {
    for (int col = 0; col < array[0].length; col++) {
        System.out.print(array[row][col] + " ");
    }
}
```

This approach is referred to as **row-major** due to the convention of thinking each of each array as a row in a table. You can also traverse an array using a **column-major** approach. The only thing that changes is the order of the loops.

```java
int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };

for (int col = 0; col < array[0].length; col++) {
    for (int row = 0; row < array.length; row++) {
        System.out.print(array[row][col] + " ");
    }
}
```

You can also used enhanced for loops, but only with a row-major traversal.[^2] Note the types used in each loop. The outer one needs to look at the inner arrays, so the type is `int[]`. The inner one looks at the actual values, so it's `int`.

```java
for (int[] row : array) {
    for (int cell : row) {
        System.out.print(cell + " ");
    }
    System.out.print(" ");
}
```

Lastly, use variable names that will be helpful in picturing the array. `i` and `j` tend to be used as counters for nested loops, but variables like `row`, `col`, and `cell` might make your life easier.

[^1]: Because we are assuming our 2D arrays are all rectangular, we can get away with using `array[0].length` on line 4. If each array was a different size, the safer approach would be to use `array[row].length`.

[^2]: If you can do column-major with enhanced for loops, it's likely more work than just using a regular loop.
