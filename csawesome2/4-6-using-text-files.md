---
title: 4.6 Using Text Files
layout: page
course: AP CSA
prev-link: ./4-5-implementing-array-algorithms.html
next-link: ./4-7-wrapper-classes-integer-and-double.html
---

- Develop code to read data from a text file

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.6 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-6-input-files.html){: target="_blank"}
- [4.33 Code Practice with ArrayLists](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayListPractice.html){: target="_blank"}

---

## Trying to Catch Exceptions

Exceptions in Java are a type of run-time error. You've seen them before. They start off with something like this

```sh
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
```

and follow with a stack-trace, which tell you what lines of code triggered the problem.

There are a bunch of different exceptions, but they fall into two larger categories: checked and unchecked. So far, you've dealt exclusively with the latter. When compiling your code, Java will not look for these and you can end up with code that will potentially break when run.

> ```java
> int[] a = new int[5];
> System.out.println(a[5]);
> ```
>
> **Figure 4.6.1** Java will let you compile and run this, despite it producing an exception.
{: .figure}

That means an **unchecked exception** is actively looked for by the Java compiler, and if it sees the potential for one of these, it will not compile your code. Unless that exceptions is handled.

> This topic of handling exceptions is being covered so the code you write for this section will actually function. Though oddly enough, this topic is not on the AP exam.

Enter the `try-catch` block. How this works is that in the `try` portion of the block, some potentially program-ruining code will execute. If an exception occurs during that execution, code in the `catch` portion will run and the program will continue on.

As an example, the code in 4.6.1 will compile, but throw an exception and cease running. The code below will still break, but the program keeps going because the exception was handled.

> ```java
> try {
>     int[] a = new int[5];
>     System.out.println(a[5]);
> } catch (Exception e) {
>     e.printStackTrace();
> }
>
> System.out.println("We didn't crash!");
> ```
>
> **Figure 4.6.2** A `try-catch` allowing a program to keep running, despite the `ArrayIndexOutOfBoundsException`.
{: .figure}

These `try-catch` blocks must be used with what is covered in this section. You'll be writing code designed to read text files, which means there's a potential for a `FileNotFoundException`, which is a checked exception.

> The book highlights an easy way to handle checked exceptions: append `throws NameOfTheException` to your method declaration. There is nothing wrong with this, but the authors leave out a lot of context about why this is done.
>
> The keyword `throws` indicates to the calling method that there is an exception that needs to be handled. Except their example is the `main` method, so there's nothing to handle it and just crashes anyway.
>
> Again, nothing wrong with this, but we need context. The only reason to use `throws` with your `main` method is if you want the program to crash when something goes wrong and you need the stack trace. For our purposes here, this is good approach.
