---
title:  1.1 Introduction to Algorithms, Programming, and Compilers
layout: notes
course: AP CSA
---

- Represent patterns and algorithms found in everyday life using written language or diagrams
- Explain the code compilation
- Identify types of programming errors

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.1 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-1-intro-algorithms.html){: target="_blank"}

---

## First Java Program

We're going to dive right in. The code below will print (or output) the text "Hello, world!" when run.

```java
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

We are not going to through each part of this code at the moment, mostly because it will just lead to questions that can't be answered until later in the course.

Here's what you need to know:

- Java programs are first compiled, then run. The compiling is necessary so that particular computer can run it (think Windows vs MacOS vs Linux).
- Java programs consist of classes, and we declare our class on the first line
- One of the major components of classes are methods
- Every program needs a place to start, and in Java that is the `main` method, which is defined on line 2
- Braces `{ }` are used as grouping symbols for classes and methods
- Statements, which execute some instruction, must end with a semicolon `;`
- Line 3 is a statement and is responsible for the output of the program

## Some Advice

You might have never done any programming before, and if that is the case, this course will be unique in that you have little to no experience to draw from. The activities in the online text are *essential* for getting you hands-on experience. Run the code, break the code, reset it, break it again. Do. Not. Skip. The. Examples. Period. Semicolon.

## Syntax and Runtime Errors

Errors are inevitable. Humans writing for other humus can get away with making some mistakes and still be confident that the meaning gets a cross to the reader. Computers do not operate that way. They are super literal. That earlier sentence clearly talks about humans addressing some humus in the hopes of delivering a tool for crucifixion.

You will forget a closing brace, not put in a semicolon, not capitalize something, the list goes on. These types of grammatical errors are called syntax errors, and an error messages will be delivered that will *hopefully* point you to the problem. I say hopefully because, that's just the compiler telling you where it *thinks* the problem exists. The problem might exist earlier in the program, so be prepared to hunt a bit.

Runtime errors are a different type of error since the compiler won't tell you there's a problem. They only appear when you try to run the program. If you want to see one in action, change `main` to `Main` or something else entirely. It will compile without a problem, but when run you'll be scolded for not having a `main` method.

> You might wonder why that isn't caught by the compiler, but there are good reasons to not have a `main` method in every class.

## Comments

Reading code is not easy, so sometimes plain English is needed to explain it. Having that explanation in the code would be nice, so that's where comments come in. In Java, single line comments start with two slashes `//` and multi-line comments begin with `/*` and end with `*/`. If you ever forget the order, look at the number pad on your keyboard.

```java
/*
This program will output the text "Hello, world!",
as is customary when learning a new language.
*/
public class helloWorld {

    public static void pain(String[] args) {

        // Line responsible for outputting "Hello, world!"
        System.out.println("Hello, world!");
    }
}
```
