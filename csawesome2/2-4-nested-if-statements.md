---
title: 2.4 Nested if Statements
layout: page
course: AP CSA
prev-link: 
next-link: 
---

- Develop code to represent nested branching logical processes and determine the result of these processes

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.4 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-4-nested-ifs.html){: target="_blank"}
- [Selection Coding Practice (2.1-2.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/selection-practice-coding.html){: target="_blank"}

---

## More *if*{: .tt-head} structures

Now that we have `if` statements to play with, we can expand our basic if-else structure to cover more areas.

First off is nesting, where you put `if` statements inside `if` statements.

```java
if (boolean expression)
{   // This nested if is executed if outer if is true
    if (boolean expression)
    {
        statement;
    }
}
```

This is helpful if you have multiple conditions that need to be satisfied. It doesn't always lead to the cleanest code—and we'll work on ways to avoid this next section—but the option is there.

Of course, you can throw `else` statements into the mix.

```java
if (isDivisible5) {
    if (isDivisible2) {
        System.out.println("Divisible by 10.");
    } else {
        System.out.println("Divisible by 5.");
    }
}
```

## *else if*{: .tt-head} structures

You can also chain multiple `if` statements using `else if`, which comes in handy when it's not just a "one or the other" situation.

```java
if (x < 0) {
    System.out.println("x is negative");
} else if (x == 0) {
    System.out.println("x is zero");
} else {
    System.out.println("x is positive");
}
```
