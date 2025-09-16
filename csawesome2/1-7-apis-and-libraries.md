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

## Classes, Attributes, and Behaviors

The book has a Turtle program for you to play with that I won't go into much detail here. Instead, I'll focus on what's going on behind the scenes. Here's the initial code from the first activity.

```java
import java.awt.*;
import java.util.*;

public class TurtleTest
{
    public static void main(String[] args)
    {
        // Do not change the next 2 lines
        World habitat = new World(300, 300);
        Turtle yertle = new Turtle(habitat);

        // Code to make yertle move forward and turn right
        yertle.forward();
        yertle.turnRight();
        
        habitat.show(true);
    }
}
```

First off, lines 1 and 2 don't do anything at the moment. If you delete them the program runs without issue, and the same is true for the remaining activities in this section. So, we're going to ignore them for the moment to make our lives easier.

Line 10 is our main focus. As a reminder, you've been writing class files, hence the whole `public class Whatever` line. Yes, they execute some code, but they also act as blueprints for **objects**. Java, as an **object-oriented programming language**, and revolves around this idea. There is a `Turtle.java` file that allows you to create `Turtle` objects, which is exactly what happens on line 9. A variable named `yertle` is declared which will reference a `Turtle` object, and on the right-hand side the object itself is created (more on that later in the course).

The `Turtle.java` file that CSAwesome2 uses is pretty complicated, so here's [a simpler version to look at courtesy of someone at Princeton](https://introcs.cs.princeton.edu/java/32class/Turtle.java.html). This one has what looks like variables up at the top: `x`, `y` and `angle`. Because they exist outside any method, they are called **fields**, but you can think of them as the objects **attributes**. They are the data related to the object. After that are a number of methods. These are **behaviors** and define what the object can do. Like our Turtle, the Princeton version has `turnRight()` behavior, but they have `goForward()` instead of our `forward()`.

> The variables in a class that appear outside any method are 

With the object created, we can now access its methods. On lines 13 and 14 the `Turtle` object named `yertle` is told to execute its `forward()` method followed by its `turnRight()` one. Unsurprisingly, they do exactly what their names imply. A **dot operator** is used in both to indicate which object is running those methods because—in case you haven't guessed yet—you can have multiple copies of the same object.

## Packages

Classes are the main building block of Java's object-oriented design, but often multiple classes depend on each other. In those cases, the classes can be grouped as a **package**, which can then be **imported** into other projects and used as needed. Those first two lines are doing just that, even though they weren't needed.

> The package `java.lang` is always loaded when you run a Java program, so there's no need to import it. It contains the `System` class, amongst others.
