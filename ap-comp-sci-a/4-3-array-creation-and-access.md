---
title: 4.3 Array Creation and Access
layout: page
course: AP CSA
prev-link: ./4-2-data-sets.html
next-link: ./4-4-array-traversals.html
---

- Develop code used to represent collections of related data using one-dimensional (1D) array objects

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.3 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-3-array-basics.html){: target="_blank"}
- [4.20 Arrays Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayPractice.html){: target="_blank"}

---

If you have lots of data to keep track of, that means lots of variables, which is dumb. Instead, if that data is similar, you can store them in **arrays**. They are collections of data where reference and access is simplified. For example, here is the creation of an array of integers and how you would modify and access them.

```java
int[] nums = new int[4];

System.out.println(nums[0]);    // outputs '0', the default value for ints
nums[0] = 2;
System.out.println(nums[0]);    // now outputs '2'

nums[1] = 4;
nums[2] = 8;
nums[3] = 16;                   // last index in array of length 4
```

Arrays are objects, so they can be initialized with `new`. As for access, they behave similar to strings in that the first entry has index 0 and the last is the length minus 1.

Along with that "arrays are objects" bit, the **length of the array** is a field rather than a method.

```java
int l = nums.length;
System.out.println(l);          // outputs 4
System.out.println(nums[4]);    // ArrayIndexOutOfBoundsException
```

Don't worry if you add the `()` on the exam. There is a specific rule in the scoring guidelines to not deduct points for that.

There is also another way to initialize an array which involves setting the value of each entry from the beginning.

```java
boolean[] b = {false, true, false, true};
```
