---
title: 4.17 Recursive Searching and Sorting
layout: page
course: AP CSA
prev-link: ./4-16-recursion.html
next-link: 
---

- Determine the result of executing recursive algorithms that use strings or collections
- Determine the result of each iteration of a binary search algorithm used to search for information in a collection
- Determine the result of each iteration of the merge sort algorithm when used to sort a collection

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.17 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-17-recursive-search-sort.html){: target="_blank"}
- [4.58 Code Practice for Recursion](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/recursionCodePractice.html){: target="_blank"}

---

Like the previous few sections, is all about tracing code rather that writing it. This time, we're looking at two recursive algorithms: binary search and merge sort. We [covered binary searching before in 4.14](./4-14-searching-algorithms.md), but that was the iterative version. The book has the recursive version along with comments so you can follow along.

**Merge sort** is the new thing, and it can be a lot at first. The key idea is that if two sub-arrays are sorted, you can merge them into a combined sorted array by only looking at the first element in each. Below is how the arrays `{1, 3, 4}` and `{2, 5}` are merged.

```sh
a: 1 3 4
b: 2 5
c:

a: 3 4
b: 2 5
c: 1

a: 3 4
b: 5
c: 1 2

a: 4
b: 5
c: 1 2 3

a:
b: 5
c: 1 2 3 4

a:
b: 
c: 1 2 3 4 5
```

To make this work, we split the unsorted array in half over and over until we have sub-arrays of length 1, which means they are technically sorted. You can then start merging those arrays together.

The basic steps exist in the method `mergeSortHelper` in the book. Amongst other things, it requires a `from` and `to` which indicate what part of the array will be sorted.

A `middle` is then calculated, which is where the array will be split, and then the recursive calls start. First the left side is broken down until `from` is no longer less than `to` (i.e., the length is 1), then the right side is broken down.

```java
private static void mergeSortHelper(int[] elements, int from, int to, int[] temp) {
    if (from < to) {
        int middle = (from + to) / 2;
        mergeSortHelper(elements, from, middle, temp);
        mergeSortHelper(elements, middle + 1, to, temp);
        merge(elements, from, middle, to, temp);
    }
}
```

Once the recursive calls end, `merge` kicks in. There are various ways to do this, but in essence a copy of the array is needed to store values temporarily, while the original array is overwritten with the now sorted values.

My version of this is below, which is quite different than the book's version. I think it's easier to wrap your head around (and it has comments!), so try to tackle the book version after you get the gist here.

```java
public static void merge(int[] nums, int left, int middle, int right) {
    System.out.println(left + "-" + right);
    System.out.println("Before: " + numsToStringBounded(nums, left, right));

    int[] lArray = new int[middle - left + 1];
    int[] rArray = new int[right - middle];

    // create temp left array
    for (int i = 0; i < lArray.length; i++)
        lArray[i] = nums[left + i];

    // create temp right array
    for (int i = 0; i < rArray.length; i++)
        rArray[i] = nums[middle + i + 1];

    // merge
    int l = 0;  // counter for lArray
    int r = 0;  // counter for RArray
    for (int i = left; i <= right; i++) {
        // first two cases are for when the other array is exhausted
        if (r >= rArray.length) {
            nums[i] = lArray[l];
            l++;
        } else if (l >= lArray.length) {
            nums[i] = rArray[r];
            r++;
        } else if (lArray[l] < rArray[r]) {
            nums[i] = lArray[l];
            l++;
        } else {
            nums[i] = rArray[r];
            r++;
        }
    }

}
```
