---
title:  1.7 APIs and Libraries
layout: notes
course: AP CSA
---

- Identify the attributes and behaviors of a class found in the libraries contained in an API

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.7 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-7-APIs-and-libraries.html)

---

## APIs and Libraries and Documentation

At the moment, we've mostly looked Java's core language. This includes declaring variables and our basic math operators. However, there are a few instances where we dipped into Java's API, or **Application Programming Interface**. Most notably, `System.out.println()`. An API specifies how you can access a **library** of code located outside your own code. It might have been written by other programmers, or even yourself, but regardless it's code that you are accessing through references.

Specifically, `System.out.println()` is how you access Java's code that outputs text to the console, and then follow it up with a line break. The actual code behind it is much more complicated, but the API allows you to run it with a simple statement.

> If you are curious, [this write-up on Medium](https://medium.com/@khairulrucse26/behind-system-out-println-hello-world-in-java-a5fc80ce3d99) does a good job of explaining how `System.out.println()` works while leaving out the messy bits. In short, it involves three different classes and four methods.

**Documentation** is the human-readable directions for how to use the API. Here's [the documentation for `println()`](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#println--). It includes a short description of what it does and what information it requires. There is also one listing for each data type. This is because a) different code might execute depending on the data, and b) to be clear which data types work with `println()`. If a data type wasn't listed, that would mean it wouldn't work.

> I linked to documentation for version 8 of Java, which is essentially what CollegeBoard expects (though they annoyingly don't come right out and say it). Java is currently at version 25.
>
> Also, the linked documentation is for Oracle's version of Java. Other organizations produce their own versions of Java, so combined with the version number this gets complicated quickly. [WhichJDK.com](https://whichjdk.com/) summarizes things nicely.

