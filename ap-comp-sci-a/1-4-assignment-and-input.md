---
title:  1.4 Assignment and Input
layout: page
course: AP CSA
prev-link: "./1-3-expressions-and-output.html"
next-link: "./1-5-casting-and-ranges-of-values.html"
---

- Develop code for assignment statements with expressions and determine the value that is stored in the variable as a result of these statements
- Develop code to read input

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.4 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-4-assignment.html){: target="_blank"}

---

## Assignment Statements

Time to break you of a math habit. Take a look at the code below. It's not a full program, but don't worry about that.

```java
a = 7;
b = a;
a = 2;
```

At the end of those three lines, the value of the variable `b` is `7`. If you thought it was `2`, don't worry about it. That's natural math thinking. It says `a = b`, so shouldn't they be equal all the time? Nope.

In programming, `=` takes on a different meaning, that of **assignment**. In each of those statements above, a value is being assigned.

- `a` gets `7`
- then `b` gets whatever `a` has, so `7`
- Finally, `a` gets reassigned `2`

## Data Types in Assignments

The statement `int x = 1.1;` won't compile with the reason given being `possible lossy conversion from double to int`. We'll eventually cover how to convert data types, but for now be mindful matching data types when using expressions and variables. Sometimes it's OK, like you can store an `int` in a `double`, but best to stay consistent.

## Adding 1 to a Variable

Yes, this gets an entire subsection. It comes up a lot. Here's how to do it.

`x = x + 1;`

This doesn't make any sense algebraically, but if you think in terms of assignment it clears up. We are assigning `x` the value of whatever `x` is plus `1` more.
