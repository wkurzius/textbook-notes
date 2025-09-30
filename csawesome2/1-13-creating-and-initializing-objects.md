---
title:  "1.13 Creating and Initializing Objects: Constructors"
layout: notes
course: AP CSA
---

- Identify, using its signature, the correct constructor being called
- Develop code to declare variables of the correct types to hold object references
- Develop code to create an object by calling a constructor

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.13 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-13-constructors.html)

---

## Constructors

To create an object, an instance of a class, is must be constructed. This is done using **constructors**, which look a lot like methods but behave a bit differently. They are invoked with the `new` command and can't be called directly. They also always share the same name as the class.

```java
World habitat = new World();    // create a new World object
Turtle t = new Turtle(habitat); // create a new Turtle object
```

Line 1 above can be read "use the `World()` constructor to create a new `World` object, which can be referenced by `habitat`".

We'll get into writing constructors later. For now, we're focusing on using them.

### Overloaded Constructors

We've seen overloaded methods already, where different versions of a method are used depending on the input. This can be done with constructors as well.

```java
World world1 = new World();
World world2 = new World(300,400);
```

Line 1 has calls a constructor with no arguments, then Line 2 makes another call with a pair of integers. These call two separate constructors, each designed to handle information given to it. Line 1 creates a world with the default size, while Line 2 will create a world with the given dimensions.

The signature of a constructor, much the signature of a method 

## Object Variables and References