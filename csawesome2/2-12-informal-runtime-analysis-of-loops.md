---
title: 2.12 Informal Runtime Analysis of Loops
layout: page
course: AP CSA
prev-link: ./2-11-nested-iteration.html
next-link: ./3-1-abstraction-and-program-design.html
---

- Calculate statement execution counts and informal run-time comparison of iterative statements

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.12 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-12-loop-analysis.html){: target="_blank"}
- [Loops Coding Practice (2.7-2.12)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/loops-practice-coding.html){: target="_blank"}

---

This section is all about tracing loops. If you are writing your own code, this is straightforward. Here's the book's first example, but with some print statements to show off what's going on at the end of each loop.

```java
int var1 = 3;
int var2 = 2;

int i = 0;
System.out.println("i\tvar1\tvar2");
System.out.println("----------------");

while ((var2 != 0) && ((var1 / var2) >= 0)) {
    var1 = var1 + 1;
    var2 = var2 - 1;

    System.out.println(i + "\t" + var1 + "\t" + var2);
    i++;
}
```

The output will look like this.

```
i       var1    var2
----------------
1       4       1
2       5       0
```

Naturally, you won't have the opportunity to modify the code of a multiple-choice question, so you'll have to do those manually. Some things to watch for when trying to determine how many times a loop runs.

1. Watch for `<` versus `<=` in the condition to avoid off-by-one errors.
2. Verify the update portion. Don't assume it goes up by one each time.
3. Look for any code in the loop that might be messing with the counter.

If the loops don't involve counters, all the work is likely done inside the loop. Use paper and write out the values after each iteration to make sure you understand what it's doing.

