---
title: 2.2 Boolean Expressions
layout: notes
course: AP CSA
---

- Develop code to create Boolean expressions with relational operators and determine the result of these expressions

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.2 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-2-booleans.html){: target="_blank"}
- [Selection Coding Practice (2.1-2.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/selection-practice-coding.html){: target="_blank"}

---

## Boolean Expressions and Relational Operators

Selection relies on whether or not statements are true. If a statement is true, a particular part of an algorithm will run. If the statement is false, that part will be skipped and possibly another part will run in its place.

In programming, boolean expressions evaluate to either `true` and `false` and they use relational operators to determine that, with the basic being `==` for testing if two things are equal.

> Remember that `=` is the assignment operator and is used for stating the value stored in a variable (or what it's referencing if it's an object).

For primitives, this is straightforward. If two `int` variables have the same value, then the expression `x == y` will evaluate to `true`. If they aren't, then it's `false`.

For objects, things are more complicated. Since object variables are just references to objects, the `==` operator checks if the variables point to the same object. It doesn't care how similar the objects are, only if they are the same object.

> `String` objects make this concept a bit complicated. If you do some testing, you might come to the conclusion that `==` works perfectly fine with `String` objects and all that `equals()` from last unit is unnecessary. Let me introduce you to the [String Pool](https://medium.com/@AlexanderObregon/how-javas-string-pool-works-and-why-it-matters-306e2ea81147).
>
> Use `equals()` for comparing `String` objects.

The opposite of equal is not-equal, and you get that in Java with the operator `!=`. It will return `true` when two things are not equal, and `false` when they are. I suggest only using this when necessary, because reading any kind of boolean statement when "nots" are involved is "not" fun. If you don't believe me, think back to any test question where you had to select the statement that was false.

### Other Comparisons

The other relational operators are less/greater than (`<` and `>`)  and less/greater than or equal to (`<=` and `>=`). Like with the equality operators, use them with primitives only. `String` has `compareTo()` and other objects might have their own, but that's a rabbit hole for another day.

> In case you get the thought "what about not less than?", that's just greater than or equal to. For anything more complicated than that, you can go check out [2.5](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-5-compound-ifs.html).
