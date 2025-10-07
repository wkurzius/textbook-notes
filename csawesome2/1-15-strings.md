---
title:  1.15 Strings
layout: notes
course: AP CSA
---

- Develop code to create string objects and determine the result of creating and combining strings
- Develop code to call methods on string objects and determine the result of calling these methods

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.15 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-15-strings.html)

---

## String References

A `String` is an object in Java, which is why it's type starts with a capital letter. They're variables are reference variables, meaning they point to the object. If it points at nothing, then it points to `null`.

Also, since it's an object, it can be created like other objects.

```java
String s = new String("Some words");
```

Is just as effective as the way you are used to.

```java
String s = "Some words";
```

There are some under-the-hood differences, but nothing we need to worry about at this point.

## Concatenation

You've seen this already, but multiple `String` objects can be joined with the `+` operator.

```java
String s = "Look, " + "concatenation.";
```

This is useful for entering the value of a variable into a `String`, or even numbers themselves. As long as the type is `String` and one of the pieces is a `String`, then Java will convert the rest and concatenate them.

```java
String s = "12" + 3;    //outputs 123
String s = 12 + "3";    //also outputs 123
String s = 12 + 3;      //syntax error
```

## *String*{: .header-tt} Index, Length, and Methods
