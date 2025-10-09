---
title:  1.3 Expressions and Output
layout: notes
course: AP CSA
---

- Develop code to generate output and determine the result that would be displayed
- Develop code to utilize string literals and determine the result of using string literals
- Develop code for arithmetic expressions and determine the result of these expressions

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.3 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-3-expressions.html){: target="_blank"}

---

## Outputting Special Characters

Two of the more common output statements in Java are `print` and `println`. The latter appends a new line character at the end of the string, so whatever is output next goes on a new line. You are free to add new lines whenever you want, but in order to do that you need an escape sequence, where instead of outputting the exact characters, something else is output. For a new line, the escape sequence is `\n`. The other escape sequences are below, with the ones you need to know for the AP exam highlighted.

| Escape Sequence | Description                                                    |
| :-------------: | -------------------------------------------------------------- |
|      `\t`       | Insert a tab in the text at this point.                        |
|      `\b`       | Insert a backspace in the text at this point.                  |
|      `\n`       | **Insert a newline in the text at this point.**                |
|      `\r`       | Insert a carriage return in the text at this point.            |
|      `\f`       | Insert a form feed in the text at this point.                  |
|      `\'`       | Insert a single quote character in the text at this point.     |
|      `\"`       | **Insert a double quote character in the text at this point.** |
|      `\\`       | **Insert a backslash character in the text at this point.**    |

## Expressions

Finally, some math. Aside from division using a slash `/` and multiplication the asterisk `*`, your basic operations work more or less how you expect. Order of operations is still there and parentheses behave like you would expect, as well. Running `System.out.println((2 + 3) * 2);` outputs a `10`.

Where you need to be careful is with division. `3 / 2` results in a `1` because Java is preserving data types. You are dividing two integers, so the output will also be an integer, and they get there by chopping of the decimal part. The only rounding is down.

So, if you need decimals, you have to use them. Make just one of the numbers a double by adding `.0` and you'll get the `1.5`.

## The Remainder Operator

A new operator you've likely not seen before is the remainder operator, which uses the percent sign `%`. This clever tool outputs the remainder after dividing the two numbers. `5 % 2` results in a `1`. This is very useful for cyclical things, like determining if a number is even or odd, or determining the day of the week based on the date.

> The remainder operator is the official Java name, but it's often called modulus or mod, and while they are technically different it's [way worse than the book describes](https://en.wikipedia.org/wiki/Modulo#Variants_of_the_definition){: target="_blank"}.
