---
title: 2.3 `if` Statements
layout: page
course: AP CSA
prev-link: ./2-2-boolean-expressions.html
next-link: ./2-4-nested-if-statements.html
---

- Develop code to represent branching logical processes by using selection statements and determine the result of these processes

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.3 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-3-ifs.html){: target="_blank"}
- [Selection Coding Practice (2.1-2.6)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/selection-practice-coding.html){: target="_blank"}

---

## **if**{: .tt-head} statements and one-way selection

Selection is used to create branching execution, where some code will only run under certain conditions. Typically, this is done with `if` statements, which look like this:

```java
if (boolean expression) {
   Do Statement1;
   Do Statement2;
   ...
   Do StatementN;
}
```

If the boolean expression evaluates to `true`, then all the statements in the block execute from top to bottom. Blocks of code are marked by braces `{ }`, which you've seen when defining methods and classes.

> _CSAwesome2_ likes to put their opening brace on the next line, while I and most of the planet prefer the same line. We do this because there's more of a premium on vertical space than horizontal (and my formatter has that as the default).
>
> Also, if there is only one statement in the block, you can get away with omitting braces altogether. I don't recommend that since it can lead to code readability issues. I won't show it here, but you'll see it in the book.

If the boolean expression evaluates to `false`, the entire block is skipped. This is useful for checking preconditions on a method. If they aren't met, the logic can be skipped and the method can exit gracefully.

```java
public static String inverse(int n, int d) {
    if (n != 0) {
        return d + "/" + n;
    }   

    return "Cannot be inverted.";
}
```

## Two-way selection

Having an alternate block of code execute can be helpful, so enter the `else` keyword. If the original boolean statement evaluates to `false`, then any code in the adjoining `else` block will run instead.

```java
if (boolean expression) {
   statement1;
   statement2;
} else {
   do other statement;
   and another one;
}
```

I can easily rewrite my method from earlier with an `else` block, which will also make it a bit easier to read (debatable).

```java
public static String inverse(int n, int d) {
    if (n != 0) {
        return d + "/" + n;
    } else {
        return "Cannot be inverted.";
    }
}
```

Writing the boolean expressions will likely be your biggest hurdle. The logical statements will either be difficult to turn into code, or the code itself will be hard to parse.
