---
title:  "1.11 Using the `Math` Class"
layout: notes
course: AP CSA
---

- Develop code to write expressions that incorporate calls to built-in mathematical libraries and determine the value that is produced as a result

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.11 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-11-Math.html){: target="_blank"}

---

## Mathematical Functions

The `Math` class is a collection of static methods that pretty much do what you would expect each would do. `Math.abs()` returns the absolute value, `Math.pow()` raises a base to a power, and so on. On the exam, CollegeBoard will provide you with a [Java Quick Reference](https://apcentral.collegeboard.org/media/pdf/ap-computer-science-a-java-quick-reference.pdf){: target="_blank"} which will tell you what methods are available to you. Others will be available for specific questions, so make sure you are good with reading documentation.

Since all of these return a value, make sure you do something with them. I recommend putting it in a variable.

## Random Numbers

Random numbers can be very useful, especially in games and statistics experiments, but we're going to just focus on how to create them. `Math.random()` generates a random double in the range $[0,1)$. Zero is included and 1 is not. This means if you were to cast to this to an `int`, you would get numbers ranging from 0 to 9.

This simple scale is the basis of any random number generator on the exam, so you need to learn how to transform this to your needs. If you remember function transformations from algebra, then you're in good shape. Multiplying scales the range, and adding moves it. A range of $[0,2)$ would be produced by `Math.random()*2`, and a range of $[10,20)$ is `Math.random()*10 + 10`.

Just keep in mind that if you need random integers, the end part of the range is exclusive. Getting numbers 1–10 means $[1,11)$, which is `(int)(Math.random()*10) + 1`.

> Casting happens before the addition, likely out of precaution. You can add inside the cast and get the same (random) results.
