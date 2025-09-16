---
title:  1.8 Documentation with Comments and Preconditions
layout: notes
course: AP CSA
---

- Describe the functionality and use of code through comments

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.8 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-8-comments.html)

---

## Comments

Comments are typically plain-language explanations of what code is supposed to do. Java has three versions.

- Single line comments start with a `//`
- Mult-line comments fall between `/*` and `*/`
- Javadoc comments that will be used to create API documentation fall between `/**` and `*/`

You won't be able to try out the Javadoc tool on CSAwesome, but I'll demo it in class. As for the AP exam, you just need to identify those comments, not use them.

Here's our first program, but with some added comments.

```java
/**
 * The HelloWorld program implements an application that
 * simply displays "Hello World!" to the standard output.
 * 
 * @author Hackerman
 * @version 1.0
 */
public class helloWorld {

    // The main method, obviously.
    public static void main(String[] args) {

        /*
         * The code below will print the words Hello World
         * to the screen, and it is amazing
         */
        System.out.println("Hello, world!");

        /* Turns out this is fine, too. */

    }
}
```

## Preconditions and Postconditions

Both of these are items that should be stated in the documentation. Preconditions are what's needed for the method to do its job. Like a method that does some division not having 0 as the divisor. The method itself might not check for these, and therefore might fail spectacularly, but it should be stated up front what the requirements are.

Postconditions describe the outcome of the method. That might be what kind of information is returned to the thing that called it (think of a square root function returning an answer), or what changed (like the `forward()` method from the Turtle activities).

## The Rest of It

Agile computing, software validity, and anything else in this section is not on the AP exam. They are worth looking into, so still do the associated reading and activities, but I won't talk about them here.
