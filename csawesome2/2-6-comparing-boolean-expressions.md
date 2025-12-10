---
title: 2.6 Comparing Boolean Expressions (De Morgan’s Laws)
layout: page
course: AP CSA
---

- Compare equivalent Boolean expressions
- Develop code to compare object references using Boolean expressions and determine the result of these expressions

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.6 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-6-comparing-booleans.html){: target="_blank"}
- [Selection Coding Practice (2.1-2.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/selection-practice-coding.html){: target="_blank"}

---

## Comparing boolean expressions and DeMorgan's Law

Two boolean expressions are equivalent if their resulting truth tables are identical. Below, you can see the statements `!(a && b)` and `!a || !b` are the same since they produce the `true`/`false` values.

|  `a`  |  `b`  | `!(a && b)` | `!a \|\| !b` |
| :---: | :---: | :---------: | :----------: |
|   T   |   T   |      F      |      F       |
|   T   |   F   |      T      |      T       |
|   F   |   T   |      T      |      T       |
|   F   |   F   |      T      |      T       |

That particular comparison is an example of DeMorgan's Law, which is sort of distribution for booleans. The individual values are negated and the AND becomes an OR, which also works the other way: `!(a || b)` is equivalent to `!a && !b`. I suggest you write out the truth table for that on your own.

### Other negations

Here's a list of other negations that involve the relational operators.

- `!(a == b)` is equivalent to `a != b`
- `!(a != b)` is equivalent to `a == b`
- `!(a < b)`  is equivalent to `a >= b`
- `!(a > b)`  is equivalent to `a <= b`
- `!(a <= b)` is equivalent to `a > b`
- `!(a >= b)` is equivalent to `a < b`

### Example

Using everything so far, let's rewrite the expression `!(a < b) && !(a > b)` a couple ways.

First, and likely least helpful is by using DeMorgan's Law. That means factoring out (?) the negation and flipping AND to OR. That gives us `!( a < b  || a > b )`. There are still negations, which make this hard to read.

The other way is to further distribute (?) the negations. Negating the relations will have them disappear and leave us with hopefully something simpler. Using the list from above, we end up with `(a >= b) && (a <= b )`, which is just a complicated way of saying `a == b`.

## Comparing objects ... again

I feel like we've done this a bunch already, so here's the short version:

- Using `==` or `!=` with reference variables (i.e. objects) tell you if they point to the same object
- To compare objects, use the object's `equals()` method instead

You can also compare objects to `null`, which is handy for avoiding errors. The example below combines a `null` check with short-circuiting to avoid potential problems.

```java
if (s != null && s.indexOf("a") >= 0) {
    System.out.println(s + " contains an a");
}
```
