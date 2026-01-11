---
title: 3.7 Class (static) Variables and Methods
layout: page
course: AP CSA
prev-link: ./3-6-methods-passing-and-returning-references-of-an-object.html
next-link: ./3-8-scope-and-access.html
---

- Develop code to define behaviors of a class through class methods
- Develop code to declare the class variables that belong to the class

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [3.7 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-3-7-static-vars-methods.html){: target="_blank"}
- [3.12 Write Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/classes-write-code.html){: target="_blank"}

---

## Object vs Class Methods and Variables

We've been accessing and calling variables and methods for a while now, so we'll spend a little time formalizing some of the rules and notation.

One of the first methods you called was `Math.random()`. This was accessed by invoking the class name, `Math`, followed by the method name. Conversely, you also called methods for the `Turtle` class, but you did that by first creating an instance of the object, naming it something like `t1`, then calling a method like `t1.forward()`.

The former is an example of a class method. Class methods are flagged as static and do not require an instance of the object to run. Just using the name of the class followed by the method name is enough.

> If you are calling from inside the class, you only need the method name. In Activity 3.7.1 you can alter line 42 to see it for yourself.

The latter, `t1.forward()` is an object method. It does not have `static` in its signature, so it requires an object exists, and that object is used when the method itself is called.

All this applies to variables as well. A `static` variable can be called directly from inside the class, or use dot notation with the class name if outside. Non-static variables need the object name in front, like `person1.name`.

## Non-static from Static

At some point, the compiler is going to throw an error that looks like this:

```sh
error: non-static method cannot be referenced from a static context
```

You tried accessing a non-static method or variable, meaning one that requires a specific instance of a class, but you didn't include that information. A `static` method or variable doesn't have this problem since they exist for all instances of that class.

## `static` Variables

Every time we've defined a class and it's variables, they've been non-static. Most of the time, this will be the case. One place where you would define a `static` variable is with a counter for how many of an object exist. It's a variable that applied to that class, but also applied to every instance of it. The idea is to not have a unique counter for every instance.

Here's an example, along with a constructor that will increment it each time.

```java
public class Rectangle {
    private int width;
    private int height;

    public static int counter = 0;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
        
        counter++;
    }

    // ... other methods ...

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(100, 200);
        System.out.println(Rectangle.counter);  // outputs 1

        Rectangle r2 = new Rectangle(r1.getWidth(), r1.getHeight());
        System.out.println(Rectangle.counter);  // outputs 2
    }
}
```

Keep in mind that since it's static, the variable is only initialized once, so it won't be reset to zero each time a rectangle is created.

## `final` Variables

If you _really_ want to make sure a variable doesn't change, use the `final` flag when you declare it. This is not limited to instance variables. Any one can be marked as `final`.

```java
final double PI = 3.14;
```

Note the all caps in the name. Not required, but highly suggested so someone reading the code knows what they are dealing with.
