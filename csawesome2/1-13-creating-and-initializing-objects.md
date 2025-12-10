---
title:  "1.13 Creating and Initializing Objects: Constructors"
layout: page
course: AP CSA
---

- Identify, using its signature, the correct constructor being called
- Develop code to declare variables of the correct types to hold object references
- Develop code to create an object by calling a constructor

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.13 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-13-constructors.html){: target="_blank"}

---

## Constructors

To create an object, an instance of a class, is must be constructed. This is done using **constructors**, which look a lot like methods but behave a bit differently. They are invoked with the `new` command and can't be called directly. They also always share the same name as the class.

```java
World habitat = new World();    // create a new World object
Turtle t = new Turtle(habitat); // create a new Turtle object
```

Line 1 above can be read "use the `World()` constructor to create a new `World` object, which can be referenced by `habitat`". Much like methods, the constructor needs to finish its own code before the rest of the program can continue.

We'll get into writing constructors later. For now, we're focusing on using them.

> It's been mentioned before, but a reference variable needs to point to an object, and in the event it doesn't, then it points to the `null` object. There is typically something wrong if you have a reference pointing to `null`, which can lead to runtime errors like `java.lang.NullPointerException`.

### Overloaded Constructors

We've seen overloaded methods already, where different versions of a method are used depending on the input. This can be done with constructors as well.

```java
World world1 = new World();
World world2 = new World(300,400);
```

Line 1 has calls a constructor with no arguments, then Line 2 makes another call with a pair of integers. These call two separate constructors, each designed to handle information given to it. Line 1 creates a world with the default size, while Line 2 will create a world with the given dimensions.

The signature of a constructor, much the signature of a method 

## Arguments, Parameters, and Call by Value

**Parameters** are the data that a method requires in order for it to run. `Math.sqrt(double a)` has a single double as a parameter. When you call/run the method, the value(s) passed to it are **arguments**.

**"Call by value"** is a concept that means that value of a variable is passed to the method or constructor being called. This is best explained with an example.

```java
int i = -4;
Math.abs(i);
System.out.println(i);
```

Line three outputs `-4` because `i` is unchanged. Only the value was passed to the `abs()` (and the work done on line 2 was essentially wasted).

If the output was `4`, meaning `i` was changed, then it would be "call by reference". **Java arguments are always passed usung call by value.** If it's an argument, you safely assume the original is left untouched. This goes for primitives and objects.
