---
title: "3.6 Methods: Passing and Returning References of an Object"
layout: page
course: AP CSA
prev-link: ./3-5-methods-how-to-write-them.html
next-link: ./3-7-class-variables-and-methods.html
---

- Develop code to define behaviors of an object through methods written in a class using object references and determine the result of calling these methods

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [3.6 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-3-6-methods-references.html){: target="_blank"}
- [3.12 Write Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/classes-write-code.html){: target="_blank"}

---

## Call by Value

You might remember that java utilizes a concept known as **call by value** where the values of a variable are copied when called by methods.

```java
public static int triple(int x) {
    return x * 3;
}

public static void main(String[] args) {
    int x = 2;
    System.out.println(x); // outputs 2
    triple(x);
    System.out.println(x); // also outputs 2
}
```

This is straightforward with primitives. If you want to modify the value of a variable, you need to explicitly do so. For the above situation, changing line 7 to `x = triple(x);` would actually triple the value of `x`.

But call by value can get messy when working with objects. Object variables, like `Turtle t1`, have values that are only a reference to the object, not the object itself. This means the reference is copied, in line with call by value, but that copy is still the same reference and points to the same object.

To put it bluntly, **if you pass an object as a parameter, you risk modifying the original**. If you want a copy, you need to explicitly make a new object and copy the instance variables from the original. This means utilizing the getters/accessor methods to get the values of the source object.

```java
Rectangle r1 = new Rectangle(100,200);
Rectangle r2 = new Rectangle(r1.getWidth(), r1.getHeight());
```

If you are designing the class, you can provide a copy constructor which will take the object passed and copy each value.

```java
public class Rectangle {
    private int width;
    private int height;

    // ... typical constructors ...

    // a copy constructor
    public Rectangle(Rectangle r) {
        width = r.getWidth();
        height = r.getHeight();
    }

    // ... getters and setters ...

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(100,200);
        Rectangle r2 = new Rectangle(r1);
    }
}
```

Regardless, making copies should be the default approach to working with object unless you are sure they are supposed to be modified. With a copy, you have option to access the original if needed. On the other hand, if you modify the original that information is lost.

### Mutable vs Immutable

The book mentions immutable objects, which are just objects that cannot be modified. There is no flag to make this happen, it just comes from simply making all your fields private and not providing any setters. `String` objects are immutable by design, something else that makes them behave more like primitives.

## Returning Objects

Perhaps unsurprisingly, this "call by value" is in place with `return` statements as well. Objects can be large and therefore memory intensive, so again, just the reference to the object is returned. A copy is not made unless the method is designed to do so.

## Classist Parameters

Remember how you can't access the instance variables of a class if they are flagged as `private`? This continues to be true, but with an added wrinkle: different objects can access each other's instance variables. `private` restricts other classes, not other objects from the same class.

```java
public class Rectangle {
    private int width;
    private int height;

    // ... typical constructors ...
    // ... getters and setters ...

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(100,200);
        // ...
        Rectangle r4 = new Rectangle(r1.width, r1.height);  // this is legal
    }
}
```

The book paints a picture of a `Person` object which has an instance variable that points to an `Address` object. 