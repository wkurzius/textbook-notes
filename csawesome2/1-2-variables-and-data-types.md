---
title:  1.2 Variables and Data Types
layout: page
course: AP CSA
---

- Identify the most appropriate data type category for a particular specification
- Develop code to declare variables to store numbers and Boolean values

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.2 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-2-variables.html){: target="_blank"}

---

## Variables

Variables behave fairly similar to what've you seen in algebra, though one of the key differences is that variables in programming languages act as storage. A simple use of a variable is below.

```java
public class variables {

    public static void main(String[] args) {
        int score;

        score = 0;
        System.out.println(score);

        // Some code that reflects the player increasing their score

        System.out.println(score);
    }
}
```

The first line in the `main` method declares the variable, basically setting aside space for it in memory. Without this line, the next one wouldn't work. In that declaration, we also specify what kind of variable we want. In this case, we asked for an integer with the keyword `int`.

The next line is where we give a value to that variable. Remember that they are storage, so initially `score` is just an empty box, but now it has a value of 0. And again, this line is essential to make sure the rest works. Without a value, there's nothing to print and your compiler will throw an error. It doesn't matter what the value is, or even if it changes later, just that it has one.

So, two things need to happen when you want to use a variable: you need to declare it and then give it a value.

## Data Types

There are two major types of variables, primitives and reference. Primitives have a fixed memory size, which makes working with them quicker (not for you, the computer). You've seen one already with `int`. The others that you need to worry about are `double` and `boolean`. The latter only accepts two possible values, `true` and `false`. The name come from George Boole who formalized what it meant to do math with just truth values. These will come in handy later on.

`double` is a bit more complicated. The short version is that it's used for decimals, since naturally `int` only deals with integers. The original type for decimal numbers was `float` (because computers use floating point numbers to represent decimals), but more precision was needed so they doubled the memory allocated and called it `double`.

> Just a couple of quick sides notes about `double` variables.
> 
> 1. If you want to know more about floating point numbers, here's a short and introduction to the topic that I refer to frequently: [Floating Point Visually Explained by Fabien Sanglard](https://fabiensanglard.net/floating_point_visually_explained/){: target="_blank"}
>
> 2. A word of caution: floating-point variables can be inaccurate for the same reason that working with one-third in decimal is a pain. This is a topic for another day, but if you can use `int` for an implementation, do it.

So, the above are all primitive variables. The other major class are a reference variables, and rather than carve out a piece of memory for some data, they instead point to an more complex object. One you will deal with immediately is `String`, which is what text is referred to as in computer speak. Strings are always wrapped in double-quotations `"`.

## On Your Own

The section itself has a lot more, but it's mechanical stuff rather than conceptual. Again, do the activities and make sure to play around with the code. If you're curious about what would happen if you did something, do it and see what happens.
