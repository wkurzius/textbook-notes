---
title:  1.10 Calling Class Methods
layout: page
course: AP CSA
prev-link: "./1-9-method-signatures.html"
next-link: "./1-11-using-the-math-class.html"
---

- Develop code to call class methods and determine the result of those calls

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.10 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-10-calling-class-methods.html){: target="_blank"}

---

## Calling Class Methods

Most methods we've worked with (the big exception is the Turtle class) were class methods, meaning they don't require a specific instance of an object to run. You can identify them by the keyword `static` in the method definition.

If you look at the "Old MacDonald" activity, we had a number of static (class) methods. The class itself didn't really have any attributes or behaviors. It was more a collection of smaller programs (the methods) designed to work together.

> As more of counter-example than anything, you could create a `Song` class and define attributes (fields) that include the contents of the chorus, the name of the song, etc. And then behaviors (methods) that could be used to control how the song played. Each of those would not be static methods since they would apply only to each instance of `Song`.

## Non-Void Methods

Non-void methods have a returns data, like an `int`, `double`, or `String`. Anything but `void`. Methods with a return type behave like math functions. They take in a bunch of information, do some calculations, then spit something back out. Activity 1.10.1 walks you through a short example of what these look like.

My simple advice is to always use variables to store the results of a method that returns something. It will make debugging easier down the road.

```java
// Do this
int num = square(5);
System.out.println(num);

// Not this
System.out.println(square(5));

// And definitely never this. The result is immediately lost.
square(5);
```

## Methods Outside the Class

This is future stuff, but methods in the same class only require the name. If it's outside the class, then the class name is needed if it's static. Instance methods, like the Turtle stuff, then the object's name, or reference variable is used.
