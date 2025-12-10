---
title: 2.5 Compound Boolean Expressions

course: AP CSA
---

- Develop code to represent compound Boolean expressions and determine the result of these expressions

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.5 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-5-compound-ifs.html){: target="_blank"}
- [Selection Coding Practice (2.1-2.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/selection-practice-coding.html)

---

## ANDs, ORs, and NOTs

Boolean expressions can be a lot more complicated than just simple comparisons. Sometimes we need to look at two values, and then decide if we want just one of those things to be true, or both. And sometimes, we just need something to be false. Enter the boolean operators AND, OR, NOT ... and a couple others we won't talk about here.

You've already seen AND and OR in algebra when you worked with inequalities.

```java
if (x >= 0 && x <= 9) {
    System.out.println("Is single digit.");
}

if (x < 13 || x > 19) {
    System.out.println("Not in the teens.");
}
```

In Java, AND is represented by the `&&` symbol and OR by `||`. Like you see above, you need AND for an interior range and OR for an exterior one.

> Java cannot do compound inequalities like $0 < x < 10$. You will have to split that into statements and join them with `&&`.

The other operator is NOT and is represented by `!`. Use when needed, because this can make code tougher to read.

```java
boolean isFriday = true;

if (!isFriday) {
    System.out.println("Ugh.");
}
```

These operators allow you to produce complex boolean expressions, but don't forget about readability. Plan your if statements in advance and see if you can reduce the complexity before producing something with two ANDs and an OR.

## Short-Circuiting

Short-circuiting is done by both `&&` and `||` and it means they will skip evaluating the second statement if it's not needed. For AND, if the first statement is `false`, there's no need to check the second so it doesn't. For OR, it's the opposite. If the first is `true`, no need to worry about the second one.

If you didn't want to short circuit the expression, you can force both to evaluate by using `&` and `|`.
