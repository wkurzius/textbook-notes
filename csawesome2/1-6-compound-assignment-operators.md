---
title:  1.6 Compound Assignment Operators
layout: notes
course: AP CSA
---

- Develop code for assignment statements with compound assignment operators and determine the value that is stored in the variable as a result

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.6 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-6-compound-operators.html)

## Extra Practice

- [Toggle Code Practice 1a (1.1–1.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/unit1a-practice-toggle-code.html)
- [Code Practice 1a (1.1–1.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/unit1a-practice-coding.html)
- [Multiple Choice Exercises for Unit 1a (1.1-1.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/Exercises-basics.html)

---

## Compound Assignment Operators

We've seen code to update the value of a variable. The code below will add five to the value of `x`.

```java
x = x + 5;
```

For actual legitimate reasons, a briefer expression was developed.

```java
x += 5;
```

This works will all the operators, too.

```java
x -= 5;
x *= 5;
x /= 5;
x %= 5;
```

Just be aware of your types, since in those examples `5` is an integer meaning your new value will also be an integer.

You do not have to use the abbreviated form, but you'll see it on the exam. Best to use it so you get comfortable reading it.

### Increment and Decrement Operator

Programmers are really lazy. Adding or subtracting by one is so common, we needed to drop one more character from the expression. The below lines will add and subtract one from `x`.

```java
x++;
x--;
```
