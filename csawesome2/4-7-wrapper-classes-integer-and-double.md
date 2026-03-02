---
title: "4.7 Wrapper Classes: Integer and Double"
layout: page
course: AP CSA
prev-link: ./4-6-using-text-files.html
next-link: ./4-8-array-list-and-its-methods.html
---

- Develop code to use `Integer` and `Double` objects from their primitive counterparts and determine the result of using these objects

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.7 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-7-wrapper-classes.html){: target="_blank"}
- [4.33 Code Practice with ArrayLists](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayListPractice.html){: target="_blank"}

---

Believe it or not, objects are sometime preferable to primitives. That means having a plain `int` is a detriment in some cases, where an object would be more desirable, if not necessary.

> One quick reason why (as others won't make sense at the moment) is that the absence of data is best represented by `null`, which primitives can't ever be.

Enter wrapper classes, which take primitives and wrap them in objects. While there is a wrapper class for each primitive, you only need to worry about `Integer` and `Double`. Working with them is straightforward since Java will do something called **autoboxing** and **unboxing**.

```java
Integer i = 5;  // autoboxing
int j = i;      // unboxing
```

You can still use the new keyword if you wish, but there's no need (and it's actually depreciated as of a Java 9 almost 10 years ago).

Also, wrapper classes are part of a `java.lang` meaning they are loaded by default and don't require an import statement.

## Parsing Methods

Like any other class, wrappers come with methods, but the only two you need to worry about are

- `static int parseInt(String s)`
- `static double parseDouble(String s)`

Both will convert a string to the appropriate number, provided the string can actually be converted. Note they are static, so remember to put the class name in front.

```java
String str = "53";
int i = Integer.parseInt(str);
```

## Remember MAX_VALUE and MIN_VALUE?

Of course you do. Go look at [1.5 Casting and Ranges of Values](./1-5-casting-and-ranges-of-values.md) for a refresher. Both of those are fields in the `Integer` class.
