---
title:  1.9 Method Signatures
layout: notes
course: AP CSA
---

- Identify the correct method to call based on documentation and method signatures
- Describe how to call methods

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.9 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-9-method-signatures.html){: target="_blank"}

---

## Method Calls

Methods, or functions as they are often called in other languages, are our way of abstracting tasks. We create a method to do some task, an then use that method without having to think about how it's being done after that point. You build a proper square root function once, then use it without worrying about the details. You can also import other code for the same purpose. We don't need to know how the Turtle class moves the turtle forward, just that it does.

Methods are also used for simplifying complex code. The book takes you through a method that prints out the lyrics to "Old MacDonald", but creates another method to deal with the repeated lyrics, like the intro and chorus.

## Method Signatures, Parameters, Arguments

We looked at documentation the other, and in there we repeated method calls with `println()`, but each with a different set of **parameters**. One version required no data, another asked for a single `int`, another a `double`, and so on. The name of the method combined with the parameters is the **method signature**. When you call a method in your code, the signature is used to find the appropriate version of the method. When multiple version of the method exist, each with the same name but different parameters, it's called **overloading**.

What also needs to be mentioned is that methods require parameters, but when you call a method, the data you send are called arguments. So `println(int x)` has a parameter of a single `int`. When you execute `println(5)`, the argument is 5. The two terms tend to get used mixed up, but the context of the statement usually clears it up.

## Return Types

Also visible in the documentation next to all the `println()` signatures is the word `void`. You also see this in your `main` method calls. This is the **return type**, and in this case means nothing is returned back to what called the method. We haven't seen any non-void methods yet, but those will return data back to what called it so it can be used elsewhere in the program.
