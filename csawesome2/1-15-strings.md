---
title:  1.15 Strings

course: AP CSA
---

- Develop code to create string objects and determine the result of creating and combining strings
- Develop code to call methods on string objects and determine the result of calling these methods

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.15 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-15-strings.html){: target="_blank"}

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

This is useful for entering the value of a variable into a `String`, or even numbers themselves. As long as one of the pieces is a `String`, then Java will convert the rest and concatenate them.

```java
String s = "12" + 3;    //outputs 123
String s = 12 + "3";    //also outputs 123
String s = 12 + 3;      //syntax error
```

## *String*{: .header-tt} Length, Index, and Methods

Strings are made up of characters—which includes letters, numbers, symbols, and even non-printable characters like tabs and newlines—and the length of a `String` is how many characters it contains. Spare yourself some counting and use the `length()` method to get the length of a `String`. This is an object method, so use the dot operator.

```java
String s = "some string";
int l = s.length();

System.out.println(l);      // outputs 11
```

Each character in a `String` can be referenced by its index, but the counting starts at 0 (which happens a lot in programming). So, the character as position 0 is `s` and the one at position 3 is `e`. The method `indexOf(String str)` returns the index of where a given string can be found in a larger one.

```java
String s = "some string";
int i = s.indexOf("ring");

System.out.println(i);      // outputs 7
```

If it can't find it, it returns `-1`. This is a common tactic of return methods. They are forced to return a certain type, but in the event it fails, it returns bad data rather than crashing out. Here, `-1` is perfect because it's always an invalid index.

### The *substring()*{. header-tt} Method

Aside from `length()` and `indexOf()`, there are a few other methods you need to worry about. The method `substring()` is fairly straightforward on the surface, but requires practice to really wrap your head around it. Both work on an existing string and extract part of it.

There are two versions: `substring(int from)` and `substring(int from, int to)`. The former returns a `String` starting at the index given and goes right to the end.

```java
String s = "some string";
String u = s.substring(6);  // "tring"
```

The latter includes an endpoint, but like `Math.random()`, the endpoint is not included.

```java
String s = "some string";
String u = s.substring(0, 3);  // "som"
```

Lots of practice needed for this, and you will see some funky problems involving it.

### *equals()*{. header-tt} and *compareTo()*{. header-tt}

This came up briefly earlier, but you can compare values in Java with `==`. But this is really only for primitives, because reference variables technically point to memory addresses. So, in order to properly compare objects, including Strings, the `equals()` method exists. Like the others, it requires the dot operator.

```java
String s1 = "a string";
String s2 = "a string";
String s3 = "string";

boolean s12 = s1.equals(s2);    // true
boolean s13 = s1.equals(s3);    // false
```

`compareTo()` is a bit more nuanced. It operates the same way, but returns an `int`. If the strings are equal, it returns 0. If the first comes first alphabetically (or more accurately, [lexicographically](https://stackoverflow.com/questions/45950646/what-is-lexicographical-order)), then it returns a negative number. It returns a positive if the second comes first.

It might seem a bit arbitrary, but think of it as a subtraction problem where the second is being subtracted from the first.

```java
String s1 = "apple";
String s2 = "bolognese";
int answer = s1.compareTo(s2);  // returns a negative
```
